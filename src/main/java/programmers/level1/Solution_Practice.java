package programmers.level1;

import java.util.*;

public class Solution_Practice {

    /**
     * #12901
     * @param a : 월
     * @param b : 일
     * @return 2016년 a월 b일이 무슨 요일인지 리턴
     * */
    public String solution01(int a, int b) {
        Calendar cal = Calendar.getInstance();
        cal.set(2016,a-1, b); //month 숫자로 입력시 0이 1월이기 때문에 -1을 해줌

        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US).toUpperCase();
    }

    /**
     * #12903
     * - 단어의 길이가 짝수라면 가운에 두글자를 반환하면 됩니다.
     * @param s : 월
     * @return 단어 s의 가운데 글자 반환
     * */
    public String solution02(String s) {
        int idx = (s.length()-1)/2;
        return (s.length()%2==0) ? s.substring(idx, idx+2) : s.substring(idx, idx+1);
    }

    /**
     * #12906
     * @param arr : 숫자 0부터 9까지의 배열
     * @return 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들
     * */
    public int[] solution03(int []arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr.length-1 == i) { //마지막
                list.add(arr[i]);
                break;
            }
            if(arr[i] != arr[i+1]) {
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    /**
     * #12910
     * - divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
     * @param arr : 자연수를 담은 배열
     * @param divisor : 나누는 값
     * @return array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수
     * */
    public int[] solution04(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int a : arr) {
            if(a % divisor == 0) {
                list.add(a);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        if(answer.length == 0) { //나누어 떨어지는 수가 없다면 -1 리턴
            return new int[]{-1};
        }
        return answer;
    }

    /**
     * #12910 studies
     * 다른 풀이 (1)
     * */
    public int[] studies04(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(a -> a % divisor == 0).toArray();
        Arrays.sort(answer);

        if(answer.length == 0) {
            return new int[]{-1};
        }
        return answer;
    }

    /**
     * #12912
     * - a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
     * - a와 b의 대소관계는 정해져있지 않습니다.
     * @param a
     * @param b
     * @return a와 b 사이에 속한 모든 정수의 합
     * */
    public long solution05(int a, int b) {
        long answer = 0;
        for(int i=Math.min(a,b); i<=Math.max(a,b); i++) {
            answer += i;
        }
        return answer;
    }

    /**
     * #12915
     * - strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
     * - 모든 strings의 원소의 길이는 n보다 큽니다.
     * - 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
     * @param strings : 문자열로 구성된 리스트
     * @param n : 정수
     * @return 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬한 배열
     * */
    public String[] solution06(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int x = 0;

        for(String s : strings) {
            if(x < strings.length) {
                strings[x] = s.charAt(n) + s;
                x++;
            }
        }
        Arrays.sort(strings);

        for(int i=0; i<strings.length; i++) {
            answer[i] = strings[i].substring(1);
        }
        return answer;
    }

    /**
     * #12916
     * - 문자열 s는 알파벳으로만 이루어져 있습니다.
     * - 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴
     * @param s : 대문자와 소문자가 섞여있는 문자열
     * @return s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False
     * */
    public boolean solution07(String s) {
        int pCnt = 0; //p의 개수
        int yCnt = 0; //y의 개수

        int i = 0;
        while(i < s.length()) {
            if(s.toLowerCase().charAt(i) == 'p') pCnt++;
            if(s.toLowerCase().charAt(i) == 'y') yCnt++;
            i++;
        }
        return (pCnt == yCnt) ? true : false;
    }

    /**
     * #12916 studies
     * 다른 풀이
     * */
    public boolean studies07(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'p')
                count++;
            else if (s.toLowerCase().charAt(i) == 'y')
                count--;
        }

        return (count == 0) ? true : false;
    }

    /**
     * #12917
     * @param s : 길이 1 이상인 문자열
     * @return 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 리턴
     * */
    public String solution08(String s) {
        String[] strArr = s.split("");
        Arrays.sort(strArr, Collections.reverseOrder()); //역정렬

        return String.join("", strArr); //배열을 문자열로 반환
    }

    /**
     * #12918
     * - 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
     * ! {n} : 앞의 문자가 정확히 n번 나옴
     * @param s : 길이 1 이상, 길이 8 이하인 문자열
     * @return 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수
     * */
    public boolean solution09(String s) {
        boolean answer = false;
        if(s.matches("[0-9]{4}") || s.matches("[0-9]{6}")) {
            answer = true;
        }
        return answer;
    }

    /**
     * #12919
     * [제한 사항]
     * - "Kim"은 반드시 seoul 안에 포함되어 있습니다.
     * - seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
     * @param seoul : 길이 1 이상, 1000 이하인 배열
     * @return String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수
     * */
    public String solution10(String[] seoul) {
        String answer = "";
        int i = 0;
        for(String s : seoul) {
            if("Kim".equals(s)) {
                answer = "김서방은 " + i + "에 있다";
            }
            i++;
        }
        return answer;
    }

    /**
     * #12919 studies
     * 다른 풀이
     * */
    public String studies10(String[] seoul) {
        //리스트 앞쪽부터 인자와 동일한 객체가 있는지 찾고 존재시 해당 인덱스 리턴(존재하지 않는다면 -1)
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 "+ x + "에 있다";
    }

    /**
     * #12921
     * ! 에라스토테네스의 체
     * @param n : 2이상 1000000이하의 자연수
     * @return 1부터 입력받은 숫자 n 사이에 있는 소수의 개수
     * */
    public int solution11(int n) {
        int answer = 0;

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; //소수에서 제외

        for(int i=2; i*i<=n; i++) {
            if(isPrime[i]) {
                for(int j=i*i; j<=n; j+=i) {
                    isPrime[j] = false; //i(자신)의 배수가 되는 수를 지운다
                }
            }
        }
        for(boolean p : isPrime) {
            if(p) answer++;
        }
        return answer;
    }

    /**
     * #12922
     * @param n : 길이 10,000이하인 자연수
     * @return "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴
     * */
    public String solution12(int n) {
        String answer = "";
        for(int i=0; i<n; i++) {
            answer += i%2==0 ? "수" : "박";
        }
        return answer;
    }

    /**
     * #12925
     * - s의 맨앞에는 부호(+, -)가 올 수 있습니다.
     * - s는 부호와 숫자로만 이루어져있습니다.
     * - s는 "0"으로 시작하지 않습니다.
     * @param s : 길이 1 이상 5이하의 문자열
     * @return 문자열 s를 숫자로 변환한 결과를 반환
     * */
    public int solution13(String s) {
        return Integer.parseInt(s);
    }
}
