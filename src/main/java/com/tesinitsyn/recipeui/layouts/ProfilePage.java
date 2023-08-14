package com.tesinitsyn.recipeui.layouts;

import com.tesinitsyn.recipeui.layouts.MainLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route(value = "profile", layout = MainLayout.class)
@PageTitle("Profile | Sinitsyn's recipes")
public class ProfilePage extends VerticalLayout {
}
