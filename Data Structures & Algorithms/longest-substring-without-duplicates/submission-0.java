class Solution {
    public int lengthOfLongestSubstring(String s) {
        int slow = 0;
        int fast = 0;
        HashSet<Character> mp = new HashSet<>();
        
        int count = 0;
        int prevcount = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            fast = i;
            Character temp = s.charAt(i);
            
            if(!mp.contains(temp))
            {
                mp.add(s.charAt(fast));
            }
            else
            {
                
                while(mp.contains(s.charAt(fast)))
                {
                    mp.remove(s.charAt(slow));
                    slow++;
                }
                mp.add(s.charAt(fast));
                
                count = 0;
                
            }
            int currentLength = fast - slow + 1;
            if(prevcount < currentLength)
            {
                    prevcount = currentLength;
            }
        }
        return prevcount;
    }
}
