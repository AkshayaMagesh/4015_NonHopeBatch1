package com.ecommerce.main;

import com.ecommerce.service.CartService;
import com.ecommerce.model.*;

public class MainApp {
    public static void main(String[] args) {
        CartService cart = new CartService();
        Product p1 = new Product(1, "iPhone 18 pro MAX", 175000);
        Product p2 = new Product(2, "Redmi Note 15 pro MAX", 60000);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.showCart();
        int totalAmount = cart.calculateTotal();
        System.out.println("Total Amount: $"+ totalAmount);
    }
}
