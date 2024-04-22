/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;
import java.util.Scanner;
public class Project1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        ElectronicProduct electronicProduct = new ElectronicProduct( "smartphone",1,1,"Samsung", 599.9f );
        ClothingProduct clothingproduct = new ClothingProduct( "Medium", "Cotton", 2 , "T-shirt", 19.99f);
        BookProduct bookProduct = new BookProduct("O'Reilly", "X Publications", 3, "OOP", 39.99f);
        System.out.println("Welcome to the E-Commerce System! ");
        System.out.println("Enter your ID:");
        int customerId = Math.abs(scanner.nextInt());
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter your address:");
        String address = scanner.next();

        Customer customer = new Customer(customerId, name, address);

        System.out.println("How many products do you want to add to your cart?");
        int numProducts = Math.abs(scanner.nextInt());
        Cart cart = new Cart(customer.getCustomerId(), numProducts);

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Which product would you like to add 1- smartphone , 2- T-shirt , 3-Oop");
            int productId = Math.abs(scanner.nextInt());
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
                    System.out.println("Invalid product ID. Please try again.");
                    i--;
                    continue;
            }
            cart.addproduct(product);
        }

        System.out.println("whould you like to place the order ? 1- yes 2- no");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Order order = new Order(customer.getCustomerId(), 1 );
            cart.placeorder(order, cart);
            order.printOrderInfo();
        } else {
            System.out.println("Thank you for using our E-Commerce system!");
        }

    }
}
    
 

