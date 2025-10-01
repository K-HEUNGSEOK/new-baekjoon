import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();
        int [] count = new int[26];

        for(int i = 0 ; i < str.length(); i ++){
            count[str.charAt(i) - 'A']++;
        }
      
        
        int max = 0;
        int index = -1;
        int falseCount = 0 ;
        boolean check = true;
        for(int i = 0 ; i < 26; i ++){
            if (max < count[i]){
                max = count[i];
            }
        }
        for(int i = 0 ; i < 26; i ++){
            if (max == count[i]){
                index = i;
                falseCount ++;
            }
            if (falseCount > 1){
                check = false;
            }
        }

        if (check){
        System.out.println((char) (index + 'A'));
        }
        else{
            System.out.println("?");
        }
    }

}
