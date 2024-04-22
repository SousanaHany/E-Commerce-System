/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Project1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        ElectronicProduct electronicProduct = new ElectronicProduct( "smartphone",1,1,"Samsung", 599.9f );
        ClothingProduct clothingproduct = new ClothingProduct( "Medium", "Cotton", 2 , "T-shirt", 19.99f);
        BookProduct bookProduct = new BookProduct("O'Reilly", "X Publications", 3, "OOP", 39.99f);
        
        JOptionPane.showMessageDialog(null, "Welcome to the E-Commerce System! ");
       int customerId = Integer.parseInt(JOptionPane.showInputDialog("Enter your id:"));
       JOptionPane.showMessageDialog(null, "you Id "+ customerId );
       String name = JOptionPane.showInputDialog("Enter your name:");
       JOptionPane.showMessageDialog(null, "Hello "+name);
        String address = JOptionPane.showInputDialog("Enter your address:");
        JOptionPane.showMessageDialog(null, "your address "+address);

        Customer customer = new Customer(customerId, name, address);

         int nomproducts= Integer.parseInt(JOptionPane.showInputDialog("Enter num of products "));
              Cart cart=new Cart(customerId,nomproducts);

        for (int i = 0; i < nomproducts; i++) {
           JOptionPane.showMessageDialog(null, "choose product to add");
           JOptionPane.showMessageDialog(null, "1- smartphone, 2- T-shirt, 3- Oop");
         int productId = Integer.parseInt(JOptionPane.showInputDialog("Enter Your choise"));
            Product product;
            switch (productId) {
                case 1:
                    product = electronicProduct;
                    break;
                case 2:
                    product = clothingproduct;
                    break;
                case 3:
                    product = bookProduct;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid product ID. Please try again.");
                    i--;
                    continue;
            }
            cart.addproduct(product);
        }

         JOptionPane.showMessageDialog(null, " whould you like to place the order ? 1-yes/2-no");
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter your choice: "));
        if (choice == 1) {
            Order order = new Order(customer.getCustomerId(), 1 );
            cart.placeorder(order, cart);
            order.printOrderInfo();
        } else {
            JOptionPane.showMessageDialog(null, "Thank you for using our E-Commerce system!");
        }

    }
}
    
    
 

