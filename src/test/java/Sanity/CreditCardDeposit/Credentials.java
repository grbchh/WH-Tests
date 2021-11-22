package Sanity.CreditCardDeposit;

public class Credentials {
    private String CreditCardNumber = "4043883547195057";
    private String CVV = "404";
    private int ExpirationMonth = 9;
    private String ExpirationYear = "2022";
    private String Amount = "1000";
    ///////Getters

    public String getCreditCardNumber() {
        return CreditCardNumber;
    }

    public String getCVV() {
        return CVV;
    }

    public int getExpirationMonth() {
        return ExpirationMonth;
    }

    public String getExpirationYear() {
        return ExpirationYear;
    }

    public String getAmount() {
        return Amount;
    }
}
