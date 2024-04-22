/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

public class ElectronicProduct extends Product  {
    String brand;
    int warrantyPeriod;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String brand, int warrantyPeriod, int productId, String name, float price) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
      if (warrantyPeriod>0){  this.warrantyPeriod = warrantyPeriod;}
      else {
          this.warrantyPeriod= Math.abs(warrantyPeriod);
      }
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    
    
    
}
