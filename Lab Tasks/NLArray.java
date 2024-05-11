import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;

public class NLArray {
    void WordTokenize() throws IOException {
        FileReader fr = new FileReader("fileName.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);

            String resultStr = "";
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')|| (ch==' ')) {
                    resultStr += ch;
                }
            }
            System.out.println("here= " + resultStr);
        }

        br.close();

    }




    public static void main(String args[]) throws IOException {
        NLArray arr=new NLArray();
        arr.WordTokenize();

    }
}
