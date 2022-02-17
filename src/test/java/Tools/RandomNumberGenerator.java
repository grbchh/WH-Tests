package Tools;

public class RandomNumberGenerator {

    public String PhoneNumber() {
        int a = 11111111;
        int b = 999999999;
        int c =  a + (int) (Math.random() * b);
        String PhoneNumber = String.valueOf("0"+c);
        return PhoneNumber;
    }

    public String RoutingNumber() {
        int a = 11111111;
        int b = 999999999;
        int c = (a + (int) (Math.random() * b)) + (a + (int) (Math.random() * b));
        String routingNumbers = String.valueOf(c);
        return routingNumbers;
    }

    public String RngForEmail() {
        int a = 0;
        int b = 99999;
        int first = a + (int) (Math.random() * b);
        String randomNumber = String.valueOf(first);
        return randomNumber;

    }

    public String DriverLicense() {
        int a = 1111111;
        int b = 99999999;
        int first = a + (int) (Math.random() * b);
        String randomNumber = String.valueOf(first);

        return randomNumber;
    }

    public String DayOfBirth() {
        int a = 1;
        int b = 28;
        int first = a + (int) (Math.random() * b);
        String randomNumber = String.valueOf(first);

        return randomNumber;
    }

    public String MonthOfBirth() {
        int a = 1;
        int b = 12;
        int first = a + (int) (Math.random() * b);
        String randomNumber = String.valueOf(first);

        return randomNumber;
    }
    public String YearOfBirth() {
        int a = 1955;
        int b = 2000;
        int first = a + (int) (Math.random() * b);
        String randomNumber = String.valueOf(first);

        return randomNumber;
    }
}
