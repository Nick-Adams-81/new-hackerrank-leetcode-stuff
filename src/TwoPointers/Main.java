package TwoPointers;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        isPalindrome palindrome = new isPalindrome();
        TwoSum2 twoSum = new TwoSum2();

        String str = "A man, a plan, a canal: Panama!";
        String str2 = "hello world!";
        int[] nums = {2,7,11,15};

        System.out.println(palindrome.isPalindrome(str));
        System.out.println(palindrome.isPalindrome(str2));
        System.out.println(Arrays.toString(twoSum.twoSum(nums, 9)));
    }
}
