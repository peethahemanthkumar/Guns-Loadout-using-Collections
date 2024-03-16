import java.util.*;

/**
 * PrintingRifleDetails
 */
public class PrintingRifleDetails {

    public void printRifle() {

        RifleCombine RifleCombine = new RifleCombine();

        LinkedList<RifleConversion> RifleList=new LinkedList<>();
        RifleList = RifleCombine.combinedRifleList();

        Iterator<RifleConversion> it=RifleList.iterator();
        while (it.hasNext()) {
            
            RifleConversion RifleConversion = (RifleConversion) it.next();

            System.out.print("Rifle CODE:- "+RifleConversion.getRifleCode()+" ");
            System.out.print("Rifle NAME:- "+RifleConversion.getRifleName()+"\n");
            System.out.print("Rifle Price:- "+RifleConversion.getRiflePrice()+" ");
            System.out.print("Rifle Damage:- "+RifleConversion.getRifleDamage()+"\n");
            System.out.print("Rifle Range:- "+RifleConversion.getRifleRange()+" ");
            System.out.print("Rifle Difficulty:- "+RifleConversion.getRifleDifficulty()+"\n");
            System.out.print("Rifle ReloadSpeed:- "+RifleConversion.getRifleReloadSpeed()+" ");
            System.out.print("Rifle MagazineCapacity:- "+RifleConversion.getRifleMagazineCapacity()+"\n");
            System.out.print("Rifle ReserveAmmoLimit:- "+RifleConversion.getRifleReserveAmmoLimit()+" ");
            System.out.print("Rifle ScopeStatus:- "+RifleConversion.getRifleScopeStatus()+"\n");
            System.out.println("Rifle Availability:- "+RifleConversion.getRifleAvailability()+"\n");
        }
    }
}