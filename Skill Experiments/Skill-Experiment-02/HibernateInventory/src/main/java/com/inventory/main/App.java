package com.inventory.main;

import com.inventory.dao.ProductDAO;
import com.inventory.entity.Product;

public class App {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        Product p1 = new Product("Laptop", "Gaming Laptop", 75000, 10);
        Product p2 = new Product("Mouse", "Wireless Mouse", 1200, 50);

        //dao.saveProduct(p1);
        //dao.saveProduct(p2);

       //dao.updateProduct(402, 72000, 8);
        dao.deleteProduct(403);
        //dao.deleteProduct(1);
//        dao.deleteProduct(52);
//        dao.deleteProduct(53);
//        dao.deleteProduct(102);
//        dao.deleteProduct(103);
//        dao.deleteProduct(152);
//        dao.deleteProduct(153);
//        dao.deleteProduct(202);
//        dao.deleteProduct(203);
//        dao.deleteProduct(252);
//        dao.deleteProduct(253);
//        dao.deleteProduct(302);
//        dao.deleteProduct(303);
//        dao.deleteProduct(352);
//        dao.deleteProduct(353);
       
        
        
        
    }
}