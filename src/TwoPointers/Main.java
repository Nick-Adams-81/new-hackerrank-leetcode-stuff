package TwoPointers;

public class Main {

    public static void main(String[] args) {
        isPalindrome palindrome = new isPalindrome();

        String str = "A man, a plan, a canal: Panama!";
        String str2 = "hello world!";
        System.out.println(palindrome.isPalindrome(str));
        System.out.println(palindrome.isPalindrome(str2));
    }
}
