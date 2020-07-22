package stringsA;
import java.util.*;
import java.util.Arrays;
import java.util.List;
public class stringsAmain {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter no. of strings:");
			int n = sc.nextInt();
			String[] strlist = new String[n];
			System.out.println("Enter strings:");
			for(int i=0;i<n;i++) {
				strlist[i] = sc.next();
			}
			List<String> list = Arrays.asList(strlist);
			StringsWithA ans = new StringsWithA();
			System.out.println(ans.search(list));
		}
	}
}