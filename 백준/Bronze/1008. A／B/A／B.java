import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A와 B 입력 받기
        int A = sc.nextInt();
        int B = sc.nextInt();

        // A를 B로 나눈 결과를 부동소수점으로 출력
        System.out.println((double) A / B);

    }
}
