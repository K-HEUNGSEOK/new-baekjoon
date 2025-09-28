import java.util.*;
class Solution {
     static String[] alphabet = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public int solution(String s) {
        List<Integer> list = new ArrayList<>();
        int lt = 0;
        while (lt < s.length()){
            if (Character.isDigit(s.charAt(lt))){
                list.add(s.charAt(lt)-'0');
            }else{
                boolean flag = true;
                int rt = lt + 3;
                while (flag){
                    String temp = s.substring(lt, rt);
                    for(int i = 0 ; i < alphabet.length; i ++){
                        if (alphabet[i].equals(temp)){
                            list.add(i);
                            flag = false;
                            break;
                        }
                    }
                    rt ++;
                }
                lt = rt -2;
            }
            lt ++;

        }
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i);
        }
        int ans = Integer.parseInt(sb.toString());
        return ans;
    }
}