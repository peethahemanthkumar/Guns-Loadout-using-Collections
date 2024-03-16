import java.util.LinkedList;

public class EquipmentDetails {

    static AddingEquipmentDetails addingEquipmentDetails=new AddingEquipmentDetails();

    public LinkedList<String> addCode(){
        LinkedList<String> EquipmentCode=new LinkedList<>();
        addingEquipmentDetails.equipmentCodeInput(EquipmentCode);
        return EquipmentCode;
    }

    public LinkedList<String> addName(){
        LinkedList<String> EquipmentName=new LinkedList<>();
        addingEquipmentDetails.equipmentNameInput(EquipmentName);
        return EquipmentName;
    }

    public LinkedList<String> addPrice(){
        LinkedList<String> EquipmentPrice=new LinkedList<>();
        addingEquipmentDetails.equipmentPriceInput(EquipmentPrice);
        return EquipmentPrice;
    }

    public LinkedList<String> addAvailability(){
        LinkedList<String> EquipmentAvailability=new LinkedList<>();
        addingEquipmentDetails.equipmentAvailabilityInput(EquipmentAvailability);
        return EquipmentAvailability;
    }
}
