package level1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution_KakaoBlind2018 {

    private static Pattern pattern = Pattern.compile("([0-9]+)([a-zA-Z])([*#]?)");

    /**
     * #17681
     * 입력으로 지도의 한 변 크기 n 과 2개의 정수 배열 arr1, arr2가 들어온다.
     * 원래의 비밀지도를 해독하여 '#', 공백으로 구성된 문자열 배열로 출력하라.
     * - 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다.
     * - 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다 (= 공백도 마찬가지)
     * - 암호화된 배열은 벽(#) → 1, 공백 → 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다
     * */
    public String[] solution01(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String fmt = "%"+n+"s";

        for(int i = 0; i < n; i++) {
            String dNum = String.format(fmt, String.valueOf(Integer.toBinaryString(arr1[i] | arr2[i])));
            answer[i] = dNum.replaceAll("0"," ")
                            .replaceAll("1","#");
        }
        return answer;
    }

    /**
     * #17682
     * 0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.
     * => "점수|보너스|[옵션]" 문자열 3세트
     * - 점수 : 0점에서 10점
     * - 보너스 : Single(S), Double(D), Triple(T)
     *          => 점수에서 1제곱, 2제곱, 3제곱으로 계산
     *          => 점수마다 하나씩 존재한다.
     * - 옵션은 스타상(*) → 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다 , 아차상(#) → x마이너스 로 점수마다 둘 중 하나만 존재할 수 있으며, 없을 수도 있다.
     * */
    public int solution02(String dartResult) {
        int[] score = getScore(dartResult);
        return Arrays.stream(score).sum();
    }

    //입력값, 위치, 찾을패턴
    public int[] getScore(String input) {
        int[] score = new int[3];
        int m = 0;

        Matcher mathcer = pattern.matcher(input);
        while(mathcer.find()){
            score[m] = Integer.parseInt(mathcer.group(1)); //게임1

            switch (mathcer.group(2)) { //게임2
                case "D":
                    score[m] = (int) Math.pow(score[m],2);
                    break;
                case "T":
                    score[m] = (int) Math.pow(score[m],3);
                    break;
            }

            switch (mathcer.group(3)) { //게임3
                case "*":
                    if(m != 0){
                        score[m-1] *= 2; //전에 얻은 점수
                    }
                    score[m] *= 2;
                    break;
                case "#":
                    score[m] *= -1;
                    break;
            }
            m++;
        }

        return score;
    }
}