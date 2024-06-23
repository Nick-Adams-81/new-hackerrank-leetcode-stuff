package ArraysAndHashing;

public class Main {


    public static void main(String[] args) {

        HasDuplicate duplicate = new HasDuplicate();
        IsAnagram anagram = new IsAnagram();

        int[] nums = {1,2,3,4,5};
        String string1 = "racecar";
        String string2 = "carrace";

        System.out.println(anagram.isAnagram(string1, string2));
        System.out.println(duplicate.hasDuplicate(nums));

    }
}
