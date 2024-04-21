import java.io.*;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
    public static void extractEmail() throws IOException {
        FileReader file = new FileReader("fileEmails.txt"); // object of file reader
        BufferedReader br = new BufferedReader(file);// this will read the give file
        String str;

        while ((str = br.readLine()) != null) {// loop will check line by line given text in file
               // Email will checked by Regular pattern of any given Email Address
            Pattern pattern = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
            Matcher matcher = pattern.matcher(str);

            while (matcher.find()) {// if Email is matched give pattern then print this line of code
                System.out.println("Valid email: " + matcher.group());
            }
        }

        br.close(); //closing tag of file reader
    }

    public static void main(String[] args) {//main methode
        try {// if the give mail throws any exception the this block of code will execute
            extractEmail();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }// end of main methode
}// end of EmailExtractor class
