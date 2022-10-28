/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author vishwashah
 */
public class ProductCatalog {

    private final List<Product> productCatalog;

    public ProductCatalog() {
        productCatalog = new ArrayList<Product>();
    }

    /**
     *
     * @return
     */
    public List<Product> getProductcatalog() {
        return productCatalog;
    }

    public Product addProduct() {
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }

    public void removeProduct(Product p) {
        productCatalog.remove(p);
    }

    public Product searchProduct(int id) {
        for (Product product : productCatalog) {
            if (product.getModelNumber() == id) {
                return product;
            }
        }
        return null;
    }
}
