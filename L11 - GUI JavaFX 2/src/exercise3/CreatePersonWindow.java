package exercise3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CreatePersonWindow extends Stage {
    public CreatePersonWindow(String name, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle(name);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    // -------------------------------------------------------------------------

    private final TextField txfTitle = new TextField();
    private final TextField txfActor = new TextField();
    private final CheckBox checkbox = new CheckBox();

    private Person person = null;

    private void initContent(GridPane pane) {
//        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblTitle = new Label("Name:");
        pane.add(lblTitle, 0, 0);

        Label lblActor = new Label("Title:");
        pane.add(lblActor, 0, 1);

        pane.add(txfTitle, 1, 0);

        pane.add(txfActor, 1, 1);
        Label lblSenior = new Label("Senior");
        pane.add(lblSenior, 2, 1);
        pane.add(checkbox, 2, 0);

        HBox buttonBox = new HBox(20);
        pane.add(buttonBox, 0, 2, 2, 1);
        buttonBox.setPadding(new Insets(10, 10, 0, 10));
        buttonBox.setAlignment(Pos.CENTER);

        Button btnCancel = new Button("Cancel");
        buttonBox.getChildren().add(btnCancel);
        btnCancel.setOnAction(event -> this.cancelAction());

        Button btnOK = new Button("OK");
        buttonBox.getChildren().add(btnOK);
        btnOK.setOnAction(event -> this.okAction());
    }

    // -------------------------------------------------------------------------
    // Button actions

    private void cancelAction() {
        txfTitle.clear();
        txfTitle.requestFocus();
        txfActor.clear();

    }

    private void okAction() {
        String title = txfTitle.getText().trim();
        String actor = txfActor.getText().trim();

        if (title.length() > 0 && actor.length() > 0) {

            txfTitle.clear();
            txfActor.clear();
            txfTitle.requestFocus();

        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Create movie");
            alert.setHeaderText("Information missing");
            alert.setContentText("Type title and actor");
            alert.show();
        }
    }
}

        // -------------------------------------------------------------------------


