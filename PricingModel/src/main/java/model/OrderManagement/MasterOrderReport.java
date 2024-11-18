
package model.OrderManagement;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class MasterOrderReport {
    private ArrayList<OrderSummary> orderSummaryList;

    public MasterOrderReport() {
        orderSummaryList = new ArrayList<>();
    }

    public void generateOrderReport(ArrayList<Order> orders) {
        for (Order order : orders) {
            OrderSummary orderSummary = new OrderSummary(order);
            orderSummaryList.add(orderSummary);
        }
    }

    public OrderSummary getTopProfitableOrder() {
        OrderSummary currentTopOrder = null;
        for (OrderSummary os : orderSummaryList) {
            if (currentTopOrder == null || os.getOrderProfit() > currentTopOrder.getOrderProfit()) {
                currentTopOrder = os;
            }
        }
        return currentTopOrder;
    }

    // Added methods

    /**
     * Get the number of orders in the report.
     *
     * @return Total number of orders summarized.
     */
    public int getTotalOrdersSummarized() {
        return orderSummaryList.size();
    }
}
