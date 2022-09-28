class Solution {
    public boolean isValid(String s) {
        
        Stack stack1 = new Stack();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c== '[' || c=='{' || c=='(')
            {
                stack1.push(c);
                
            }
            else if(stack1.isEmpty())
                return false;
            else if(c==']')
            {
                char p = (char) stack1.pop();
                if(p!='[')
                    return false;
            }
              else if(c=='}')
            {
                char p = (char) stack1.pop();
                if(p!='{')
                    return false;
            }  else if(c==')')
            {
                char p = (char) stack1.pop();
                if(p!= '(')
                    return false;
            }
        }
        
        if(stack1.isEmpty())
            return true;
        else
            return false;
    }
}