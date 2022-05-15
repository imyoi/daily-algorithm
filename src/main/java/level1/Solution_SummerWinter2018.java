package level1;

import java.util.Arrays;

public class Solution_SummerWinter2018 {

    static int cnt = 0; // 소수가 되는 경우의 수

    /**
     * #12977
     * 배열 nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
     * ! nCr : n개 중에서 r개를 선택하는 경우의 수 (합은 똑같으므로 중복 없이) = 조합
     * */
    public int solution01(int[] nums) {
        boolean[] picked = new boolean[nums.length];
        combination(nums, picked, 0, nums.length, 3);
        return cnt;
    }

    /**
     *@param picked → 선택(=true)
     *@param idx →  시작 위치
     *@param r →  n개 중 선택하는 수
     * */
    public void combination(int[] nums, boolean[] picked, int idx, int n, int r) {
        if(r == 0) {
            int sum = 0;
            for(int i = 0; i < n; i++) {
                if(picked[i]) {
                    sum += nums[i];
                }
            }
            if(isPrime(sum)) cnt++;
        }else {
            for(int i = idx; i < n; i++) {
                picked[i] = true;
                combination(nums, picked, i+1, n, r-1);
                picked[i] = false;
            }
        }
    }

    public boolean isPrime(int sum) {
        if (sum <= 1) return false;
        for(int i = 2; i <= (int)Math.sqrt(sum); i++) {
            if(sum % i == 0) return false;
        }
        return true;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * #12982
     * 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때,
     * 최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.
     * */
    public int solution02(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d); //적은 금액부터 비교하기 위해 정렬

        for(int i : d){
            if(i <= budget) {
                budget -= i;
                answer ++;
            }
        };

        return answer;
    }


}
