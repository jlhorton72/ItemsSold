/*
 * Name:            James Horton
 * Date:            10/18/2018
 * Assignment:      Practice Exercise
 * File:            DemoItemsAndPets.java
 */
package demoitemsandpets;
import java.util.*;
/**
 *
 * @author Redindianfred
 */
public class DemoItemsAndPets 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int inv;
        String desc;
        double price;
        boolean nuet;
        boolean vacd;
        boolean broke;
        String ans;
        
        ItemsSold item = new ItemsSold();
        PetSold aPet = new PetSold();
        
        System.out.println("What is the invoice number: ");
        inv = sc.nextInt();
        item.setNvcNum(inv);
        sc.nextLine();
        System.out.println("What is the desrciption: ");
        desc = sc.nextLine();
        item.setDescrip(desc);
        System.out.println("How much did it cost: ");
        price = sc.nextDouble();
        item.setPrice(price);
        item.printItemsSold();
        
        System.out.println("What is the invoice number: ");
        inv = sc.nextInt();
        aPet.setNvcNum(inv);
        sc.nextLine();
        System.out.println("What is the desrciption: ");
        desc = sc.nextLine();
        aPet.setDescrip(desc);
        System.out.println("How much did it cost: ");
        price = sc.nextDouble();
        aPet.setPrice(price);
        
        System.out.println("Please answer with 'true' or 'false' ");
        System.out.println("Was the pet vaccinated:");
        ans = sc.nextLine();
        vacd = sc.nextBoolean();
        aPet.setVacinated(vacd);
        System.out.println("Please answer with 'true' or 'false' ");
        System.out.println("Was the pet nuetered: ");
        nuet = sc.nextBoolean();
        aPet.setNeutered(nuet);
        System.out.println("Please answer with 'true' or 'false' ");
        System.out.println("Has the pet been house broken: ");
        broke = sc.nextBoolean();
        aPet.setHousebroken(broke);
        
        aPet.printItemsSold();
        
        
    } // end of main
    
} // end of class
