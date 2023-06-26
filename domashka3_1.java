import java.util.Scanner;
public class domashka3_1 {
    public static void main(String[] args) {
        /*
         * Реализовать простой калькулятор
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        while(!in.hasNextDouble()) {
            in.next();
        }
        double a = in.nextDouble();
        System.out.println("выберите действие: ");
        while (!in.hasNext("[-+/*]")) {
            in.next();            
        }
        String zzz = in.next();
        System.out.println("Введите число: ");
        while(!in.hasNextDouble()) {
            in.next();
        }
        double b = in.nextDouble();
            switch (zzz){
                case "+" :
                System.out.println(a + b);
                break; 
                case "-" :
                System.out.println(a - b);
                break;
                case "*" :
                System.out.println(a * b);
                break;
                case "/" :
                System.out.println(a / b);
                break;
            }
            in.close();
    }
}
