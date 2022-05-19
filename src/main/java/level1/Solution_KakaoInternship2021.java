package level1;

public class Solution_KakaoInternship2021 {

    /**
     * #81301
     * 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
     * s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
     * ? replace(old, new)
     */
    public int solution01(String s) {
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0; i < num.length; i++) {
            s = s.replace(num[i], String.valueOf(i));
        }

        int answer = Integer.parseInt(s);
        return answer;
    }

}
