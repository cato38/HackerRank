import org.apache.commons.validator.routines.InetAddressValidator;

import java.util.Scanner;

class MyRegex {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter ip:");
        String INET4ADDRESS = myObj.nextLine();

        InetAddressValidator validator = InetAddressValidator.getInstance();

        if (validator.isValidInet4Address(INET4ADDRESS)) {
            System.out.print("The IP address " + INET4ADDRESS + " is valid");
        }
        else {
            System.out.print("The IP address " + INET4ADDRESS + " isn't valid");
        }

    }
}
