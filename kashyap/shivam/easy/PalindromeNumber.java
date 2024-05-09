package kashyap.shivam.easy;

public class PalindromeNumber {

    public static void main(String[] args) {


        System.out.println(new PalindromeNumber().isPalindrome(121));
        System.out.println(new PalindromeNumber().isPalindrome(-121));
        System.out.println(new PalindromeNumber().isPalindrome(-123));
    }

    // 121 should return true

    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }
        if(x < 10){
            return true;
        }

        int number = x, newNum = 0;
        while (number > 0){

            newNum = (newNum * 10) +number % 10;
            number = number / 10;

        }
        if(newNum == x){
            return true;
        }
        return false;


    }
}