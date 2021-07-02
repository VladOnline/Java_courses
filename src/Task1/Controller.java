package Task1;
import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(View view,Model model) {
        this.view = view;
        this.model = model;
    }

    void excute(){
        view.FirstPrint();
        model.setFirstWorld(CheckWorld("Hello"));
        view.SecontPrint();
        model.setSeconWorld(CheckWorld("World!"));
        view.EndPrint(model.getFirstWorld() , model.getSeconWorld());
    }

    String CheckWorld(String World){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        while(! word.equals(World)){
            view.WrongDate();
            word = scanner.nextLine();
        }
        return word;
    }
}
