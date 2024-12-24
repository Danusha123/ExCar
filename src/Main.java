public class Main {
    public static void main(String[] args) {

        MyData myRequirement = new MyData();
        myRequirement.setMyName("Danusha Pramode");
        myRequirement.setManufacturerYear(0);
        myRequirement.setMyValue(0);


        CheckMyData checkmydata = new CheckMyData();
        if (myRequirement.getPrice() > 0 && myRequirement.getManufacturerYear() > 0) {
            checkmydata.findCars(myRequirement);
        } else {
            checkmydata.findCars();
        }


    }
}