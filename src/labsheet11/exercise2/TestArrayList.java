package labsheet11.exercise2;

//TestArrayList.java
/*A driver (test) class that contains the main() method for
testing the functionality of the LineItem and Product classes but this time
an array-list is used for maintaining a collection of LineItem objects and
a separate collection of Product objects. The driver is also testing out
the functionality of the ArrayList class*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestArrayList{
    public static void main(String[] args) {

        // Create Products
        Product p1 = new Product(1, "Red Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Black Marker", "This is a black permanent marker");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        Product p6 = new Product(6, "Protractor", "This is a protractor");
        Product p7 = new Product(7, "Refill Pad", "This is a 150 page refill pad");
        Product p8 = new Product(8, "Eraser", "This is an eraser");
        Product p9 = new Product(9, "Tippex", "This is tippex");
        Product p10 = new Product(10, "Stapler", "This is a stapler");
        Product p11 = new Product(11, "Black Pen","This is a black pen");
        Product p12 = new Product(12, "Blue Pen","This is a blue pen");
        Product p13 = new Product(13, "Red Marker", "This is a red permanent marker");
        Product p14 = new Product(14, "Blue Marker", "This is a blue permanent marker");
        Product p15 = new Product(15, "Calculator", "This is a Casio scientific calculator");

//Create an array-list of Product objects
        ArrayList<Product> allProducts = new ArrayList<Product>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15));
         int choice;

        do{
            choice = Integer.parseInt(JOptionPane.showInputDialog("1. Add a product \n2.Amend a Product \n3.Remove a product" +
                    "\n4. View all Products \n5.Quit \n\n\nPlease enter your choice"));

            while(choice<0 || choice>6){
                choice = Integer.parseInt(JOptionPane.showInputDialog("1. Add a product \n2.Amend a Product \n3.Remove a product" +
                        "\n4. View all Products \n5.Quit \n\n\nInvalid choice! Must be between 1 and 5"));

            }

            switch (choice){
                case 1:
                    addProduct(allProducts);
                    break;
                case 2:
                    amendProduct(allProducts);
                    break;
                case 3:
                    removeProduct(allProducts);
                    break;
                case 4:
                    viewProducts(allProducts);
                    break;
            }

        }while (choice != 5);

        JOptionPane.showMessageDialog(null,"Thanks for using the system","Fare",JOptionPane.INFORMATION_MESSAGE);




    }

    public static void addProduct(ArrayList<Product> allProducts){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter the product id"));
        String name = JOptionPane.showInputDialog("Please enter the product name");
        String description = JOptionPane.showInputDialog("Please enter the product description");

        Product p = new Product(id,name,description);

        allProducts.add(p);

        JOptionPane.showMessageDialog(null,"Product now created and added to array list","Product Added",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void amendProduct(ArrayList<Product> allProducts){
        String name = JOptionPane.showInputDialog("Please enter the name of the product you wish to amend");
        String contain="";
        for(Product a:allProducts){
            if(a.getName().toLowerCase().contains(name.toLowerCase()))
                contain += "\n" + a.toString();
        }

        int choice = Integer.parseInt(JOptionPane.showInputDialog("The following products matched your search phrase\n\n" + contain + "\n\nEnter the id of the one do you want to amend"));

        int amend = Integer.parseInt(JOptionPane.showInputDialog("The details of the product you wish to amend are: " + allProducts.get(choice-1).toString() + " \n\n\n1. Amend Name\n2. Amend Description\n3.Cancel Amendment \n\n\nPlease enter your choice"));

        while(amend < 0 || amend > 6){
            amend = Integer.parseInt(JOptionPane.showInputDialog("The details of the product you wish to amend are: " + allProducts.get(choice-1).toString() + " \n\n\n1. Amend Name\n2. Amend Description\n3.Cancel Amendment \n\n\nInvalid! Please enter your choice"));
        }

        switch (amend){
            case 1:
                String named = JOptionPane.showInputDialog("Please enter the new name for the product");
                allProducts.get(choice - 1).setName(named);
                JOptionPane.showMessageDialog(null,"Product details now amended","Product amended",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                String description = JOptionPane.showInputDialog("Please enter new description");
                allProducts.get(choice-1).setDescription(description);
                JOptionPane.showMessageDialog(null,"Product details now amended","Product amended",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                break;
        }

    }

    public static void removeProduct(ArrayList<Product> allProducts){
        String name = JOptionPane.showInputDialog("Enter the name of the product you wish to delete");
        String list="";
        for(Product a:allProducts){
            if(a.getName().toLowerCase().contains(name.toLowerCase())){
                list += "\n"+a.toString();
            }
        }

        int choice = Integer.parseInt(JOptionPane.showInputDialog("The following products matched your search\n" + list + "\n\nPlease enter the id of the one you wish to remove"));

        int remove = JOptionPane.showConfirmDialog(null,"The details of the product \n\n" + allProducts.get(choice-1).toString() + "are you sure wish to delete","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);

        if(remove == JOptionPane.YES_OPTION){
            allProducts.remove(choice-1);
            JOptionPane.showMessageDialog(null,"Product now removed from array list","Product Removed",JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null,"Product removal cancelled","Product Not Removed",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void viewProducts(ArrayList<Product> allProducts){
        String list="";

        for(Product a:allProducts){
            if(a != null){
                list += a.toString() + "\n";
            }
        }

        JOptionPane.showMessageDialog(null,list,"List of all Products",JOptionPane.INFORMATION_MESSAGE);
    }
}
