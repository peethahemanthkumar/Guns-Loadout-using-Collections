import java.util.*;
class PistolDetails {

    static AddingPistolDetails addingDetails = new AddingPistolDetails();

    public ArrayList<String> addCode() {

        ArrayList<String> pistolCode = new ArrayList<>();
        addingDetails.pistolCodeInput(pistolCode);
        return pistolCode;
    }

    public ArrayList<String> addName() {

        ArrayList<String> pistolName = new ArrayList<>();
        addingDetails.pistolNameInput(pistolName);
        return pistolName;
    } 

    public ArrayList<Integer> addPrice() {

        ArrayList<Integer> pistolPrice = new ArrayList<>();
        addingDetails.pistolPriceInput(pistolPrice);
        return pistolPrice;
    } 

    public ArrayList<Integer> addDamage(){
        ArrayList<Integer> pistolDamage=new ArrayList<>();
        addingDetails.pistolDamageInput(pistolDamage);

        return pistolDamage;
    }

    public ArrayList<String> addRange(){
        ArrayList<String> pistolRange=new ArrayList<>();
        addingDetails.pistolRangeInput(pistolRange);

        return pistolRange;
    }

    public ArrayList<String> addDifficulty(){
        ArrayList<String> pistolDifficulty=new ArrayList<>();
        addingDetails.pistolDifficultyInput(pistolDifficulty);

        return pistolDifficulty;
    }

    public ArrayList<String> addReloadSpeed(){
        ArrayList<String> pistolReloadSpeed=new ArrayList<>();
        addingDetails.pistolReloadSpeedInput(pistolReloadSpeed);

        return pistolReloadSpeed;
    }

    public ArrayList<Integer> addMagazineCapacity(){
        ArrayList<Integer> pistolMagazineCapacity=new ArrayList<>();
        addingDetails.pistolMagazineCapacity(pistolMagazineCapacity);

        return pistolMagazineCapacity;
    }

    public ArrayList<Integer> addPistolReserveAmmoLimit(){
        ArrayList<Integer> pistolReserveAmmoLimit=new ArrayList<>();
        addingDetails.pistolReseverAmmoLimit(pistolReserveAmmoLimit);

        return pistolReserveAmmoLimit;
    }

    public ArrayList<String> addPistolScopeStatus(){
        ArrayList<String> pistolScopeStatus=new ArrayList<>();
        addingDetails.pistolScopeStatus(pistolScopeStatus);

        return pistolScopeStatus;
    }

    public ArrayList<String> addPistolAvailability(){
        ArrayList<String> pistolAvailability=new ArrayList<>();
        addingDetails.pistolAvailabilityInput(pistolAvailability);

        return pistolAvailability;
    }
}