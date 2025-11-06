import java.util.*;


public class Main
{
    static boolean isAnagram(String s1, String s2){
       
       
       if(s1.length() != s2.length()) return false;
       
       int ch[] = new int[26];
       
       for(int i = 0; i<s1.length(); i++){
           ch[s1.charAt(i) - 'a']++;
           ch[s2.charAt(i) - 'a']--;
       }
       
       for(int num: ch){
           if(num != 0){
               return false;
           }
       }
       
       
        return true;
    }
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s1 = sc.nextLine();
    
    String s2 = sc.nextLine();
    
    System.out.println(isAnagram(s1,s2));
	}
}
