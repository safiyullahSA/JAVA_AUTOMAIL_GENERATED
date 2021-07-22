package EmailId;
import SourceCode.JavaMail;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Collecting {
	TreeSet<String> set = new TreeSet<String>();
	public static void collectingEmail(TreeSet<String> set){
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter the number of Emails you want to send");
	int i = sc.nextInt();
	String email;
	for(int temp = 0;temp <i;temp++) {
		email = sc.nextLine();
		email = sc.next();
		set.add(email);
		
	}
	
	
	sc.close();
}
	public static String getEmail(TreeSet<String> set) throws Exception {
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			JavaMail.sendMail(iter.next());
		}
		return "\n\nAll Mail Sent Successfully";
	}
}
