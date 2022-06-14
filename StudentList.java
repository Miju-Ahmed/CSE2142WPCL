import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
	public static void main(String[] args) {

//		Check arguments
		if(args[0].equals("a")) {
			System.out.println("Loading data ...");			
			try {
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(
								new FileInputStream("students.txt"))); 
				String studentName = bufferedReader.readLine();
				String nameSplit[] = studentName.split(",");			
				for(String name : nameSplit) { 
					System.out.println(name); 
				}
			} 
			catch (Exception e){

			} 
			System.out.println("Data Loaded.");
		}
		else if(args[0].equals("r")) {
			System.out.println("Loading data ...");			
			try {
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(
								new FileInputStream("students.txt"))); 
				String studentName = bufferedReader.readLine();
				System.out.println(studentName);
				String nameSplit[] = studentName.split(",");	
				Random random = new Random();
				int y = random.nextInt();
				System.out.println(i[y]);
			} 
			catch (Exception e){

			} 
			System.out.println("Data Loaded.");			
		}
		else if(args[0].contains("+")){
			System.out.println("Loading data ...");			
			try {
				BufferedWriter bufferedReader = new BufferedWriter(
						new FileWriter("students.txt", true));
				String t = args[0].substring(1);
				Date d = new Date();
				String df = "dd/mm/yyyy-hh:mm:ss a";
				DateFormat dateFormat = new SimpleDateFormat(df);
				String fd= dateFormat.format(d);
				bufferedReader.write(", "+t+"\nList last updated on "+fd);
				bufferedReader.close();
			} 
			catch (Exception e){

			}
							
			System.out.println("Data Loaded.");	
		}
		else if(args[0].contains("?")) {
			System.out.println("Loading data ...");			
			try {
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(
								new FileInputStream("students.txt"))); 
				String studentName = bufferedReader.readLine();
				String nameSplit[] = studentName.split(",");	
				boolean done = false;
				String t = args[0].substring(1);
				for(int idx = 0; idx<i.length && !done; idx++) {
					if(i[idx].equals(t)) {
						System.out.println("We found it!");
						done=true;
					}
				}
			} 
			catch (Exception e){

			} 
			System.out.println("Data Loaded.");				
		}
		else if(args[0].contains("c")){
			System.out.println("Loading data ...");			
			try {
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(
								new FileInputStream("students.txt"))); 
				String D = bufferedReader.readLine();
				char a[] = D.toCharArray();			
				boolean in_word = false;
				int count=0;
				for(char c:a) {
					if(c ==' '){
						if (!in_word) {	
							count++; in_word =true;
						}
						else { in_word=false;}			
					}
				}
				System.out.println(count +" word(s) found " + a.length);
			} 
			catch (Exception e){
				
			} 
			System.out.println("Data Loaded.");				
		}
	}
}