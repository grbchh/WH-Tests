package Info;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String");
        String s = br.readLine();
    }
}



