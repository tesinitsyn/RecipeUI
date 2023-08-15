package com.tesinitsyn.recipeui.components;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeBlock extends HorizontalLayout {
    String recipeName;
    String recipeIngredients;
    String timeToCook;

    public RecipeBlock(String recipeName, String recipeIngredients, String timeToCook) {
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
        this.timeToCook = timeToCook;

        addClassName("recipe-block");
        Text recipeNameText = new Text(recipeName);
        Text recipeIngredientsText = new Text(recipeIngredients);
        Text timeToCookText = new Text(timeToCook);
        add(
                recipeNameText,
                recipeIngredientsText,
                timeToCookText
        );
    }
}