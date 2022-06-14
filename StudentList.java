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
				int randomNumber = random.nextInt();
				System.out.println(nameSplit[randomNumber]);
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
				String names = args[0].substring(1);
				Date date = new Date();
				String dateFormate = "dd/mm/yyyy-hh:mm:ss a";
				DateFormat dateFormat = new SimpleDateFormat(dateFormate);
				String dateUpdate= dateFormat.format(date);
				bufferedReader.write(", "+names+"\nList last updated on "+dateUpdate);
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
				for(int idx = 0; idx<nameSplit.length && !done; idx++) {
					if(nameSplit[idx].equals(t)) {
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
				String readLine = bufferedReader.readLine();
				char split[] = readLine.toCharArray();			
				boolean in_word = false;
				int count=0;
				for(char c:split) {
					if(c ==' '){
						if (!in_word) {	
							count++; in_word =true;
						}
						else { in_word=false;}			
					}
				}
				System.out.println(count +" word(s) found " + split.length);
			} 
			catch (Exception e){
				
			} 
			System.out.println("Data Loaded.");
						
		}
		else{
				System.out.println("Loading data ...");
				System.out.println("The given arguments is not mathched.");
		}
	}
}