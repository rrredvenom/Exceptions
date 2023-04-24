package HW3;


import HW3.Presenter.Presenter;
import HW3.View.ConsoleView;
import HW3.View.View;

public class Task {
    public static void main(String[] args) {
        Presenter<View> prog = new Presenter<View>(new ConsoleView());
        prog.start();
    }
}