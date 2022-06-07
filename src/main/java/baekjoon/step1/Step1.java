package baekjoon.step1;

import java.util.Scanner;

/**
 * 입출력과 사칙연산
 * */
public class Step1 {

    public static void main(String[] args) {
        solution06();
    }

    /**
     * #2557
     * Hello World!를 출력하시오.
     * */
    public void solution01() {
        System.out.println("Hello World!");
    }

    /**
     * #10718
     * 두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
     * */
    public void solution02() {
        System.out.println("강한친구 대한육군");
        System.out.println("강한친구 대한육군");
    }

    /**
     * #10171
     * \, ' 등의 문자에 주의하며 고양이를 출력하는 문제
     * */
    public void solution03() {
        System.out.println("\\    /\\\n )  ( ')\n(  /  )\n \\(__)|");
    }

    /**
     * #10172
     * ", `, \ 등의 문자에 주의하며 개를 출력하는 문제
     * */
    public void solution04() {
        System.out.println("|\\_/|\n|q p|   /}\n( 0 )\"\"\"\\\n|\"^\"`    |\n||_/=\\\\__|");
    }

    /**
     * #1000, #1001, #10998
     * 두 정수 A와 B를 입력받은 다음, A+B(또는 A-B, AxB)를 출력하는 프로그램을 작성하시오.
     * */
    public static void solution05() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A+B); //#1000
        System.out.println(A-B); //#1001
        System.out.println(A*B); //#10998

        sc.close(); //자원해제
    }

    /**
     * #1008
     * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
     * */
    public static void solution06() {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        System.out.println(A/B); //#1008
        sc.close(); //자원해제
    }
}
