import java.lang.System.*;
import java.lang.String.*;
import java.util.*;

public class checkIfPermutation{
	public String sort(String s){
		char[] charArray = s.toCharArray();
		java.util.Arrays.sort(charArray);
		return new String(charArray);
	} 

	public boolean isPermutation(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		return sort(s1).equals(sort(s2));
	}
	
	public static void main(String[] args){
		checkIfPermutation cip = new checkIfPermutation();
		if(cip.isPermutation(args[0], args[1])){
			System.out.println("Yes!");
		}else{
			System.out.println("No!");
		}
	}
}
