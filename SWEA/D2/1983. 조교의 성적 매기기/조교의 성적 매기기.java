import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
 
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int z = 1; z <=T; z ++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

            Student[] arr = new Student[n];
            for (int i = 0; i < n; i++) {
                int f = sc.nextInt();
                int s = sc.nextInt();
                int t = sc.nextInt();
                arr[i] = new Student(i + 1, f, s, t);
            }
            Arrays.sort(arr);
            int cnt = n / 10; //각 알파벳마다 반복횟수를 정해줌
            //등급을 매겨야된다.
            int index = 0;
            for(int i = 0 ; i < 10; i ++){
                for(int j = 0 ; j < cnt; j ++){
                    arr[index++].setGrade(grades[i]);
                }
            }

            for (Student student : arr) {
                if (student.index == k){
                    System.out.println("#" + z + " " + student.grade);
                    break;
                }
            }
        }

    }
    static class Student implements Comparable<Student>{
        private int index, medium, finals, homework;
        private double total;
        private String grade;
        public Student(int index, int medium, int finals, int homework) {
            this.index = index;
            this.medium = medium;
            this.finals = finals;
            this.homework = homework;
            this.total = getTotal();
            grade = null;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        @Override
        public int compareTo(Student o){
           return Double.compare(o.total, this.total);
        }

        double getTotal(){
            return (medium * 0.35) + (finals * 0.45) + (homework * 0.20);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "index=" + index +
                    ", medium=" + medium +
                    ", finals=" + finals +
                    ", homework=" + homework +
                    ", total=" + total +
                    ", grade='" + grade + '\'' +
                    '}';
        }
    }
}
