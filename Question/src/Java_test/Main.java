import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(“整数を２つ入力してください。”);
        String x = in.nextInt();
        String y = in.nextInt();
        System.out.println(“入力した整数１は ” + x + ” です。”);
         System.out.println(“入力した整数２は ” + y + ” です。”);
    }
}