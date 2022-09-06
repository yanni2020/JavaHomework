package Java8;

public class MasterCard extends CreditCard{

    MasterCard(){}

    @Override
    boolean isCardAcceptable(String cardType) {
        if(cardType.equals("MaserCard"))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        MasterCard.refund(99.11);
    }
}
