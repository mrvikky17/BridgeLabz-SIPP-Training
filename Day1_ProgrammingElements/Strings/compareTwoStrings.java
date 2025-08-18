package Strings;
import java.util.*;
public class compareTwoStrings {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    boolean myfunres = compareStrings(str1, str2);
    boolean builtinres = str1.equals(str2);
    if(myfunres==builtinres){
        System.out.println("both result are same");
    }
    else{
        System.out.println("both are not equal");
    }
sc.close();
}
public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true; 
    }
}
