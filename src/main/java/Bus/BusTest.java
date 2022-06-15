package Bus;

public class BusTest {

    public static void main(String[] args) {

        Bus bus1 = new Bus(5, 5, 1000, "5530 가", 11, 0);
        // 최대 승객수, 현재 탑승한 승객수, 요금, 버스 번호, 주유량, 현재 속도

        bus1.drive();
        bus1.drivingConditionChange();
        bus1.passengerRide();
        bus1.speedChange();

    }
}
