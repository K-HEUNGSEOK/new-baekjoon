class Solution {
     static int height, width, rx,lx,ry,ly;
    static char[][] arr;
    public int[] solution(String[] wallpaper) {
        
        StringBuilder sb = new StringBuilder();
        for (String s : wallpaper) {
            for(int i = 0 ; i < s.length(); i ++){
                if (s.charAt(i) == '.' || s.charAt(i) == '#'){
                    sb.append(s.charAt(i));
                }
            }
            sb.append("\n");
        }

        String string = sb.toString();
        String[] split1 = string.split("\n");
        height = split1.length;
        width = split1[0].length();
        arr = new char[height][width];

        for(int i = 0 ; i < split1.length; i ++){
            arr[i] = split1[i].toCharArray();
        }

        //입력끝
         lx = 0;
         ly = 0;
         rx = 0;
         ry = 0;
         //먼저 lx ly 찾기
         boolean flag = false;
        for(int i = 0;  i < height; i ++){
            if (flag) break;
            for(int j = 0 ; j < width; j ++){
                if (check(i,j)){
                    lx = i;
                    ly = j;
                    flag = true;
                    break;
                }
            }
        }
        //rx ry 찾기
        for(int i = lx;  i < height; i ++){
            for(int j = ly ; j < width; j ++){
                if (check(i,j)){
                    rx = i;
                    ry = j;
                }
            }
        }
        int[]ans = new int[4];
        ans[0] = lx;
        ans[1] = ly;
        ans[2] = rx+1;
        ans[3] = ry+1;
        return ans;
    }
     static boolean check(int x, int y){
        boolean flag = false;
        //세로 확인
        for(int i = 0; i < height; i ++){
            if (arr[i][y] == '#'){
                flag = true;
                break;
            }
        }
        //가로 확인
        if (!flag) return false;
        for(int i = 0; i < width; i ++){
            if (arr[x][i] == '#'){
                return true;
            }
        }


        return false;
    }
}