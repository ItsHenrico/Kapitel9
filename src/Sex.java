import java.util.Scanner;

public class Sex {
    public static void main(String[] args){
        int countOrd = 0;
        int countRader = 0;
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' '){
                countOrd++;
            }
            if (text.charAt(i) == '\n'){
                countRader++;
            }
        }
        System.out.println("\n" + "Antal ord: " + (countOrd+1) + "\nAntalet ord: " + text.length() + "\nAntalet rader: " + (countRader+1));
    }
}
