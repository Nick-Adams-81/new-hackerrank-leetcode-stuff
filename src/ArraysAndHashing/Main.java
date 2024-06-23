package ArraysAndHashing;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        HasDuplicate duplicate = new HasDuplicate();
        IsAnagram anagram = new IsAnagram();
        TwoSum twoSum = new TwoSum();

        int[] nums = {1,2,3,4,5};
        int[] sums = {3,4,5,6};

        String string1 = "racecar";
        String string2 = "carrace";

        System.out.println(anagram.isAnagram(string1, string2));
        System.out.println(duplicate.hasDuplicate(nums));
        System.out.println(Arrays.toString(twoSum.twoSum(sums, 7)));

    }
}
