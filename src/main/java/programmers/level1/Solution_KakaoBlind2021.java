package programmers.level1;

public class Solution_KakaoBlind2021 {

    /**
     * #72410
     * - 특수문자 : -_.~!@#$%^&*()=+[{]}:?,<>/
     * - step6 → 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
     * @param new_id : 신규 유저가 입력한 아이디
     * @return : "네오"가 설계한 7단계의 처리 과정을 거친 후의 추천 아이디
     * */
    public String solution01(String new_id) {
        //step 1 대문자 → 소문자
        String answer = new_id.toLowerCase();

        //step 2 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        //step 3 '...'와 '..' → '.
        answer = answer.replaceAll("[.]{2,}", "."); //{n,} : 최소 n개 이상

        //step 4 '.'가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^[.]|[.]$", "");

        //step 5 빈 문자열이면 a
        if("".equals(answer)) {
            answer += "a";
        }

        //step 6 new_id 길이가 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        if(answer.length() >= 16) {
            answer = answer.substring(0,15).replaceAll("[.]$", "");
        }

        //step 7 new_id 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙임.
        if(answer.length() <= 2) {
            while(answer.length() < 3){
                answer += answer.charAt(answer.length() - 1);
            }
        }

        return answer;
    }
}