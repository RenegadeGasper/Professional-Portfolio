import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        int MaxWords = 5;

        Scanner scan = new Scanner(System.in);
        String word ="";
    
        for (int i = 0; i < MaxWords; i++){
            System.out.println("Please enter word "+(i+1)+" of "+ MaxWords);
            word = scan.nextLine();
    
        }
        System.out.println(word);
}