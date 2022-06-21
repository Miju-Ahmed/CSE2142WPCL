import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
    public static void main(String[] args) {

//		Check arguments
        if(args[0].equals(Constant.showAll)) {
            System.out.println(Constant.loadingData);
            try {
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(Constant.studentList)));
                String inputName = bufferedReader.readLine();
                String nameSplit[] = inputName.split(Constant.comma);
                for(String name : nameSplit) { System.out.println(name); }
            }
            catch (Exception e){

            }
            System.out.println(Constant.dataLoaded);
        }
        else if(args[0].equals(Constant.random)){
            System.out.println(Constant.loadingData);
            try {
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(Constant.studentList)));
                String inputName  = bufferedReader.readLine();
                System.out.println(inputName );
                String nameSplit[] = inputName .split(Constant.comma);
                Random random = new Random();
                int randomNumber = random.nextInt();
                System.out.println(nameSplit[randomNumber]);
            }
            catch (Exception e){

            }
            System.out.println(Constant.dataLoaded);
        }
        else if(args[0].contains(Constant.plus)){
            System.out.println(Constant.loadingData);
            try {
                BufferedWriter bufferedReader = new BufferedWriter(
                        new FileWriter(Constant.studentList, true));
                String data = args[0].substring(1);
                Date date = new Date();
                DateFormat dateFormat = new SimpleDateFormat(Constant.dateShow);
                String dateFormate= dateFormat.format(date);
                bufferedReader.write(Constant.comma+data+Constant.update+dateFormate);
                bufferedReader.close();
            }
            catch (Exception e){

            }

            System.out.println(Constant.dataLoaded);
        }
        else if(args[0].contains(Constant.subString)){
            System.out.println(Constant.loadingData);
            try {
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(Constant.studentList)));
                String inputName  = bufferedReader.readLine();
                String nameSplit[] = inputName .split(Constant.comma);
                boolean done = false;
                String data = args[0].substring(1);
                for(int idx = 0; idx<nameSplit.length && !done; idx++){
                    if(nameSplit[idx].equals(data)){
                        System.out.println(Constant.weFound);
                        done=true;
                    }
                }
            }
            catch (Exception e){

            }
            System.out.println(Constant.dataLoaded);
        }
        else if(args[0].contains(Constant.wordCount)){
            System.out.println(Constant.loadingData);
            try {
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(Constant.studentList)));
                String inputName  = bufferedReader.readLine();
                char nameSplit[] = inputName.toCharArray();
                boolean in_word = false;
                int count=0;
                for(char c:nameSplit) {
                    if(c == Constant.space) {
                        if (!in_word) {
                            count++; in_word =true;
                        }
                        else {
                            in_word=false;
                        }
                    }
                }
                System.out.println(count +Constant.wordFound + nameSplit.length);
            }
            catch (Exception e){

            }
            System.out.println(Constant.dataLoaded);
        }
        else{
            System.out.println(Constant.notFound);
        }
    }
}