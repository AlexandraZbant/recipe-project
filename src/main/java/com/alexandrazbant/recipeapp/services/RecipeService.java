package com.alexandrazbant.recipeapp.services;

import com.alexandrazbant.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService{

    Set<Recipe> getRecipes();
}