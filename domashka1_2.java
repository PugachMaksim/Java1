public class domashka1_2 {
    public static void main(String[] args) {
/*
 * Вывести все простые числа от 1 до 1000
 */
        for (int i = 1; i <= 1000; i++) {

                for (int j = 2; j <= i; j++) {

                    if (j < i  & i % j == 0) {
                        break;
                    }
                    if (i % j == 0) {
                        System.out.println(i);
                    }
                }
            }
    }    
}
