class Solution {

    public boolean isaPalindrome(String s , int left, int right)
    {
        if(left >= right)
        {
            return true;
        }

        if(s.charAt(left) == s.charAt(right))
        {
            return isaPalindrome(s,left+1,right-1);
        }
        else
        {
            return false;
        }
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return isaPalindrome(s,0,s.length()-1);
    }
}
