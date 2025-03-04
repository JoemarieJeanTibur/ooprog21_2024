class Student {

   int idNum;
   String firstName;
   String lastName;
   String mjrCourse;
   int yearLvl;
   
   //constructor
   
      public Student(int idNum, String firstName, String lastName, String mjrCourse, int yearLvl) {
        this.idNum = idNum;
        this.lastName = lastName;
        this.mjrCourse = mjrCourse;   
        this.yearLvl = yearLvl;
        }


   
   //getters
    public int getIdNum() {
        return idNum;
    }
    
    public String getFirstName() {
      return firstName;
    }
    
    public String getLastName() {
      return lastName;
    }
    
    public String getMjrCourse() {
      return mjrCourse;
    }
    
    public int getYearLvl() {
      return yearLvl;
    }
    
    //setters
     public void setIdNum(int numberId) {
      idNum = numberId;
     }
     
     public void setFirstName(String fName) {
      firstName = fName;
     }
     
     public void setLastName(String lName) {
      lastName = lName;
     }
     
     public void setMjrCourse(String cRse) {
      mjrCourse = cRse;
     }
     
     public void setYearlvl(int lvlYr) {
      yearLvl = lvlYr;
     }


}