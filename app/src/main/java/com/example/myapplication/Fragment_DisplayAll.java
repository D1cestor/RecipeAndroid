package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Fragment_DisplayAll extends Fragment {
    private View view;
    private ArrayList<RecipeBean> recipeBeans;
    private ArrayList<String> ids;
    private ArrayList<Fragment> fragments;
    private FragmentManager fm;
    private String url;
    private int layoutRes;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_recipe_container,container,false);
        return view;

    }

    public Fragment_DisplayAll(String url, int layoutRes){
        this.url = url;
        this.layoutRes = layoutRes;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recipeBeans = new ArrayList<>();
        fragments = new ArrayList<>();
        ids = new ArrayList<>();
        JsonObjectRequest requestCategories = new JsonObjectRequest(url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArray = response.getJSONArray("meals");
                    for (int i = 0; i < jsonArray.length(); i++){
                        JSONObject json = (JSONObject) jsonArray.get(i);
                        ids.add(json.getString("idMeal"));
                        String tempUrl = "https://www.themealdb.com/api/json/v1/1/lookup.php?i=" + json.getString("idMeal");
                        MySingleton.getInstance(getContext()).addToRequestQueue(getRecipeRequest(tempUrl));
                    }
            } catch (JSONException e) {
                e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(), "Network error", Toast.LENGTH_LONG).show();
            }
        });



        MySingleton.getInstance(getContext()).addToRequestQueue(requestCategories);
    }

    private JsonObjectRequest getRecipeRequest(String url){
        JsonObjectRequest request = new JsonObjectRequest(url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                JSONArray jsonArray = null;
                try {
                    jsonArray = response.getJSONArray("meals");
                    JSONObject recipe = (JSONObject) jsonArray.get(0);
                    RecipeBean recipeBean = RecipeBean.getBeanValue(recipe.toString());
                    recipeBeans.add(recipeBean);
                    Fragment_option fragment_option = new Fragment_option(recipeBean);
                    fragments.add(fragment_option);
                    fm = getChildFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.add(R.id.content,fragment_option);
                    ft.commitAllowingStateLoss();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(), "Network error", Toast.LENGTH_LONG).show();
            }
        });
        return  request;
    }

}
