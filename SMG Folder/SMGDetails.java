import java.util.LinkedList;

public class SMGDetails {

    static AddingSMGDetails addingSMGDetails=new AddingSMGDetails();

    public LinkedList<String> addCode(){
        LinkedList<String> smgCode=new LinkedList<>();
        addingSMGDetails.smgCodeInput(smgCode);
        return smgCode;
    }

    public LinkedList<String> addName(){
        LinkedList<String> smgName=new LinkedList<>();
        addingSMGDetails.smgNameInput(smgName);
        return smgName;
    }

    public LinkedList<Integer> addPrice(){
        LinkedList<Integer> smgPrice=new LinkedList<>();
        addingSMGDetails.smgPriceInput(smgPrice);
        return smgPrice;
    }

    public LinkedList<Integer> addDamage(){
        LinkedList<Integer> smgDamage=new LinkedList<>();
        addingSMGDetails.smgDamageInput(smgDamage);
        return smgDamage;
    }

    public LinkedList<String> addRange(){
        LinkedList<String> smgRange=new LinkedList<>();
        addingSMGDetails.smgRangeInput(smgRange);
        return smgRange;
    }

    public LinkedList<String> addDifficuty(){
        LinkedList<String> smgDifficulty=new LinkedList<>();
        addingSMGDetails.smgDifficultyInput(smgDifficulty);
        return smgDifficulty;
    }

    public LinkedList<String> addReloadSpeed(){
        LinkedList<String> smgReloadSpeed=new LinkedList<>();
        addingSMGDetails.smgReloadSpeedInput(smgReloadSpeed);
        return smgReloadSpeed;
    }

    public LinkedList<Integer> addMagazinecapacity(){
        LinkedList<Integer> smgMagazineCapacity=new LinkedList<>();
        addingSMGDetails.smgMagazineCapacityInput(smgMagazineCapacity);
        return smgMagazineCapacity;
    }

    public LinkedList<Integer> addReseveAmmoLimit(){
        LinkedList<Integer> smgReserveAmmoLimit=new LinkedList<>();
        addingSMGDetails.smgReseverAmmoLimitInput(smgReserveAmmoLimit);
        return smgReserveAmmoLimit;
    }

    public LinkedList<String> addScopeStatus(){
        LinkedList<String> smgScopeStatus=new LinkedList<>();
        addingSMGDetails.smgScopeStatusInput(smgScopeStatus);
        return smgScopeStatus;
    }

    public LinkedList<String> addAvailability(){
        LinkedList<String> smgAvailability=new LinkedList<>();
        addingSMGDetails.smgAvailabilityInput(smgAvailability);
        return smgAvailability;
    }
}
