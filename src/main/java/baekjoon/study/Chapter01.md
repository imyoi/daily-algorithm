## :cloud: [알고리즘](https://github.com/imyoi/daily-algorithm/blob/main/src/main/java/baekjoon/step1/Step1.md)

### 시간복잡도
입력의 크기 N에 대해서 시간이 얼마나 걸릴지 나타내는 방법 (표기법으로 대문자 O를 사용한다.) <br>
<u>최악의 경우</u>에 시간이 얼마나 걸릴지 알 수 있다.

#### [시간복잡도 계산]
- Big O Notation 에서 상수는 버린다.
- 두 가지 항이 있을때, 변수가 같으면 큰 것만 빼고 다 버린다.
- 두가지 항이 있는데 변수가 다르면 놔둔다.
      
<details>
<summary>예제코드</summary>
<div markdown="1">

#### ex. 시간 복잡도 : O(N)
```
int sum = 0;
for(int i=1; i<N; i++) {
    sum += i;
}
```
#### ex. 시간 복잡도 : O(N<sup>2</sup>)
```
int sum = 0;
for(int i=1; i<N; i++) {
    for(int j=1; j<=N; j++ {
        if(i == j) {
            sum += j;
        }
    }
}
```
#### ex. 시간 복잡도 : O(1)
```
int sum = 0;
sum = N*(N+1)/2;
```

</div>
</details>

---

### Java 입출력
&nbsp; :one: 입력은 Scanner, 출력은 System.out을 사용한다.
```
Scanner sc = new Scanner(System.in);
```
&nbsp; :two: 입력이 많은 경우에는 속도가 느리기 때문에, BufferedReader를 사용한다.
```
BufferedReader br = new BufferReader(new InputStreamReader(System.in));
```
&nbsp; :three: 출력이 많은 경우에는 StringBuilder를 사용해서 한 문자열로 만들어서 출력을 한 번만 사용하거나 BufferWrither를 사용한다.

