package day2;
/*@Author:Tejaswini
* Write a short program that prints each number from 1 to 100 on a new line.
* */
public class ShortProgram {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++  ){
            if( i%15==0){
                System.out.println(i + " Fizz Buzz");
            }
          else if(i%3== 0){
               System.out.println(i + " Fizz");
           }else if(i%5==0){
               System.out.println(i + " Buzz");
           }  else // print the numbers
               System.out.println(i);
        }
    }
}
