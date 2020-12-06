package com.example.myapplication;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;

public class RecipeBean implements Serializable {
    private Integer idMeal;
    private String strMeal;
    private String strCategory;
    private String strArea;
    private String strInstructions;
    private String strMealThumb;
    private String strYoutube;
    private String strIngredient1;
    private String strIngredient2;
    private String strIngredient3;
    private String strIngredient4;
    private String strIngredient5;
    private String strIngredient6;
    private String strIngredient7;
    private String strIngredient8;
    private String strIngredient9;
    private String strIngredient10;
    private String strIngredient11;
    private String strIngredient12;
    private String strIngredient13;
    private String strIngredient14;
    private String strIngredient15;
    private String strIngredient16;
    private String strIngredient17;
    private String strIngredient18;
    private String strIngredient19;
    private String strIngredient20;
    private String strMeasure1;
    private String strMeasure2;
    private String strMeasure3;
    private String strMeasure4;
    private String strMeasure5;
    private String strMeasure6;
    private String strMeasure7;
    private String strMeasure8;
    private String strMeasure9;
    private String strMeasure10;
    private String strMeasure11;
    private String strMeasure12;
    private String strMeasure13;
    private String strMeasure14;
    private String strMeasure15;
    private String strMeasure16;
    private String strMeasure17;
    private String strMeasure18;
    private String strMeasure19;
    private String strMeasure20;

    public static RecipeBean getBeanValue(String json) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            RecipeBean recipeBean = new RecipeBean();
            recipeBean.setIdMeal(jsonObject.getInt("idMeal"));
            recipeBean.setStrMeal(jsonObject.getString("strMeal"));
            recipeBean.setStrArea(jsonObject.getString("strArea"));
            recipeBean.setStrInstructions(jsonObject.getString("strInstructions"));
            recipeBean.setStrMealThumb(jsonObject.getString("strMealThumb"));
            recipeBean.setStrYoutube(jsonObject.getString("strYoutube"));
            recipeBean.setStrIngredient1(jsonObject.getString("strIngredient1"));
            recipeBean.setStrIngredient2(jsonObject.getString("strIngredient2"));
            recipeBean.setStrIngredient3(jsonObject.getString("strIngredient3"));
            recipeBean.setStrIngredient4(jsonObject.getString("strIngredient4"));
            recipeBean.setStrIngredient5(jsonObject.getString("strIngredient5"));
            recipeBean.setStrIngredient6(jsonObject.getString("strIngredient6"));
            recipeBean.setStrIngredient7(jsonObject.getString("strIngredient7"));
            recipeBean.setStrIngredient8(jsonObject.getString("strIngredient8"));
            recipeBean.setStrIngredient9(jsonObject.getString("strIngredient9"));
            recipeBean.setStrIngredient10(jsonObject.getString("strIngredient10"));
            recipeBean.setStrIngredient11(jsonObject.getString("strIngredient11"));
            recipeBean.setStrIngredient12(jsonObject.getString("strIngredient12"));
            recipeBean.setStrIngredient13(jsonObject.getString("strIngredient13"));
            recipeBean.setStrIngredient14(jsonObject.getString("strIngredient14"));
            recipeBean.setStrIngredient15(jsonObject.getString("strIngredient15"));
            recipeBean.setStrIngredient16(jsonObject.getString("strIngredient16"));
            recipeBean.setStrIngredient17(jsonObject.getString("strIngredient17"));
            recipeBean.setStrIngredient18(jsonObject.getString("strIngredient18"));
            recipeBean.setStrIngredient19(jsonObject.getString("strIngredient19"));
            recipeBean.setStrIngredient20(jsonObject.getString("strIngredient20"));
            recipeBean.setStrMeasure1(jsonObject.getString("strMeasure1"));
            recipeBean.setStrMeasure2(jsonObject.getString("strMeasure2"));
            recipeBean.setStrMeasure3(jsonObject.getString("strMeasure3"));
            recipeBean.setStrMeasure4(jsonObject.getString("strMeasure4"));
            recipeBean.setStrMeasure5(jsonObject.getString("strMeasure5"));
            recipeBean.setStrMeasure6(jsonObject.getString("strMeasure6"));
            recipeBean.setStrMeasure7(jsonObject.getString("strMeasure7"));
            recipeBean.setStrMeasure8(jsonObject.getString("strMeasure8"));
            recipeBean.setStrMeasure9(jsonObject.getString("strMeasure9"));
            recipeBean.setStrMeasure10(jsonObject.getString("strMeasure10"));
            recipeBean.setStrMeasure11(jsonObject.getString("strMeasure11"));
            recipeBean.setStrMeasure12(jsonObject.getString("strMeasure12"));
            recipeBean.setStrMeasure13(jsonObject.getString("strMeasure13"));
            recipeBean.setStrMeasure14(jsonObject.getString("strMeasure14"));
            recipeBean.setStrMeasure15(jsonObject.getString("strMeasure15"));
            recipeBean.setStrMeasure16(jsonObject.getString("strMeasure16"));
            recipeBean.setStrMeasure17(jsonObject.getString("strMeasure17"));
            recipeBean.setStrMeasure18(jsonObject.getString("strMeasure18"));
            recipeBean.setStrMeasure19(jsonObject.getString("strMeasure19"));
            recipeBean.setStrMeasure20(jsonObject.getString("strMeasure20"));
            return recipeBean;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<String> getIngredients(){
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add(strIngredient1);
        ingredients.add(strIngredient2);
        ingredients.add(strIngredient3);
        ingredients.add(strIngredient4);
        ingredients.add(strIngredient5);
        ingredients.add(strIngredient6);
        ingredients.add(strIngredient7);
        ingredients.add(strIngredient8);
        ingredients.add(strIngredient9);
        ingredients.add(strIngredient10);
        ingredients.add(strIngredient11);
        ingredients.add(strIngredient12);
        ingredients.add(strIngredient13);
        ingredients.add(strIngredient14);
        ingredients.add(strIngredient15);
        ingredients.add(strIngredient16);
        ingredients.add(strIngredient17);
        ingredients.add(strIngredient18);
        ingredients.add(strIngredient19);
        ingredients.add(strIngredient20);
        return ingredients;
    }

    public ArrayList<String> getMeasures(){
        ArrayList<String> measures = new ArrayList<>();
        measures.add(strMeasure1);
        measures.add(strMeasure2);
        measures.add(strMeasure3);
        measures.add(strMeasure4);
        measures.add(strMeasure5);
        measures.add(strMeasure6);
        measures.add(strMeasure7);
        measures.add(strMeasure8);
        measures.add(strMeasure9);
        measures.add(strMeasure10);
        measures.add(strMeasure11);
        measures.add(strMeasure12);
        measures.add(strMeasure13);
        measures.add(strMeasure14);
        measures.add(strMeasure15);
        measures.add(strMeasure16);
        measures.add(strMeasure17);
        measures.add(strMeasure18);
        measures.add(strMeasure19);
        measures.add(strMeasure20);
        return measures;
    }

    @Override
    public String toString() {
        return "RecipeBean{" +
                "idMeal=" + idMeal +
                ", strMeal='" + strMeal + '\'' +
                ", strCategory='" + strCategory + '\'' +
                ", strArea='" + strArea + '\'' +
                ", strInstructions='" + strInstructions + '\'' +
                ", strMealThumb='" + strMealThumb + '\'' +
                ", strYoutube='" + strYoutube + '\'' +
                ", strIngredient1='" + strIngredient1 + '\'' +
                ", strIngredient2='" + strIngredient2 + '\'' +
                ", strIngredient3='" + strIngredient3 + '\'' +
                ", strIngredient4='" + strIngredient4 + '\'' +
                ", strIngredient5='" + strIngredient5 + '\'' +
                ", strIngredient6='" + strIngredient6 + '\'' +
                ", strIngredient7='" + strIngredient7 + '\'' +
                ", strIngredient8='" + strIngredient8 + '\'' +
                ", strIngredient9='" + strIngredient9 + '\'' +
                ", strIngredient10='" + strIngredient10 + '\'' +
                ", strIngredient11='" + strIngredient11 + '\'' +
                ", strIngredient12='" + strIngredient12 + '\'' +
                ", strIngredient13='" + strIngredient13 + '\'' +
                ", strIngredient14='" + strIngredient14 + '\'' +
                ", strIngredient15='" + strIngredient15 + '\'' +
                ", strIngredient16='" + strIngredient16 + '\'' +
                ", strIngredient17='" + strIngredient17 + '\'' +
                ", strIngredient18='" + strIngredient18 + '\'' +
                ", strIngredient19='" + strIngredient19 + '\'' +
                ", strIngredient20='" + strIngredient20 + '\'' +
                ", strMeasure1='" + strMeasure1 + '\'' +
                ", strMeasure2='" + strMeasure2 + '\'' +
                ", strMeasure3='" + strMeasure3 + '\'' +
                ", strMeasure4='" + strMeasure4 + '\'' +
                ", strMeasure5='" + strMeasure5 + '\'' +
                ", strMeasure6='" + strMeasure6 + '\'' +
                ", strMeasure7='" + strMeasure7 + '\'' +
                ", strMeasure8='" + strMeasure8 + '\'' +
                ", strMeasure9='" + strMeasure9 + '\'' +
                ", strMeasure10='" + strMeasure10 + '\'' +
                ", strMeasure11='" + strMeasure11 + '\'' +
                ", strMeasure12='" + strMeasure12 + '\'' +
                ", strMeasure13='" + strMeasure13 + '\'' +
                ", strMeasure14='" + strMeasure14 + '\'' +
                ", strMeasure15='" + strMeasure15 + '\'' +
                ", strMeasure16='" + strMeasure16 + '\'' +
                ", strMeasure17='" + strMeasure17 + '\'' +
                ", strMeasure18='" + strMeasure18 + '\'' +
                ", strMeasure19='" + strMeasure19 + '\'' +
                ", strMeasure20='" + strMeasure20 + '\'' +
                '}';
    }

    public Integer getIdMeal() {
        return idMeal;
    }

    public void setIdMeal(Integer idMeal) {
        this.idMeal = idMeal;
    }

    public String getStrMeal() {
        return strMeal;
    }

    public void setStrMeal(String strMeal) {
        this.strMeal = strMeal;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public String getStrArea() {
        return strArea;
    }

    public void setStrArea(String strArea) {
        this.strArea = strArea;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    public String getStrMealThumb() {
        return strMealThumb;
    }

    public void setStrMealThumb(String strMealThumb) {
        this.strMealThumb = strMealThumb;
    }

    public String getStrYoutube() {
        return strYoutube;
    }

    public void setStrYoutube(String strYoutube) {
        this.strYoutube = strYoutube;
    }

    public String getStrIngredient1() {
        return strIngredient1;
    }

    public void setStrIngredient1(String strIngredient1) {
        this.strIngredient1 = strIngredient1;
    }

    public String getStrIngredient2() {
        return strIngredient2;
    }

    public void setStrIngredient2(String strIngredient2) {
        this.strIngredient2 = strIngredient2;
    }

    public String getStrIngredient3() {
        return strIngredient3;
    }

    public void setStrIngredient3(String strIngredient3) {
        this.strIngredient3 = strIngredient3;
    }

    public String getStrIngredient4() {
        return strIngredient4;
    }

    public void setStrIngredient4(String strIngredient4) {
        this.strIngredient4 = strIngredient4;
    }

    public String getStrIngredient5() {
        return strIngredient5;
    }

    public void setStrIngredient5(String strIngredient5) {
        this.strIngredient5 = strIngredient5;
    }

    public String getStrIngredient6() {
        return strIngredient6;
    }

    public void setStrIngredient6(String strIngredient6) {
        this.strIngredient6 = strIngredient6;
    }

    public String getStrIngredient7() {
        return strIngredient7;
    }

    public void setStrIngredient7(String strIngredient7) {
        this.strIngredient7 = strIngredient7;
    }

    public String getStrIngredient8() {
        return strIngredient8;
    }

    public void setStrIngredient8(String strIngredient8) {
        this.strIngredient8 = strIngredient8;
    }

    public String getStrIngredient9() {
        return strIngredient9;
    }

    public void setStrIngredient9(String strIngredient9) {
        this.strIngredient9 = strIngredient9;
    }

    public String getStrIngredient10() {
        return strIngredient10;
    }

    public void setStrIngredient10(String strIngredient10) {
        this.strIngredient10 = strIngredient10;
    }

    public String getStrIngredient11() {
        return strIngredient11;
    }

    public void setStrIngredient11(String strIngredient11) {
        this.strIngredient11 = strIngredient11;
    }

    public String getStrIngredient12() {
        return strIngredient12;
    }

    public void setStrIngredient12(String strIngredient12) {
        this.strIngredient12 = strIngredient12;
    }

    public String getStrIngredient13() {
        return strIngredient13;
    }

    public void setStrIngredient13(String strIngredient13) {
        this.strIngredient13 = strIngredient13;
    }

    public String getStrIngredient14() {
        return strIngredient14;
    }

    public void setStrIngredient14(String strIngredient14) {
        this.strIngredient14 = strIngredient14;
    }

    public String getStrIngredient15() {
        return strIngredient15;
    }

    public void setStrIngredient15(String strIngredient15) {
        this.strIngredient15 = strIngredient15;
    }

    public String getStrIngredient16() {
        return strIngredient16;
    }

    public void setStrIngredient16(String strIngredient16) {
        this.strIngredient16 = strIngredient16;
    }

    public String getStrIngredient17() {
        return strIngredient17;
    }

    public void setStrIngredient17(String strIngredient17) {
        this.strIngredient17 = strIngredient17;
    }

    public String getStrIngredient18() {
        return strIngredient18;
    }

    public void setStrIngredient18(String strIngredient18) {
        this.strIngredient18 = strIngredient18;
    }

    public String getStrIngredient19() {
        return strIngredient19;
    }

    public void setStrIngredient19(String strIngredient19) {
        this.strIngredient19 = strIngredient19;
    }

    public String getStrIngredient20() {
        return strIngredient20;
    }

    public void setStrIngredient20(String strIngredient20) {
        this.strIngredient20 = strIngredient20;
    }

    public String getStrMeasure1() {
        return strMeasure1;
    }

    public void setStrMeasure1(String strMeasure1) {
        this.strMeasure1 = strMeasure1;
    }

    public String getStrMeasure2() {
        return strMeasure2;
    }

    public void setStrMeasure2(String strMeasure2) {
        this.strMeasure2 = strMeasure2;
    }

    public String getStrMeasure3() {
        return strMeasure3;
    }

    public void setStrMeasure3(String strMeasure3) {
        this.strMeasure3 = strMeasure3;
    }

    public String getStrMeasure4() {
        return strMeasure4;
    }

    public void setStrMeasure4(String strMeasure4) {
        this.strMeasure4 = strMeasure4;
    }

    public String getStrMeasure5() {
        return strMeasure5;
    }

    public void setStrMeasure5(String strMeasure5) {
        this.strMeasure5 = strMeasure5;
    }

    public String getStrMeasure6() {
        return strMeasure6;
    }

    public void setStrMeasure6(String strMeasure6) {
        this.strMeasure6 = strMeasure6;
    }

    public String getStrMeasure7() {
        return strMeasure7;
    }

    public void setStrMeasure7(String strMeasure7) {
        this.strMeasure7 = strMeasure7;
    }

    public String getStrMeasure8() {
        return strMeasure8;
    }

    public void setStrMeasure8(String strMeasure8) {
        this.strMeasure8 = strMeasure8;
    }

    public String getStrMeasure9() {
        return strMeasure9;
    }

    public void setStrMeasure9(String strMeasure9) {
        this.strMeasure9 = strMeasure9;
    }

    public String getStrMeasure10() {
        return strMeasure10;
    }

    public void setStrMeasure10(String strMeasure10) {
        this.strMeasure10 = strMeasure10;
    }

    public String getStrMeasure11() {
        return strMeasure11;
    }

    public void setStrMeasure11(String strMeasure11) {
        this.strMeasure11 = strMeasure11;
    }

    public String getStrMeasure12() {
        return strMeasure12;
    }

    public void setStrMeasure12(String strMeasure12) {
        this.strMeasure12 = strMeasure12;
    }

    public String getStrMeasure13() {
        return strMeasure13;
    }

    public void setStrMeasure13(String strMeasure13) {
        this.strMeasure13 = strMeasure13;
    }

    public String getStrMeasure14() {
        return strMeasure14;
    }

    public void setStrMeasure14(String strMeasure14) {
        this.strMeasure14 = strMeasure14;
    }

    public String getStrMeasure15() {
        return strMeasure15;
    }

    public void setStrMeasure15(String strMeasure15) {
        this.strMeasure15 = strMeasure15;
    }

    public String getStrMeasure16() {
        return strMeasure16;
    }

    public void setStrMeasure16(String strMeasure16) {
        this.strMeasure16 = strMeasure16;
    }

    public String getStrMeasure17() {
        return strMeasure17;
    }

    public void setStrMeasure17(String strMeasure17) {
        this.strMeasure17 = strMeasure17;
    }

    public String getStrMeasure18() {
        return strMeasure18;
    }

    public void setStrMeasure18(String strMeasure18) {
        this.strMeasure18 = strMeasure18;
    }

    public String getStrMeasure19() {
        return strMeasure19;
    }

    public void setStrMeasure19(String strMeasure19) {
        this.strMeasure19 = strMeasure19;
    }

    public String getStrMeasure20() {
        return strMeasure20;
    }

    public void setStrMeasure20(String strMeasure20) {
        this.strMeasure20 = strMeasure20;
    }
}