class Lease {
    private String tenantName;
    private int apartNum;
    private double rentAmonth;
    private int leaseinMonth;

    public Lease() {
        tenantName = "XXX";
        apartNum = 0;
        rentAmonth = 1000;
        leaseinMonth = 12;
    }

    public Lease(String tenantName, int apartNum, double rentAmonth, int leaseinMonth) {
     this.tenantName = tenantName;
     this.apartNum = apartNum;
     this.rentAmonth = rentAmonth;
     this.leaseinMonth = leaseinMonth;
 }

    // setters
   public void setTenantName(String tName) {
        tenantName = tName; 
   }

   public void setApartNum(int aNum) {
        apartNum = aNum; 
   }

   public void setRentAmonth(double rAmonth) {
    rentAmonth = rAmonth;
   }

   public void setLeaseinMonth(int lMonth) {
    leaseinMonth = lMonth;
   }

   //getters
   public String getTenantName() {
    return tenantName;
   }

   public int getApartNum() {
    return apartNum;
   }

   public double getRentAmonth() {
    return rentAmonth;
   }

   public int getLeaseinMonth() {
    return leaseinMonth;
   }

   //nonstatic method
   public void addPetFee(){
        rentAmonth += 10;
        explainPetPolicy();
   }

   public void explainPetPolicy() {
    System.out.println("******************************");
    System.out.println("* The Pet Fee is $10 a month *");
    System.out.println("******************************");
    System.out.println("");
   }




}