import java.util.Scanner;

public class Sex {
    public static void main(String[] args){
        int countOrd = 1;
        int countRader = 1;
        String text = "";
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            text = scanner.nextLine();
        }
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' '){
                countOrd++;
            }
            if (text.charAt(i) == '\n'){
                countRader++;
            }
        }
        System.out.println("\nAntal ord: " + countOrd + "\nAntal täcken: " + text.length() + "\nAntal rader: " + countRader);
    }
}