package Java8;

public abstract class CreditCard {
    String holderName, cardType;
    int cardNumber, accountBalance;

    abstract boolean isCardAcceptable(String cardType);

    //Default methods are allowed only in interfaces
    // default void paybill(double bill){
    //     System.out.println();
    // }

    public static void refund(double amount){
        System.out.println("refund: " + amount);
    };
}
