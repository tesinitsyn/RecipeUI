package com.tesinitsyn.recipeui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class RecipeUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipeUiApplication.class, args);
//
//        String url = "http://localhost:8080/api/recipe/getById/2";
//
//        WebClient.Builder builder = WebClient.builder();
//
//        String recipe = builder.build()
//                .get()
//                .uri(url)
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();
//
//        System.out.println(recipe);
//
    }
}
