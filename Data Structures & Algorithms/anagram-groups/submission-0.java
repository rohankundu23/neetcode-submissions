class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group = new ArrayList<>();
        String[] dup = new String[strs.length];
        for(int i = 0 ; i < strs.length ; i++)
        {
            String s = strs[i];
            char[] astring = s.toCharArray();

            Arrays.sort(astring);

            String sortedStr = new String(astring);

            dup[i] = sortedStr;

        }

        for(int i = 0 ; i < strs.length ; i++)
        {
            if(dup[i] == "-1")
            {
                continue;
            }
            List<String> childgroup = new ArrayList<>();
            childgroup.add(strs[i]);
            for(int j = i + 1 ; j < strs.length ; j++)
            {
                if(dup[i].equals(dup[j]))
                {
                    childgroup.add(strs[j]);
                    dup[j] = "-1";
                }
            }
            dup[i] = "-1";

            group.add(childgroup);
        }
        return group;


    }
}
