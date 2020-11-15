package lab08.exercise2;

public class Validator {
    public static boolean isValidReg(String registrationNumber){
        boolean result = false;

        if(registrationNumber.length() > 6 && registrationNumber.length() < 12){

            if(Character.isDigit(registrationNumber.charAt(0)) && Character.isDigit(registrationNumber.charAt(1)) ){
                if(registrationNumber.charAt(2) == '-') {
                    if ((Character.isUpperCase(registrationNumber.charAt(3)) && Character.isUpperCase(registrationNumber.charAt(4)) &&
                            registrationNumber.charAt(5) == '-') || (Character.isUpperCase(registrationNumber.charAt(3)) &&
                            registrationNumber.charAt(4) == '-' && Character.isDigit(registrationNumber.charAt(5)))) {

                    }

                }
            }
        }

        return result;
    }
}
