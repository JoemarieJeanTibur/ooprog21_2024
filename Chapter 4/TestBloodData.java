import java.util.Scanner;

class TestBloodData {

    public static void main(String[] a) {
    
        Scanner tibur = new Scanner(System.in);

        BloodData bloodData = new BloodData();
        
        System.out.println("Enter Blood Type: ");
        String bloodType = tibur.nextLine();

        System.out.println("ENter Rh Factor:");
        String rhFactor = tibur.nextLine();

        bloodData.setBloodType(bloodType);
        bloodData.setRhFactor(rhFactor);

        bloodData.displayBloodInfo();
    }
}