import java.util.*;

public class FinalEquipmentDetails {
    public static void main(String[] args) {      

        EquipmentCombine equipmentCombine = new EquipmentCombine();

        LinkedList<EquipmentConversion> equipmentList=new LinkedList<>();
        equipmentList = equipmentCombine.combinedEquipmentList();

        Iterator<EquipmentConversion> it=equipmentList.iterator();
        while (it.hasNext()) {

            EquipmentConversion equipmentConversion = (EquipmentConversion) it.next();

            System.out.print("Equipment CODE:- "+equipmentConversion.getEquipmentCode()+" ");
            System.out.print("Equipment NAME:- "+equipmentConversion.getEquipmentName()+"\n");
            System.out.print("Equipment Price:- "+equipmentConversion.getEquipmentPrice()+" ");
            System.out.println("Equipment Availability:- "+equipmentConversion.getEquipmentAvailability()+"\n");
        }
    }
}