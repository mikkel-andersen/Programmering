package guidemoes.excerxice3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiDemo3 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 3");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField investment = new TextField();
    private final TextField years = new TextField();
    private final TextField interest = new TextField();
    private final TextField futureValue = new TextField();

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
        investment.setText(String.valueOf(0));
        pane.add(investment, 1, 0, 2, 1);

        years.setText(String.valueOf(0));
        pane.add(years, 1, 0, 3, 1);

        interest.setText(String.valueOf(0));
        pane.add(interest, 1, 0, 4, 1);

        futureValue.setText(String.valueOf(0));
        pane.add(futureValue, 1, 0, 5, 1);



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
    }

    // -------------------------------------------------------------------------
    private void increment() {
        int n = Integer.parseInt(investment.getText());
        n++;
        String txt = String.valueOf(n);
        investment.setText(txt);
    }

}
