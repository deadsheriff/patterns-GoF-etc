package com.company.Demo;
import com.company.Command.*;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class CommandDemo implements Demo {
    @Override
    public void execute() {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
