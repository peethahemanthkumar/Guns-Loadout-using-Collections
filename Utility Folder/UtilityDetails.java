import java.util.LinkedList;

public class UtilityDetails {

    static AddingUtilityDetails addingUtilityDetails=new AddingUtilityDetails();

    public LinkedList<String> addCode(){
        LinkedList<String> utilityCode=new LinkedList<>();
        addingUtilityDetails.utilityCodeInput(utilityCode);
        return utilityCode;
    }

    public LinkedList<String> addName(){
        LinkedList<String> utilityName=new LinkedList<>();
        addingUtilityDetails.utilityNameInput(utilityName);
        return utilityName;
    }

    public LinkedList<Integer> addPrice(){
        LinkedList<Integer> utilityPrice=new LinkedList<>();
        addingUtilityDetails.utilityPriceInput(utilityPrice);
        return utilityPrice;
    }

    public LinkedList<String> addDamage(){
        LinkedList<String> utilityDamage=new LinkedList<>();
        addingUtilityDetails.utilityDamageInput(utilityDamage);
        return utilityDamage;
    }

    public LinkedList<String> addRange(){
        LinkedList<String> utilityRange=new LinkedList<>();
        addingUtilityDetails.utilityRangeInput(utilityRange);
        return utilityRange;
    }
    public LinkedList<String> addTime() {
        LinkedList<String> utilityTime = new LinkedList<>();
        addingUtilityDetails.utilityTimeInput(utilityTime);
        return utilityTime;
    }

    public LinkedList<String> addAvailability(){
        LinkedList<String> utilityAvailability=new LinkedList<>();
        addingUtilityDetails.utilityAvailabilityInput(utilityAvailability);
        return utilityAvailability;
    }
}
