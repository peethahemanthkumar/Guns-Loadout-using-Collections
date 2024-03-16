import java.util.*;

public class AddingEquipmentDetails {
    
    public void equipmentCodeInput(LinkedList<String> equipmentCode) {
        equipmentCode.add("EQ001");
        equipmentCode.add("EQ002");
        equipmentCode.add("EQ003");
        equipmentCode.add("EQ004");
        equipmentCode.add("EQ005");
    }

    public void equipmentNameInput(LinkedList<String> equipmentName) {
        equipmentName.add("Kevlar and Helmet");
        equipmentName.add("Defuse Kit or Rescue Kit");
        equipmentName.add("C4 Explosive");
        equipmentName.add("Zeus x27");
        equipmentName.add("Medi-Shot (Deathmatch only)");
    }

    public void equipmentPriceInput(LinkedList<String> equipmentPrice) {
        equipmentPrice.add("1000");
        equipmentPrice.add("200");
        equipmentPrice.add("Free");
        equipmentPrice.add("200");
        equipmentPrice.add("Free");
    }

    public void equipmentAvailabilityInput(LinkedList<String> smgAvailability) {
        smgAvailability.add("Counter-Terrorists and Terrorists");
        smgAvailability.add("Counter-Terrorists");
        smgAvailability.add("Terrorists");
        smgAvailability.add("Counter-Terrorists and Terrorists");
        smgAvailability.add("Counter-Terrorists and Terrorists");
    }
}
