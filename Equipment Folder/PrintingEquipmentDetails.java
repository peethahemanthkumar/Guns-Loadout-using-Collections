import java.util.*;

public class PrintingEquipmentDetails {
    
    public void printEquipment() {
        
        EquipmentCombine equipmentCombine = new EquipmentCombine();

        LinkedList<EquipmentConversion> equipmentList=new LinkedList<>();
        equipmentList = equipmentCombine.combinedEquipmentList();

        Iterator<EquipmentConversion> it=equipmentList.iterator();
        while (it.hasNext()) {
            
            EquipmentConversion EquipmentConversion = (EquipmentConversion) it.next();

            System.out.print("Equipment CODE:- "+EquipmentConversion.getEquipmentCode()+" ");
            System.out.print("Equipment NAME:- "+EquipmentConversion.getEquipmentName()+"\n");
            System.out.print("Equipment Price:- "+EquipmentConversion.getEquipmentPrice()+" ");
            System.out.println("Equipment Availability:- "+EquipmentConversion.getEquipmentAvailability()+"\n");
        }
    }
}
