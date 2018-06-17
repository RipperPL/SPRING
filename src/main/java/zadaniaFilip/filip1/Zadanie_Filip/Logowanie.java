package zadaniaFilip.filip1.Zadanie_Filip;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;

public class Logowanie {
    IUser user;
    String enteredPass;
    String enteredUsername;

    public int EnterCredentials() {

//TODO zamienic na spring
        int counter = 1;
        int log=1;
        while (counter == 0) {
            {
                System.out.println("\n Podaj usera \n ");
                Scanner in = new Scanner(System.in);
                this.enteredPass = in.nextLine();
                System.out.println("\n Podaj haslo\n ");
                this.enteredUsername = in.nextLine();
                if (PassCheck(this.enteredUsername, this.enteredPass)== true) {
                    log=1;
                    counter=1;
                }
                else {
                    System.out.println("Zle dane");
                    log=0;
                }
            }
        }
    return log;
    }

    private boolean PassCheck(String uName, String uPass){
        //TODO logika do logowania do bazy danych

        return true;
    }
}