package com.example.javafx_ui_controls_and_multimedia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Cell;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToe extends Application {
    private char whoseTurn = 'X';

    private Cell[][] cell = new Cell[3][3];

    private Label lblStatus = new Label("X's turn to play");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                pane.add(cell[i][j] = new Cell(), j, i);
            }
        }

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(lblStatus);

        Scene scene = new Scene(borderPane, 450, 170);
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    public boolean isFull() {
//        for(int i = 0; i < 3; i++){
//            for (int j = 0; j < 3; j++){
//                if(cell[i][j].getToken() == ' ') {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    public boolean isWon(char token) {
//        for(int i = 0; i < 3; i++){
//            if(cell[i][1].getToken() == token && cell[i][1].getToken() == token && cell[i][2].getToken() == token){
//                return true;
//            }
//        }
//
//        for(int j = 0; j < 3; j++){
//            if(cell[0][j].getToken() == token && cell[1][j].getToken() == token && cell[2][j].getToken() == token){
//                return true;
//            }
//        }
//
//
//    }

}
