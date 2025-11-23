public class UPI implements PaymentStrategy{
    @Override
    public void getDetails(){
        System.out.println("Getting UPI details!");
    }

    @Override
    public void pay(){
        System.out.println("Payment Successful via UPI!");
    }
}