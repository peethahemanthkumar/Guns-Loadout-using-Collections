import java.util.LinkedList;

public class RifleDetails {

    static AddingRifleDetails addingRifleDetails=new AddingRifleDetails();

    public LinkedList<String> addCode(){
        LinkedList<String> RifleCode=new LinkedList<>();
        addingRifleDetails.RifleCodeInput(RifleCode);
        return RifleCode;
    }

    public LinkedList<String> addName(){
        LinkedList<String> RifleName=new LinkedList<>();
        addingRifleDetails.RifleNameInput(RifleName);
        return RifleName;
    }

    public LinkedList<Integer> addPrice(){
        LinkedList<Integer> RiflePrice=new LinkedList<>();
        addingRifleDetails.RiflePriceInput(RiflePrice);
        return RiflePrice;
    }

    public LinkedList<Integer> addDamage(){
        LinkedList<Integer> RifleDamage=new LinkedList<>();
        addingRifleDetails.RifleDamageInput(RifleDamage);
        return RifleDamage;
    }

    public LinkedList<String> addRange(){
        LinkedList<String> RifleRange=new LinkedList<>();
        addingRifleDetails.RifleRangeInput(RifleRange);
        return RifleRange;
    }

    public LinkedList<String> addDifficuty(){
        LinkedList<String> RifleDifficulty=new LinkedList<>();
        addingRifleDetails.RifleDifficultyInput(RifleDifficulty);
        return RifleDifficulty;
    }

    public LinkedList<String> addReloadSpeed(){
        LinkedList<String> RifleReloadSpeed=new LinkedList<>();
        addingRifleDetails.RifleReloadSpeedInput(RifleReloadSpeed);
        return RifleReloadSpeed;
    }

    public LinkedList<Integer> addMagazinecapacity(){
        LinkedList<Integer> RifleMagazineCapacity=new LinkedList<>();
        addingRifleDetails.RifleMagazineCapacityInput(RifleMagazineCapacity);
        return RifleMagazineCapacity;
    }

    public LinkedList<Integer> addReseveAmmoLimit(){
        LinkedList<Integer> RifleReserveAmmoLimit=new LinkedList<>();
        addingRifleDetails.RifleReseverAmmoLimitInput(RifleReserveAmmoLimit);
        return RifleReserveAmmoLimit;
    }

    public LinkedList<String> addScopeStatus(){
        LinkedList<String> RifleScopeStatus=new LinkedList<>();
        addingRifleDetails.RifleScopeStatusInput(RifleScopeStatus);
        return RifleScopeStatus;
    }

    public LinkedList<String> addAvailability(){
        LinkedList<String> RifleAvailability=new LinkedList<>();
        addingRifleDetails.RifleAvailabilityInput(RifleAvailability);
        return RifleAvailability;
    }
}
