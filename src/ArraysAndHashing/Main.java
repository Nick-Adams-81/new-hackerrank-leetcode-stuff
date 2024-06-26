package ArraysAndHashing;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        HasDuplicate duplicate = new HasDuplicate();
        IsAnagram anagram = new IsAnagram();
        TwoSum twoSum = new TwoSum();
        GroupAnagrams anagrams = new GroupAnagrams();
        TopKFrequentElement kEl = new TopKFrequentElement();
        ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();
        LongestConsecutiveSequence seq = new LongestConsecutiveSequence();

        int[] nums = {1,2,3,4,5};
        int[] sums = {3,4,5,6};
        int[] moreNums = {1,2,2,2,3,3,3};
        int[] outputNums = {1,2,4,6};
        int[] randomNums = {2,30,9,3,4,5,12};

        String string1 = "racecar";
        String string2 = "carrace";

        String[] strs = {"hello", "olleh", "tommy", "mymot", "cars", "srac"};

        System.out.println(anagram.isAnagram(string1, string2));
        System.out.println(duplicate.hasDuplicate(nums));
        System.out.println(Arrays.toString(twoSum.twoSum(sums, 7)));
        System.out.println(anagrams.groupAnagrams(strs));
        System.out.println(Arrays.toString(kEl.topKFrequent(moreNums, 2)));
        System.out.println(Arrays.toString(product.productExceptSelf(outputNums)));
        System.out.println(seq.longestConsecutive(randomNums));

    }
}
