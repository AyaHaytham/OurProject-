package resturant;

import java.util.*;
public class Menu extends Meal {
    Map<Integer, Meal> menu = new HashMap<Integer, Meal>();
    Map<Integer, Meal> archivedMenu = new HashMap<Integer, Meal>();
    public Menu(String mealName, List <String> ingredient, double mealCoast) {
        super(mealName, ingredient, mealCoast);
        Meal m=new Meal(mealName,ingredients,mealCoast);
        menu.put(mealId,m);
    }
    public void deleteMeal(int mealID){
        Meal remove = menu.remove(mealID);
        archivedMenu.put(mealID,menu.get(mealID));
    }
    public void EditIngredientsMeal(int num,int mealID,String s,double coast){
        Meal meal=menu.get(mealID);
        switch(num){
            case '1'://add ingredient
                meal.addIngredient(meal,s);
                menu.replace(mealID,menu.get(mealID),meal);
                break;
            case '2'://delete ingredient
                meal.deleteIngredient(meal,s);
                menu.replace(mealID,menu.get(mealID),meal);
                break;
            case'3'://Edit name
                meal.setMealName(s);
                menu.replace(mealID,menu.get(mealID),meal);
                break;
            case'4'://Edit coast
                meal.setMealCoast(coast);
                menu.replace(mealID,menu.get(mealID),meal);
                break;
            default:
                System.out.println("Error!! No similar symbol!");
                break;
        }
    }

}