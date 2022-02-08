package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 국영수(https://www.acmicpc.net/problem/10825)
 */
public class Ex10825_2 {

    static int studentNumber;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {
        studentNumber = Integer.parseInt(br.readLine());
        PriorityQueue<Student> pq = new PriorityQueue<>();

        for (int i = 0; i < studentNumber; i++) {
            st = new StringTokenizer(br.readLine());
            pq.add(new Student(st.nextToken(),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())));
        }

        while(!pq.isEmpty()) {
            sb.append(pq.poll().name).append("\n");
        }

        System.out.println(sb);
    }

    static class Student implements Comparable<Student> {
        String name;
        int kor, eng, math;

        Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public int compareTo(Student s1) {
            if (kor == s1.kor) {
                if (eng == s1.eng) {
                    if (math == s1.math) {
                        return this.name.compareTo(s1.name);
                    }
                    return s1.math - math;
                }
                return eng - s1.eng;
            }
            return s1.kor - kor;
        }
    }
}
