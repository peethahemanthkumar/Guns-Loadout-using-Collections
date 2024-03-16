import java.util.*;

public class FinalSMGDetails {
    public static void main(String[] args) {      

        SMGCombine smgCombine = new SMGCombine();

        LinkedList<SMGConversion> smgList=new LinkedList<>();
        smgList = smgCombine.combinedSMGList();

        Iterator<SMGConversion> it=smgList.iterator();
        while (it.hasNext()) {
            
            SMGConversion smgConversion = (SMGConversion) it.next();

            System.out.print("SMG CODE:- "+smgConversion.getSmgCode()+" ");
            System.out.print("SMG NAME:- "+smgConversion.getSmgName()+"\n");
            System.out.print("SMG Price:- "+smgConversion.getSmgPrice()+" ");
            System.out.print("SMG Damage:- "+smgConversion.getSmgDamage()+"\n");
            System.out.print("SMG Range:- "+smgConversion.getSmgRange()+" ");
            System.out.print("SMG Difficulty:- "+smgConversion.getSmgDifficulty()+"\n");
            System.out.print("SMG ReloadSpeed:- "+smgConversion.getSmgReloadSpeed()+" ");
            System.out.print("SMG MagazineCapacity:- "+smgConversion.getSmgMagazineCapacity()+"\n");
            System.out.print("SMG ReserveAmmoLimit:- "+smgConversion.getSmgReserveAmmoLimit()+" ");
            System.out.print("SMG ScopeStatus:- "+smgConversion.getSmgScopeStatus()+"\n");
            System.out.println("SMG Availability:- "+smgConversion.getSmgAvailability()+"\n");
        }

    }
}