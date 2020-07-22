package palindromes;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;
public class palindromeMain {
	public static boolean isPalin(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter no. of strings:");
			int n = sc.nextInt();
			Predicate<String> predicate = palindromeMain::isPalin;
			List<String> finalList = new ArrayList<String>();
			System.out.println("Enter strings:");
			for(int i=0;i<n;i++) {
				String str = sc.next();
				boolean res = predicate.test(str);
				if(res==true) {
					finalList.add(str);
				}
			}
			System.out.println((finalList));
		}
	  }
}