import java.util.*;

public class RifleCombine {

    public LinkedList<RifleConversion> combinedRifleList() {

        RifleDetails rifleDetails=new RifleDetails();

        LinkedList<String> rifleCode=new LinkedList<>();
        rifleCode=rifleDetails.addCode();

        LinkedList<String> rifleName=new LinkedList<>();
        rifleName=rifleDetails.addName();

        LinkedList<Integer> riflePrice=new LinkedList<>();
        riflePrice=rifleDetails.addPrice();

        LinkedList<Integer> rifleDamage=new LinkedList<>();
        rifleDamage=rifleDetails.addDamage();

        LinkedList<String> rifleRange=new LinkedList<>();
        rifleRange=rifleDetails.addRange();

        LinkedList<String> rifleDifficulty=new LinkedList<>();
        rifleDifficulty=rifleDetails.addDifficuty();

        LinkedList<String> rifleReloadSpeed=new LinkedList<>();
        rifleReloadSpeed=rifleDetails.addReloadSpeed();

        LinkedList<Integer> rifleMagazineCapacity=new LinkedList<>();
        rifleMagazineCapacity=rifleDetails.addMagazinecapacity();

        LinkedList<Integer> rifleReserveAmmoLimit=new LinkedList<>();
        rifleReserveAmmoLimit=rifleDetails.addReseveAmmoLimit();

        LinkedList<String> rifleScopeStatus=new LinkedList<>();
        rifleScopeStatus=rifleDetails.addScopeStatus();

        LinkedList<String> rifleAvilability=new LinkedList<>();
        rifleAvilability=rifleDetails.addAvailability();

        LinkedList<RifleConversion> rifleList=new LinkedList<>();
        int rifleListSize=rifleCode.size();


        for(int i=0;i<rifleListSize;i++)
        {
            RifleConversion rifleConversion=new RifleConversion();
            
            rifleConversion.setRifleCode(rifleCode.get(i));
            rifleConversion.setRifleName(rifleName.get(i));
            rifleConversion.setRiflePrice(riflePrice.get(i));
            rifleConversion.setRifleDamage(rifleDamage.get(i));
            rifleConversion.setRifleRange(rifleRange.get(i));
            rifleConversion.setRifleDifficulty(rifleDifficulty.get(i));
            rifleConversion.setRifleReloadSpeed(rifleReloadSpeed.get(i));
            rifleConversion.setRifleMagazineCapacity(rifleMagazineCapacity.get(i));
            rifleConversion.setRifleReserveAmmoLimit(rifleReserveAmmoLimit.get(i));
            rifleConversion.setRifleScopeStatus(rifleScopeStatus.get(i));
            rifleConversion.setRifleAvailability(rifleAvilability.get(i));

            rifleList.add(rifleConversion);
        }

        return rifleList;

    }


    

}
