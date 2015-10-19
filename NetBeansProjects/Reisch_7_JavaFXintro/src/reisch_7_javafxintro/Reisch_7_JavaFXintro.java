/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reisch_7_javafxintro;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author sreisch3829
 */
public class Reisch_7_JavaFXintro extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc =canvas.getGraphicsContext2D();
        drawAmanda(gc,25,66,13,14);
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
            }
    private void drawAmanda(GraphicsContext amanda, int x, int y, int w, int h) {
        amanda.setFill(Color.CHOCOLATE);
        amanda.fillRect(x, y, w, h);
    }
    
        private void drawShapes(GraphicsContext gc) {
            // IDE- Integrated Development Enviroment
            
            gc.setFill(Color.AQUAMARINE);
            gc.setStroke(Color.DARKSLATEGRAY);
            gc.setLineWidth(5);
            gc.strokeLine(40, 10, 10, 40);
            gc.fillOval(10, 60, 30, 30);
            gc.strokeOval(60, 60, 30, 30);
            gc.fillRoundRect(110, 60, 30, 30, 10, 10);
            gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
            gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
            gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
            gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
            gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
            gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
            gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
            gc.fillPolygon(new double[]{10, 40, 10, 40},
                            new double[]{210, 210, 240, 240}, 4);
            gc.strokePolygon(new double[]{60, 90, 60, 90}, 
                    new double[]{210, 210, 240, 240}, 4);
            gc.strokePolyline(new double[]{110, 140, 110, 140}, 
                    new double[]{210, 210, 240, 240}, 4);
        }
        
        
    
}
