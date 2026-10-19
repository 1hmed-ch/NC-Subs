class Solution {
    public String makeGood(String s) {
        char[] charArray = s.toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        StringBuilder res = new StringBuilder();
        for(char c : charArray){
            if(!stack.isEmpty() && 
            stack.peek() != c && 
            Character.toLowerCase(stack.peek()) == Character.toLowerCase(c)
            ){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        

        while(!stack.isEmpty()){
            res.append(stack.pop());
        }

        return res.reverse().toString();
    }
}
