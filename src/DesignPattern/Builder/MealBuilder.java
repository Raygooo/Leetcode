package DesignPattern.Builder;

/**
 * Class MealBuilder is created on 2019/12/12 23:58.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class MealBuilder {
    public static Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public static Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
