/*
 * Name:            James Horton
 * Date:            10/18/2018
 * Assignment:      Practice Exercise
 * File:            PetSold.java
 */
package demoitemsandpets;

/**
 *
 * @author Redindianfred
 */
public class PetSold extends ItemsSold
{
    private boolean vacinated;
    private boolean neutered;
    private boolean housebroken;

    public boolean isVacinated() {
        return vacinated;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public boolean isHousebroken() {
        return housebroken;
    }

    public void setVacinated(boolean vacinated) {
        this.vacinated = vacinated;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public void setHousebroken(boolean housebroken) {
        this.housebroken = housebroken;
    }
    
    @Override
    public void printItemsSold()
    {
        super.printItemsSold();
        System.out.println();
        if (!vacinated)
        {
            System.out.println("This pet has NOT been vacinated!");           
        }
        else
            System.out.println("This pet HAS been vacinated!");
        
        if (!neutered)
        {
            System.out.println("This pet has NOT been neutered!");           
        }
        else
            System.out.println("This pet HAS been neutered!");
        
        if (!housebroken)
        {
            System.out.println("This pet has NOT been housebroken!");           
        }
        else
            System.out.println("This pet HAS been housebroken!");
     
    } // end of override printItemsSold
    
} // end of PetSold
