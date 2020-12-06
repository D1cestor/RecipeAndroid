package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.android.volley.toolbox.NetworkImageView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class DisplayRecipe extends AppCompatActivity {
    private RecipeBean recipeBean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_recipe);
        recipeBean =  (RecipeBean) getIntent().getSerializableExtra("data");
        TextView title = findViewById(R.id.recipeTitle);
        title.setText(recipeBean.getStrMeal());
        NetworkImageView networkImageView = findViewById(R.id.photo);
        networkImageView.setImageUrl(recipeBean.getStrMealThumb(),MySingleton.getInstance(getBaseContext()).getImageLoader());
        LinearLayout ingredientContent = findViewById(R.id.ingredientContent);
        appendIngredient(ingredientContent,recipeBean);
        LinearLayout instructions = findViewById(R.id.instructions);
        appendInstructions(instructions,recipeBean);
    }



    public void appendIngredient(LinearLayout ingredientContent, RecipeBean recipeBean){
        int i = 0;
        ArrayList<String> ingredients = recipeBean.getIngredients();
        ArrayList<String> measures = recipeBean.getMeasures();
        LinearLayout ingredientsLayout = new LinearLayout(ingredientContent.getContext());
        ingredientsLayout.setOrientation(LinearLayout.VERTICAL);
        ingredientsLayout.setLayoutParams(new LinearLayout.LayoutParams(0,ViewGroup.LayoutParams.WRAP_CONTENT,1));
        LinearLayout measuresLayout = new LinearLayout(ingredientContent.getContext());
        measuresLayout.setOrientation(LinearLayout.VERTICAL);
        measuresLayout.setLayoutParams(new LinearLayout.LayoutParams(0,ViewGroup.LayoutParams.WRAP_CONTENT,1));
        measuresLayout.setGravity(Gravity.RIGHT);
        ingredientContent.addView(ingredientsLayout);
        ingredientContent.addView(measuresLayout);
        ingredientContent.setOrientation(LinearLayout.HORIZONTAL);

        while(ingredients.get(i) != ""){
            TextView ingredient = new TextView(ingredientsLayout.getContext());
            ingredient.setText(ingredients.get(i));
            ingredientsLayout.addView(ingredient);
            TextView measure = new TextView(measuresLayout.getContext());
            measure.setText(measures.get(i));
            measure.setGravity(Gravity.RIGHT);
            measuresLayout.addView(measure);
            i++;
        }
    }


    public void appendInstructions(LinearLayout instructions, RecipeBean recipeBean){
        TextView instruction = new TextView(instructions.getContext());
        instruction.setText(recipeBean.getStrInstructions());
        instructions.addView(instruction);
    }
}