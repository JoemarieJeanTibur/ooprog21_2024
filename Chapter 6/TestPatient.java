import java.util.Scanner;

class TestPatient {
    public static void main(String[] args) {

        Patient pat = new Patient();
        
        Scanner patient = new Scanner(System.in);

        System.out.println("Enter ID number: ");
        int idNum = patient.nextInt();

        System.out.println("Enter age: ");
        int age = patient.nextInt();
        patient.nextLine(); 

        System.out.println("Enter blood type: ");
        String bloodType = patient.nextLine();

        System.out.println("Enter Rh factor: ");
        String rhFactor = patient.nextLine();

        BloodData bloodData = new BloodData(bloodType, rhFactor);
        Patient patientWithData = new Patient(idNum, age, bloodData);

        System.out.println("\nPatient Information:");
        System.out.println("ID: " + patientWithData.getIdNum());
        System.out.println("Age: " + patientWithData.getAge());
        System.out.println("Blood Type: " + patientWithData.getBloodData().getBloodType());
        System.out.println("Rh Factor: " + patientWithData.getBloodData().getRhFactor());

        patient.close(); 
    }
} 
