/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reisch_7_methodmadness;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
//import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author sreisch3829
 */
public class Reisch_7_MethodMadness extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc =canvas.getGraphicsContext2D();
        drawBackground(gc,0,0,300,250);
        drawBlueCircle(gc);
        drawManyOvals(gc);
        drawOtherOvals(gc);
        drawBiggestCircle(gc);
        drawMyCat(gc);
        drawEyes(gc);
        drawLittleButtons(gc);
        //drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
            }
    private void drawBackground(GraphicsContext bg, int x, int y, int w, int h) {
        bg.setFill(Color.LIGHTSTEELBLUE);
        bg.fillRect(x, y, w, h);
    }
    
    private void drawBlueCircle(GraphicsContext blue) {
        blue.setFill(Color.PALETURQUOISE);
        blue.setStroke(Color.TURQUOISE);
        blue.setLineWidth(3);
        blue.fillOval(115,10,60,60);
        blue.strokeOval(115,10,60,60); 
    }
    
    
    private void drawMyCat(GraphicsContext cat) {
        cat.setFill(Color.CYAN);
        cat.setStroke(Color.DARKCYAN);
        cat.setLineWidth(5);
        cat.fillOval(108,70,80,80);
        cat.strokeOval(108,70,80,80);
    }
    
    private void drawBiggestCircle(GraphicsContext big) {
        big.setFill(Color.BLUE);
        big.fillOval(100,150,100,100);
        big.setStroke(Color.DARKBLUE);
        big.setLineWidth(5);
        big.strokeOval(100,150,100,100);
    }
    
    private void drawManyOvals(GraphicsContext many) {
        for (int i = 0; i < 300; i++) {
            if (i % 2 == 0){
                many.fillOval(15, 40, 20, 20);
                many.setFill(Color.NAVY);
            } else if (i % 3 == 0){
                many.fillOval(35, 80, 20, 20);
                many.setFill(Color.CORNFLOWERBLUE);
            } else {
                many.setFill(Color.STEELBLUE);
                many.fillOval(80, 65, 20, 20);
                
            }
        }
        
    }
    
    private void drawOtherOvals(GraphicsContext other) { 
        for (int i = 0; i < 300; i++) {
            if (i % 2 == 0){
                other.fillOval(270, 40, 20, 20);
                other.setFill(Color.NAVY);
            } else if (i % 3 == 0){
                other.fillOval(245, 80, 20, 20);
                other.setFill(Color.CORNFLOWERBLUE);
            } else {
                other.setFill(Color.STEELBLUE);
                other.fillOval(205, 65, 20, 20);
                
            }
        }
        
    }
    private void drawLittleButtons(GraphicsContext buttons) {
                buttons.setFill(Color.BLACK);
                buttons.fillRect(145, 110, 5, 5);
                buttons.fillRect(145, 90, 5, 5);
                buttons.fillRect(145, 100, 5, 5);
    }
    
    private void drawEyes(GraphicsContext eyes) {
        eyes.setFill(Color.BLACK);
        eyes.fillOval(135,25,5,30);
        eyes.fillOval(150,25,5,30);
    }
    
    static boolean drawManythings (int somenumber) {
        return (somenumber % 2 == 0);
    }
    }


