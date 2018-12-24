package com.example.fn;

public class DrinksFunction {

    public DrinkData handleRequest(DrinkData input) {
        DrinkData newDrinkData = new DrinkData();
        newDrinkData.setName((input == null || input.getName() == null || input.getName().isEmpty()) ? "<no name>" : input.getName());
        newDrinkData.setAlcohol((input == null || input.getAlcohol() == null) ? 0 : input.getAlcohol() + 1);
        return newDrinkData;
    }

}
