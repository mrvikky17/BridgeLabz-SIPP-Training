package Methods;
import java.util.*;

public class CheckNumber {
    public static int checkNumber(int n) {
        if (n > 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int result = checkNumber(num);
        System.out.println(result);
        sc.close();
    }
}
