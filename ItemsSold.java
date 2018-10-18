/*
 * Name:            James Horton
 * Date:            10/18/2018
 * Assignment:      Practice Exercise
 * File:            ItemsSold.java
 */
package demoitemsandpets;

/**
 *
 * @author Redindianfred
 */
public class ItemsSold 
{
    private int nvcNum;
    private String descrip;
    private double price;

    public int getNvcNum() {
        return nvcNum;
    }

    public String getDescrip() {
        return descrip;
    }

    public double getPrice() {
        return price;
    }

    public void setNvcNum(int nvcNum) {
        this.nvcNum = nvcNum;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    

    
    public void printItemsSold()
    {
        System.out.println(nvcNum);
        System.out.println("Items sold: ");
        System.out.println(descrip + "\t\t\t" + price);        
    }
    
} // end of ItemsSold
