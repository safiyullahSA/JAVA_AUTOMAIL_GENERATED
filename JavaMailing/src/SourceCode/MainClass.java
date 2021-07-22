package SourceCode;
import java.util.TreeSet;

import EmailId.Collecting;


public class MainClass {

	public static void main(String[] args) throws Exception {
		
		TreeSet<String>set = new TreeSet<String>();
		Collecting.collectingEmail(set);
		Collecting.getEmail(set);
	}

}
