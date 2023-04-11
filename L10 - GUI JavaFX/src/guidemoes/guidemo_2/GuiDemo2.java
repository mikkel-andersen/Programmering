package guidemoes.guidemo_2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Scanner;

public class GuiDemo2 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 2");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfNumber = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(true);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblName = new Label("Number:");
        pane.add(lblName, 0, 0);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        // Deleted here is:
//        TextField txfName = new TextField();
//        txfName = new TextField();
        txfNumber.setText(String.valueOf(0));
        pane.add(txfNumber, 1, 0, 2, 1);

        // add a button to the pane (at col=1, row=1)
        Button btnIncrement = new Button("Inc");
        pane.add(btnIncrement, 1, 1);
//        GridPane.setMargin(btnUpperCase, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnIncrement.setOnAction(event -> this.increment());

        // add a button to the pane (at col=2, row=1)
        Button btnDecrement = new Button("Dec");
        pane.add(btnDecrement, 2, 1);
//        GridPane.setMargin(btnLowerCase, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnDecrement.setOnAction(event -> this.decrement());
    }

    // -------------------------------------------------------------------------
    private void increment() {
        int n = Integer.parseInt(txfNumber.getText());
        n++;
        String txt = String.valueOf(n);
        txfNumber.setText(txt);
    }

    private void decrement() {
        int n = Integer.parseInt(txfNumber.getText());
        n--;
        String txt = String.valueOf(n);
        txfNumber.setText(txt);
    }
}
