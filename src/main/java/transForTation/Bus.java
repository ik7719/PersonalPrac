package transForTation;

import java.util.Scanner;

public class Bus {

    private int maxPassenger;
    private int currentPassenger;
    private int fee;
    private Long busNumber;
    private int currentOil;
    private int currentSpeed;
    private BusCondition busCondition; // enum import

    private final static BusSequence busSequence = new BusSequence();

    Scanner scan = new Scanner(System.in);

    Bus(int maxPassenger, int currentPassenger, int fee, int currentOil, int currentSpeed){

        this.maxPassenger = maxPassenger;
        this.currentPassenger = currentPassenger;
        this.fee = fee;
        this.busNumber = busSequence.nextVal();
        this.currentOil = currentOil;
        this.currentSpeed = currentSpeed;
        busCondition = BusCondition.운행;
    }

    public void drive() {

        if(currentOil < 10) {
            drivingConditionChange();
        } else {
            busCondition = BusCondition.운행;
            System.out.println(busNumber + "번 버스에 손님이 탑승하셨습니다.");
            passengerRide();
        }

    }

    public void drivingConditionChange() {

        // enum 클래스를 바로 사용할 수는 없고 클래스를 참조할 변수를 선언하고 사용해야 함.
        busCondition = BusCondition.차고지행;
        System.out.println("주유가 필요합니다.");

    }

    public void passengerRide() {
        if(currentPassenger >= maxPassenger || busCondition != BusCondition.운행 ) {
            System.out.println("탑승할 수 없습니다.");
        } else {
            currentPassenger++;
            System.out.println("현재 탑승한 승객은 총 " + currentPassenger + "명 입니다.");
            speedChange();
        }
    }

    public void speedChange() {
        if(currentOil < 10) {
            System.out.print("주유량을 확인해주세요.\n");
        } else {
            System.out.println("추가할 속도를 입력해주세요.");
            int plusSpeed = scan.nextInt();
            int resultSpeed = currentSpeed + plusSpeed;
            System.out.println("현재 속도는 " + resultSpeed + "km 입니다.");
        }

    }

}
