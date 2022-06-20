package transForTation;

public class TransportationTest {

    public static void main(String[] args) {

        Bus bus1 = new Bus(
                5,
                4,
                1000,
                11,
                0);
        // 최대 승객수, 현재 탑승한 승객수, 요금, 버스 번호, 주유량, 현재 속도

        bus1.drive();

        Taxi taxi1 = new Taxi(
                "1061 나",
                11,
                50,
                "화성",
                20,
                15,
                1000,
                2000);
        // 택시 번호, 주유량, 현재 속도, 목적지, 기본거리, 목적지까지 거리,
        // 기본 요금, 거리당 요금

        taxi1.drive();

    }
}
