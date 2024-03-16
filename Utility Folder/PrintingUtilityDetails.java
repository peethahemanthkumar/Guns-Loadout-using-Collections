import java.util.*;

public class PrintingUtilityDetails {
    
    public void printUtility() {
        
        UtilityCombine utilityCombine = new UtilityCombine();

        LinkedList<UtilityConversion> UtilityList=new LinkedList<>();
        UtilityList = utilityCombine.combinedUtilityList();

        Iterator<UtilityConversion> it=UtilityList.iterator();
        while (it.hasNext()) {
            
            UtilityConversion utilityConversion = (UtilityConversion) it.next();

            System.out.print("Utility CODE:- "+utilityConversion.getUtilityCode()+" ");
            System.out.print("Utility NAME:- "+utilityConversion.getUtilityName()+"\n");
            System.out.print("Utility Price:- "+utilityConversion.getUtilityPrice()+" ");
            System.out.print("Utility Damage:- "+utilityConversion.getUtilityDamage()+"\n");
            System.out.print("Utility Range:- "+utilityConversion.getUtilityRange()+" ");
            System.out.print("Utility Time:- "+utilityConversion.getUtilityTime()+"\n");
            System.out.println("Utility Availability:- "+utilityConversion.getUtilityAvailability()+"\n");
        }
    }
}
