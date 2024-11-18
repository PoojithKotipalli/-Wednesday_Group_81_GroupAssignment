/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.OrderManagement;

import java.util.ArrayList;

import model.CustomerManagement.CustomerProfile;
import model.MarketModel.MarketChannelAssignment;
import model.ProductManagement.Product;
import model.SalesManagement.SalesPersonProfile;

/**
 *
 * @author kal bugrara
 */
public class Order {
    private ArrayList<OrderItem> orderItems;
    private CustomerProfile customer;
    private SalesPersonProfile salesperson;
    private String status;

    public Order() {
    }

    public Order(CustomerProfile cp) {
        orderItems = new ArrayList<>();
        customer = cp;
        status = "in process";
    }

    public Order(CustomerProfile cp, SalesPersonProfile sp) {
        orderItems = new ArrayList<>();
        customer = cp;
        salesperson = sp;
        status = "in process";
    }

    public OrderItem newOrderItem(Product p, int actualPrice, int quantity) {
        OrderItem oi = new OrderItem(p, actualPrice, quantity);
        orderItems.add(oi);
        return oi;
    }

    public int getOrderTotal() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            sum += oi.getOrderItemTotal();
        }
        return sum;
    }

    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            sum += oi.calculatePricePerformance();
        }
        return sum;
    }

    public int getNumberOfOrderItemsAboveTarget() {
        int count = 0;
        for (OrderItem oi : orderItems) {
            if (oi.isActualAboveTarget()) {
                count++;
            }
        }
        return count;
    }

    public boolean isOrderAboveTotalTarget() {
        int targetSum = 0;
        for (OrderItem oi : orderItems) {
            targetSum += oi.getOrderItemTargetTotal();
        }
        return getOrderTotal() > targetSum;
    }

    public void cancelOrder() {
        status = "Cancelled";
    }

    public void submit() {
        status = "Submitted";
    }

    public CustomerProfile getCustomer() {
        return customer;
    }
}
