import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PaymentStrategy strategy;

        System.out.println("Select Payment method: ");
        System.out.println("1. Card");
        System.out.println("2. Net Banking");
        System.out.println("3. UPI");

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        if(val == 1){
            strategy = new Card();
        } else if(val == 2){
            strategy = new NetBanking();
        } else if(val == 3){
            strategy = new UPI();
        } else{
            System.out.println("Invalid Choice!!!");
            return;
        }

        strategy.getDetails();
        strategy.pay();
    }
}
