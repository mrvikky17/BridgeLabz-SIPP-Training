package Methods;
import java.util.*;
public class sumNaturalNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getsum(n));
        sc.close();        
    }
    public static int getsum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
           sum +=i; 
        }
        return sum;
    }
}