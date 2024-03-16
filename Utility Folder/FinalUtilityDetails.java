import java.util.*;

public class FinalUtilityDetails {
    public static void main(String[] args) {      

        UtilityCombine utilityCombine = new UtilityCombine();

        LinkedList<UtilityConversion> utilityList=new LinkedList<>();
        utilityList = utilityCombine.combinedUtilityList();

        Iterator<UtilityConversion> it=utilityList.iterator();
        while (it.hasNext()) {
            
            UtilityConversion utilityConversion = (UtilityConversion) it.next();

            System.out.print("Utility CODE:- "+utilityConversion.getUtilityCode()+" ");
            System.out.print("Utility NAME:- "+utilityConversion.getUtilityName()+"\n");
            System.out.print("Utility Price:- "+utilityConversion.getUtilityPrice()+" ");
            System.out.print("Utility Damage:- "+utilityConversion.getUtilityDamage()+"\n");
            System.out.print("Utility Range:- "+utilityConversion.getUtilityRange()+" ");
            System.out.print("Utility Range:- "+utilityConversion.getUtilityTime()+"\n");
            System.out.println("Utility Availability:- "+utilityConversion.getUtilityAvailability()+"\n");
        }

    }
}