package DesignPattern.Builder;

/**
 * Class BuilderPatternDemo is created on 2019/12/13 0:04.
 *
 * @author Ray
 * @version 2019/12/13
 **/

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Meal vegMeal = MealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());

        Meal nonVegMeal = MealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
    }
}
