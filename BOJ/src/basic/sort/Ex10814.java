package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 나이순 정렬(https://www.acmicpc.net/problem/10814)
 */
public class Ex10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            students[i] = new Student(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student.age + " " + student.name);
        }
    }

    static class Student implements Comparable<Student>{
        int age;
        String name;

        Student(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Student s1) {
            if (age == s1.age) {
                return 0;
            }
            return age - s1.age;
        }
    }

}
