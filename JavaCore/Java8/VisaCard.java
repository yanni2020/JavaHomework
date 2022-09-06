package Java8;

public class VisaCard extends CreditCard{

    @Override
    boolean isCardAcceptable(String cardType) {
        if(cardType.equals("VisaCard"))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        VisaCard.refund(100.11);
    }
    
}
