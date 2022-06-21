package baekjoon.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 입출력과 사칙연산
 * */
public class Step1 {

    public static void main(String[] args) {
        solution11();
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

    /**
     * #10869
     * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
     * */
    public static void solution07() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
    }

    /**
     * #10926
     * 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
     * */
    public static void solution08() {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        System.out.println(id + "??!");
    }

    /**
     * #18108
     * 불기 연도 y가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
     * ! Scanner는 정규식 검사가 오래걸리기 때문에 BufferedReader를 사용
     * */
    public static void solution09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine()) - 543;
        System.out.println(y);
    }

    /**
     * #10430
     * 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
     * */
    public static void solution10() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }

    /**
     * #2588
     * (세 자리 수) × (세 자리 수) 연산 중 첫째 줄부터 넷째 줄까지 차례대로 들어갈 값을 출력한다.
     * */
    public static void solution11() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 * (num2%10));
        System.out.println(num1 * (num2%100/10));
        System.out.println(num1 * (num2/100));
        System.out.println(num1 * num2);
    }
}
