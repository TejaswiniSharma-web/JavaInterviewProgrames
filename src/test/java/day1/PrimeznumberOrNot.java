package day1;
/**@Author:TejaswiniSharma
 **Question:whether the number is prime or not
*
*
* */
public class PrimeznumberOrNot {
    public static void main(String[] args) {
        int num =29;
        boolean isPrime=true;
        for (int i=3;i<num;i++){
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num+"is a prime number");
        }else {
            System.out.println(num+"is a not prime number");
        }
    }
}
