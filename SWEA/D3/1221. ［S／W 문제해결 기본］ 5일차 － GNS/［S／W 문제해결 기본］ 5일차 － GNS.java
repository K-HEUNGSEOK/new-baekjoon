import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    static String[] arr = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int z = 1 ; z<= T;  z++){
            String first = sc.nextLine();
            String[] command = first.split(" ");

            int n = Integer.parseInt(command[1]);

            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str);
            Test[] test = new Test[n];
            for(int i = 0 ; i < n ; i ++){
                test[i] = new Test(st.nextToken());
            }

            Arrays.sort(test);

            System.out.println("#" + z + " ");
            for(Test t : test){
                System.out.print(t.name + " ");
            }
            System.out.println();
        }
    }
    static class Test implements Comparable<Test>{
        String name;
        int index;
        public Test(String name){
            this.name = name;
            this.index = getIndex(name);
        }

        public int getIndex(String name){
            for(int i = 0 ; i < arr.length ; i ++){
                if(arr[i].equals(name)){
                    return i;
                }
            }
            return -1;
        }
        @Override
        public int compareTo(Test o){
            return this.index - o.index;
        }


        @Override
        public String toString() {
            return "Test{" +
                    "name='" + name + '\'' +
                    ", index=" + index +
                    '}';
        }
    }
}


