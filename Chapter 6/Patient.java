
public class Patient {

    private int age;
    private int idNum;
    private BloodData bloodData;

    //constructor
    public Patient() {
        this.age = 0;
        this.idNum = 0;
        this.bloodData = new BloodData();
    }

    public Patient(int age, int idNum, BloodData bloodData) {
        this.age = age;
        this.idNum = idNum;
        this.bloodData = bloodData;
    }

    //getters
    public int getAge() {
        return age; 
    }

    public int getIdNum() {
        return idNum; 
    }

    public BloodData getBloodData() {
        return bloodData; 
    }


}
