package resturant;

import java.util.ArrayList;
import java.util.List;

public class Meal{
    public int mealId;
    public String mealName;
    private static int counter = 0;
    List <String> ingredients=new ArrayList<>();
    public double mealCoast;
    public Meal(String mealName,List <String> ingredients,double mealCoast) {
        mealId = counter++;
        this.mealName = mealName;
        this.mealCoast=mealCoast;
    }

    public List <String> getIngredients() {
        return ingredients;
    }

    public double getMealCoast() {
        return mealCoast;
    }

    public String getMealName() {
        return mealName;
    }

    public int getMealId() {
        return mealId;
    }

    public void setIngredients(List <String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setMealCoast(double mealCoast) {
        this.mealCoast = mealCoast;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }
    public void addIngredient(Meal meal,String Ingredient){
        List <String> newIngredients=new ArrayList<>();
        newIngredients=meal.getIngredients();
        newIngredients.add(Ingredient);
    }
    public void deleteIngredient(Meal meal,String Ingredient){
        for(String ing:meal.getIngredients()){
            if(ing==Ingredient){
                meal.getIngredients().remove(ing);
            }}}
}
