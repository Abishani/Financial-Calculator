package sample;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelpLoan {
    public static Pane aid2() {
        Stage help3 = new Stage();

        Label assist = new Label("LOAN CALCULATOR");
        assist.setLayoutX(5);
        assist.setLayoutY(10);
        assist.setStyle("-fx-font-weight: bolder;-fx-font-size: 30px;-fx-font-style: oblique");

        Label loanAid = new Label("\n" +
                "\n" +
                "USE OF THIS CALCULATOR\n" +
                "Use this calculator to determine your Monthly payment , Total Payment and Total Interest\n" +
                "\n" +
                "\n" +
                "To find Monthly payment , Total Payment and Total Interest, you need to insert some values\n" +
                "Loan Amount - The original principal on a new loan or principal remaining on an existing loan\n" +
                "Loan Term - Number of payments required to repay the loan\n" +
                "Interest Rate - The annual interest rate\n" +
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
                "\"Clear\" button will delete the record which is entered inside the text field.  \n" +
                "\n");
        loanAid.setLayoutX(5);
        loanAid.setLayoutY(50);
        loanAid.setMaxWidth(750);
        loanAid.setWrapText(true);
        loanAid.setStyle("-fx-font: Times New Roman;-fx-font-size: 20;");


        Pane aid2 = new Pane();
        aid2.getChildren().addAll(assist,loanAid);

        Scene support = new Scene(aid2, 1120, 1000);
        help3.setTitle("Help");  //Title for the page
        help3.setScene(support);   //set scene
        help3.show();

        return  aid2;
    }
}
