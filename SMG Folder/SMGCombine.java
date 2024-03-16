import java.util.*;

public class SMGCombine {

    public LinkedList<SMGConversion> combinedSMGList() {

        SMGDetails smgDetails=new SMGDetails();

        LinkedList<String> smgCode=new LinkedList<>();
        smgCode=smgDetails.addCode();

        LinkedList<String> smgName=new LinkedList<>();
        smgName=smgDetails.addName();

        LinkedList<Integer> smgPrice=new LinkedList<>();
        smgPrice=smgDetails.addPrice();

        LinkedList<Integer> smgDamage=new LinkedList<>();
        smgDamage=smgDetails.addDamage();

        LinkedList<String> smgRange=new LinkedList<>();
        smgRange=smgDetails.addRange();

        LinkedList<String> smgDifficulty=new LinkedList<>();
        smgDifficulty=smgDetails.addDifficuty();

        LinkedList<String> smgReloadSpeed=new LinkedList<>();
        smgReloadSpeed=smgDetails.addReloadSpeed();

        LinkedList<Integer> smgMagazineCapacity=new LinkedList<>();
        smgMagazineCapacity=smgDetails.addMagazinecapacity();

        LinkedList<Integer> smgReserveAmmoLimit=new LinkedList<>();
        smgReserveAmmoLimit=smgDetails.addReseveAmmoLimit();

        LinkedList<String> smgScopeStatus=new LinkedList<>();
        smgScopeStatus=smgDetails.addScopeStatus();

        LinkedList<String> smgAvilability=new LinkedList<>();
        smgAvilability=smgDetails.addAvailability();

        LinkedList<SMGConversion> smgList=new LinkedList<>();
        int smgListSize=smgCode.size();


        for(int i=0;i<smgListSize;i++)
        {
            SMGConversion smgConversion=new SMGConversion();
            
            smgConversion.setSmgCode(smgCode.get(i));
            smgConversion.setSmgName(smgName.get(i));
            smgConversion.setSmgPrice(smgPrice.get(i));
            smgConversion.setSmgDamage(smgDamage.get(i));
            smgConversion.setSmgRange(smgRange.get(i));
            smgConversion.setSmgDifficulty(smgDifficulty.get(i));
            smgConversion.setSmgReloadSpeed(smgReloadSpeed.get(i));
            smgConversion.setSmgMagazineCapacity(smgMagazineCapacity.get(i));
            smgConversion.setSmgReserveAmmoLimit(smgReserveAmmoLimit.get(i));
            smgConversion.setSmgScopeStatus(smgScopeStatus.get(i));
            smgConversion.setSmgAvailability(smgAvilability.get(i));

            smgList.add(smgConversion);
        }

        return smgList;

    }


    

}
