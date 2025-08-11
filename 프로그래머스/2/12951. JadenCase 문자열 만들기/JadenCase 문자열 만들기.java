class Solution {
    public String solution(String str) {
          char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean check = true;
        for (char c : arr) {
            if (c == ' '){
                sb.append(' ');
                check = true;
            }else{
                if (check){
                    char upperCase = Character.toUpperCase(c);
                    sb.append(upperCase);
                    check = false;
                }else{
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        return sb.toString();
    }
  
}