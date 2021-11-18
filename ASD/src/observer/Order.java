package practice.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * this is observable  concrete classe
 * Observable interface is optional
 */
public class Order {
    private String id;
    private double itemCost;
    private  int count;
    private  double discount ;
public  double shippingCost;

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public double getDiscount() {
        return discount;
    }


    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Order(String id){
         this.id=id;
    }

    private List<OrderObservable> observers= new ArrayList<>();
    public void attach(OrderObservable observable){
        observers.add(observable);
    }
    public void detach(OrderObservable observable){
        observers.remove(observable);
    }



    public double getItemCost() {
        return itemCost-discount;
    }

public void addItem(double price){
        itemCost+=price;
        count++;
        observers.forEach(o->o.updated(this)); // senders notification to state changes
}
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Practice.observer.Order{" +
                "id='" + id + '\'' +
                ", itemCost=" + itemCost +
                ", count=" + count +
                ", discount=" + discount +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
