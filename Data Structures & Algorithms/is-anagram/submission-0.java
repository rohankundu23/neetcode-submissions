class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> count = new HashMap<>();
        if(s.length() != t.length())
        {
            return false;
        }
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(count.containsKey(s.charAt(i)))
            {
                int a = count.get(s.charAt(i));

                count.put(s.charAt(i),a+1);
            }
            else
            {
                count.put(s.charAt(i),1);
            }
        }
        
        for(int i = 0 ; i < t.length() ; i++)
        {
            if(count.containsKey(t.charAt(i)))
            {
                int a = count.get(t.charAt(i));
                if(a != 1)
                {
                    count.put(t.charAt(i),a-1);
                }
                else
                {
                    count.remove(t.charAt(i));
                }
                
            }
        }
        if(count.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
