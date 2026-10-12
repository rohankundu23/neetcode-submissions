class Solution {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();

        if(s.length()%2 != 0)
        {
            return false;
        }
        for(int i = 0 ; i < s.length();i++)
        {
            if(s.charAt(i)== '['|| s.charAt(i)== '('||s.charAt(i)== '{')
            {
                temp.push(s.charAt(i));
            }
            else
            {
                if(temp.isEmpty())
                {
                    return false;
                }

                char ctemp = temp.peek();

                if(s.charAt(i) == ']' && ctemp == '[')
                {
                    temp.pop();
                }
                
                else if(s.charAt(i) == ')' && ctemp == '(')
                {
                    temp.pop();
                }
                
                else if(s.charAt(i) == '}' && ctemp == '{')
                {
                    temp.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return temp.isEmpty();
    }
}
