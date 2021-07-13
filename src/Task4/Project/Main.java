package Task4.Project;


import Task4.Project.Controller.Controller;
import Task4.Project.Model.Model;
import Task4.Project.View.View;


public class Main {
    public static void main(String[] args) {
          Model model = new Model();
          View view = new View();
          Controller controller = new Controller(view,model);
          controller.excute();
    }
}

