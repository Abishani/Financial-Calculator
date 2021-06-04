package sample;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelpCompound {
    public static Pane aid(){
        Stage help1 = new Stage();

        Label assist = new Label("COMPOUND CALCULATOR");
        assist.setLayoutX(5);
        assist.setLayoutY(10);
        assist.setStyle("-fx-font-weight: bolder;-fx-font-size: 30px;-fx-font-style: oblique");

        Label comAid = new Label("\n" +
                "\n" +
                "USE OF THIS CALCULATOR\n" +
                "Calculate compound interest on an investment or savings.Using the compound interest formula\n" +
                "can calculate Accrued amount which includes principal and interest.\n" +
                "\n" +
                "\n" +
                "ELEMENTS TO CALCULATE ACCRUED AMOUNT\n" +
                "Principal - How much you are investing.\n" +
                "Interest Rate - annual interest rate for your compound interest\n" +
                "Time(in years) - Time involved in years (eg: if it is 6 months  = 0.5 years)\n" +
                "\n" +
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

        comAid.setLayoutX(5);
        comAid.setLayoutY(50);
        comAid.setMaxWidth(750);
        comAid.setWrapText(true);
        comAid.setStyle("-fx-font-size: 20;"+"-fx-font: New Roman");




        Pane aid = new Pane();
        aid.getChildren().addAll(assist,comAid);

        Scene support = new Scene(aid, 1120, 1000);
        help1.setTitle("Help");  //Title for the page
        help1.setScene(support);   //set scene
        help1.show();

        return aid;
    }
}
