package ExceptionHandling;


/**
 * 1)   Define two exceptions “CardTypeException” and “AddressException”. Create 
 *      a separate class “ExceptionHandler” which contains one method 
 *      “handleException”. The method takes input of cardType and address. If 
 *      cardType is “AMEX”, throw CardTypeException. If address is outside US, 
 *      return AddressException, for other errors, just return generic exception
 *      Your exception should be caught and you should display message to tell 
 *      which exception is returned.
 */
public class ExceptionHandler extends Exception{
    
    public ExceptionHandler(){}
    public ExceptionHandler(String msg){super(msg);}

    public static void handleException(String cardType, String address) {
        if(cardType == "AMEX")
            try {
                throw new CardTypeException("card type exceptrion");
            } catch (CardTypeException e) {
                e.printStackTrace();
            }
        else if(address != "US")
            try {
                throw new AddressException("address exception");
            } catch (AddressException e) {
                e.printStackTrace();
            }
        else
            try {
                throw new Exception("generral exception");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }


}