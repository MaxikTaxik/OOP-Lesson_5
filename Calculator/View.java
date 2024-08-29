package Calculator;
import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String title) {
        System.out.println(String.format("%s: ", title));
        return in.nextInt();
    }

    public void print (int data,  String title) {
        System.out.println(String.format("%s: %d", title, data));
    }
}




