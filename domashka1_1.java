import java.util.Scanner;
public class domashka1_1 {
    public static void main(String[] args) {
/*
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        in.close();
    }
}