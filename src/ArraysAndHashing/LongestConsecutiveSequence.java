package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int maxSequence = 0;
        for(int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int currentSequenceLength = 1;
            if(!set.contains(currentNum -1)) {
                while(set.contains(currentNum +1)) {
                    currentNum++;
                    currentSequenceLength++;
                }
            }
            maxSequence = Math.max(maxSequence, currentSequenceLength);
        }
        return maxSequence;
    }
}
