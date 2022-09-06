package OOP;
/**
 * Topic: OOP
 * 2) 
 */
public class VisaCard extends CreditCard{

    boolean isCardAcceptable;

    VisaCard(String cardType){
        this.isCardAcceptable = isCardAcceptable(cardType);
        // ...
    }

    /**
     * 3) Implement static polymorphism (override)
     */
    @Override
    public boolean isCardAcceptable(String cardType) {
        if(cardType.equals("VisaCard"))
            return true;
        return false;
    }

    /**
     * 3) Implement dynamic polymorphism (overload)
     */
    public void checkCreadit(String cardHolder){
        // ...
    }
    public void checkCreadit(int cardNumber){
        // ...
    }


}
