class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int length=s.length()-1;
        int count=0;

        for(int i=length;i>=0;i--){
            char ch = s.charAt(i);
            if(ch == ' '){
                return count;
            }
            count++;
        }
        return count;
    }
}