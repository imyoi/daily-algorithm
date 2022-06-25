package baekjoon.step2;

import java.util.Scanner;

public class Step2 {

    public static void main(String[] args) {
        p_2753();
    }

    /**
     * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
     * */
    public static void p_1330() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B) {
            System.out.println('>');
        }else if(A < B) {
            System.out.println('<');
        }else if(A == B) {
            System.out.println("==");
        }
    }

    /**
     * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
     * */
    public static void p_9498() {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        System.out.print(score>=90 ? "A" : score>=80 ? "B" : score>=70 ? "C": score>=60 ? "D" : "F");
    }

    /**
     * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
     * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
     * */
    public static void p_2753() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println((year%4==0 && (year%100!=0 || year%400==0)) ? 1 : 0 );
    }
}