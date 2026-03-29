package day1;

public class Basics2 {

    // check odd or even
    static String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    // find reverse of a number
    static int findReverse(int num) {
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;   // get last digit
            reverse = reverse * 10 + digit;
            num = num / 10;         // remove last digit
        }

        return reverse;
    }

    // check palindrome
    static void isPalindrome(int num) {
        int reverse = findReverse(num);

        if (num == reverse) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is Not Palindrome");
        }
    }

    // find power 
    static int findPower(int base , int exp){

        int result = 1;

        while (exp > 0) {
            // check if exponenet is odd or even
            if (exp % 2 == 1){
                result = result * base; // include the base if yes
            }

            // now multiply the base 
            base = base * base;

            //now shrip the exp
            exp = exp / 2;
        }
        return  result;
    }

    
    public static void main(String[] args) {
        /*
        // check even/odd
        System.out.println("5 is " + checkEvenOdd(5));

        // reverse number
        int rev = findReverse(2345);
        System.out.println("Reverse of 2345 is " + rev);

        // palindrome check
        isPalindrome(121);
        isPalindrome(123);
       
       
        //find  power
        int power = findPower(2, 5);
        System.out.println(power);
         */
    }
}