import java.util.*;

public class AddingSMGDetails {
    
    public void smgCodeInput(LinkedList<String> smgCode) {
        smgCode.add("SMG001");
        smgCode.add("SMG002");
        smgCode.add("SMG003");
        smgCode.add("SMG004");
        smgCode.add("SMG005");
        smgCode.add("SMG006");
        smgCode.add("SMG007");
    }

    public void smgNameInput(LinkedList<String> smgName) {
        smgName.add("MP9");
        smgName.add("MAC-10");
        smgName.add("PP-Bizon");
        smgName.add("MP7");
        smgName.add("UMP-45");
        smgName.add("P90");
        smgName.add("MP5-SD");
    }

    public void smgPriceInput(LinkedList<Integer> smgPrice) {
        smgPrice.add(1250);
        smgPrice.add(1050);
        smgPrice.add(1400);
        smgPrice.add(1500);
        smgPrice.add(1200);
        smgPrice.add(2350);
        smgPrice.add(1500);
    }

    public void smgDamageInput(LinkedList<Integer> smgDamage) {
        smgDamage.add(26);
        smgDamage.add(28);
        smgDamage.add(27);
        smgDamage.add(29);
        smgDamage.add(35);
        smgDamage.add(25);
        smgDamage.add(27);
    }

    public void smgRangeInput(LinkedList<String> smgRange) {
        smgRange.add("16.00 meters");
        smgRange.add("12.00 meters");
        smgRange.add("10.00 meters");
        smgRange.add("14.00 meters");
        smgRange.add("11.00 meters");
        smgRange.add("10.00 meters");
        smgRange.add("15.00 meters");
    }

    public void smgDifficultyInput(LinkedList<String> smgDifficulty) {
        smgDifficulty.add("'**'");
        smgDifficulty.add("'**'");
        smgDifficulty.add("'**'");
        smgDifficulty.add("'*'");
        smgDifficulty.add("'**'");
        smgDifficulty.add("'***'");
        smgDifficulty.add("'****'");
        smgDifficulty.add("'**'");
        smgDifficulty.add("'****'");
        smgDifficulty.add("'****'");
    }

    public void smgReloadSpeedInput(LinkedList<String> smgReloadSpeed) {
        smgReloadSpeed.add("2.10 seconds");
        smgReloadSpeed.add("3.20 seconds");
        smgReloadSpeed.add("2.40 seconds");
        smgReloadSpeed.add("3.10 seconds");
        smgReloadSpeed.add("3.50 seconds");
        smgReloadSpeed.add("3.30 seconds");
        smgReloadSpeed.add("3.00 seconds");
    }

    public void smgMagazineCapacityInput(LinkedList<Integer> smgMagazineCapacity) {
        smgMagazineCapacity.add(30);
        smgMagazineCapacity.add(30);
        smgMagazineCapacity.add(54);
        smgMagazineCapacity.add(30);
        smgMagazineCapacity.add(25);
        smgMagazineCapacity.add(50);
        smgMagazineCapacity.add(30);
    }

    public void smgReseverAmmoLimitInput(LinkedList<Integer> smgReserveAmmoLimit) {
        smgReserveAmmoLimit.add(120);
        smgReserveAmmoLimit.add(100);
        smgReserveAmmoLimit.add(120);
        smgReserveAmmoLimit.add(120);
        smgReserveAmmoLimit.add(100);
        smgReserveAmmoLimit.add(100);
        smgReserveAmmoLimit.add(120);
    }

    public void smgScopeStatusInput(LinkedList<String> smgScopeStatus) {
        smgScopeStatus.add("No Scope");
        smgScopeStatus.add("No Scope");
        smgScopeStatus.add("No Scope");
        smgScopeStatus.add("No Scope");
        smgScopeStatus.add("No Scope");
        smgScopeStatus.add("No Scope");
        smgScopeStatus.add("No Scope");
    }

    public void smgAvailabilityInput(LinkedList<String> smgAvailability) {
        smgAvailability.add("Counter-Terrorists");
        smgAvailability.add("Terrorists");
        smgAvailability.add("Counter-Terrorists and Terrorists");
        smgAvailability.add("Counter-Terrorists and Terrorists");
        smgAvailability.add("Counter-Terrorists and Terrorists");
        smgAvailability.add("Counter-Terrorists and Terrorists");
        smgAvailability.add("Counter-Terrorists and Terrorists");
    }
}
