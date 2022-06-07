package baekjoon;

import baekjoon.step1.Step1;
import org.junit.jupiter.api.Test;
class Step1Test {

    private final Step1 s = new Step1();

    @Test
    void solution01_HelloWolrd_출력() {
        s.solution01();
    }

    @Test
    void solution02_We_love_kriii() {
        s.solution02();
    }

    @Test
    void solution03_고양이() {
        s.solution03();
    }
}
