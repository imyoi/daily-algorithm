package programmers.level2;

public class Solution_SummerWinter2019 {
    /**
     * #62048 멀쩡한 사각형
     * @param w
     * @param h
     * @return 사용할 수 있는 정사각형의 개수
     * */
    public long solution(int w, int h) {
        //[참고]대각선을 지나는 단위정사각형 구하기
        //https://m.blog.naver.com/PostView.nhn?blogId=zzinuhelios&logNo=120024685950&proxyReferer=https:%2F%2Fwww.google.com%2F

        long x = (long)w;
        long y = (long)h;

        long gcd = gcd(Math.max(x, y), Math.min(x, y));
        long square  = x/gcd + ((y/gcd)-1); //대각선이 지나는 단위 정사각형

        // w x h 사각형에서 w, h의 최대공약수를 a라고 할 때,
        // ex. 8과 12의 최대공약수 a => 4
        //     8과 12의 서로소 : b =>  8/4 = 2 , c => 12/4 = 3
        //     대각선을 지나는 단위 사각형 : 가로 + 세로 - 1
        // w = ab, h = ac
        // a(b+c-1) = ab+ac-a = w+h-a 가 됨
        return (x*y) - (x+y-gcd);
    }
    //최대공약수
    public long gcd(long max, long min) {
        if(min == 0) return max;
        return gcd(min, max%min);
    }
}