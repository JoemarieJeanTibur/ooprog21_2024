public class BloodData {

    private String bloodType;
    private String rhFactor;

    public BloodData() {
        defaultPatient();
    }

    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    // Setters
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    // Getters
    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

   private void defaultPatient() {
        bloodType = "A";
        rhFactor = "-";
    }

    public void displayBloodInfo() {
        System.out.println();
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh factor is: " + rhFactor);
    }
}
