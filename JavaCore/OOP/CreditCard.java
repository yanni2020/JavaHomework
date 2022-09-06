package OOP;
/**
 * Topic: OOP
 * 2) Define an abstract class “CreditCard” which contains fields (holderName,
 *    cardNumber, accountBalance, cardType), and not-implemented method 
 *    “isCardAcceptable” with argument cardType, and implemented method 
 *    “payBill(double bill)”. Define two classes “VisaCard” and “MasterCard” 
 *    both should inherit this “CreditCard” class and you should define 
 *    constructor for both classes and implement the “isCardAcceptable” method. 
 *    // difference between abstract method and interface
 */
public abstract class CreditCard {
    private String holderName, cardType;
    private int cardNumber, accountBalance;

    public boolean isCardAcceptable(String cardType){
        return true;
    }
    
    public void payBill(double bill) {
        
    }
}
