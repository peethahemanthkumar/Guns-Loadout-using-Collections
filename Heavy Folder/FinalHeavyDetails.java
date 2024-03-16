import java.util.*;

public class FinalHeavyDetails {

    public static void main(String[] args) throws Exception {

        HeavyCombine HeavyCombine = new HeavyCombine();

        LinkedList<HeavyConversion> HeavyList = new LinkedList<>();
        HeavyList = HeavyCombine.combinedHeavyList();

        ListIterator<HeavyConversion> it = HeavyList.listIterator();
        while( it.hasNext() ) {
            HeavyConversion HeavyConversion = (HeavyConversion) it.next();

            System.out.print("Heavy Code :- " + HeavyConversion.getHeavyCode() + " , ");
            System.out.print("Heavy Name :- " + HeavyConversion.getHeavyName() + "\n");
            System.out.print("Heavy Price :- " + HeavyConversion.getHeavyPrice() + " , ");
            System.out.print("Heavy Damage :- " + HeavyConversion.getHeavyDamage() + "\n");
            System.out.print("Heavy Range :- " + HeavyConversion.getHeavyRange() + " , ");
            System.out.print("Heavy Difficulty :- " + HeavyConversion.getHeavyDifficulty() + "\n");
            System.out.print("Heavy Reload Speed :- " + HeavyConversion.getHeavyReloadSpeed() + " , ");
            System.out.print("Heavy Magazine Capacity :- " + HeavyConversion.getHeavyMagazineCapacity() + "\n");
            System.out.print("Heavy Reserve Ammo Limit :- " + HeavyConversion.getHeavyReserveAmmoLimit() + " , ");
            System.out.print("Heavy Scope Status :- " + HeavyConversion.getHeavyScopeStatus() + " ,\n");
            System.out.println("Heavy Availability :- " + HeavyConversion.getHeavyAvailability() + ".\n");
        }



    }
}
