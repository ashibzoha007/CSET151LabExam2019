import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
public static void main(String[] args) {

//		Check arguments
		if(args[0].equals("all")) {
			System.out.println("Loading data ...");
			try {
			BufferedReader s = new BufferedReader(
							   new InputStreamReader(
							   new FileInputStream("students.txt")));
			String r = s.readLine();
			String i[] = r.split(",");
			for(String j : i) 
			{
				 System.out.println(j); 
				}
			} catch (Exception e){}
			System.out.println("Data Loaded.");
		}
		else if(args[0].equals("random"))
		{
			System.out.println("Loading data ...");
			try {
			BufferedReader s = new BufferedReader(
							   new InputStreamReader(
							   new FileInputStream("student.txt")));
			String r = s.readLine();
			System.out.println(r);
			String i[] = r.split(",");
			Random x = new Random();
				int y = x.nextInt();
			System.out.println(i[y]);
			} catch (Exception e){}
			System.out.println("Data Loaded.");
		}
		else if(args[0].contains("another_list")){
			System.out.println("Loading data ...");
			try {
			BufferedWriter s = new BufferedWriter(
							   new FileWriter("students.txt", true));
			String t = args[0].substring(1);
	        Date d = new Date();
	        String date_s = " 2011-01-18 00:00:00.0"; 
			SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss"); 
			Date date = dt.parse(date_s); 
			SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd");
			System.out.println(dt1.format(date));
		}
		else if(args[0].contains("query"))
		{
			System.out.println("Loading data ...");
			try {
			BufferedReader s = new BufferedReader(
							   new InputStreamReader(
							   new FileInputStream("students.txt")));
			String r = s.readLine();
			String i[] = r.split(",");
			boolean done = false;
			String t = args[0].substring(1);
			for(int idx = 0; idx<i.length && !done; idx++) {
				if(i[idx].equals(t)) {
					System.out.println("We found it!");
						done=true;
				}
			}
			} catch (Exception e){}
			System.out.println("Data Loaded.");
		}
		else if(args[0].contains("swap_another"))
		{
			System.out.println("Loading data ...");
			try {
			BufferedReader s = new BufferedReader(
						       new InputStreamReader(
							   new FileInputStream("students.txt")));
			String D = s.readLine();
			char a[] = D.toCharArray();
			boolean in_word = false;
			int count=0;
			for(char c:a) {
				if(c ==' ')
				{
					if (!in_word) {	count++; in_word =true;	}
					else { in_word=false;}
				}
			}
			System.out.println(count +" word(s) found " + a.length);
			} catch (Exception e){}
			System.out.println("Data Loaded.");
		}


		private static void displayStudent(List<Student>studentsList) {
			for (Student temp : studentsList){
				System.out.println(temp);
			}
			
		}


	}

}


public class Constants {
public static void main(String[] args) {


private static final String FINAL_STRING = "foo";

public void stringPrinter(){
    for(int i=0;i<10;i++){
        System.out.println(FINAL_STRING);
    }
}

}



}




