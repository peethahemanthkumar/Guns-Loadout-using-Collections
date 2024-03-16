import java.util.LinkedList;

public class HeavyDetails {

    static AddingHeavyDetails addingHeavyDetails=new AddingHeavyDetails();

    public LinkedList<String> addCode(){
        LinkedList<String> heavyCode=new LinkedList<>();
        addingHeavyDetails.heavyCodeInput(heavyCode);
        return heavyCode;
    }

    public LinkedList<String> addName(){
        LinkedList<String> heavyName=new LinkedList<>();
        addingHeavyDetails.heavyNameInput(heavyName);
        return heavyName;
    }

    public LinkedList<Integer> addPrice(){
        LinkedList<Integer> heavyPrice=new LinkedList<>();
        addingHeavyDetails.heavyPriceInput(heavyPrice);
        return heavyPrice;
    }

    public LinkedList<Integer> addDamage(){
        LinkedList<Integer> heavyDamage=new LinkedList<>();
        addingHeavyDetails.heavyDamageInput(heavyDamage);
        return heavyDamage;
    }

    public LinkedList<String> addRange(){
        LinkedList<String> heavyRange=new LinkedList<>();
        addingHeavyDetails.heavyRangeInput(heavyRange);
        return heavyRange;
    }

    public LinkedList<String> addDifficuty(){
        LinkedList<String> heavyDifficulty=new LinkedList<>();
        addingHeavyDetails.heavyDifficultyInput(heavyDifficulty);
        return heavyDifficulty;
    }

    public LinkedList<String> addReloadSpeed(){
        LinkedList<String> heavyReloadSpeed=new LinkedList<>();
        addingHeavyDetails.heavyReloadSpeedInput(heavyReloadSpeed);
        return heavyReloadSpeed;
    }

    public LinkedList<Integer> addMagazinecapacity(){
        LinkedList<Integer> heavyMagazineCapacity=new LinkedList<>();
        addingHeavyDetails.heavyMagazineCapacityInput(heavyMagazineCapacity);
        return heavyMagazineCapacity;
    }

    public LinkedList<Integer> addReseveAmmoLimit(){
        LinkedList<Integer> heavyReserveAmmoLimit=new LinkedList<>();
        addingHeavyDetails.heavyReseverAmmoLimitInput(heavyReserveAmmoLimit);
        return heavyReserveAmmoLimit;
    }

    public LinkedList<String> addScopeStatus(){
        LinkedList<String> heavyScopeStatus=new LinkedList<>();
        addingHeavyDetails.heavyScopeStatusInput(heavyScopeStatus);
        return heavyScopeStatus;
    }

    public LinkedList<String> addAvailability(){
        LinkedList<String> heavyAvailability=new LinkedList<>();
        addingHeavyDetails.heavyAvailabilityInput(heavyAvailability);
        return heavyAvailability;
    }
}
