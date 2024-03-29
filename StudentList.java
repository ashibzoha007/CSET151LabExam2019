import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
public static void main(String[] args) {

//		Check arguments
		if(args[0].equals("all")) {						//show all data
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
		else if(args[0].equals("random"))			//show random data
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
		else if(args[0].contains("another_list")){  		//show another list
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
		else if(args[0].contains("query")) 						//for help
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
						done=false;
				}
			}
			} catch (Exception e){}
			System.out.println("Data Loaded.");
		}
		else if(args[0].contains("swap_another")) 					//show swap list
		{
			System.out.println("Loading data ...");
			try {
			BufferedReader s = new BufferedReader(
						       new InputStreamReader(
							   new FileInputStream("students.txt")));
			String D = s.readLine();
			char a[] = D.toCharArray();
			boolean runWithRetries(int maxRetries, ThrowingTask t) { 
   			int count = 0;
    		while (count < maxRetries) {
        try {
            t.run();
            return true;
        }
        catch (ExecutionException e) {
            if (++count >= maxRetries)
                return false;
        }
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



	public static int countError(int n)
    {
        if (n<0)
        {
            System.out.println("Error! Input should be positive");
            return -1;
        }
        int result = 0; 
        while ((n/10) != 0)
        {
            result++;
            n/=10;
        }
        return result + 1;
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




