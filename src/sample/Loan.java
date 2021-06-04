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

public class Loan {
    public static Pane root3() {
        Stage stage3 = new Stage();

        //creating labels and textFields
        Label loanAmt = new Label("Loan Amount");
        loanAmt.setLayoutX(90);
        loanAmt.setLayoutY(100);
        loanAmt.setStyle("-fx-text-fill: white;-fx-font-size: 20px");

        Label loanTerm = new Label("Loan Term");
        loanTerm.setLayoutX(90);
        loanTerm.setLayoutY(150);
        loanTerm.setStyle("-fx-text-fill: white;-fx-font-size: 20px");

        Label intRate = new Label("Interest Rate");
        intRate.setLayoutX(90);
        intRate.setLayoutY(200);
        intRate.setStyle("-fx-text-fill: white;-fx-font-size: 20px");


        TextField lAmt = new TextField();
        lAmt.setLayoutX(250);
        lAmt.setLayoutY(100);
        lAmt.setPromptText("$");

        TextField lTerm = new TextField();
        lTerm.setLayoutX(250);
        lTerm.setLayoutY(150);
        lTerm.setPromptText("years");

        TextField iRate = new TextField();
        iRate.setLayoutX(250);
        iRate.setLayoutY(200);
        iRate.setPromptText("%");



        Button loanCal = new Button("Calculate");
        loanCal.setLayoutX(650);
        loanCal.setLayoutY(480);
        loanCal.setPrefWidth(150);
        loanCal.setPrefHeight(50);
        loanCal.setCursor(Cursor.HAND);
        loanCal.getCursor();
        loanCal.setStyle("-fx-background-color: mediumseagreen;-fx-text-fill: black;" +
                "-fx-font-weight: bolder;-fx-font-size: 25px");




        //back button
        Button back = new Button("Back");
        back.setLayoutX(900);
        back.setLayoutY(280);
        back.setPrefWidth(150);
        back.setPrefHeight(50);
        back.setCursor(Cursor.HAND);
        back.getCursor();
        back.setStyle("-fx-background-color: #2A363B;-fx-text-fill: white;-" +
                "fx-font-weight: bolder;-fx-font-size: 25px");
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage3.close();
            }
        });

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
            public void handle(ActionEvent event) {
                HelpLoan.aid2();
            }
        });


        Label error = new Label("");
        error.setLayoutX(55);
        error.setLayoutY(600);
        error.setStyle("-fx-font-size: 20px;-fx-text-fill: red;-fx-font-weight: bolder");

        //set Background image
        Image img4 = new Image("file:background.jpg");
        ImageView imgView4 = new ImageView(img4);
        imgView4.setFitWidth(1100);
        imgView4.setFitHeight(600);


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

        Button minus = new Button("-");
        minus.setStyle("-fx-font-size: 30px");
        minus.setLayoutX(180);
        minus.setLayoutY(240);
        minus.setPrefWidth(85);
        minus.setPrefHeight(75);

        Button clear = new Button("clear");
        clear.setStyle("-fx-font-size: 20px");
        clear.setLayoutX(1);
        clear.setLayoutY(320);
        clear.setPrefWidth(265);
        clear.setPrefHeight(75);

        //creating a pane
        Pane calMethod = new Pane();
        calMethod.setStyle("-fx-font-weight: bolder;-fx-font-size: 25px");
        calMethod.setPrefWidth(270);
        calMethod.setPrefHeight(360);
        calMethod.setLayoutX(600);
        calMethod.setLayoutY(50);
        calMethod.getChildren().addAll(seven, eight, nine, four, five,
                six, one, two, three, zero, point, clear, minus);

        //ACCESSING THE CALCULATOR
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
            minus.setOnAction(event12 -> iRate.setText(iRate.getText() + "-"));
            clear.setOnAction(event13 -> iRate.clear());
        });

        lAmt.setOnMouseClicked(event -> {
            seven.setOnAction(event14 -> lAmt.setText(lAmt.getText() + "7"));
            eight.setOnAction(event15 -> lAmt.setText(lAmt.getText() + "8"));
            nine.setOnAction(event16 -> lAmt.setText(lAmt.getText() + "9"));
            four.setOnAction(event17 -> lAmt.setText(lAmt.getText() + "4"));
            five.setOnAction(event18 -> lAmt.setText(lAmt.getText() + "5"));
            six.setOnAction(event19 -> lAmt.setText(lAmt.getText() + "6"));
            one.setOnAction(event20 -> lAmt.setText(lAmt.getText() + "1"));
            two.setOnAction(event21 -> lAmt.setText(lAmt.getText() + "2"));
            three.setOnAction(event22 -> lAmt.setText(lAmt.getText() + "3"));
            zero.setOnAction(event23 -> lAmt.setText(lAmt.getText() + "0"));
            point.setOnAction(event24 -> lAmt.setText(lAmt.getText() + "."));
            minus.setOnAction(event25 -> lAmt.setText(lAmt.getText() + "-"));
            clear.setOnAction(event26 -> lAmt.clear());
        });


        lTerm.setOnMouseClicked(event -> {
            seven.setOnAction(event27 -> lTerm.setText(lTerm.getText() + "7"));
            eight.setOnAction(event28 -> lTerm.setText(lTerm.getText() + "8"));
            nine.setOnAction(event29 -> lTerm.setText(lTerm.getText() + "9"));
            four.setOnAction(event30 -> lTerm.setText(lTerm.getText() + "4"));
            five.setOnAction(event31 -> lTerm.setText(lTerm.getText() + "5"));
            six.setOnAction(event32 -> lTerm.setText(lTerm.getText() + "6"));
            one.setOnAction(event33 -> lTerm.setText(lTerm.getText() + "1"));
            two.setOnAction(event34 -> lTerm.setText(lTerm.getText() + "2"));
            three.setOnAction(event35 -> lTerm.setText(lTerm.getText() + "3"));
            zero.setOnAction(event36 -> lTerm.setText(lTerm.getText() + "0"));
            point.setOnAction(event37 -> lTerm.setText(lTerm.getText() + "."));
            minus.setOnAction(event38 -> lTerm.setText(lTerm.getText() + "-"));
            clear.setOnAction(event39 -> lTerm.clear());
        });

        Label results = new Label(" RESULTS                 ");
        results.setLayoutX(55);
        results.setLayoutY(290);
        results.setStyle("-fx-background-color: grey;-fx-text-fill: black;" +
                "-fx-font-size: 25px;-fx-font-weight: bolder");

        Label result1 = new Label(" ");
        result1.setLayoutX(55);
        result1.setLayoutY(340);
        result1.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-text-fill: powderblue");

        Label result2 = new Label(" ");
        result2.setLayoutX(55);
        result2.setLayoutY(370);
        result2.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-text-fill: powderblue");

        Label result3 = new Label(" ");
        result3.setLayoutX(55);
        result3.setLayoutY(400);
        result3.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-text-fill: powderblue");


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
                lAmt.clear();
                lTerm.clear();
                iRate.clear();
                result1.setText("");
                result2.setText("");
                result3.setText("");

            }
        });


        //<<<<<<<<<<<<<<<<<====CALCULATIONS=====>>>>>>>>>>>>>>>>>>>>>>>>

        DecimalFormat df = new DecimalFormat("0.00");

        loanCal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    double n = 12;
                    double P = Double.parseDouble(lAmt.getText()); // loan amount
                    double t = Double.parseDouble(lTerm.getText()); // loan term
                    double r = Double.parseDouble(iRate.getText()); //interest rate
                    double PMT = ((r / 12) / 100 * P) / (1 - Math.pow((1 + (r / 12) / 100), -n * t)); // find the monthly payment
                    result1.setText("Monthly Payment : $" + df.format(PMT));

                    double TP = (PMT * t * 12); //total payment
                    result2.setText("Total Payment : $" + df.format(TP));

                    double TI = (TP - P);//total interest
                    result3.setText("Total Interest : $" + df.format(TI));
                }catch(Exception Display){
                    error.setText("Please enter the valid inputs");
                }
            }
        });

        //Display loan page contents
        Pane root3 = new Pane();
        root3.setStyle("-fx-font-size: 19");
        root3.getChildren().addAll(imgView4, loanAmt, loanTerm, intRate,
                 lAmt, lTerm, iRate,loanCal, back, calMethod, results,result1,result2,result3,clearAll,help);


        //Loan
        Scene scene3 = new Scene(root3, 1100, 600);
        stage3.setTitle("Loan");
        stage3.setScene(scene3);
        stage3.show();

        return root3;
    }
}
