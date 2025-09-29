class Solution {
    static int[] left = {1,4,7};
    static int[] right = {3,6,9};
    static int[][] keypad = {
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {-1,0,-1}
    };
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int ltX = 3;
        int ltY = 0;
        int rtX = 3;
        int rtY = 2;
        for(int num : numbers){
            boolean flag = false;
            for(int i = 0; i < 3; i ++){
                if(num == left[i]){
                    sb.append("L");
                    
                    
                    for(int j = 0 ; j < 4; j ++){
                        for(int k = 0 ; k < 3; k ++){
                            if(num == keypad[j][k]){
                                ltX = j;
                                ltY = k;
                                break;
                            }
                        }
                    }
                
                        
                        
                    flag = true;
                    break;
                }
            }
            
            if(!flag){
            for(int i = 0; i < 3; i ++){
                if(num == right[i]){
                    sb.append("R");
                    
                    
                    for(int j = 0 ; j < 4; j ++){
                        for(int k = 0 ; k < 3; k ++){
                            if(num == keypad[j][k]){
                                rtX = j;
                                rtY = k;
                                break;
                            }
                        }
                    }
                    
                    
                    flag = true;
                    break;
                }
            }
            }
            
            if(!flag){
                int tempX = 0;
                int tempY = 0;
                
                   for(int j = 0 ; j < 4; j ++){
                        for(int k = 0 ; k < 3; k ++){
                            if(num == keypad[j][k]){
                                tempX = j;
                                tempY = k;
                                break;
                            }
                        }
                    }
                
                
                int tempL = manhaten(ltX, ltY, tempX, tempY);
                int tempR = manhaten(rtX, rtY, tempX, tempY);
                
                if(tempL == tempR){
                    if(hand.equals("left")){
                        sb.append("L");
                        ltX = tempX;
                        ltY = tempY;
                    }
                    else if(hand.equals("right")){
                        sb.append("R");
                        rtX = tempX;
                        rtY = tempY;
                    }
                }else{
                    int ans = Math.min(tempL,tempR);
                    
                    if(ans == tempL){
                        sb.append("L");
                        ltX = tempX;
                        ltY = tempY;
                    }else{
                         sb.append("R");
                        rtX = tempX;
                        rtY = tempY;
                    }
                }
            }
        }
        return sb.toString();
    }
    static int manhaten(int x1, int y1, int x2, int y2){
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }
}