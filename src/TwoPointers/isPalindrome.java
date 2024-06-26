package TwoPointers;

public class isPalindrome {

    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1) return true;
        int left = 0;
        int right = s.length() -1;
        while(left <= right) {
            char currentLeft = s.charAt(left);
            char currentRight = s.charAt(right);
            if(!Character.isLetterOrDigit(currentLeft)) left++;
            else if(!Character.isLetterOrDigit(currentRight)) right--;
            else {
                if(Character.toLowerCase(currentLeft) != Character.toLowerCase(currentRight)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
