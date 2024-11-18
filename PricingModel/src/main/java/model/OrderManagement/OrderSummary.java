/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.OrderManagement;

/**
 *
 * @author kal bugrara
 */
public class OrderSummary {
    private int salesVolume;
    private boolean totalAboveTarget;
    private int orderPricePerformance;
    private int numberOfOrderItemsAboveTarget;

    public OrderSummary(Order o) {
        salesVolume = o.getOrderTotal();
        totalAboveTarget = o.isOrderAboveTotalTarget();
        orderPricePerformance = o.getOrderPricePerformance();
        numberOfOrderItemsAboveTarget = o.getNumberOfOrderItemsAboveTarget();
    }

    public int getOrderProfit() {
        return orderPricePerformance;
    }
}
