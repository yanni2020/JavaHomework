package DesignPattern;

/**
 * 2) Create a factory pattern called “CurrencyExchange” which takes in the 
 *    country name and return the currency object for that country.
 */
public class CurrencyExchange {
    public static Currency exchange(String country){
        if(country.equals("China"))
            return new ChineseYuan();
        else if(country.equals("US"))
            return new Dollar();
        else
            return null;
    }
}
