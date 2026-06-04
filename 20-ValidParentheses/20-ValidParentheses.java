// Last updated: 6/4/2026, 10:35:40 AM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else if(ch=='}'||ch==']'||ch==')'){
                if(st.isEmpty()) return false;
                int top = st.pop();
                if(ch=='}'&&top!='{'||ch==']'&&top!='['||ch==')'&&top!='('){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}