package level1;

public class Solution_SummerWinter2018 {

    private int cnt; // 소수가 되는 경우의 수

    /**
     * #12977
     * 배열 nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
     * ! nCr : n개 중에서 r개를 선택하는 경우의 수 (합은 똑같으므로 중복 없이) = 조합
     * */
    public int solution01(int[] nums) {
        int n = nums.length;
        return combination(nums, new boolean[n], 0, n, 3);
    }

    /**
     *@param picked → 선택(=true)
     *@param idx →  시작 위치
     *@param r →  n개 중 선택하는 수
     * */
    public int combination(int[] nums, boolean[] picked, int idx, int n, int r) {
        int sum = 0;
        if(r == 0) {
            for(int i = 0; i < n; i++) {
                if(picked[i]) {
                    sum += nums[i];
                }
            }
            System.out.println("sum >>>>" + sum);
            if(isPrime(sum)) cnt++;
        }
        for(int i = idx; i < n; i++) {
            picked[i] = true;
            combination(nums, picked, i+1, n, r-1);
            picked[i] = false;
        }
        return cnt;
    }

    public static boolean isPrime(int sum) {
        for(int i = 2; i <= (int)Math.sqrt(sum); i++) {
            if(sum % i == 0) return false;
        }
        return true;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * #12982
     * */
    public int solution02(int[] d, int budget) {
        int answer = 0;
        return answer;
    }


}
