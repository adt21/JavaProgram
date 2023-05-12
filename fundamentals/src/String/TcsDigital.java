package String;
public class TcsDigital {
	public static String capitalFirstLetter(String str) {
        String s[]=str.split(" ");
        String ans="";
        for(String ss : s){
          ans=ans+" "+ capitalFirstLetter(ss);
        }
        return ans;
    }
	
	public static void main(String[] args) {
		String str= "hi how are you";
        String s[]=str.split(" ");
        String ans="";
        for(String ss : s){
        	ans=ans+" "+ capitalFirstLetter(ss);
        }
        System.out.println(ans);
      }
}
