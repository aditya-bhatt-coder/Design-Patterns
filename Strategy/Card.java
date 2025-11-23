public class Card implements PaymentStrategy{
    @Override
    public void getDetails(){
        System.out.println("Getting card details!");
    }

    @Override
    public void pay(){
        System.out.println("Payment Successful via card!");
    }
}