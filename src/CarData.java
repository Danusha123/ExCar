import java.util.ArrayList;
import java.util.List;

public class CarData {

    public List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();

        Car porsh911 = new Car();
        porsh911.setName("porsh911");
        porsh911.setEngineNo("lk1000");
        porsh911.setChassisNo("MN1477");
        porsh911.setEngineCapacity("1000");
        porsh911.setNoOfTyers(4);
        porsh911.setPrice(155000);
        porsh911.setManufacturerYear(2018);
        carList.add(porsh911);

        Car axio = new Car();
        axio.setName("axio");
        axio.setEngineNo("lk2000");
        axio.setChassisNo("MN1480");
        axio.setEngineCapacity("1100");
        axio.setNoOfTyers(4);
        axio.setPrice(200000);
        axio.setManufacturerYear(2019);
        carList.add(axio);

        Car nissangtr = new Car();
        nissangtr.setName("nissangtr");
        nissangtr.setEngineNo("lk3000");
        nissangtr.setChassisNo("MN1490");
        nissangtr.setEngineCapacity("1500");
        nissangtr.setNoOfTyers(4);
        nissangtr.setPrice(250000);
        nissangtr.setManufacturerYear(2020);
        carList.add(nissangtr);

        Car BmWm5 = new Car();
        BmWm5.setName("MBWm5");
        BmWm5.setEngineNo("lk3000");
        BmWm5.setChassisNo("MN1500");
        BmWm5.setEngineCapacity("2000");
        BmWm5.setNoOfTyers(4);
        BmWm5.setPrice(300000);
        BmWm5.setManufacturerYear(2021);
        carList.add(BmWm5);

        return carList;
    }


}
