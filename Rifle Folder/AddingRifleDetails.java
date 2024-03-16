import java.util.*;

public class AddingRifleDetails {
    
    public void RifleCodeInput(LinkedList<String> RifleCode) {
        RifleCode.add("RF001");
        RifleCode.add("RF002");
        RifleCode.add("RF003");
        RifleCode.add("RF004");
        RifleCode.add("RF005");
        RifleCode.add("RF006");
        RifleCode.add("RF007");
        RifleCode.add("RF008");
        RifleCode.add("RF009");
        RifleCode.add("RF010");
        RifleCode.add("RF011");
    }

    public void RifleNameInput(LinkedList<String> RifleName) {
        RifleName.add("FAMAS");
        RifleName.add("Galil AR");
        RifleName.add("M4A4");
        RifleName.add("M4A1-S");
        RifleName.add("AK-47");
        RifleName.add("AUG");
        RifleName.add("SG 553");
        RifleName.add("SSG 08");
        RifleName.add("AWP");
        RifleName.add("SCAR-20");
        RifleName.add("G3SG1");
    }

    public void RiflePriceInput(LinkedList<Integer> RiflePrice) {
        RiflePrice.add(2250);
        RiflePrice.add(1800);
        RiflePrice.add(3100);
        RiflePrice.add(2900);
        RiflePrice.add(2700);
        RiflePrice.add(3300);
        RiflePrice.add(3000);
        RiflePrice.add(1700);
        RiflePrice.add(4750);
        RiflePrice.add(5000);
        RiflePrice.add(5000);
    }

    public void RifleDamageInput(LinkedList<Integer> RifleDamage) {
        RifleDamage.add(30);
        RifleDamage.add(30);
        RifleDamage.add(33);
        RifleDamage.add(38);
        RifleDamage.add(36);
        RifleDamage.add(28);
        RifleDamage.add(30);
        RifleDamage.add(88);
        RifleDamage.add(115);
        RifleDamage.add(80);
        RifleDamage.add(80);
    }

    public void RifleRangeInput(LinkedList<String> RifleRange) {
        RifleRange.add("15.00 meters");
        RifleRange.add("16.00 meters");
        RifleRange.add("28.00 meters");
        RifleRange.add("28.00 meters");
        RifleRange.add("21.70 meters");
        RifleRange.add("28.00 meters");
        RifleRange.add("24.00 meters");
        RifleRange.add("47.00 meters");
        RifleRange.add("69.00 meters");
        RifleRange.add("66.00 meters");
        RifleRange.add("66.00 meters");
    }

    public void RifleDifficultyInput(LinkedList<String> RifleDifficulty) {
        RifleDifficulty.add("'***'");
        RifleDifficulty.add("'***'");
        RifleDifficulty.add("'***'");
        RifleDifficulty.add("'***'");
        RifleDifficulty.add("'****'");
        RifleDifficulty.add("'***'");
        RifleDifficulty.add("'***'");
        RifleDifficulty.add("'****'");
        RifleDifficulty.add("'***'");
        RifleDifficulty.add("'***'");
        RifleDifficulty.add("'***'");
    }

    public void RifleReloadSpeedInput(LinkedList<String> RifleReloadSpeed) {
        RifleReloadSpeed.add("3.30 seconds");
        RifleReloadSpeed.add("3.00 seconds");
        RifleReloadSpeed.add("3.10 seconds");
        RifleReloadSpeed.add("3.10 seconds");
        RifleReloadSpeed.add("2.40 seconds");
        RifleReloadSpeed.add("3.30 seconds");
        RifleReloadSpeed.add("2.80 seconds");
        RifleReloadSpeed.add("3.70 seconds");
        RifleReloadSpeed.add("3.70 seconds");
        RifleReloadSpeed.add("3.10 seconds");
        RifleReloadSpeed.add("4.70 seconds");
    }

    public void RifleMagazineCapacityInput(LinkedList<Integer> RifleMagazineCapacity) {
        RifleMagazineCapacity.add(25);
        RifleMagazineCapacity.add(35);
        RifleMagazineCapacity.add(30);
        RifleMagazineCapacity.add(20);
        RifleMagazineCapacity.add(30);
        RifleMagazineCapacity.add(30);
        RifleMagazineCapacity.add(30);
        RifleMagazineCapacity.add(10);
        RifleMagazineCapacity.add(5);
        RifleMagazineCapacity.add(20);
        RifleMagazineCapacity.add(20);
    }

    public void RifleReseverAmmoLimitInput(LinkedList<Integer> RifleReserveAmmoLimit) {
        RifleReserveAmmoLimit.add(90);
        RifleReserveAmmoLimit.add(90);
        RifleReserveAmmoLimit.add(90);
        RifleReserveAmmoLimit.add(80);
        RifleReserveAmmoLimit.add(90);
        RifleReserveAmmoLimit.add(90);
        RifleReserveAmmoLimit.add(90);
        RifleReserveAmmoLimit.add(90);
        RifleReserveAmmoLimit.add(30);
        RifleReserveAmmoLimit.add(90);
        RifleReserveAmmoLimit.add(90);
    }

    public void RifleScopeStatusInput(LinkedList<String> RifleScopeStatus) {
        RifleScopeStatus.add("No Scope");
        RifleScopeStatus.add("No Scope");
        RifleScopeStatus.add("No Scope");
        RifleScopeStatus.add("No Scope");
        RifleScopeStatus.add("No Scope");
        RifleScopeStatus.add("Scope");
        RifleScopeStatus.add("Scope");
        RifleScopeStatus.add("Scope");
        RifleScopeStatus.add("Scope");
        RifleScopeStatus.add("Scope");
        RifleScopeStatus.add("Scope");
    }

    public void RifleAvailabilityInput(LinkedList<String> RifleAvailability) {
        RifleAvailability.add("Counter-Terrorists");
        RifleAvailability.add("Terrorists");
        RifleAvailability.add("Counter-Terrorists");
        RifleAvailability.add("Counter-Terrorists");
        RifleAvailability.add("Terrorists");
        RifleAvailability.add("Counter-Terrorists");
        RifleAvailability.add("Terrorists");
        RifleAvailability.add("Counter-Terrorists and Terrorists");
        RifleAvailability.add("Counter-Terrorists and Terrorists");
        RifleAvailability.add("Counter-Terrorists");
        RifleAvailability.add("Terrorists");
    }
}
