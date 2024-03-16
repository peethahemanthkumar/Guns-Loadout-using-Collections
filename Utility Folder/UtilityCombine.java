import java.util.*;

public class UtilityCombine {

    public LinkedList<UtilityConversion> combinedUtilityList() {

        UtilityDetails utilityDetails=new UtilityDetails();

        LinkedList<String> utilityCode=new LinkedList<>();
        utilityCode=utilityDetails.addCode();

        LinkedList<String> utilityName=new LinkedList<>();
        utilityName=utilityDetails.addName();

        LinkedList<Integer> utilityPrice=new LinkedList<>();
        utilityPrice=utilityDetails.addPrice();

        LinkedList<String> utilityDamage=new LinkedList<>();
        utilityDamage=utilityDetails.addDamage();

        LinkedList<String> utilityRange=new LinkedList<>();
        utilityRange=utilityDetails.addRange();

        LinkedList<String> utilityTime = new LinkedList<>();
        utilityTime = utilityDetails.addTime();

        LinkedList<String> utilityAvilability=new LinkedList<>();
        utilityAvilability=utilityDetails.addAvailability();

        LinkedList<UtilityConversion> utilityList=new LinkedList<>();
        int UtilityListSize=utilityCode.size();


        for(int i=0;i<UtilityListSize;i++)
        {
            UtilityConversion utilityConversion=new UtilityConversion();
            
            utilityConversion.setUtilityCode(utilityCode.get(i));
            utilityConversion.setUtilityName(utilityName.get(i));
            utilityConversion.setUtilityPrice(utilityPrice.get(i));
            utilityConversion.setUtilityDamage(utilityDamage.get(i));
            utilityConversion.setUtilityRange(utilityRange.get(i));
            utilityConversion.setUtilityTime(utilityTime.get(i));
            utilityConversion.setUtilityAvailability(utilityAvilability.get(i));

            utilityList.add(utilityConversion);
        }

        return utilityList;

    }


    

}
