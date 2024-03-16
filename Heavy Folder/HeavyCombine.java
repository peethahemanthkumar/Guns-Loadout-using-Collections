import java.util.*;

public class HeavyCombine {

    public LinkedList<HeavyConversion> combinedHeavyList() {

        HeavyDetails heavyDetails=new HeavyDetails();

        LinkedList<String> heavyCode=new LinkedList<>();
        heavyCode=heavyDetails.addCode();

        LinkedList<String> heavyName=new LinkedList<>();
        heavyName=heavyDetails.addName();

        LinkedList<Integer> heavyPrice=new LinkedList<>();
        heavyPrice=heavyDetails.addPrice();

        LinkedList<Integer> heavyDamage=new LinkedList<>();
        heavyDamage=heavyDetails.addDamage();

        LinkedList<String> heavyRange=new LinkedList<>();
        heavyRange=heavyDetails.addRange();

        LinkedList<String> heavyDifficulty=new LinkedList<>();
        heavyDifficulty=heavyDetails.addDifficuty();

        LinkedList<String> heavyReloadSpeed=new LinkedList<>();
        heavyReloadSpeed=heavyDetails.addReloadSpeed();

        LinkedList<Integer> heavyMagazineCapacity=new LinkedList<>();
        heavyMagazineCapacity=heavyDetails.addMagazinecapacity();

        LinkedList<Integer> heavyReserveAmmoLimit=new LinkedList<>();
        heavyReserveAmmoLimit=heavyDetails.addReseveAmmoLimit();

        LinkedList<String> heavyScopeStatus=new LinkedList<>();
        heavyScopeStatus=heavyDetails.addScopeStatus();

        LinkedList<String> heavyAvilability=new LinkedList<>();
        heavyAvilability=heavyDetails.addAvailability();

        LinkedList<HeavyConversion> heavyList=new LinkedList<>();
        int heavyListSize=heavyCode.size();


        for(int i=0;i<heavyListSize;i++)
        {
            HeavyConversion heavyConversion=new HeavyConversion();
            
            heavyConversion.setHeavyCode(heavyCode.get(i));
            heavyConversion.setHeavyName(heavyName.get(i));
            heavyConversion.setHeavyPrice(heavyPrice.get(i));
            heavyConversion.setHeavyDamage(heavyDamage.get(i));
            heavyConversion.setHeavyRange(heavyRange.get(i));
            heavyConversion.setHeavyDifficulty(heavyDifficulty.get(i));
            heavyConversion.setHeavyReloadSpeed(heavyReloadSpeed.get(i));
            heavyConversion.setHeavyMagazineCapacity(heavyMagazineCapacity.get(i));
            heavyConversion.setHeavyReserveAmmoLimit(heavyReserveAmmoLimit.get(i));
            heavyConversion.setHeavyScopeStatus(heavyScopeStatus.get(i));
            heavyConversion.setHeavyAvailability(heavyAvilability.get(i));

            heavyList.add(heavyConversion);
        }

        return heavyList;

    }


    

}
