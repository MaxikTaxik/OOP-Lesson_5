package Calculator;
public class Presenter {
    Model model;
    View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void buttonClick() {
        int x = view.getValue("X");
        int y = view.getValue("Y");
        model.setOperandX(x);
        model.setOperandY(y);
        int result = model.result();
        view.print(result, "Result");
    }

}
