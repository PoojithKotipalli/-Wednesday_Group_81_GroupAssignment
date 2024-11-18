/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ProductManagement;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class ProductCatalog {

    private String type;
    private ArrayList<Product> products; // List of products initially empty

    public ProductCatalog(String type) {
        this.type = type;
        this.products = new ArrayList<>(); // Initialize the products list
    }

    // Default constructor with "unknown" type
    public ProductCatalog() {
        this("unknown");
    }

    /**
     * Add a new product with integer pricing.
     *
     * @param name         The name of the product.
     * @param floorPrice   The floor price of the product.
     * @param ceilingPrice The ceiling price of the product.
     * @param targetPrice  The target price of the product.
     * @return The newly created Product.
     */
    public Product newProduct(String name, int floorPrice, int ceilingPrice, int targetPrice) {
        Product product = new Product(name, floorPrice, ceilingPrice, targetPrice);
        products.add(product);
        return product;
    }

    /**
     * Add a new product with double pricing (actual price included).
     *
     * @param name        The name of the product.
     * @param actualPrice The actual price of the product.
     * @param targetPrice The target price of the product.
     * @return The newly created Product.
     */
    public Product addProduct(String name, double actualPrice, double targetPrice) {
        Product product = new Product(name, actualPrice, targetPrice);
        products.add(product);
        return product;
    }

    /**
     * Generate a product performance report for the catalog.
     *
     * @return A ProductsReport containing summaries for all products.
     */
    public ProductsReport generatProductPerformanceReport() {
        ProductsReport productsReport = new ProductsReport();

        for (Product product : products) {
            ProductSummary productSummary = new ProductSummary(product);
            productsReport.addProductSummary(productSummary);
        }
        return productsReport;
    }

   
    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

   
    public int getTotalProducts() {
        return products.size();
    }

   
    public ArrayList<Product> getProductList() {
        return products;
    }

    
    public String getType() {
        return type;
    }

    
    public void setType(String type) {
        this.type = type;
    }
}