import java.util.*;

public class FinalPistolDetails {

    public static void main(String[] args) throws Exception {

        PistolCombine pistolCombine = new PistolCombine();

        ArrayList<PistolConversion> pistolList = new ArrayList<>();
        pistolList = pistolCombine.combinedPistolList();

        ListIterator<PistolConversion> it = pistolList.listIterator();
        while( it.hasNext() ) {
            PistolConversion pistolConversion = (PistolConversion) it.next();

            System.out.print("Pistol Code :- " + pistolConversion.getPistolCode() + " , ");
            System.out.print("Pistol Name :- " + pistolConversion.getPistolName() + "\n");
            System.out.print("Pistol Price :- " + pistolConversion.getPistolPrice() + " , ");
            System.out.print("Pistol Damage :- " + pistolConversion.getPistolDamage() + "\n");
            System.out.print("Pistol Range :- " + pistolConversion.getPistolRange() + " , ");
            System.out.print("Pistol Difficulty :- " + pistolConversion.getPistolDifficulty() + "\n");
            System.out.print("Pistol Reload Speed :- " + pistolConversion.getPistolReloadSpeed() + " , ");
            System.out.print("Pistol Magazine Capacity :- " + pistolConversion.getPistolMagazineCapacity() + "\n");
            System.out.print("Pistol Reserve Ammo Limit :- " + pistolConversion.getPistolReserveAmmoLimit() + " , ");
            System.out.print("Pistol Scope Status :- " + pistolConversion.getPistolScopeStatus() + " ,\n");
            System.out.println("Pistol Availability :- " + pistolConversion.getPistolAvailability() + ".\n");
        }



    }
}
