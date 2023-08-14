package com.tesinitsyn.recipeui.layouts;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route(value = "topRecipes", layout = MainLayout.class)
@PageTitle("Top Recipes | Sinitsyn's recipes")
public class MainPage extends VerticalLayout {

}
