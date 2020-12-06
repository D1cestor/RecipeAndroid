package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.ui.main.SectionsPagerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragments = new ArrayList<>();
        fragments.add(new Fragment_DisplayAll("https://www.themealdb.com/api/json/v1/1/filter.php?c=Seafood",R.layout.fragment_recipeoftheday));
        fragments.add(new Fragment_DisplayAll("https://www.themealdb.com/api/json/v1/1/filter.php?c=Beef",R.layout.fragment_recipeoftheday));
        fragments.add(new Fragment_DisplayAll("https://www.themealdb.com/api/json/v1/1/filter.php?c=Chicken",R.layout.fragment_recipeoftheday));
        fragments.add(new Fragment_DisplayAll("https://www.themealdb.com/api/json/v1/1/filter.php?c=Dessert",R.layout.fragment_recipeoftheday));
        fragments.add(new Fragment_DisplayAll("https://www.themealdb.com/api/json/v1/1/filter.php?c=Lamb",R.layout.fragment_recipeoftheday));
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager(),fragments);
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }
}