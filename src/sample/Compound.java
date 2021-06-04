package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.text.DecimalFormat;

public class Compound {
    public static Pane root1() {
        Stage stage1 = new Stage();
        //creating labels , textFields and combo boxes

        Label lb1 = new Label("Calculate : ");
        lb1.setLayoutX(160);
        lb1.setLayoutY(80);
        lb1.setStyle("-fx-font-weight: bolder;-fx-font-size: 18px;-fx-text-fill: white;-fx-font-size: 20px");

        Label find = new Label("   Total P + I(A)    ");
        find.setLayoutX(260);
        find.setLayoutY(75);
        find.setStyle("-fx-font-weight: bolder;-fx-font-size: 18px;-fx-background-color: crimson;-fx-border-color: white");



        Label lb2 = new Label("Principal :");
        lb2.setLayoutX(130);
        lb2.setLayoutY(150);
        lb2.setFont(Font.font(20));
        lb2.setStyle("-fx-font-weight: bolder;-fx-font-size: 18px;-fx-text-fill: white;-fx-font-size: 20px");

        TextField principal = new TextField(" ");
        principal.setLayoutX(240);
        principal.setLayoutY(150);
        principal.setPromptText("$");


        Label lb3 = new Label("Interest Rate :");
        lb3.setLayoutX(100);
        lb3.setLayoutY(200);
        lb3.setFont(Font.font(20));
        lb3.setStyle("-fx-font-weight: bolder;-fx-font-size: 18px;-fx-text-fill: white;-fx-font-size: 20px");

        TextField rate = new TextField(" ");
        rate.setLayoutX(240);
        rate.setLayoutY(200);
        rate.setPromptText("%");


        Label lb4 = new Label("Time (time in years) :");
        lb4.setLayoutX(40);
        lb4.setLayoutY(250);
        lb4.setStyle("-fx-font-weight: bolder;-fx-font-size: 18px;-fx-text-fill: white;-fx-font-size: 20px");

        TextField time = new TextField(" ");
        time.setLayoutX(240);
        time.setLayoutY(250);
        time.setPromptText("years");

        Label results = new Label("RESULTS               ");
        results.setLayoutX(90);
        results.setLayoutY(350);
        results.setStyle("-fx-font-weight: bolder;-fx-font-size: 25px;" +
                "-fx-text-fill: black;-fx-background-color: grey");

        Label result1 = new Label("");
        result1.setLayoutX(90);
        result1.setLayoutY(400);
        result1.setStyle("-fx-font-size: 20px;-fx-text-fill: powderblue;-fx-font-weight: bolder");

        Label error = new Label("");
        error.setLayoutX(90);
        error.setLayoutY(400);
        error.setStyle("-fx-font-size: 20px;-fx-text-fill: red;-fx-font-weight: bolder");


        //calculate button
        Button comCal = new Button("Calculate");
        comCal.setLayoutX(650);
        comCal.setLayoutY(420);
        comCal.setPrefWidth(150);
        comCal.setPrefHeight(50);
        comCal.setCursor(Cursor.HAND);
        comCal.getCursor();
        comCal.setStyle("-fx-background-color: mediumseagreen;-fx-text-fill: black;" +
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
            public void handle(ActionEvent event) {
                HelpCompound.aid();
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
                principal.clear();
                rate.clear();
                time.clear();
                result1.setText(" ");
            }
        });


        //Back button
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
                stage1.close();

            }
        });


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
        calMethod.getChildren().addAll(seven, eight, nine, four, five,
                six, one, two, three, zero, point, clear);

        //ACCESSING THE CALCULATOR
        principal.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> principal.setText(principal.getText() + "7"));
            eight.setOnAction(event2 -> principal.setText(principal.getText() + "8"));
            nine.setOnAction(event3 -> principal.setText(principal.getText() + "9"));
            four.setOnAction(event4 -> principal.setText(principal.getText() + "4"));
            five.setOnAction(event5 -> principal.setText(principal.getText() + "5"));
            six.setOnAction(event6 -> principal.setText(principal.getText() + "6"));
            one.setOnAction(event7 -> principal.setText(principal.getText() + "1"));
            two.setOnAction(event8 -> principal.setText(principal.getText() + "2"));
            three.setOnAction(event9 -> principal.setText(principal.getText() + "3"));
            zero.setOnAction(event10 -> principal.setText(principal.getText() + "0"));
            point.setOnAction(event11 -> principal.setText(principal.getText() + "."));
            clear.setOnAction(event12 -> principal.clear());
        });

        rate.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> rate.setText(rate.getText() + "7"));
            eight.setOnAction(event2 -> rate.setText(rate.getText() + "8"));
            nine.setOnAction(event3 -> rate.setText(rate.getText() + "9"));
            four.setOnAction(event4 -> rate.setText(rate.getText() + "4"));
            five.setOnAction(event5 -> rate.setText(rate.getText() + "5"));
            six.setOnAction(event6 -> rate.setText(rate.getText() + "6"));
            one.setOnAction(event7 -> rate.setText(rate.getText() + "1"));
            two.setOnAction(event8 -> rate.setText(rate.getText() + "2"));
            three.setOnAction(event9 -> rate.setText(rate.getText() + "3"));
            zero.setOnAction(event10 -> rate.setText(rate.getText() + "0"));
            point.setOnAction(event11 -> rate.setText(rate.getText() + "."));
            clear.setOnAction(event12 -> rate.clear());
        });

        time.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> time.setText(time.getText() + "7"));
            eight.setOnAction(event2 -> time.setText(time.getText() + "8"));
            nine.setOnAction(event3 -> time.setText(time.getText() + "9"));
            four.setOnAction(event4 -> time.setText(time.getText() + "4"));
            five.setOnAction(event5 -> time.setText(time.getText() + "5"));
            six.setOnAction(event6 -> time.setText(time.getText() + "6"));
            one.setOnAction(event7 -> time.setText(time.getText() + "1"));
            two.setOnAction(event8 -> time.setText(time.getText() + "2"));
            three.setOnAction(event9 -> time.setText(time.getText() + "3"));
            zero.setOnAction(event10 -> time.setText(time.getText() + "0"));
            point.setOnAction(event11 -> time.setText(time.getText() + "."));
            clear.setOnAction(event12 -> time.clear());
        });

        //<<<<<<<<<<<<<<========CALCULATIONS=========>>>>>>>>>>>>>>>
        DecimalFormat df = new DecimalFormat("0.00");

        comCal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    double n = 12;   //no of periods
                    double P = Double.parseDouble(principal.getText());  //principal
                    double r = Double.parseDouble(rate.getText()) / 100;   // rate
                    double t = Double.parseDouble(time.getText());  //time in years
                    double A = P * (Math.pow(1 + (r / n), (n * t)));  //Calculate Accrued amount
                    result1.setText("Accrued amount : $" + df.format(A));
                }catch(Exception display){
                    error.setText("Please enter the valid inputs");
                }
            }
        });


        //set Background image
        Image img2 = new Image("file:background.jpg");
        ImageView imgView2 = new ImageView(img2);
        imgView2.setFitWidth(1100);
        imgView2.setFitHeight(600);

        //containing all the labels and nodes
        Pane root1 = new Pane();
        root1.getChildren().addAll(imgView2, lb1,find,lb2,principal,lb3,rate,
                lb4,time,results,result1,comCal, calMethod, back,clearAll,help,error);

        Scene scene = new Scene(root1, 1100, 600);
        stage1.setTitle("Compound");  //Title for the page
        stage1.setScene(scene);   //set scene
        stage1.show();

        return root1;

    }
}

