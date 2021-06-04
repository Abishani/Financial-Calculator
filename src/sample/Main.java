package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/*Name : Abishani Muthalagan
 *StuId : 2019743
 * UOWID : w1789987
*/

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        //set Background image
        Image img1 = new Image("file:home1.jpg");
        ImageView imgView1 = new ImageView(img1);
        imgView1.setFitWidth(800);
        imgView1.setFitHeight(550);

        //creating buttons with labels

        Button rb1 = new Button("Compound Interest Savings");
        rb1.setStyle("-fx-background-color: black");
        rb1.setStyle("-fx-text-fill: black");
        rb1.setFont(Font.font(25));
        rb1.setLayoutX(350);
        rb1.setLayoutY(150);
        rb1.setPrefWidth(350);
        rb1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Compound.root1();
            }
        });

        Button rb2 = new Button("Savings");
        rb2.setStyle("-fx-text-fill: black");
        rb2.setFont(Font.font(25));
        rb2.setLayoutX(350);
        rb2.setLayoutY(220);
        rb2.setPrefWidth(350);
        rb2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Savings.root2();
            }
        });

        Button rb3 = new Button("Loan");
        rb3.setStyle("-fx-text-fill: black");
        rb3.setFont(Font.font(25));
        rb3.setLayoutX(350);
        rb3.setLayoutY(290);
        rb3.setPrefWidth(350);
        rb3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Loan.root3();
            }
        });

        Button rb4 = new Button("Mortgage");
        rb4.setStyle("-fx-text-fill: black");
        rb4.setFont(Font.font(25));
        rb4.setLayoutX(350);
        rb4.setLayoutY(360);
        rb4.setPrefWidth(350);
        rb4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Mortgage.root4();
            }
        });



        //Display home page contents
        Pane root = new Pane();
        root.getChildren().addAll(imgView1,rb1,rb2,rb3,rb4);


        //create scene - home page
        Scene scene = new Scene(root,800,550);
        stage.setTitle("Home");  //Title for the page
        stage.setScene(scene);   //set scene
        stage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
