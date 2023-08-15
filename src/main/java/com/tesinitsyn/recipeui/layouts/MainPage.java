package com.tesinitsyn.recipeui.layouts;

import com.tesinitsyn.recipeui.components.RecipeBlock;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;


@Route(value = "topRecipes", layout = MainLayout.class)
@PageTitle("Top Recipes | Sinitsyn's recipes")
public class MainPage extends VerticalLayout {

    public MainPage() {
        createRecipes();
    }

    private void createRecipes() {
        List<HorizontalLayout> recipeBlockList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            RecipeBlock idk = new RecipeBlock(
                    "idk" + i,
                    "idk" + i,
                    "idk" + i);
            recipeBlockList.add(idk);
        }

        for (int i = 0; i < 3; i++) {
            add(recipeBlockList.get(i));
        }
    }
}
