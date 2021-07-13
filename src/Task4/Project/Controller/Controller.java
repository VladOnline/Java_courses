package Task4.Project.Controller;

import Task4.Project.Model.Model;
import Task4.Project.View.Print_Message;
import Task4.Project.View.View;

import java.util.Scanner;

public class Controller implements  Regular {
    private View view;
    private Model model;


    public Controller(View view , Model model) {
        this.view = view;
        this.model = model;

    }
    public void excute() {
        view.PrintMessage(Print_Message.InputName);
        EnterDate(Regular.InputName);
        view.PrintMessage(Print_Message.InputSurname);
        EnterDate(Regular.EmailAddress);
        view.PrintMessage(Print_Message.EmailAddress);
        EnterDate(Regular.EmailAddress);
        view.PrintMessage(Print_Message.EnteLogin);
        EnterDate(Regular.EmailAddress);

    }
    public String EnterDate(String Regular){
        Scanner scanner = new Scanner(System.in);
        String word = "";
        boolean cheked = false ;
        while(!cheked ){
             word = scanner.nextLine();

            cheked = CheckDate(word, Regular );

        }

        return word;

    }

    private boolean CheckDate(String Date,String Regular){
        boolean result = Date.matches(Regular);

        if (!result ){
            view.PrintMessage(Print_Message.WrongDate);
        }
        return result;
    }
}
