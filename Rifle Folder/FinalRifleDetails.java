import java.util.*;

public class FinalRifleDetails {

    public static void main(String[] args) throws Exception {

        RifleCombine rifleCombine = new RifleCombine();

        LinkedList<RifleConversion> rifleList = new LinkedList<>();
        rifleList = rifleCombine.combinedRifleList();

        ListIterator<RifleConversion> it = rifleList.listIterator();
        while( it.hasNext() ) {
            RifleConversion RifleConversion = (RifleConversion) it.next();

            System.out.print("Rifle Code :- " + RifleConversion.getRifleCode() + " , ");
            System.out.print("Rifle Name :- " + RifleConversion.getRifleName() + "\n");
            System.out.print("Rifle Price :- " + RifleConversion.getRiflePrice() + " , ");
            System.out.print("Rifle Damage :- " + RifleConversion.getRifleDamage() + "\n");
            System.out.print("Rifle Range :- " + RifleConversion.getRifleRange() + " , ");
            System.out.print("Rifle Difficulty :- " + RifleConversion.getRifleDifficulty() + "\n");
            System.out.print("Rifle Reload Speed :- " + RifleConversion.getRifleReloadSpeed() + " , ");
            System.out.print("Rifle Magazine Capacity :- " + RifleConversion.getRifleMagazineCapacity() + "\n");
            System.out.print("Rifle Reserve Ammo Limit :- " + RifleConversion.getRifleReserveAmmoLimit() + " , ");
            System.out.print("Rifle Scope Status :- " + RifleConversion.getRifleScopeStatus() + " ,\n");
            System.out.println("Rifle Availability :- " + RifleConversion.getRifleAvailability() + ".\n");
        }



    }
}
