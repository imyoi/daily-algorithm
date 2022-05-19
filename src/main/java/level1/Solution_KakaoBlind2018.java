package level1;

public class Solution_KakaoBlind2018 {

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

}