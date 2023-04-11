package guidemoes.excerxice3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiDemo03 extends Application {
    @Override
    public void start (Stage stage) {
        stage.setTitle("Exercise 3");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    private final TextField txfInvestment = new TextField();
    private final TextField txfYears = new TextField();
    private final TextField txfInterest = new TextField();
    private final TextField txfFutureValue = new TextField();

    private void initContent (GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);
        Label invest = new Label("Investment");
        pane.add(invest, 0, 0);
        Label years = new Label("Number of Years");
        pane.add(years, 0, 2);
        Label interest = new Label("Interest");
        pane.add(interest, 0, 4);
        Label futureValue = new Label("Future value");
        pane.add(futureValue, 0, 6);

        pane.add(txfInvestment, 1, 0, 2, 1);
        pane.add(txfYears, 1, 2, 2, 1);
        pane.add(txfInterest, 1, 4, 2, 1);
        pane.add(txfFutureValue, 1, 6, 2, 1);

        Button calculate = new Button("Calculate");
        pane.add(calculate, 1, 5, 2, 1);
        calculate.setOnAction(event -> this.calculate());
    }

    private void calculate() {
        int n = Integer.parseInt(txfInvestment.getText());
        double x = Double.parseDouble(txfInterest.getText());
        int y = Integer.parseInt(txfYears.getText());
        double fV = (n * (x + 1)) * y;
        txfFutureValue.setText(String.valueOf(fV));
    }
}
