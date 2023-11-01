package p1;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Amount
{
    Stage window;
    Button b1;
    public double Final(String a, int b, double c)
    {
        double am = 0;
        window = new Stage();
        window.setTitle("Amount");
        Label l = new Label();
        if (a.compareTo("Milk") == 0) {
            am = 22 * b;
        } else if (a.compareTo("Bread") == 0) {
            am = 30 * b;
        } else if (a.compareTo("Eggs") == 0) {
            am = 8 * b;
        } else if (a.compareTo("Tofu") == 0) {
            am = 0.375 * b;
        } else if (a.compareTo("Tuna") == 0) {
            am = 215 * b;
        } else if (a.compareTo("Bacon") == 0) {
            am = 0.824 * b;
        } else if (a.compareTo("Book") == 0) {
            am = 30 * b;
        } else if (a.compareTo("Pen") == 0) {
            am = 10 * b;
        } else if (a.compareTo("Pencil") == 0) {
            am = 7 * b;
        } else if (a.compareTo("Spiral") == 0) {
            am = 50 * b;
        } else if (a.compareTo("Stapler") == 0) {
            am = 100 * b;
        } else if (a.compareTo("Scissors") == 0) {
            am = 60 * b;
        } else if (a.compareTo("FaceWash") == 0) {
            am = 215 * b;
        } else if (a.compareTo("AcneCream") == 0) {
            am = 300 * b;
        } else if (a.compareTo("Toner") == 0) {
            am = 179 * b;
        } else if (a.compareTo("Lipstick") == 0) {
            am = 55 * b;
        } else if (a.compareTo("Hairband") == 0) {
            am = 20 * b;
        } else if (a.compareTo("Perfumes") == 0) {
            am = 599 * b;
        } else if (a.compareTo("Cola") == 0) {
            am = 20 * b;
        } else if (a.compareTo("Coffee") == 0) {
            am = 200 * b;
        } else if (a.compareTo("Tea") == 0) {
            am = 150 * b;
        } else if (a.compareTo("Sprite") == 0) {
            am = 20 * b;
        } else if (a.compareTo("Fanta") == 0) {
            am = 30 * b;
        } else if (a.compareTo("FreshJuice") == 0) {
            am = 90 * b;
        }
        b1 = new Button();
        b1.setText("Close");
        b1.setOnAction(e -> window.close());
        l.setText("Amount is : " + String.valueOf(am));
        FlowPane g1 = new FlowPane();
        g1.getChildren().addAll(l, b1);
        //GridPane.setConstraints(b1, 5, 5);
        //GridPane.setConstraints(l, 4, 4);
        Scene s = new Scene(g1, 5000, 5000);
        window.setScene(s);
        window.show();
        am = am + c;
        return am;
    }
}