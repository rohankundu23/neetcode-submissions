class Solution {

    public String encode(List<String> strs) {
        String enc = "";
        for(int i = 0  ; i < strs.size() ; i++)
        {
            String temp = strs.get(i);

            enc = enc+temp.length()+"#"+temp;
        }
        return enc;
    }

    public List<String> decode(String str) {
        List<String> finalstring = new ArrayList<>();
        int stringsize = 0;
        for(int i = 0 ; i < str.length() ; i++)
        {
            Character a = str.charAt(i);

            if(Character.isDigit(a))
            {
                stringsize = stringsize * 10 + (a - '0');
                continue;
            }
            else
            {
                if(a.equals('#'))
                {
                   String g = "";
        int j = 0;

        for(; j < stringsize; j++)
        {
            g = g + str.charAt(i + 1 + j);
        }

        finalstring.add(g);

        i = i + stringsize;
        stringsize = 0;
                }
                
            }
        }
        return finalstring;
    }
}
