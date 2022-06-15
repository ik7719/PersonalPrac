package Bus;

import java.util.Scanner;

public class Bus {

    private int maxPassenger;
    private int currentPassenger;
    private int fee;
    private String busNumber;
    private int currentOil;
    private int currentSpeed;
    private Condition condition; // enum import

    Scanner scan = new Scanner(System.in);

    Bus(int maxPassenger, int currentPassenger, int fee, String busNumber, int currentOil, int currentSpeed){

        this.maxPassenger = maxPassenger;
        this.currentPassenger = currentPassenger;
        this.fee = fee;
        this.busNumber = busNumber;
        this.currentOil = currentOil;
        this.currentSpeed = currentSpeed;
        condition = Condition.운행;
    }

    public void drive() {

        if(condition == Condition.차고지행 || currentOil < 10) {
            System.out.println("운행이 불가능합니다.");
        } else {
            System.out.println("버스 운행 10분 전입니다.");
            condition = Condition.운행;
        }

    }

    public void drivingConditionChange() {

        // enum 클래스를 바로 사용할 수는 없고 클래스를 참조할 변수를 선언하고 사용해야 함.
        // TODO : 오일량이 10미만일 경우
        if (currentOil < 10) {
            condition = Condition.차고지행;
            System.out.println("주유가 필요합니다.");
        } else {
            condition = Condition.운행;
            System.out.println("운행이 가능한 상태입니다.");
        }

    }

    public void passengerRide() {
        if(currentPassenger >= maxPassenger || condition != Condition.운행 ) {
            System.out.println("탑승할 수 없습니다.");
        } else {
            currentPassenger++;
            System.out.println("현재 탑승한 승객은 총 " + currentPassenger + "명 입니다.");
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
