import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T = 10;
        int ans = 1;
        while (T-- > 0) {
            int n = sc.nextInt();
            //맨왼쪽 두칸과 맨오른쪽 두칸은 건물을 못지음
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 2; i < n - 2; i++) {
                if (arr[i] <= 0) continue;

                if (arr[i - 1] < arr[i] && arr[i - 2] < arr[i] && arr[i] > arr[i + 1] && arr[i] > arr[i + 2]) {
                    int max = Math.max(arr[i - 1], arr[i - 2]);
                    max = Math.max(max, arr[i + 1]);
                    max = Math.max(max, arr[i + 2]);
                    sum += arr[i] - max;
                }
            }
            System.out.println("#" + ans++ + " " + sum);
        }
    }
}