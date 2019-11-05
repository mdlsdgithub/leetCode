import java.util.Stack;

public class leetcode20 {
    public static void main(String[] args) {
        String s = "{]";
        new leetcode20().isValid(s);
    }
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < chars.length; i++) {
            if ('('==chars[i] ||'{'==chars[i]||'['==chars[i]) {
                stack.push(chars[i]);
            }
            if(')'==chars[i]){
                if(stack.size()>0){
                    char temp = stack.pop();
                    if('('==temp){
                        continue;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }

            }
            if('}'==chars[i]){
                if(stack.size()>0){
                    char temp = stack.pop();
                    if('{'==temp){
                        continue;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }

            }
            if(']'==chars[i]){
                if(stack.size()>0){
                    char temp = stack.pop();
                    if('['==temp){
                        continue;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }

            }
        }
        if(stack.size()==0){
            return true;
        }else{
            return false;
        }
    }
}
