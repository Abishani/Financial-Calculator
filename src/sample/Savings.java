package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.text.DecimalFormat;


public class Savings {

    public static Pane root2() {
        Stage stage2 = new Stage();
        //<<<<FINDING FUTURE VALUE>>>>>>
        //Display savings page contents
        TabPane cTabPane = new TabPane();
        cTabPane.setTabMinWidth(75);
        cTabPane.setStyle("-fx-font-size: 20px");

        //creating tabs
        Tab fv = new Tab();
        fv.setText("FV");
        fv.setClosable(false);
        fv.setStyle("-fx-font-weight: bolder");


        //creating labels and text fields
        Label lb1 = new Label("N (No of periods)");
        lb1.setLayoutX(110);
        lb1.setLayoutY(95);
        lb1.setFont(Font.font(18));
        lb1.setStyle("-fx-text-fill: white");


        Label lb2 = new Label("Start Principal");
        lb2.setLayoutX(135);
        lb2.setLayoutY(145);
        lb2.setFont(Font.font(18));
        lb2.setStyle("-fx-text-fill: white");


        Label lb3 = new Label("I/Y (Interest)");
        lb3.setLayoutX(146);
        lb3.setLayoutY(195);
        lb3.setFont(Font.font(18));
        lb3.setStyle("-fx-text-fill: white");


        Label lb4 = new Label("PMT (Annuity Payment)");
        lb4.setLayoutX(70);
        lb4.setLayoutY(245);
        lb4.setFont(Font.font(18));
        lb4.setStyle("-fx-text-fill: white");


        Label lb5 = new Label("PMT made at the end of each compound period");
        lb5.setLayoutX(20);
        lb5.setLayoutY(40);
        lb5.setFont(Font.font(18));
        lb5.setStyle("-fx-text-fill: red;-fx-font-weight: bolder;" +
                "-fx-font-size: 25px;");

        Label result1 = new Label("");
        result1.setLayoutX(55);
        result1.setLayoutY(370);
        result1.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-text-fill: powderblue");

        Label resultsDisplay1 = new Label("RESULTS                        ");
        resultsDisplay1.setLayoutX(55);
        resultsDisplay1.setLayoutY(600);
        resultsDisplay1.setLayoutY(320);
        resultsDisplay1.setStyle("-fx-font-size: 25px;-fx-text-fill: black;" +
                "-fx-background-color: grey;-fx-font-weight: bolder");

        TextField tf1 = new TextField();
        tf1.setLayoutX(260);
        tf1.setLayoutY(90);
        tf1.setPromptText("years");

        TextField tf2 = new TextField();
        tf2.setLayoutX(260);
        tf2.setLayoutY(140);
        tf2.setPromptText("$");

        TextField tf3 = new TextField();
        tf3.setLayoutX(260);
        tf3.setLayoutY(190);
        tf3.setPromptText("%");

        TextField tf4 = new TextField();
        tf4.setLayoutX(260);
        tf4.setLayoutY(240);
        tf4.setPromptText("$");

        Button calculate1 = new Button("Calculate");
        calculate1.setLayoutX(650);
        calculate1.setLayoutY(440);
        calculate1.setPrefWidth(150);
        calculate1.setPrefHeight(50);
        calculate1.setCursor(Cursor.HAND);
        calculate1.getCursor();
        calculate1.setStyle("-fx-background-color:mediumseagreen;-fx-text-fill: black;" +
                "-fx-font-weight: bolder;-fx-font-size: 25px");


        Pane p1 = new Pane();
        p1.getChildren().addAll(lb1, lb2, lb3, lb4, lb5, tf1, tf2, tf3, tf4, calculate1,result1,resultsDisplay1);
        fv.setContent(p1);


//===============================================================================
//<<<<FINDING ANNUITY PAYMENT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Tab pmt = new Tab();
        pmt.setText("PMT");
        pmt.setClosable(false);
        pmt.setStyle("-fx-font-weight: bolder");

        //creating labels and text fields
        Label lb6 = new Label("N (No of periods)");
        lb6.setLayoutX(110);
        lb6.setLayoutY(95);
        lb6.setFont(Font.font(18));
        lb6.setStyle("-fx-text-fill: white");

        TextField tf5 = new TextField();
        tf5.setLayoutX(260);
        tf5.setLayoutY(90);
        tf5.setPromptText("years");

        Label lb7 = new Label("Start Principal");
        lb7.setLayoutX(135);
        lb7.setLayoutY(145);
        lb7.setFont(Font.font(18));
        lb7.setStyle("-fx-text-fill: white");

        TextField tf6 = new TextField();
        tf6.setLayoutX(260);
        tf6.setLayoutY(140);
        tf6.setPromptText("$");

        Label lb8 = new Label("I/Y (Interest)");
        lb8.setLayoutX(146);
        lb8.setLayoutY(195);
        lb8.setFont(Font.font(18));
        lb8.setStyle("-fx-text-fill: white");

        TextField tf7 = new TextField();
        tf7.setLayoutX(260);
        tf7.setLayoutY(190);
        tf7.setPromptText("%");

        Label lb9 = new Label("FV (Future Value)");
        lb9.setLayoutX(110);
        lb9.setLayoutY(245);
        lb9.setFont(Font.font(18));
        lb9.setStyle("-fx-text-fill: white");

        TextField tf8 = new TextField();
        tf8.setLayoutX(260);
        tf8.setLayoutY(240);
        tf8.setPromptText("$");

        Label lb10 = new Label("PMT made at the end of each compound period");
        lb10.setLayoutX(20);
        lb10.setLayoutY(40);
        lb10.setFont(Font.font(18));
        lb10.setStyle("-fx-text-fill: red;-fx-font-weight: bolder;" +
                "-fx-font-size: 25px;");

        Label result2 =  new Label(" ");
        result2.setLayoutX(55);
        result2.setLayoutY(370);
        result2.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-text-fill: powderblue");

        Label resultsDisplay2 = new Label("RESULTS                        ");
        resultsDisplay2.setLayoutX(55);
        resultsDisplay2.setLayoutY(600);
        resultsDisplay2.setLayoutY(320);
        resultsDisplay2.setStyle("-fx-font-size: 25px;-fx-text-fill: black;" +
                "-fx-background-color: grey;-fx-font-weight: bolder");

        Button calculate2 = new Button("Calculate");
        calculate2.setLayoutX(650);
        calculate2.setLayoutY(440);
        calculate2.setPrefWidth(150);
        calculate2.setPrefHeight(50);
        calculate2.setCursor(Cursor.HAND);
        calculate2.getCursor();
        calculate2.setStyle("-fx-background-color:mediumseagreen;-fx-text-fill: black;" +
                "-fx-font-weight: bolder;-fx-font-size: 25px");


        Pane p2 = new Pane();
        p2.getChildren().addAll(lb6, lb7, lb8, lb9, lb10, tf5, tf6, tf7, tf8, calculate2,result2,resultsDisplay2);
        pmt.setContent(p2);


//==============================================================================
//<<<<<<<<<<<FINDING INTEREST RATE>>>>>>>>>>>>>>>
        Tab interest = new Tab();
        interest.setText("I/Y");
        interest.setClosable(false);
        interest.setStyle("-fx-font-weight: bolder");

        //creating labels and text fields
        Label lb11 = new Label("N (No of periods)");
        lb11.setLayoutX(110);
        lb11.setLayoutY(95);
        lb11.setFont(Font.font(18));
        lb11.setStyle("-fx-text-fill: white");

        TextField tf9 = new TextField();
        tf9.setLayoutX(260);
        tf9.setLayoutY(90);
        tf9.setPromptText("years");

        Label lb12 = new Label("Start Principal");
        lb12.setLayoutX(135);
        lb12.setLayoutY(145);
        lb12.setFont(Font.font(18));
        lb12.setStyle("-fx-text-fill: white");

        TextField tf10 = new TextField();
        tf10.setLayoutX(260);
        tf10.setLayoutY(140);
        tf10.setPromptText("$");

        Label lb13 = new Label("PMT (Annuity Payment)");
        lb13.setLayoutX(70);
        lb13.setLayoutY(195);
        lb13.setFont(Font.font(18));
        lb13.setStyle("-fx-text-fill: white");

        TextField tf11 = new TextField();
        tf11.setLayoutX(260);
        tf11.setLayoutY(190);
        tf11.setPromptText("$");

        Label lb14 = new Label("FV (Future Value)");
        lb14.setLayoutX(110);
        lb14.setLayoutY(245);
        lb14.setFont(Font.font(18));
        lb14.setStyle("-fx-text-fill: white");

        TextField tf12 = new TextField();
        tf12.setLayoutX(260);
        tf12.setLayoutY(240);
        tf12.setPromptText("$");

        Label lb15 = new Label("PMT made at the end of each compound period");
        lb15.setLayoutX(20);
        lb15.setLayoutY(40);
        lb15.setFont(Font.font(18));
        lb15.setStyle("-fx-text-fill: red;-fx-font-weight: bolder;" +
                "-fx-font-size: 25px;");

        Label result3 =  new Label("");
        result3.setLayoutX(55);
        result3.setLayoutY(370);
        result3.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-text-fill: powderblue");

        Label resultsDisplay3 = new Label("RESULTS                        ");
        resultsDisplay3.setLayoutX(55);
        resultsDisplay3.setLayoutY(600);
        resultsDisplay3.setLayoutY(320);
        resultsDisplay3.setStyle("-fx-font-size: 25px;-fx-text-fill: black;" +
                "-fx-background-color: grey;-fx-font-weight: bolder");

        Button calculate3 = new Button("Calculate");
        calculate3.setLayoutX(650);
        calculate3.setLayoutY(440);
        calculate3.setPrefWidth(150);
        calculate3.setPrefHeight(50);
        calculate3.setCursor(Cursor.HAND);
        calculate3.getCursor();
        calculate3.setStyle("-fx-background-color:mediumseagreen;-fx-text-fill: black;" +
                "-fx-font-weight: bolder;-fx-font-size: 25px");

        Pane p3 = new Pane();
        p3.getChildren().addAll(lb11, lb12, lb13, lb14, lb15,
                tf9, tf10, tf11, tf12, calculate3,result3,resultsDisplay3);
        interest.setContent(p3);


//=============================================================================
//<<<<<<<<<<<<<<<FINDING NUMBER OF PERIODS>>>>>>>>>>>>>>>>
        Tab time = new Tab();
        time.setText("N");
        time.setClosable(false);
        time.setStyle("-fx-font-weight: bolder");

        //creating labels and text fields
        Label lb16 = new Label("I/Y (Interest)");
        lb16.setLayoutX(146);
        lb16.setLayoutY(95);
        lb16.setFont(Font.font(18));
        lb16.setStyle("-fx-text-fill: white");

        TextField tf13 = new TextField();
        tf13.setLayoutX(260);
        tf13.setLayoutY(90);
        tf13.setPromptText("%");

        Label lb17 = new Label("Start Principal");
        lb17.setLayoutX(135);
        lb17.setLayoutY(145);
        lb17.setFont(Font.font(18));
        lb17.setStyle("-fx-text-fill: white");

        TextField tf14 = new TextField();
        tf14.setLayoutX(260);
        tf14.setLayoutY(140);
        tf14.setPromptText("$");

        Label lb18 = new Label("PMT (Annuity Payment)");
        lb18.setLayoutX(70);
        lb18.setLayoutY(195);
        lb18.setFont(Font.font(18));
        lb18.setStyle("-fx-text-fill: white");

        TextField tf15 = new TextField();
        tf15.setLayoutX(260);
        tf15.setLayoutY(190);
        tf15.setPromptText("$");

        Label lb19 = new Label("FV (Future Value)");
        lb19.setLayoutX(110);
        lb19.setLayoutY(245);
        lb19.setFont(Font.font(18));
        lb19.setStyle("-fx-text-fill: white");

        TextField tf16 = new TextField();
        tf16.setLayoutX(260);
        tf16.setLayoutY(240);
        tf16.setPromptText("$");

        Label lb20 = new Label("PMT made at the end of each compound period");
        lb20.setLayoutX(20);
        lb20.setLayoutY(40);
        lb20.setFont(Font.font(18));
        lb20.setStyle("-fx-text-fill: red;-fx-font-weight: bolder;" +
                "-fx-font-size: 25px;");

        Button calculate4 = new Button("Calculate");
        calculate4.setLayoutX(650);
        calculate4.setLayoutY(440);
        calculate4.setPrefWidth(150);
        calculate4.setPrefHeight(50);
        calculate4.setCursor(Cursor.HAND);
        calculate4.getCursor();
        calculate4.setStyle("-fx-background-color:mediumseagreen;-fx-text-fill: black;" +
                "-fx-font-weight: bolder;-fx-font-size: 25px");

        Label result4 =  new Label("");
        result4.setLayoutX(55);
        result4.setLayoutY(370);
        result4.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-text-fill: powderblue");

        Label resultsDisplay4 = new Label("RESULTS                        ");
        resultsDisplay4.setLayoutX(55);
        resultsDisplay4.setLayoutY(600);
        resultsDisplay4.setLayoutY(320);
        resultsDisplay4.setStyle("-fx-font-size: 25px;-fx-text-fill: black;" +
                "-fx-background-color: grey;-fx-font-weight: bolder");


        Pane p4 = new Pane();
        p4.getChildren().addAll(lb16, lb17, lb18, lb19, lb20,
                tf13, tf14, tf15, tf16, calculate4,result4,resultsDisplay4);
        time.setContent(p4);

//============================================================================
//<<<<<<<<<<<<<<<FINDING START PRINCIPAL>>>>>>>>>>>>>>>>
        Tab stPri = new Tab();
        stPri.setText("Start Principal");
        stPri.setClosable(false);
        stPri.setStyle("-fx-font-weight: bolder");

        //creating labels and text fields
        Label lb21 = new Label("I/Y (Interest)");
        lb21.setLayoutX(146);
        lb21.setLayoutY(95);
        lb21.setFont(Font.font(18));
        lb21.setStyle("-fx-text-fill: white");

        TextField tf17 = new TextField();
        tf17.setLayoutX(260);
        tf17.setLayoutY(90);
        tf17.setPromptText("%");

        Label lb22 = new Label("N (No of Periods)");
        lb22.setLayoutX(110);
        lb22.setLayoutY(145);
        lb22.setFont(Font.font(18));
        lb22.setStyle("-fx-text-fill: white");

        TextField tf18 = new TextField();
        tf18.setLayoutX(260);
        tf18.setLayoutY(140);
        tf18.setPromptText("years");

        Label lb23 = new Label("PMT (Annuity Payment)");
        lb23.setLayoutX(70);
        lb23.setLayoutY(195);
        lb23.setFont(Font.font(18));
        lb23.setStyle("-fx-text-fill: white");

        TextField tf19 = new TextField();
        tf19.setLayoutX(260);
        tf19.setLayoutY(190);
        tf19.setPromptText("$");

        Label lb24 = new Label("FV (Future Value)");
        lb24.setLayoutX(110);
        lb24.setLayoutY(245);
        lb24.setFont(Font.font(18));
        lb24.setStyle("-fx-text-fill: white");

        TextField tf20 = new TextField();
        tf20.setLayoutX(260);
        tf20.setLayoutY(240);
        tf20.setPromptText("$");

        Label lb25 = new Label("PMT made at the end of each compound period");
        lb25.setLayoutX(20);
        lb25.setLayoutY(40);
        lb25.setFont(Font.font(18));
        lb25.setStyle("-fx-text-fill: red;-fx-font-weight: bolder;" +
                "-fx-font-size: 25px;");

        Label result5 =  new Label("");
        result5.setLayoutX(55);
        result5.setLayoutY(370);
        result5.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-text-fill: powderblue");

        Label resultsDisplay5 = new Label("RESULTS                        ");
        resultsDisplay5.setLayoutX(55);
        resultsDisplay5.setLayoutY(600);
        resultsDisplay5.setLayoutY(320);
        resultsDisplay5.setStyle("-fx-font-size: 25px;-fx-text-fill: black;" +
                "-fx-background-color: grey;-fx-font-weight: bolder");

        Button calculate5 = new Button("Calculate");
        calculate5.setLayoutX(650);
        calculate5.setLayoutY(440);
        calculate5.setPrefWidth(150);
        calculate5.setPrefHeight(50);
        calculate5.setCursor(Cursor.HAND);
        calculate5.getCursor();
        calculate5.setStyle("-fx-background-color:mediumseagreen;-fx-text-fill: black;" +
                "-fx-font-weight: bolder;-fx-font-size: 25px");

        Pane p5 = new Pane();
        p5.getChildren().addAll(lb21, lb22, lb23, lb24, lb25,
                tf17, tf18, tf19, tf20, calculate5,result5,resultsDisplay5);
        stPri.setContent(p5);

//===========================================================================

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
                HelpSavings.aid1();
            }
        });

        //back button
        Button back = new Button("Back");
        back.setLayoutX(900);
        back.setLayoutY(280);
        back.setPrefWidth(150);
        back.setPrefHeight(50);
        back.setCursor(Cursor.HAND);
        back.setStyle("-fx-background-color: gray;-fx-text-fill: black;" +
                "-fx-font-weight: bolder;-fx-font-size: 25px");
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage2.close();
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
                tf1.clear();
                tf2.clear();
                tf3.clear();
                tf4.clear();
                tf5.clear();
                tf6.clear();
                tf7.clear();
                tf8.clear();
                tf9.clear();
                tf10.clear();
                tf11.clear();
                tf12.clear();
                tf13.clear();
                tf14.clear();
                tf15.clear();
                tf16.clear();
                tf17.clear();
                tf18.clear();
                tf19.clear();
                tf20.clear();
                result1.setText("");
                result2.setText("");
                result3.setText("");
                result4.setText("");
                result5.setText("");
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
        calMethod.setPrefHeight(380);
        calMethod.setLayoutX(600);
        calMethod.setLayoutY(80);
        calMethod.getChildren().addAll(seven, eight, nine, four, five,
                six, one, two, three, zero, point, clear, minus);

        //ACCESSING THE CALCULATOR
        //text field 1
        tf1.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf1.setText(tf1.getText() + "7"));
            eight.setOnAction(event2 -> tf1.setText(tf1.getText() + "8"));
            nine.setOnAction(event3 -> tf1.setText(tf1.getText() + "9"));
            four.setOnAction(event4 -> tf1.setText(tf1.getText() + "4"));
            five.setOnAction(event5 -> tf1.setText(tf1.getText() + "5"));
            six.setOnAction(event6 -> tf1.setText(tf1.getText() + "6"));
            one.setOnAction(event7 -> tf1.setText(tf1.getText() + "1"));
            two.setOnAction(event8 -> tf1.setText(tf1.getText() + "2"));
            three.setOnAction(event9 -> tf1.setText(tf1.getText() + "3"));
            zero.setOnAction(event10 -> tf1.setText(tf1.getText() + "0"));
            point.setOnAction(event11 -> tf1.setText(tf1.getText() + "."));
            minus.setOnAction(event12 -> tf1.setText(tf1.getText() + "-"));
            clear.setOnAction(event13 -> tf1.clear());
        });
        tf2.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf2.setText(tf2.getText() + "7"));
            eight.setOnAction(event2 -> tf2.setText(tf2.getText() + "8"));
            nine.setOnAction(event3 -> tf2.setText(tf2.getText() + "9"));
            four.setOnAction(event4 -> tf2.setText(tf2.getText() + "4"));
            five.setOnAction(event5 -> tf2.setText(tf2.getText() + "5"));
            six.setOnAction(event6 -> tf2.setText(tf2.getText() + "6"));
            one.setOnAction(event7 -> tf2.setText(tf2.getText() + "1"));
            two.setOnAction(event8 -> tf2.setText(tf2.getText() + "2"));
            three.setOnAction(event9 -> tf2.setText(tf2.getText() + "3"));
            zero.setOnAction(event10 -> tf2.setText(tf2.getText() + "0"));
            point.setOnAction(event11 -> tf2.setText(tf2.getText() + "."));
            minus.setOnAction(event12 -> tf2.setText(tf2.getText() + "-"));
            clear.setOnAction(event13 -> tf2.clear());
        });
        tf3.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf3.setText(tf3.getText() + "7"));
            eight.setOnAction(event2 -> tf3.setText(tf3.getText() + "8"));
            nine.setOnAction(event3 -> tf3.setText(tf3.getText() + "9"));
            four.setOnAction(event4 -> tf3.setText(tf3.getText() + "4"));
            five.setOnAction(event5 -> tf3.setText(tf3.getText() + "5"));
            six.setOnAction(event6 -> tf3.setText(tf3.getText() + "6"));
            one.setOnAction(event7 -> tf3.setText(tf3.getText() + "1"));
            two.setOnAction(event8 -> tf3.setText(tf3.getText() + "2"));
            three.setOnAction(event9 -> tf3.setText(tf3.getText() + "3"));
            zero.setOnAction(event10 -> tf3.setText(tf3.getText() + "0"));
            point.setOnAction(event11 -> tf3.setText(tf3.getText() + "."));
            minus.setOnAction(event12 -> tf3.setText(tf3.getText() + "-"));
            clear.setOnAction(event13 -> tf3.clear());
        });
        tf4.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf4.setText(tf4.getText() + "7"));
            eight.setOnAction(event2 -> tf4.setText(tf4.getText() + "8"));
            nine.setOnAction(event3 -> tf4.setText(tf4.getText() + "9"));
            four.setOnAction(event4 -> tf4.setText(tf4.getText() + "4"));
            five.setOnAction(event5 -> tf4.setText(tf4.getText() + "5"));
            six.setOnAction(event6 -> tf4.setText(tf4.getText() + "6"));
            one.setOnAction(event7 -> tf4.setText(tf4.getText() + "1"));
            two.setOnAction(event8 -> tf4.setText(tf4.getText() + "2"));
            three.setOnAction(event9 -> tf4.setText(tf4.getText() + "3"));
            zero.setOnAction(event10 -> tf4.setText(tf4.getText() + "0"));
            point.setOnAction(event11 -> tf4.setText(tf4.getText() + "."));
            minus.setOnAction(event12 -> tf4.setText(tf4.getText() + "-"));
            clear.setOnAction(event13 -> tf4.clear());
        });
        tf5.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf5.setText(tf5.getText() + "7"));
            eight.setOnAction(event2 -> tf5.setText(tf5.getText() + "8"));
            nine.setOnAction(event3 -> tf5.setText(tf5.getText() + "9"));
            four.setOnAction(event4 -> tf5.setText(tf5.getText() + "4"));
            five.setOnAction(event5 -> tf5.setText(tf5.getText() + "5"));
            six.setOnAction(event6 -> tf5.setText(tf5.getText() + "6"));
            one.setOnAction(event7 -> tf5.setText(tf5.getText() + "1"));
            two.setOnAction(event8 -> tf5.setText(tf5.getText() + "2"));
            three.setOnAction(event9 -> tf5.setText(tf5.getText() + "3"));
            zero.setOnAction(event10 -> tf5.setText(tf5.getText() + "0"));
            point.setOnAction(event11 -> tf5.setText(tf5.getText() + "."));
            minus.setOnAction(event12 -> tf5.setText(tf5.getText() + "-"));
            clear.setOnAction(event13 -> tf5.clear());
        });
        tf6.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf6.setText(tf6.getText() + "7"));
            eight.setOnAction(event2 -> tf6.setText(tf6.getText() + "8"));
            nine.setOnAction(event3 -> tf6.setText(tf6.getText() + "9"));
            four.setOnAction(event4 -> tf6.setText(tf6.getText() + "4"));
            five.setOnAction(event5 -> tf6.setText(tf6.getText() + "5"));
            six.setOnAction(event6 -> tf6.setText(tf6.getText() + "6"));
            one.setOnAction(event7 -> tf6.setText(tf6.getText() + "1"));
            two.setOnAction(event8 -> tf6.setText(tf6.getText() + "2"));
            three.setOnAction(event9 -> tf6.setText(tf6.getText() + "3"));
            zero.setOnAction(event10 -> tf6.setText(tf6.getText() + "0"));
            point.setOnAction(event11 -> tf6.setText(tf6.getText() + "."));
            minus.setOnAction(event12 -> tf6.setText(tf6.getText() + "-"));
            clear.setOnAction(event13 -> tf6.clear());
        });
        tf7.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf7.setText(tf7.getText() + "7"));
            eight.setOnAction(event2 -> tf7.setText(tf7.getText() + "8"));
            nine.setOnAction(event3 -> tf7.setText(tf7.getText() + "9"));
            four.setOnAction(event4 -> tf7.setText(tf7.getText() + "4"));
            five.setOnAction(event5 -> tf7.setText(tf7.getText() + "5"));
            six.setOnAction(event6 -> tf7.setText(tf7.getText() + "6"));
            one.setOnAction(event7 -> tf7.setText(tf7.getText() + "1"));
            two.setOnAction(event8 -> tf7.setText(tf7.getText() + "2"));
            three.setOnAction(event9 -> tf7.setText(tf7.getText() + "3"));
            zero.setOnAction(event10 -> tf7.setText(tf7.getText() + "0"));
            point.setOnAction(event11 -> tf7.setText(tf7.getText() + "."));
            minus.setOnAction(event12 -> tf7.setText(tf7.getText() + "-"));
            clear.setOnAction(event13 -> tf7.clear());
        });
        tf8.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf8.setText(tf8.getText() + "7"));
            eight.setOnAction(event2 -> tf8.setText(tf8.getText() + "8"));
            nine.setOnAction(event3 -> tf8.setText(tf8.getText() + "9"));
            four.setOnAction(event4 -> tf8.setText(tf8.getText() + "4"));
            five.setOnAction(event5 -> tf8.setText(tf8.getText() + "5"));
            six.setOnAction(event6 -> tf8.setText(tf8.getText() + "6"));
            one.setOnAction(event7 -> tf8.setText(tf8.getText() + "1"));
            two.setOnAction(event8 -> tf8.setText(tf8.getText() + "2"));
            three.setOnAction(event9 -> tf8.setText(tf8.getText() + "3"));
            zero.setOnAction(event10 -> tf8.setText(tf8.getText() + "0"));
            point.setOnAction(event11 -> tf8.setText(tf8.getText() + "."));
            minus.setOnAction(event12 -> tf8.setText(tf8.getText() + "-"));
            clear.setOnAction(event13 -> tf8.clear());
        });
        tf9.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf9.setText(tf9.getText() + "7"));
            eight.setOnAction(event2 -> tf9.setText(tf9.getText() + "8"));
            nine.setOnAction(event3 -> tf9.setText(tf9.getText() + "9"));
            four.setOnAction(event4 -> tf9.setText(tf9.getText() + "4"));
            five.setOnAction(event5 -> tf9.setText(tf9.getText() + "5"));
            six.setOnAction(event6 -> tf9.setText(tf9.getText() + "6"));
            one.setOnAction(event7 -> tf9.setText(tf9.getText() + "1"));
            two.setOnAction(event8 -> tf9.setText(tf9.getText() + "2"));
            three.setOnAction(event9 -> tf9.setText(tf9.getText() + "3"));
            zero.setOnAction(event10 -> tf9.setText(tf9.getText() + "0"));
            point.setOnAction(event11 -> tf9.setText(tf9.getText() + "."));
            minus.setOnAction(event12 -> tf9.setText(tf9.getText() + "-"));
            clear.setOnAction(event13 -> tf9.clear());
        });
        tf10.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf10.setText(tf10.getText() + "7"));
            eight.setOnAction(event2 -> tf10.setText(tf10.getText() + "8"));
            nine.setOnAction(event3 -> tf10.setText(tf10.getText() + "9"));
            four.setOnAction(event4 -> tf10.setText(tf10.getText() + "4"));
            five.setOnAction(event5 -> tf10.setText(tf10.getText() + "5"));
            six.setOnAction(event6 -> tf10.setText(tf10.getText() + "6"));
            one.setOnAction(event7 -> tf10.setText(tf10.getText() + "1"));
            two.setOnAction(event8 -> tf10.setText(tf10.getText() + "2"));
            three.setOnAction(event9 -> tf10.setText(tf10.getText() + "3"));
            zero.setOnAction(event10 -> tf10.setText(tf10.getText() + "0"));
            point.setOnAction(event11 -> tf10.setText(tf10.getText() + "."));
            minus.setOnAction(event12 -> tf10.setText(tf10.getText() + "-"));
            clear.setOnAction(event13 -> tf10.clear());
        });
        tf11.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf11.setText(tf11.getText() + "7"));
            eight.setOnAction(event2 -> tf11.setText(tf11.getText() + "8"));
            nine.setOnAction(event3 -> tf11.setText(tf11.getText() + "9"));
            four.setOnAction(event4 -> tf11.setText(tf11.getText() + "4"));
            five.setOnAction(event5 -> tf11.setText(tf11.getText() + "5"));
            six.setOnAction(event6 -> tf11.setText(tf11.getText() + "6"));
            one.setOnAction(event7 -> tf11.setText(tf11.getText() + "1"));
            two.setOnAction(event8 -> tf11.setText(tf11.getText() + "2"));
            three.setOnAction(event9 -> tf11.setText(tf11.getText() + "3"));
            zero.setOnAction(event10 -> tf11.setText(tf11.getText() + "0"));
            point.setOnAction(event11 -> tf11.setText(tf11.getText() + "."));
            minus.setOnAction(event12 -> tf11.setText(tf11.getText() + "-"));
            clear.setOnAction(event13 -> tf11.clear());
        });
        tf12.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf12.setText(tf12.getText() + "7"));
            eight.setOnAction(event2 -> tf12.setText(tf12.getText() + "8"));
            nine.setOnAction(event3 -> tf12.setText(tf12.getText() + "9"));
            four.setOnAction(event4 -> tf12.setText(tf12.getText() + "4"));
            five.setOnAction(event5 -> tf12.setText(tf12.getText() + "5"));
            six.setOnAction(event6 -> tf12.setText(tf12.getText() + "6"));
            one.setOnAction(event7 -> tf12.setText(tf12.getText() + "1"));
            two.setOnAction(event8 -> tf12.setText(tf12.getText() + "2"));
            three.setOnAction(event9 -> tf12.setText(tf12.getText() + "3"));
            zero.setOnAction(event10 -> tf12.setText(tf12.getText() + "0"));
            point.setOnAction(event11 -> tf12.setText(tf12.getText() + "."));
            minus.setOnAction(event12 -> tf12.setText(tf12.getText() + "-"));
            clear.setOnAction(event13 -> tf12.clear());
        });
        tf13.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf13.setText(tf13.getText() + "7"));
            eight.setOnAction(event2 -> tf13.setText(tf13.getText() + "8"));
            nine.setOnAction(event3 -> tf13.setText(tf13.getText() + "9"));
            four.setOnAction(event4 -> tf13.setText(tf13.getText() + "4"));
            five.setOnAction(event5 -> tf13.setText(tf13.getText() + "5"));
            six.setOnAction(event6 -> tf13.setText(tf13.getText() + "6"));
            one.setOnAction(event7 -> tf13.setText(tf13.getText() + "1"));
            two.setOnAction(event8 -> tf13.setText(tf13.getText() + "2"));
            three.setOnAction(event9 -> tf13.setText(tf13.getText() + "3"));
            zero.setOnAction(event10 -> tf13.setText(tf13.getText() + "0"));
            point.setOnAction(event11 -> tf13.setText(tf13.getText() + "."));
            minus.setOnAction(event12 -> tf13.setText(tf13.getText() + "-"));
            clear.setOnAction(event13 -> tf13.clear());
        });
        tf14.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf14.setText(tf14.getText() + "7"));
            eight.setOnAction(event2 -> tf14.setText(tf14.getText() + "8"));
            nine.setOnAction(event3 -> tf14.setText(tf14.getText() + "9"));
            four.setOnAction(event4 -> tf14.setText(tf14.getText() + "4"));
            five.setOnAction(event5 -> tf14.setText(tf14.getText() + "5"));
            six.setOnAction(event6 -> tf14.setText(tf14.getText() + "6"));
            one.setOnAction(event7 -> tf14.setText(tf14.getText() + "1"));
            two.setOnAction(event8 -> tf14.setText(tf14.getText() + "2"));
            three.setOnAction(event9 -> tf14.setText(tf14.getText() + "3"));
            zero.setOnAction(event10 -> tf14.setText(tf14.getText() + "0"));
            point.setOnAction(event11 -> tf14.setText(tf14.getText() + "."));
            minus.setOnAction(event12 -> tf14.setText(tf14.getText() + "-"));
            clear.setOnAction(event13 -> tf14.clear());
        });
        tf15.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf15.setText(tf15.getText() + "7"));
            eight.setOnAction(event2 -> tf15.setText(tf15.getText() + "8"));
            nine.setOnAction(event3 -> tf15.setText(tf15.getText() + "9"));
            four.setOnAction(event4 -> tf15.setText(tf15.getText() + "4"));
            five.setOnAction(event5 -> tf15.setText(tf15.getText() + "5"));
            six.setOnAction(event6 -> tf15.setText(tf15.getText() + "6"));
            one.setOnAction(event7 -> tf15.setText(tf15.getText() + "1"));
            two.setOnAction(event8 -> tf15.setText(tf15.getText() + "2"));
            three.setOnAction(event9 -> tf15.setText(tf15.getText() + "3"));
            zero.setOnAction(event10 -> tf15.setText(tf15.getText() + "0"));
            point.setOnAction(event11 -> tf15.setText(tf15.getText() + "."));
            minus.setOnAction(event12 -> tf15.setText(tf15.getText() + "-"));
            clear.setOnAction(event13 -> tf15.clear());
        });
        tf16.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf16.setText(tf16.getText() + "7"));
            eight.setOnAction(event2 -> tf16.setText(tf16.getText() + "8"));
            nine.setOnAction(event3 -> tf16.setText(tf16.getText() + "9"));
            four.setOnAction(event4 -> tf16.setText(tf16.getText() + "4"));
            five.setOnAction(event5 -> tf16.setText(tf16.getText() + "5"));
            six.setOnAction(event6 -> tf16.setText(tf16.getText() + "6"));
            one.setOnAction(event7 -> tf16.setText(tf16.getText() + "1"));
            two.setOnAction(event8 -> tf16.setText(tf16.getText() + "2"));
            three.setOnAction(event9 -> tf16.setText(tf16.getText() + "3"));
            zero.setOnAction(event10 -> tf16.setText(tf16.getText() + "0"));
            point.setOnAction(event11 -> tf16.setText(tf16.getText() + "."));
            minus.setOnAction(event12 -> tf16.setText(tf16.getText() + "-"));
            clear.setOnAction(event13 -> tf16.clear());
        });
        tf17.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf17.setText(tf17.getText() + "7"));
            eight.setOnAction(event2 -> tf17.setText(tf17.getText() + "8"));
            nine.setOnAction(event3 -> tf17.setText(tf17.getText() + "9"));
            four.setOnAction(event4 -> tf17.setText(tf17.getText() + "4"));
            five.setOnAction(event5 -> tf17.setText(tf17.getText() + "5"));
            six.setOnAction(event6 -> tf17.setText(tf17.getText() + "6"));
            one.setOnAction(event7 -> tf17.setText(tf17.getText() + "1"));
            two.setOnAction(event8 -> tf17.setText(tf17.getText() + "2"));
            three.setOnAction(event9 -> tf17.setText(tf17.getText() + "3"));
            zero.setOnAction(event10 -> tf17.setText(tf17.getText() + "0"));
            point.setOnAction(event11 -> tf17.setText(tf17.getText() + "."));
            minus.setOnAction(event12 -> tf17.setText(tf17.getText() + "-"));
            clear.setOnAction(event13 -> tf17.clear());
        });

        tf18.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf18.setText(tf18.getText() + "7"));
            eight.setOnAction(event2 -> tf18.setText(tf18.getText() + "8"));
            nine.setOnAction(event3 -> tf18.setText(tf18.getText() + "9"));
            four.setOnAction(event4 -> tf18.setText(tf18.getText() + "4"));
            five.setOnAction(event5 -> tf18.setText(tf18.getText() + "5"));
            six.setOnAction(event6 -> tf18.setText(tf18.getText() + "6"));
            one.setOnAction(event7 -> tf18.setText(tf18.getText() + "1"));
            two.setOnAction(event8 -> tf18.setText(tf18.getText() + "2"));
            three.setOnAction(event9 -> tf18.setText(tf18.getText() + "3"));
            zero.setOnAction(event10 -> tf18.setText(tf18.getText() + "0"));
            point.setOnAction(event11 -> tf18.setText(tf18.getText() + "."));
            minus.setOnAction(event12 -> tf18.setText(tf18.getText() + "-"));
            clear.setOnAction(event13 -> tf18.clear());
        });
        tf19.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf19.setText(tf19.getText() + "7"));
            eight.setOnAction(event2 -> tf19.setText(tf19.getText() + "8"));
            nine.setOnAction(event3 -> tf19.setText(tf19.getText() + "9"));
            four.setOnAction(event4 -> tf19.setText(tf19.getText() + "4"));
            five.setOnAction(event5 -> tf19.setText(tf19.getText() + "5"));
            six.setOnAction(event6 -> tf19.setText(tf19.getText() + "6"));
            one.setOnAction(event7 -> tf19.setText(tf19.getText() + "1"));
            two.setOnAction(event8 -> tf19.setText(tf19.getText() + "2"));
            three.setOnAction(event9 -> tf19.setText(tf19.getText() + "3"));
            zero.setOnAction(event10 -> tf19.setText(tf19.getText() + "0"));
            point.setOnAction(event11 -> tf19.setText(tf19.getText() + "."));
            minus.setOnAction(event12 -> tf19.setText(tf19.getText() + "-"));
            clear.setOnAction(event13 -> tf19.clear());
        });
        tf20.setOnMouseClicked(event -> {
            seven.setOnAction(event1 -> tf20.setText(tf20.getText() + "7"));
            eight.setOnAction(event2 -> tf20.setText(tf20.getText() + "8"));
            nine.setOnAction(event3 -> tf20.setText(tf20.getText() + "9"));
            four.setOnAction(event4 -> tf20.setText(tf20.getText() + "4"));
            five.setOnAction(event5 -> tf20.setText(tf20.getText() + "5"));
            six.setOnAction(event6 -> tf20.setText(tf20.getText() + "6"));
            one.setOnAction(event7 -> tf20.setText(tf20.getText() + "1"));
            two.setOnAction(event8 -> tf20.setText(tf20.getText() + "2"));
            three.setOnAction(event9 -> tf20.setText(tf20.getText() + "3"));
            zero.setOnAction(event10 -> tf20.setText(tf20.getText() + "0"));
            point.setOnAction(event11 -> tf20.setText(tf20.getText() + "."));
            minus.setOnAction(event12 -> tf20.setText(tf20.getText() + "-"));
            clear.setOnAction(event13 -> tf20.clear());
        });

        Label error = new Label("");
        error.setLayoutX(55);
        error.setLayoutY(600);
        error.setStyle("-fx-font-size: 20px;-fx-text-fill: red;-fx-font-weight: bolder");


        //<<<<<<<<<<<====CALCULATIONS===>>>>>>>>>>>>>>>

        DecimalFormat df = new DecimalFormat("0.00");

        calculate1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    double n = 12; // number of times
                    double t = Double.parseDouble(tf1.getText());
                    double P = Double.parseDouble(tf2.getText());
                    double r = Double.parseDouble(tf3.getText()) / 100;
                    double PMT = Double.parseDouble(tf4.getText());
                    double A = (PMT * ((Math.pow((1 + (r / n)), (n * t)) - 1) / (r / n)))
                            + (P * (Math.pow((1 + (r / n)), (n * t))));
                    result1.setText("Future Value : $" + df.format(A));
                }catch(Exception display){
                    error.setText("Please enter the valid inputs");
                }


            }
        });



        calculate2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                double n = 12; // number of times
                double t = Double.parseDouble(tf5.getText());
                double P = Double.parseDouble(tf6.getText());
                double r = Double.parseDouble(tf7.getText())/100;
                double A = Double.parseDouble(tf8.getText());
                double PMT = (A-(P*Math.pow((1+(r/n)),(n*t))))/((Math.pow((1+(r/n)),(n*t))-1)/(r/n));
                result2.setText("PMT (Annuity Payment) : $" + df.format(PMT));
                }catch(Exception display){
                    error.setText("Please enter the valid inputs");
                }


            }
        });

        calculate3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    double n = 12; // number of times
                    double t = Double.parseDouble(tf9.getText());
                    double P = Double.parseDouble(tf10.getText());
                    double PMT = Double.parseDouble(tf11.getText());
                    double A = Double.parseDouble(tf12.getText());
                    double r = n * (Math.pow((A / P), (1 / (n * t))) - 1) * 100;
                    result3.setText("I/Y (Interest) : " + df.format(r) + " %");
                }catch(Exception display){
                    error.setText("Please enter the valid inputs");
                }


            }
        });

        calculate4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    double n = 12; // number of times
                    double r = Double.parseDouble(tf13.getText()) / 100;
                    double P = Double.parseDouble(tf14.getText());
                    double PMT = Double.parseDouble(tf15.getText());
                    double A = Double.parseDouble(tf16.getText());
                    double t = Math.log((A + (PMT * n / r)) / (P + (PMT * n / r))) / (Math.log(1 + (r / n)) * n);
                    result4.setText("N (No of Periods) : " + df.format(t));
                }catch(Exception display){
                    error.setText("Please enter the valid inputs");
                }


            }
        });

        calculate5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    double n = 12; // number of times
                    double r = Double.parseDouble(tf17.getText()) / 100;
                    double t = Double.parseDouble(tf18.getText());
                    double PMT = Double.parseDouble(tf19.getText());
                    double A = Double.parseDouble(tf20.getText());
                    double P = A / (Math.pow((1 + (r / n)), (n * t)));
                    result5.setText("Start Principal : $" + df.format(P));
                }catch(Exception display){
                    error.setText("Please enter the valid inputs");
                }


            }
        });



        //set Background image
        Image img3 = new Image("file:background.jpg");
        ImageView imgView3 = new ImageView(img3);
        imgView3.setFitWidth(1100);
        imgView3.setFitHeight(600);

        cTabPane.getTabs().addAll(fv, pmt, interest, time, stPri);

        Pane root2 = new Pane();
        root2.getChildren().addAll(imgView3, cTabPane, back, calMethod,clearAll,help);


        //Savings
        Scene scene2 = new Scene(root2, 1100, 600);
        stage2.setTitle("Savings");
        stage2.setScene(scene2);
        stage2.show();

        return root2;
    }
}
