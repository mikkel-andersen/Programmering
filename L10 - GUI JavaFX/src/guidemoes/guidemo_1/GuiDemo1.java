package guidemoes.guidemo_1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiDemo1 extends Application {
    private TextField txFirstName;
    private TextField txLastName;
    private TextField txFullName;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false); // true for grid - false for no grid

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label firstNameLabel = new Label("First name:");
        pane.add(firstNameLabel, 1, 0);

        Label lastNameLabel = new Label("Last name: ");
        pane.add(lastNameLabel, 2, 0);

        Label combLabel = new Label("Full name: ");
        pane.add(combLabel, 1, 2);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        txFirstName = new TextField();
        pane.add(txFirstName, 1, 1, 1, 1);

        txLastName = new TextField();
        pane.add(txLastName, 2, 1, 2, 1);

        txFullName = new TextField();
        pane.add(txFullName, 1, 3, 3, 1);

        // add a button to the pane (at col=1, row=1)
        Button btnCombine = new Button("Combine");
        pane.add(btnCombine, 1, 5);
        GridPane.setMargin(btnCombine, new Insets(10, 10, 0, 10));

        btnCombine.setOnAction(event -> this.combine());
    }

    private void combine() {
        String name = txFirstName.getText() + " " + txLastName.getText();
        txFullName.setText(name);
    }
}
