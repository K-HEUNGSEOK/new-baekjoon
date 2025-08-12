class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        boolean flag = false;
        for(int i = 1 ; i < total ; i++){
            for(int j = 1; j <= i ; j ++){
                if (i * j == total){
                    if((i - 2) * (j -2) == yellow){
                    answer[0]= i;
                    answer[1] = j;
                    flag = true;
                    break;
                        }
                }
            }
            if (flag){
                break;
            }
        }
        return answer;
    }
}