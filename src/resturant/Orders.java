package resturant;

import user.Order;

import java.util.*;
public class Orders extends Order{
    Queue <Order> orders=new LinkedList<>();
    List <Order> doneOrders=new ArrayList<>();
    List <Order> archivedOrders=new ArrayList<>();
    List <Order> PreparingOrders=new ArrayList<>();

    public Orders(List<Meal> order) {
        super(order);
        Order o=new Order(order);
        orders.offer(o);
    }
    
}
