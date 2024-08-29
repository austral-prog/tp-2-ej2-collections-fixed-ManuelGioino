package com.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class Sets {

    // A set of common alcoholic ingredients
    private static final Set<String> ALCOHOLIC_INGREDIENTS = new HashSet<>(Arrays.asList(
            "whiskey", "whisky", "white rum", "dark rum", "bourbon", "rye", "scotch", "vodka",
            "tequila", "gin", "dry vermouth", "sweet vermouth", "prosecco", "aperol", "brandy", "mezcal",
            "triple sec", "coffee liqueur", "almond liqueur", "champagne", "orange curacao", "rum"
    ));

    // Method to check if a drink is a cocktail or mocktail
    public static String checkDrinks(String drinkName, List<String> ingredients) {
        for (String ingredient : ingredients) {
            if (ALCOHOLIC_INGREDIENTS.contains(ingredient)) {
                return drinkName + " Cocktail";
            }
        }
        return drinkName + " Mocktail";
    }
}