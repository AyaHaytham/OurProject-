package user;

import restaurant.Meal;
import java.util.*;
public class Order {
    public int OrderId;
    public double OrderCoast=0;
    private static int counter = 0;
    List<Meal> order = new ArrayList<>();
    public Order(List <Meal> order) {
        OrderId = counter++;
        for (Meal m : order) {
            OrderCoast+= m.getMealCoast();
            order.add(m);
        }
    }

    public double getOrderCoast() {
        if (OrderCoast <= 0){
            for (Meal order : order) {
                OrderCoast += order.getMealCoast();
                return OrderCoast;}}
        else return OrderCoast;
        return 0;
    }

}
