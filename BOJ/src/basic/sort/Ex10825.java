package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 국영수(https://www.acmicpc.net/problem/10825)
 */
public class Ex10825 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Student s = new Student();
            s.name = st.nextToken();
            s.kor = Integer.parseInt(st.nextToken());
            s.eng = Integer.parseInt(st.nextToken());
            s.math = Integer.parseInt(st.nextToken());
            students.add(s);
        }

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.name);
        }
    }

    static class Student implements Comparable<Student> {
        String name;
        int kor;
        int eng;
        int math;

        Student() {
            super();
        }

        Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public int compareTo(Student s1) {
            if (this.kor == s1.kor && this.eng == s1.eng && this.math == s1.math) {
                return this.name.compareTo(s1.name);
            } else if (this.kor == s1.kor && this.eng == s1.eng) {
                return s1.math - this.math;
            } else if (this.kor == s1.kor) {
                return this.eng - s1.eng;
            } else {
                return s1.kor - this.kor;
            }
        }
    }
}
