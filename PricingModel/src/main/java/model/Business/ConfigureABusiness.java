/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.ProductManagement.Product;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

    public static Business initialize() {
        
        Business business = new Business("Demo Business");
        addDemoData(business);

        return business;
    }

    
    private static void addDemoData(Business business) {
        SupplierDirectory supplierDirectory = business.getSupplierDirectory();
        MasterOrderList masterOrderList = business.getMasterOrderList();
        CustomerDirectory customerDirectory = business.getCustomerDirectory();

        for (int i = 1; i <= 10; i++) {
            customerDirectory.addCustomer("Customer " + i);
        }

        for (int i = 1; i <= 5; i++) {
            Supplier supplier = supplierDirectory.newSupplier("Supplier " + i);

            for (int j = 1; j <= 10; j++) {
                double actualPrice = 10 + j;       
                double targetPrice = 15 + j;       
                double ceilingPrice = targetPrice + 10;

                
                Product product = supplier.getProductCatalog().addProduct(
                    "Product " + j + " (Supplier " + i + ")",
                    actualPrice,
                    targetPrice
                );
                product.updateProductPrices((int) actualPrice, (int) ceilingPrice, targetPrice);

               
                for (int k = 1; k <= 10; k++) {
                    CustomerProfile customer = customerDirectory.getCustomerList().get(k % 10); 
                    Order order = masterOrderList.newOrder(customer);

                    double randomizedPrice = targetPrice + (Math.random() * 10 - 5); 
                    int quantity = 1 + (int) (Math.random() * 5); 

                   
                    order.newOrderItem(product, (int) randomizedPrice, quantity);
                }
            }
        }
    }
}
