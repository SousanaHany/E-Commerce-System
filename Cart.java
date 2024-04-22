/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

public class Cart {
    int customerId;
    int nProducts;
  Product[] products ;

    public Cart() {
    }

    public Cart(int customerId, int nProducts) {
        this.customerId = customerId;
        this.nProducts = nProducts;
        products = new Product[nProducts];
    }

    public void setCustomerId(int customerId) {
       if (customerId>0) {this.customerId = customerId;}
       else {
       this.customerId= Math.abs(customerId);
       
       }
    }

    public void setnProducts(int nProducts) {
       if(nProducts>0){ this.nProducts = nProducts;}
       else{
           this.nProducts = Math.abs(nProducts);
           
       }
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }


    public int getCustomerId() {
        return customerId;
    }

    public int getnProducts() {
        return nProducts;
    }

    public Product[] getProducts() {
        return products;
    }
    
    public void addproduct(Product product){
      for (int i=0 ; i<nProducts ;i++ ){
      if (products[i]==null){
            products[i]=product;
            break;
      }
      else if (i == nProducts-1)
           System.out.println("can't add more products, the cart is full");

      }
    }
    public void removeproduct(Product product){
      for(int i=0; i<nProducts ; i++){
      if(products[i]==product){
      products[i]=null;
      System.out.println("product removed");
      }
      }
    System.out.println("this product is not in the cart");
    }
    public float calculatePrice(){
     float totalprice=0;
        for(int i=0 ; i<nProducts; i++){
          if(products[i]!=null){
          totalprice+= products[i].getPrice();
       }
    }
        return totalprice;
    } 
    public void placeorder(Order o , Cart c){
        o.c1 = c;
        o.products = new Product[c.nProducts];
    } 
    
}

