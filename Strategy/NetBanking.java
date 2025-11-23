public class NetBanking implements PaymentStrategy{
    @Override
    public void getDetails(){
        System.out.println("Getting bank details!");
    }

    @Override
    public void pay(){
        System.out.println("Payment Successful via Net banking!");
    }
}