import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Fyra {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x = 0;
        System.out.println("Hur många år vill du ta ut pengar?");
        int antalÅr = scanner.nextInt();
        System.out.println("Hur mycket pengar har du på kontot?");
        double antaletPengar = scanner.nextDouble();
        System.out.println("Vad är din ränta? (%)");
        double ränta = scanner.nextDouble();
        System.out.println("Hur mycket vill du ta ut varje år?");
        int ut = scanner.nextInt();
        beloppVidUttag(antaletPengar, ränta, antalÅr, ut);
    }
    public static double beloppVidUttag(double antaletPengar, double ränta, int antalÅr, int ut){
        if(ut > antaletPengar * 0.01 * ränta) {
            System.out.println("Du tar ut mer än vad du kan!");;
            return 0;
        } else {
            for (int i = 1; i <= antalÅr; i++) {
                antaletPengar = antaletPengar + antaletPengar * 0.01 * ränta - ut;
                System.out.printf("|%-10d||%10f|%n", i, antaletPengar);
            }
            return antaletPengar;
        }
    }
}