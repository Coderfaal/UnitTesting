public class PrimeNumberOrNot {

    public boolean checkPrimerOrNot(double number){

        for (int i = 2; i < number/2; i++) {


            if (number % i == 0) {
                System.out.println("it is prime");
            } else {
                return false;
            }
        }
        return true;
}}
