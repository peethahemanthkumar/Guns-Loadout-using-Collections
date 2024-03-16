import java.util.ArrayList;

public class PistolCombine {
    
    public ArrayList<PistolConversion> combinedPistolList() {
        
        PistolDetails pistolDetails = new PistolDetails();

        ArrayList<String> pistolCode = new ArrayList<>();
        pistolCode = pistolDetails.addCode();        
        
        ArrayList<String> pistolName = new ArrayList<>();
        pistolName = pistolDetails.addName();

        ArrayList<Integer> pistolPrice = new ArrayList<>();
        pistolPrice = pistolDetails.addPrice();        

        ArrayList<Integer> pistolDamage=new ArrayList<>();
        pistolDamage=pistolDetails.addDamage();

        ArrayList<String> pistolRange=new ArrayList<>();
        pistolRange=pistolDetails.addRange();

        ArrayList<String> pistolDifficulty=new ArrayList<>();
        pistolDifficulty=pistolDetails.addDifficulty();

        ArrayList<String> pistolReloadSpeed=new ArrayList<>();
        pistolReloadSpeed=pistolDetails.addReloadSpeed();

        ArrayList<Integer> pistolMagazineCapacity=new ArrayList<>();
        pistolMagazineCapacity=pistolDetails.addMagazineCapacity();

        ArrayList<Integer> pistolReserveAmmoLimit=new ArrayList<>();
        pistolReserveAmmoLimit=pistolDetails.addPistolReserveAmmoLimit();

        ArrayList<String> pistolScopeStatus=new ArrayList<>();
        pistolScopeStatus=pistolDetails.addPistolScopeStatus();

        ArrayList<String> pistolAvailability=new ArrayList<>();
        pistolAvailability=pistolDetails.addPistolAvailability();

        ArrayList<PistolConversion> pistolList = new ArrayList<>();

        int pistolListSize = pistolCode.size();


        for ( int i = 0 ; i < pistolListSize ; i++ ) {
            
            PistolConversion pistolConversion = new PistolConversion();
            
            pistolConversion.setPistolCode(pistolCode.get(i));
            pistolConversion.setPistolName(pistolName.get(i));
            pistolConversion.setPistolPrice(pistolPrice.get(i));
            pistolConversion.setPistolDamage(pistolDamage.get(i));
            pistolConversion.setPistolRange(pistolRange.get(i));
            pistolConversion.setPistolDifficulty(pistolDifficulty.get(i));
            pistolConversion.setPistolReloadSpeed(pistolReloadSpeed.get(i));
            pistolConversion.setPistolMagazineCapacity(pistolMagazineCapacity.get(i));
            pistolConversion.setPistolReserveAmmoLimit(pistolReserveAmmoLimit.get(i));
            pistolConversion.setPistolScopeStatus(pistolScopeStatus.get(i));
            pistolConversion.setPistolAvailability(pistolAvailability.get(i));

            pistolList.add(pistolConversion);
        }

        return pistolList;
    }
}
