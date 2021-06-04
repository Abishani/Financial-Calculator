package sample;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelpSavings {
    public static Pane aid1() {
        Stage help2 = new Stage();

        Label assist = new Label("SAVINGS CALCULATOR");
        assist.setLayoutX(5);
        assist.setLayoutY(10);
        assist.setStyle("-fx-font-weight: bolder;-fx-font-size: 30px;-fx-font-style: oblique");

        Label saveAid = new Label("\n" +
                "\n" +
                "USE OF THIS CALCULATOR\n" +
                "Using this calculator can identify these things\n" +
                "(1)FV - Future Value\n" +
                "(2)PMT - Annuity Payment\n" +
                "(3)I/Y (Interest) - Interest Rate\n" +
                "(4)N - Number of Periods\n" +
                "(5)Start principal\n" +
                "\n" +
                "\n" +
                "To find these things you have to enter  particular inputs\n" +
                "N (No of periods) - years  (eg: if it is 6 months  = 0.5 years)\n" +
                "Start principal - How much you are investing\n" +
                "I/Y (Interest) - This is a annual interest rate \n" +
                "PMT(Annuity Payment) - Monthly Payment\n" +
                "FV (Future value) - To get PMT, I/Y, N and Start Principal how much future value is needed\n" +
                "\n" +
                "\n" +
                "BUTTONS\n" +
                "Calculate - Calculate button will display the results under the \"RESULTS\"\n" +
                "To delete all the records at the same time which are inserted into the text field \n" +
                "click the \"Clear All\" Button\n" +
                "To go to Home Page click \"Back\" Button\n" +
                "\n" +
                "\n" +
                "ON SCREEN CALCULATOR\n" +
                "Through On Screen Calculator can insert the numbers and decimals into the text fields\n" +
                "\"Clear\" button will delete the record which is entered inside the text field.  \n");
        saveAid.setLayoutX(5);
        saveAid.setLayoutY(50);
        saveAid.setMaxWidth(750);
        saveAid.setWrapText(true);
        saveAid.setStyle("-fx-font: Times New Roman;-fx-font-size: 20;");

        Pane aid1 = new Pane();
        aid1.getChildren().addAll(assist,saveAid);

        Scene support = new Scene(aid1, 1120, 1000);
        help2.setTitle("Help");  //Title for the page
        help2.setScene(support);   //set scene
        help2.show();

        return  aid1;
    }
}