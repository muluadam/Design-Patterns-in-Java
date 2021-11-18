package practice.observer;

/**
 * concrete Practice.observer
 */
public class PriceObserver implements OrderObservable{

    @Override
    public void updated(Order order) {
        double totoal=order.getItemCost();
        if(totoal>500){
            order.setDiscount(20);
        }else if(totoal>200){
            order.setDiscount(20);
        }
    }
}
