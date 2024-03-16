import java.util.*;

public class PrintingHeavyDetails {
    
    public void printHeavy() {
        
        HeavyCombine heavyCombine = new HeavyCombine();

        LinkedList<HeavyConversion> heavyList=new LinkedList<>();
        heavyList = heavyCombine.combinedHeavyList();

        Iterator<HeavyConversion> it=heavyList.iterator();
        while (it.hasNext()) {
            
            HeavyConversion heavyConversion = (HeavyConversion) it.next();

            System.out.print("Heavy CODE:- "+heavyConversion.getHeavyCode()+" ");
            System.out.print("Heavy NAME:- "+heavyConversion.getHeavyName()+"\n");
            System.out.print("Heavy Price:- "+heavyConversion.getHeavyPrice()+" ");
            System.out.print("Heavy Damage:- "+heavyConversion.getHeavyDamage()+"\n");
            System.out.print("Heavy Range:- "+heavyConversion.getHeavyRange()+" ");
            System.out.print("Heavy Difficulty:- "+heavyConversion.getHeavyDifficulty()+"\n");
            System.out.print("Heavy ReloadSpeed:- "+heavyConversion.getHeavyReloadSpeed()+" ");
            System.out.print("Heavy MagazineCapacity:- "+heavyConversion.getHeavyMagazineCapacity()+"\n");
            System.out.print("Heavy ReserveAmmoLimit:- "+heavyConversion.getHeavyReserveAmmoLimit()+" ");
            System.out.print("Heavy ScopeStatus:- "+heavyConversion.getHeavyScopeStatus()+"\n");
            System.out.println("Heavy Availability:- "+heavyConversion.getHeavyAvailability()+"\n");
        }
    }
}
