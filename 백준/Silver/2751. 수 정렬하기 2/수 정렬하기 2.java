    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(arr);
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0 ; i < n ; i ++){
                stringBuilder.append(arr[i]).append("\n");
            }

            System.out.println(stringBuilder.toString());

        }
    }