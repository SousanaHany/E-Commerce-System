/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

public class Product {
 int productId ;
 String name;
 float price ; 
    public Product(){
}

    public Product(int productId, String name, float price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void setProductId(int productId) {
        if (productId>0) {  this.productId = productId;}
        else {
            this.productId= Math.abs(productId);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
       if(price>0) {this.price = price;}
       else { this.price= Math.abs(price);
       }
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  name + " - $"  + price;
   }
    }
 
         
    
    

