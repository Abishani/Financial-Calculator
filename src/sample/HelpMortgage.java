package sample;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelpMortgage {
    public static Pane aid3() {
        Stage help4 = new Stage();

        Label assist = new Label("MORTGAGE CALCULATOR");
        assist.setLayoutX(5);
        assist.setLayoutY(10);
        assist.setStyle("-fx-font-weight: bolder;-fx-font-size: 30px;-fx-font-style: oblique");

        Label mortgageAid = new Label("\n" +
                "\n" +
                "USE OF THIS CALCULATOR\n" +
                "Use of this calculator to determine Loan amount, Monthly Payment and Total Mortgage Payment\n" +
                "\n" +
                "to find above things you have to enter these values\n" +
                "Home Price - The sums in money for which houses may be bought\n" +
                "Down Payment -initial payment to be made  \n" +
                "Loan Term - regular payments over a set period of time\n" +
                "Interest Rate - It is a percentage how much you wil pay for a loan\n" +
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
        mortgageAid.setLayoutX(5);
        mortgageAid.setLayoutY(50);
        mortgageAid.setMaxWidth(750);
        mortgageAid.setWrapText(true);
        mortgageAid.setStyle("-fx-font: Times New Roman;-fx-font-size: 20;");

        Pane aid3 = new Pane();
        aid3.getChildren().addAll(assist,mortgageAid);

        Scene support = new Scene(aid3, 1120, 1000);
        help4.setTitle("Help");  //Title for the page
        help4.setScene(support);   //set scene
        help4.show();

        return  aid3;
    }
}
