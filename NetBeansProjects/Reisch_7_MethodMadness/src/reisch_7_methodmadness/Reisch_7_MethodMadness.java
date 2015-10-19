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
        drawRect(gc,134,43,20,20);
        drawManyOvals(gc);
        drawOtherOvals(gc);
        drawMyCat(gc);
        //drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
            }
    private void drawBackground(GraphicsContext bg, int x, int y, int w, int h) {
        bg.setFill(Color.FIREBRICK);
        bg.fillRect(x, y, w, h);
    }
    
    private void drawBlueCircle(GraphicsContext blue) {
        blue.setFill(Color.DARKRED);
        blue.setStroke(Color.MOCCASIN);
        blue.setLineWidth(3);
        blue.fillOval(115,10,60,60);
        blue.strokeOval(115,10,60,60); 
    }
    
    private void drawRect(GraphicsContext amanda, int x, int y, int w, int h) {
        amanda.setFill(Color.ORANGE);
        amanda.fillRect(x, y, w, h);
    }
    
    private void drawMyCat(GraphicsContext cat) {
        cat.setFill(Color.WHITE);
        cat.setStroke(Color.DARKGOLDENROD);
        cat.setLineWidth(5);
        cat.fillOval(108,70,80,80);
        cat.strokeOval(108,70,80,80);
    }
    
    private void drawManyOvals(GraphicsContext many) {
        for (int i = 0; i < 300; i++) {
            if (i % 2 == 0){
                many.fillOval(15, 40, 20, 20);
                many.setFill(Color.DARKSALMON);
            } else if (i % 3 == 0){
                many.fillOval(35, 80, 20, 20);
                many.setFill(Color.GOLD);
            } else {
                many.setFill(Color.CORNSILK);
                many.fillOval(80, 65, 20, 20);
                
            }
        }
        
    }
    
    private void drawOtherOvals(GraphicsContext other) { 
        for (int i = 0; i < 300; i++) {
            if (i % 2 == 0){
                other.fillOval(270, 40, 20, 20);
                other.setFill(Color.DARKSALMON);
            } else if (i % 3 == 0){
                other.fillOval(245, 80, 20, 20);
                other.setFill(Color.GOLD);
            } else {
                other.setFill(Color.CORNSILK);
                other.fillOval(205, 65, 20, 20);
                
            }
        }
        
    }
    static boolean drawManythings (int somenumber) {
        return (somenumber % 2 == 0);
    }
    }


