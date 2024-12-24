public class Main {
    public static void main(String[] args) {

        MyData myrequirement = new MyData();
        myrequirement.setMyName("Danusha");
        myrequirement.setManufacturerYear(0);
        myrequirement.setMyValue(0);


        CheckMyData checkmydata = new CheckMyData();
        if (myrequirement.getPrice() > 0 && myrequirement.getManufacturerYear() > 0) {
            checkmydata.findCars(myrequirement);
        } else {
            checkmydata.findCars();
        }


    }
}