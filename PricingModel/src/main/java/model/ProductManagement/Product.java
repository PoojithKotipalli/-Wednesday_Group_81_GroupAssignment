package model.ProductManagement;

import java.util.ArrayList;
import model.OrderManagement.OrderItem;

/**
 *
 * Author: kal bugrara
 */
public class Product {
    private String name;
    private int floorPrice;
    private int ceilingPrice;
    private int targetPrice;
    private double actualPrice; // Added field for actual price
    private int salesBelowTarget;
    private int salesAboveTarget;
    private double revenueBeforeAdjustment;
    private double revenueAfterAdjustment;
    private ArrayList<OrderItem> orderitems;

    // Constructor with actual price
    public Product(String name, double actualPrice, double ceilingPrice) {
        this.name = name;
        this.floorPrice = floorPrice;
        this.ceilingPrice = (int) ceilingPrice;
        this.targetPrice = targetPrice;
        this.actualPrice = actualPrice; // Initialize actual price
        this.orderitems = new ArrayList<>();
    }

    // Constructor without actual price (default actual price to target price)
    public Product(String name, int floorPrice, int ceilingPrice, int targetPrice) {
        this(name, targetPrice, ceilingPrice);
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public int getCeilingPrice() {
        return ceilingPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }
    
    public void setTargetPrice(double targetPrice) {
        this.targetPrice = (int) targetPrice;
    }
    
    public double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalesBelowTarget() {
        return salesBelowTarget;
    }

    public void setSalesBelowTarget(int salesBelowTarget) {
        this.salesBelowTarget = salesBelowTarget;
    }

    public int getSalesAboveTarget() {
        return salesAboveTarget;
    }

    public void setSalesAboveTarget(int salesAboveTarget) {
        this.salesAboveTarget = salesAboveTarget;
    }

    public double getRevenueBeforeAdjustment() {
        return revenueBeforeAdjustment;
    }

    public void setRevenueBeforeAdjustment(double revenueBeforeAdjustment) {
        this.revenueBeforeAdjustment = revenueBeforeAdjustment;
    }

    public double getRevenueAfterAdjustment() {
        return revenueAfterAdjustment;
    }

    public void setRevenueAfterAdjustment(double revenueAfterAdjustment) {
        this.revenueAfterAdjustment = revenueAfterAdjustment;
    }

    // Updates the product prices
    public Product updateProductPrices(int floorPrice, int ceilingPrice, double targetPrice) {
        this.floorPrice = floorPrice;
        this.ceilingPrice = ceilingPrice;
        this.targetPrice = (int) targetPrice;
        this.actualPrice = targetPrice; // Optionally update actual price
        return this;
    }

    public void addOrderItem(OrderItem oi) {
        orderitems.add(oi);
    }

    // Calculates the number of product sales above target
    public int getNumberOfProductSalesAboveTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualAboveTarget()) {
                sum++;
            }
        }
        return sum;
    }

    // Calculates the number of product sales below target
    public int getNumberOfProductSalesBelowTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualBelowTarget()) {
                sum++;
            }
        }
        return sum;
    }

    // Checks if the product is always sold above the target price
    public boolean isProductAlwaysAboveTarget() {
        for (OrderItem oi : orderitems) {
            if (!oi.isActualAboveTarget()) {
                return false;
            }
        }
        return true;
    }

    // Calculates the total price performance of all order items for this product
    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum += oi.calculatePricePerformance(); // Positive and negative values
        }
        return sum;
    }

    // Calculates the total sales volume for this product
    public int getSalesVolume() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum += oi.getOrderItemTotal();
        }
        return sum;
    }

    // Calculates the total revenue for this product
    public double getRevenue() {
        double totalRevenue = 0.0;
        for (OrderItem oi : orderitems) {
            totalRevenue += oi.getOrderItemTotal() * actualPrice; // Actual price times quantity
        }
        return totalRevenue;
    }

    // Calculates the profit margin for this product
    public double getProfitMargin() {
        double totalRevenue = getRevenue();
        double totalCost = 0.0;
        for (OrderItem oi : orderitems) {
            totalCost += oi.getOrderItemTotal() * floorPrice; // Floor price times quantity
        }
        return totalRevenue - totalCost; // Profit = Revenue - Cost
    }

    @Override
    public String toString() {
        return name;
    }
}