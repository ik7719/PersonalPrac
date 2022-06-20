package transForTation;

import java.util.Scanner;

public class Taxi {

    private String taxiNumber;
    private int oil;
    private int currentSpeed;
    private String goal;
    private int distance;
    private int goalDistance;
    private int fee;
    private int distanceFee;

    private TaxiCondition taxiCondition;

    Scanner scan = new Scanner(System.in);

    private int speedResult;
    private int finalFee;

    Taxi(String taxiNumber,
         int oil,
         int currentSpeed,
         String goal,
         int distance,
         int goalDistance,
         int fee,
         int distanceFee){

        this.taxiNumber = taxiNumber;
        this.oil = oil;
        this.currentSpeed = currentSpeed;
        this.goal = goal;
        this.distance = distance;
        this.goalDistance = goalDistance;
        this.fee = fee;
        this.distanceFee = distanceFee;

        taxiCondition = TaxiCondition.일반;
    }

    // 운행시작
    public void drive(){
        if(oil >= 10){
            ride();
        } else {
            System.out.println("주유량이 10L 이상이어야 운행이 가능합니다.");
        }
    }

    // 승객 탑승
    public void ride(){
        if(taxiCondition == TaxiCondition.일반){
            taxiCondition = TaxiCondition.운행중;
            System.out.println("[" + taxiNumber + "]번 택시에 손님이 탑승하셨습니다.");
            speedChange();
            payFee();
        } else {
            System.out.println("현재 [" + taxiNumber + "]번 택시는 운행중이므로 탑승할 수 없습니다.");
        }

    }

    // 속도 변경
    public void speedChange(){

        System.out.println("변경할 속도를 입력해주세요.");
        int plusSpeed = scan.nextInt();
        speedResult = currentSpeed + plusSpeed;
        System.out.println("현재 속도는 " + speedResult + "km 입니다.");
    }

    // 거리당 요금 추가
    public void plusDistanceFee(){

        if(goalDistance > distance){
            finalFee = ( (goalDistance - distance) * distanceFee ) + fee;
        } else {
            finalFee = fee;
        }
    }

    // 요금 결제
    public void payFee(){

        plusDistanceFee();
        System.out.println("최종 요금은 " + finalFee + "원 입니다.");

    }

}
