import java.util.List;

public class CheckMyData {

    public void findCars(MyData myData) {
        CarData cardata = new CarData();
        List<Car> carList = cardata.getCarList();

        for (Car car : carList) {
            if (car.getPrice() <= myData.getMyValue()
                    && car.getManufacturerYear() <= 2024) {
                System.out.println(myData.getMyName() + " you can bye ");
                this.printCarDetails(car);
            }
        }
    }

    public void findCars() {
        CarData cardata = new CarData();
        List<Car> carList = cardata.getCarList();

        for (Car car : carList) {
            this.printCarDetails(car);
        }
    }

    private void printCarDetails(Car car) {
        System.out.println(car.getPrice());
        System.out.println(car.getChassisNo());
        System.out.println(car.getEngineCapacity());
        System.out.println(car.getNoOfTyers());
        System.out.println(car.getName());
        System.out.println("");

    }

}



