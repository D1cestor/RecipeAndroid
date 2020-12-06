package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

public class Fragment_option extends Fragment {
    private View view;
    private NetworkImageView networkImageView;
    private TextView textView;
    private RecipeBean recipeBean;


    public Fragment_option(RecipeBean recipeBean){
        this.recipeBean = recipeBean;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_option,container,false);
        networkImageView = view.findViewById(R.id.image);
        textView = view.findViewById(R.id.name);
        textView.setText(recipeBean.getStrMeal());
        textView.setTextSize(30);
        networkImageView.setImageUrl(recipeBean.getStrMealThumb(),MySingleton.getInstance(getContext()).getImageLoader());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),DisplayRecipe.class);
                intent.putExtra("data",recipeBean);
                startActivity(intent);
            }
        });
        return view;
    }




}
