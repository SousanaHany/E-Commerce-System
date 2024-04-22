/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

import javax.swing.JOptionPane;

public class Order {
    Cart c1;
     int customerId;
     int orderId;
     Product[] products;
      float totalPrice;
 

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
       String message=" order id: "+ orderId + ", customer id: "+ customerId +", products in order: " ; 
        for (int i = 0 ; i<c1.nProducts ; i++){
            if(c1.products[i]!=null){
    message+=  c1.products[i].toString();    
            }
        }
        
         message+= " total price: $ "+ c1.calculatePrice(); 
              JOptionPane.showMessageDialog( null,message);
    }
}



