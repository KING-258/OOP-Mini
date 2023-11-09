import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.paint.Color;
import javafx.stage.Stage;
import p1.*;
public class App extends Application implements EventHandler<ActionEvent>
{
    Stage window;
    String u;
    String p;
    String c;
    double m = 0;
    public static void main(String[] args) throws Exception
    {
        launch(args);
    }
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        window.setTitle("New");
        FlowPane g1 = new FlowPane();//Welcome
        FlowPane sp = new FlowPane(Orientation.VERTICAL,10, 10);//Select Category
        FlowPane g2 = new FlowPane(Orientation.VERTICAL,10, 10);//Select Item
        Label l0 = new Label();
        Button b0 = new Button();//Third
        Button b4 = new Button();//Third
        Button b5 = new Button();//Third
        Label l = new Label("Select a Category ");
        ComboBox<String> c = new ComboBox<>();
        ComboBox<String> c1 = new ComboBox<>();
        Button b = new Button();//Second
        Button b3 = new Button();//Second
        Label l1 = new Label("User_Name");
        TextField t1 = new TextField("User");
        Button b1 = new Button();//First
        Button b2 = new Button();//First
        PasswordField t2 = new PasswordField();
        Label l2 = new Label("Password");
        Scene s1 = new Scene(g1, 700, 700);//First
        Scene s2 = new Scene(sp, 700, 700);//Second
        Scene s3 = new Scene(g2, 700, 700);//Third
        Label l3 = new Label();
        Label l4 = new Label();
        TextField t3 = new TextField("Quantity or Weight in Grams");
        // FlowPane.setConstraints(l1, 0, 0);
        // FlowPane.setConstraints(t1, 1, 0);
        // FlowPane.setConstraints(l2, 0, 1);
        // FlowPane.setConstraints(t2, 1, 1);
        // FlowPane.setConstraints(b1, 3, 3);
        // FlowPane.setConstraints(b2, 3, 1);
        // FlowPane.setConstraints(l3, 0, 0);
        // FlowPane.setConstraints(l, 8, 8);
        // FlowPane.setConstraints(c1, 9, 9);
        // FlowPane.setConstraints(b, 9, 10);
        // FlowPane.setConstraints(b3, 9, 7);
        // FlowPane.setConstraints(l0, 0, 0);
        // FlowPane.setConstraints(t3, 9, 9);
        // FlowPane.setConstraints(c, 9, 10);
        // FlowPane.setConstraints(b0, 11, 11);
        // FlowPane.setConstraints(b4, 11, 7);
        // FlowPane.setConstraints(b5, 12, 11);
        b1.setText("Enter");
        b1.setOnAction(e -> {
            u = t1.getText();
            p = t2.getText();
            u = Print(u, p);
            l3.setText("User is : " + u);
            window.setScene(s2);
        });
        b.setText("Confirm");
        b.setOnAction(f -> {
            System.out.println("Done");
            l0.setText("Current Section is :"+c1.getValue());
            if(c1.getValue().compareTo("Groceries") == 0)
            {
                c.getItems().addAll("Milk","Bread","Eggs","Tofu","Tuna","Bacon");
            }
            else if(c1.getValue().compareTo("Stationery") == 0)
            {
                c.getItems().addAll("Book","Pen","Pencil","Spiral","Stapler","Scissors");
            }
            else if(c1.getValue().compareTo("Cosmetics") == 0)
            {
                c.getItems().addAll("FaceWash","AcneCream","Toner","Lipstick","Hairband","Perfumes");
            }
            else{
                c.getItems().addAll("Cola","Coffee","Tea","Sprite","Fanta","FreshJuice");
            }
            window.setScene(s3);
        });
        b0.setText("Proceed for Billing : ");
        b0.setOnAction(g -> {
            Amount a1 = new Amount();
            int q;
            q=0;
            try {
                q = Integer.parseInt(t3.getText());
            }catch(Exception e){
                l4.setText("Try Again");
            }
            m = a1.Final(c.getValue(), q, m);
        });
        b2.setText("Customer");
        b2.setOnAction(h -> window.setScene(s2));
        b3.setText("Back to Login Page");
        b3.setOnAction(i -> window.setScene(s1));
        b4.setText("Next Item");
        b4.setOnAction(j -> window.setScene(s2));
        b5.setText("Print the Receipt");
        b5.setOnAction(this);
        c1.getItems().addAll("Groceries", "Stationery", "Cosmetics", "Beverages");
        g1.setPadding(new Insets(10,10,10,10));
        g1.setHgap(10);
        g1.setVgap(8);
        g1.getChildren().addAll(l1,t1,l2,t2,b1,b2);
        sp.setPadding(new Insets(10,10,10,10));
        sp.setHgap(20);
        sp.setVgap(20);
        sp.getChildren().addAll(l3, l, c1, b, b3);
        g2.setPadding(new Insets(10,10,10,10));
        g2.setHgap(10);
        g2.setVgap(8);
        g2.getChildren().addAll(l0,c,t3,b0,b4,b5,l4);
        //s1.setFill(Color.web("#FFFF00"));
        //s2.setFill(Color.web("#FFFF00"));
        //s3.setFill(Color.web("#FFFF00"));
        window.setScene(s1);
        window.show();
    }
    String Print(String a, String b)
    {
        System.out.println(a + "\n" + b);
        return a;
    }
    public void handle(ActionEvent e){
        FlowPane g = new FlowPane(Orientation.VERTICAL);
        //FlowPane.setConstraints(g, 11, 9);
        Button b = new Button();
        b.setText("EXIT");
        b.setOnAction(f -> window.close());
        Scene s = new Scene(g, 250, 300);
        Label l = new Label("Final Amount is " + String.valueOf(m));
        g.getChildren().addAll(l, b);
        window.setScene(s);
        window.show();
    }
}