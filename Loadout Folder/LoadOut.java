public class LoadOut {
    public static void main(String[] args) {
        
        
        PrintingPistolDetails printingPistolDetails = new PrintingPistolDetails();
        printingPistolDetails.printPistol();

        PrintingSMGDetails printingSMGDetails = new PrintingSMGDetails();
        printingSMGDetails.printSMG();

        PrintingRifleDetails printingRifleDetails = new PrintingRifleDetails();
        printingRifleDetails.printRifle();

        PrintingHeavyDetails printingHeavyDetails = new PrintingHeavyDetails();
        printingHeavyDetails.printHeavy();

        PrintingUtilityDetails printingUtilityDetails = new PrintingUtilityDetails();
        printingUtilityDetails.printUtility();

        PrintingEquipmentDetails printingEquipmentDetails = new PrintingEquipmentDetails();
        printingEquipmentDetails.printEquipment();

       
    } 
}
