package com.example.javafx_ui_controls_and_multimedia.ch22Algorithms;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class EightQueens extends Application {
    public static final int SIZE = 8;

    /*The size of the chessboard
    queens are placed at (i, queens[i])
    -1 indicates that no queen is currently placed in the i-th row
    Initially, place a queen at (0, 0) in the 0-th row
    * */
    private int[] queens = {-1, -1, -1, -1, -1, -1, -1, -1};

//    public static void main(String[] args) {
//        launch(args);
//    }

    @Override
    public void start(Stage primaryStage) {
        search();

        GridPane chessBoard = new GridPane();
        chessBoard.setAlignment(Pos.CENTER);
        Label[][] labels = new Label[SIZE][SIZE];
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                chessBoard.add(labels[i][j] = new Label(), j, i);
                labels[i][j].setStyle("-fx-border-color: black");
                labels[i][j].setPrefSize(55, 55);
            }
        }

        //Display queens
        Image image = new Image("C:\\Users\\Tesla\\Desktop\\Spring Boot Up and Running\\ch7UpAndRunning\\JavaFX_UI_Controls_and_Multimedia\\src\\main\\java\\com\\example\\javafx_ui_controls_and_multimedia\\image\\queen.jpg");
        for(int i = 0; i < SIZE; i++){
            labels[i][queens[i]].setGraphic(new ImageView(image));
        }

        //create a scene and place it in the stage
        Scene scene = new Scene(chessBoard, 55 * SIZE, 55 * SIZE);
        primaryStage.setTitle("EightQueens");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean search() {
        //k - 1 indicates the number of queens placed so far
        //we are looking for a position in the kth row to place a queen
        int k = 0;
        while(k >= 0 && k < SIZE){
            int j = findPosition(k);
            if(j < 0) {
                queens[k] = -1;
                k--; // backtrack to previous row
            } else {
                queens[k] = j;
                k++;
            }
        }

        if(k == -1){
            return false;
        } else
            return true;
    }

    public int findPosition(int k){
        int start = queens[k] + 1;

        for(int j = start; j < SIZE; j++){
            if(isValid(k, j)) //ONE MISPLACED SEMICOLON COST ME LIKE 30+ MINUTES OF THE PROGRAM NOT WORKING!!! !!!!!!!!!!!!!
            return j; //(k, j) is the place to put the queen now
        }
        return -1;
    }

    //return true if a queen can be placed at (row, column)
    public boolean isValid(int row, int column){
        for(int i = 1; i <= row; i++){
            if(queens[row - i] == column //check column
                    || queens[row - i] == column - i //check upleft diagonal
                    || queens[row - i] == column + i) //check upright diagonal
                return false;//there is a conflict
        }
        return true;
    }
}
