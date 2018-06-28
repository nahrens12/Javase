public  class Vehicle{


     private    int regNo;
        String make;
        String model;
public String vehicleType;

    public Vehicle(String make, String model, int regNo, String vehicleType) {

        this.regNo = regNo;
        this.make = make;
        this.model = model;
        this. vehicleType = vehicleType;

    }

    public int getRegNo()
    {
return regNo;
    }
    public void setRegNo()
    {
        this.regNo = regNo;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(){
        this.make = make;

    }

        public String getModel()

        {
        return model;

        }


    public void setModel() {

        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{}";
    }
}





