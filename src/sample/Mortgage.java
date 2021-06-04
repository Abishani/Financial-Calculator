package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.text.DecimalFormat;


public class Mortgage {
    public static Pane root4() {
        Stage stage4 = new Stage();
        //creating labels and textFields
        Label homePrice = new Label("Home Price");
        homePrice.setLayoutX(90);
        homePrice.setLayoutY(50);
        homePrice.setStyle("-fx-font-size: 18;-fx-text-fill: white");

        TextField hPrice = new TextField();
        hPrice.setLayoutX(250);
        hPrice.setLayoutY(50);
        hPrice.setPromptText("$");

        Label downPay = new Label("Down Payment");
        downPay.setLayoutX(90);
        downPay.setLayoutY(100);
        downPay.setStyle("-fx-font-size: 18;-fx-text-fill: white");

        TextField dPay = new TextField();
        dPay.setLayoutX(250);
        dPay.setLayoutY(100);
        dPay.setPromptText("$");

        Label loanTerm = new Label("Loan Term");
        loanTerm.setLayoutX(90);
        loanTerm.setLayoutY(150);
        loanTerm.setStyle("-fx-font-size: 18;-fx-text-fill: white");

        TextField lTerm = new TextField();
        lTerm.setLayoutX(250);
        lTerm.setLayoutY(150);
        lTerm.setPromptText("years");

        Label intRate = new Label("Interest Rate");
        intRate.setLayoutX(90);
        intRate.setLayoutY(200);
        intRate.setStyle("-fx-font-size: 18;-fx-text-fill: white");

        TextField iRate = new TextField();
        iRate.setLayoutX(250);
        iRate.setLayoutY(200);
        iRate.setPromptText("%");

        Label results = new Label("RESULTS             ");
        results.setLayoutX(90);
        results.setLayoutY(310);
        results.setStyle("-fx-text-fill: black;-fx-background-color: grey;-fx-font-size: 25px;-fx-font-weight: bolder");

        Label results1 = new Label("");
        results1.setLayoutX(90);
        results1.setLayoutY(350);
        results1.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-text-fill: powderblue");

        Label results2 = new Label("");
        results2.setLayoutX(90);
        results2.setLayoutY(380);
        results2.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-text-fill: powderblue");

        Label results3 = new Label("");
        results3.setLayoutX(90);
        results3.setLayoutY(410);
        results3.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-text-fill: powderblue");


        Button morCal = new Button("Calculate");
        morCal.setLayoutX(650);
        morCal.setLayoutY(480);
        morCal.setPrefWidth(150);
        morCal.setPrefHeight(50);
        morCal.setCursor(Cursor.HAND);
        morCal.getCursor();
        morCal.setStyle("-fx-background-color: mediumseagreen;-fx-text-fill: black;" +
                "-fx-font-weight: bolder;-fx-font-size: 25px");


        Button help = new Button("Help");
        help.setLayoutX(900);
        help.setLayoutY(140);
        help.setPrefWidth(150);
        help.setPrefHeight(50);
        help.setCursor(Cursor.HAND);
        help.getCursor();
        help.setStyle("-fx-background-color: royalblue;-fx-text-fill: black;" +
                "-fx-font-weight: bolder;-fx-font-size: 25px");
        help.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                HelpMortgage.aid3();
            }
        });


        //back button
        Button back = new Button("Back");
        back.setLayoutX(900);
        back.setLayoutY(280);
        back.setPrefWidth(150);
        back.setPrefHeight(50);
        back.setCursor(Cursor.HAND);
        back.getCursor();
        back.setStyle("-fx-background-color: gray;-fx-text-fill: black;" +
                "-fx-font-weight: bolder;-fx-font-size: 25px");
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage4.close();
            }
        });

        Button clearAll = new Button("Clear All");
        clearAll.setLayoutX(900);
        clearAll.setLayoutY(210);
        clearAll.setPrefWidth(150);
        clearAll.setPrefHeight(50);
        clearAll.setCursor(Cursor.HAND);
        clearAll.getCursor();
        clearAll.setStyle("-fx-background-color:#547980;-fx-text-fill: black;" +
                "-fx-font-weight: bolder;-fx-font-size: 25px");
        clearAll.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hPrice.clear();
                dPay.clear();
                lTerm.clear();
                iRate.clear();
                results1.setText("");
                results2.setText("");
                results3.setText("");
            }
        });

        //set Background image
        Image img5 = new Image("file:background.jpg");
        ImageView imgView5 = new ImageView(img5);
        imgView5.setFitWidth(1100);
        imgView5.setFitHeight(600);

        //CALCULATOR
        Button seven = new Button("7");
        seven.setLayoutX(1);
        seven.setPrefWidth(85);
        seven.setPrefHeight(75);

        Button eight = new Button("8");
        eight.setLayoutX(90);
        eight.setPrefWidth(85);
        eight.setPrefHeight(75);

        Button nine = new Button("9");
        nine.setLayoutX(180);
        nine.setPrefWidth(85);
        nine.setPrefHeight(75);

        Button four = new Button("4");
        four.setLayoutX(1);
        four.setLayoutY(80);
        four.setPrefWidth(85);
        four.setPrefHeight(75);

        Button five = new Button("5");
        five.setLayoutX(90);
        five.setLayoutY(80);
        five.setPrefWidth(85);
        five.setPrefHeight(75);

        Button six = new Button("6");
        six.setLayoutX(180);
        six.setLayoutY(80);
        six.setPrefWidth(85);
        six.setPrefHeight(75);

        Button one = new Button("1");
        one.setLayoutX(1);
        one.setLayoutY(160);
        one.setPrefWidth(85);
        one.setPrefHeight(75);

        Button two = new Button("2");
        two.setLayoutX(90);
        two.setLayoutY(160);
        two.setPrefWidth(85);
        two.setPrefHeight(75);

        Button three = new Button("3");
        three.setLayoutX(180);
        three.setLayoutY(160);
        three.setPrefWidth(85);
        three.setPrefHeight(75);


        Button zero = new Button("0");
        zero.setLayoutX(1);
        zero.setLayoutY(240);
        zero.setPrefWidth(85);
        zero.setPrefHeight(75);

        Button point = new Button(".");
        point.setLayoutX(90);
        point.setLayoutY(240);
        point.setPrefWidth(85);
        point.setPrefHeight(75);

        Button clear = new Button("clear");
        clear.setStyle("-fx-font-size: 20px");
        clear.setLayoutX(180);
        clear.setLayoutY(240);
        clear.setPrefWidth(85);
        clear.setPrefHeight(75);

        //creating a pane
        Pane calMethod = new Pane();
        calMethod.setStyle("-fx-font-weight: bolder;-fx-font-size: 25px");
        calMethod.setPrefWidth(270);
        calMethod.setPrefHeight(360);
        calMethod.setLayoutX(600);
        calMethod.setLayoutY(70);
        calMethod.getChildren().addAll(seven, eight, nine, four,
                five, six, one, two, three, zero, point, clear);

        //ACCESSING THE CALCULATOR
        hPrice.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> hPrice.setText(hPrice.getText() + "7"));
            eight.setOnAction(event2 -> hPrice.setText(hPrice.getText() + "8"));
            nine.setOnAction(event3 -> hPrice.setText(hPrice.getText() + "9"));
            four.setOnAction(event4 -> hPrice.setText(hPrice.getText() + "4"));
            five.setOnAction(event5 -> hPrice.setText(hPrice.getText() + "5"));
            six.setOnAction(event6 -> hPrice.setText(hPrice.getText() + "6"));
            one.setOnAction(event7 -> hPrice.setText(hPrice.getText() + "1"));
            two.setOnAction(event8 -> hPrice.setText(hPrice.getText() + "2"));
            three.setOnAction(event9 -> hPrice.setText(hPrice.getText() + "3"));
            zero.setOnAction(event10 -> hPrice.setText(hPrice.getText() + "0"));
            point.setOnAction(event11 -> hPrice.setText(hPrice.getText() + "."));
            clear.setOnAction(event12 -> hPrice.clear());
        });

        dPay.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> dPay.setText(dPay.getText() + "7"));
            eight.setOnAction(event2 -> dPay.setText(dPay.getText() + "8"));
            nine.setOnAction(event3 -> dPay.setText(dPay.getText() + "9"));
            four.setOnAction(event4 -> dPay.setText(dPay.getText() + "4"));
            five.setOnAction(event5 -> dPay.setText(dPay.getText() + "5"));
            six.setOnAction(event6 -> dPay.setText(dPay.getText() + "6"));
            one.setOnAction(event7 -> dPay.setText(dPay.getText() + "1"));
            two.setOnAction(event8 -> dPay.setText(dPay.getText() + "2"));
            three.setOnAction(event9 -> dPay.setText(dPay.getText() + "3"));
            zero.setOnAction(event10 -> dPay.setText(dPay.getText() + "0"));
            point.setOnAction(event11 -> dPay.setText(dPay.getText() + "."));
            clear.setOnAction(event12 -> dPay.clear());
        });

        lTerm.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> lTerm.setText(lTerm.getText() + "7"));
            eight.setOnAction(event2 -> lTerm.setText(lTerm.getText() + "8"));
            nine.setOnAction(event3 -> lTerm.setText(lTerm.getText() + "9"));
            four.setOnAction(event4 -> lTerm.setText(lTerm.getText() + "4"));
            five.setOnAction(event5 -> lTerm.setText(lTerm.getText() + "5"));
            six.setOnAction(event6 -> lTerm.setText(lTerm.getText() + "6"));
            one.setOnAction(event7 -> lTerm.setText(lTerm.getText() + "1"));
            two.setOnAction(event8 -> lTerm.setText(lTerm.getText() + "2"));
            three.setOnAction(event9 -> lTerm.setText(lTerm.getText() + "3"));
            zero.setOnAction(event10 -> lTerm.setText(lTerm.getText() + "0"));
            point.setOnAction(event11 -> lTerm.setText(lTerm.getText() + "."));
            clear.setOnAction(event12 -> lTerm.clear());
        });

        iRate.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> iRate.setText(iRate.getText() + "7"));
            eight.setOnAction(event2 -> iRate.setText(iRate.getText() + "8"));
            nine.setOnAction(event3 -> iRate.setText(iRate.getText() + "9"));
            four.setOnAction(event4 -> iRate.setText(iRate.getText() + "4"));
            five.setOnAction(event5 -> iRate.setText(iRate.getText() + "5"));
            six.setOnAction(event6 -> iRate.setText(iRate.getText() + "6"));
            one.setOnAction(event7 -> iRate.setText(iRate.getText() + "1"));
            two.setOnAction(event8 -> iRate.setText(iRate.getText() + "2"));
            three.setOnAction(event9 -> iRate.setText(iRate.getText() + "3"));
            zero.setOnAction(event10 -> iRate.setText(iRate.getText() + "0"));
            point.setOnAction(event11 -> iRate.setText(iRate.getText() + "."));
            clear.setOnAction(event12 -> iRate.clear());
        });

        Label error = new Label("");
        error.setLayoutX(55);
        error.setLayoutY(600);
        error.setStyle("-fx-font-size: 20px;-fx-text-fill: red;-fx-font-weight: bolder");

        //<<<<<<<<<<<<<<<<<<====CALCULATIONS=====>>>>>>>>>>>>>>>
        DecimalFormat df = new DecimalFormat("0.00");

        morCal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    double n = 12;
                    double HP = Double.parseDouble(hPrice.getText()); // home price
                    double DP = Double.parseDouble(dPay.getText());   // down payment
                    double t = Double.parseDouble(lTerm.getText());   // loan term
                    double r = Double.parseDouble(iRate.getText());   // interest rate
                    double LA = HP - DP;  //Loan Amount
                    results1.setText("Loan amount : $" + df.format(LA));

                    double MP = ((r / n) / 100 * LA / (1 - Math.pow((1 + (r / n) / 100), -n * t)));  //Monthly Payment
                    results2.setText("Monthly Payment : $" + df.format(MP));

                    double TMP = MP * (t * n); //Total Mortgage Payment
                    results3.setText("Total Mortgage Payment : $" + df.format(TMP));
                }catch (Exception display){
                    error.setText("Please enter the valid inputs");
                }

            }
        });



        //Display mortgage page contents
        Pane root4 = new Pane();
        root4.setId("mortgage");
        root4.getChildren().addAll(imgView5, homePrice, downPay, loanTerm, intRate,
                hPrice, dPay, lTerm, iRate,  morCal, back, calMethod, results,results1,results2,results3,clearAll,help,error);


        //Mortgage
        Scene scene4 = new Scene(root4, 1100, 600);
        stage4.setTitle("Mortgage");
        stage4.setScene(scene4);
        stage4.show();

        return root4;
    }
}
