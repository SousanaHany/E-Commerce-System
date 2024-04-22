/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

public class Order {
    Cart c1;
     int customerId;
     int orderId;
     Product[] products;
 

    public Order() {
    }

    public Order(int customerId, int orderId) {
        this.customerId = customerId;
        this.orderId = orderId;
        
    }   

    private double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }

    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
        
        for (int i = 0 ; i<c1.nProducts ; i++)
            if(c1.products[i]!=null)
                System.out.println(c1.products[i].toString());
        System.out.println("Total Price: $" + c1.calculatePrice());
    }
}

