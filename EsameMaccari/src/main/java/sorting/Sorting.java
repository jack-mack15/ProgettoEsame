package sorting;

import java.util.Scanner;

import static java.lang.System.*;

public class Sorting{

    public static void main(String[] args){

        Scanner scanner = new Scanner(in);

        out.print("Quante stringhe vuoi inserire?");
        int len  = scanner.nextInt();

        int i = 0;

        out.println("Inserisci le stringhe");

        String[] stringhe = new String[len];
        scanner.nextLine();
        for(i = 0; i < len; i++){
            stringhe[i] = scanner.nextLine();
        }

        scanner.close();

        int j = 0;

        for(i = 0; i < len; i++){
            for(j = i+1; j < len; j++){
                if (stringhe[i].compareTo(stringhe[j])>0) {
                    String temp = stringhe[i];
                    stringhe[i] = stringhe[j];
                    stringhe[j] = temp;
                }
            }
        }
        for(i = 0; i < len; i++){
            out.println(stringhe[i]);
        }
    }
}
