import java.util.*;

public class EquipmentCombine {

    public LinkedList<EquipmentConversion> combinedEquipmentList() {

        EquipmentDetails equipmentDetails=new EquipmentDetails();

        LinkedList<String> equipmentCode=new LinkedList<>();
        equipmentCode=equipmentDetails.addCode();

        LinkedList<String> equipmentName=new LinkedList<>();
        equipmentName=equipmentDetails.addName();

        LinkedList<String> equipmentPrice=new LinkedList<>();
        equipmentPrice=equipmentDetails.addPrice();

        LinkedList<String> equipmentAvilability=new LinkedList<>();
        equipmentAvilability=equipmentDetails.addAvailability();

        LinkedList<EquipmentConversion> equipmentList=new LinkedList<>();
        int equipmentListSize=equipmentCode.size();


        for(int i=0;i<equipmentListSize;i++)
        {
            EquipmentConversion equipmentConversion=new EquipmentConversion();
            
            equipmentConversion.setEquipmentCode(equipmentCode.get(i));
            equipmentConversion.setEquipmentName(equipmentName.get(i));
            equipmentConversion.setEquipmentPrice(equipmentPrice.get(i));
            equipmentConversion.setEquipmentAvailability(equipmentAvilability.get(i));

            equipmentList.add(equipmentConversion);
        }

        return equipmentList;

    }


    

}

