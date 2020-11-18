
import java.util.ResourceBundle;

import javafx.collections.ObservableList;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import javafx.scene.input.MouseEvent;

import javafx.scene.layout.Pane;

import javafx.scene.Node;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineCap;

public class PainterController extends PainterControls{

    private static PenRadius penRadius    = PenRadius.MEDIUM;
    private static Paint     brushColor   = Color.BLACK;
    private static PenShape  currentShape = PenShape.CIRCLE;

    @FXML
    void shapeRadioButtonSelected(ActionEvent event){
        currentShape = (PenShape) shapeToggleGroup.getSelectedToggle().getUserData();
	System.out.println(currentShape);
    }

    @FXML
    void sizeRadioButtonSelected(ActionEvent event) {
        penRadius  = (PenRadius) sizeToggleGroup.getSelectedToggle().getUserData();
    }
    
    @FXML
    void colorRadioButtonSelected(ActionEvent event) {
        brushColor = (Color) colorToggleGroup.getSelectedToggle().getUserData();
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void undoButtonPressed(ActionEvent event) {
        final ObservableList<Node> itemsInDrawingAreaPane = drawingAreaPane.getChildren();
	final int noOfItems = itemsInDrawingAreaPane.size(); 

	if(noOfItems > 0) { itemsInDrawingAreaPane.remove(noOfItems - 1); }
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        drawingAreaPane.getChildren().add(getShape(event, currentShape));
    }
    
    private static Shape getShape(final MouseEvent event, final PenShape shape){

	final double xAxisPosition = event.getX();
	final double yAxisPosition = event.getY();
        final int lineSize      = penRadius.getRadius();

        return switch(shape) {
	           case RECTANGLE -> getRectangle(
					       lineSize,
					       lineSize,
		                               xAxisPosition,
					       yAxisPosition,
					       brushColor
					       ); 
		   case CIRCLE -> getCircle(xAxisPosition, yAxisPosition, lineSize, brushColor);
	       };

    }

    private static Shape getRectangle(final int height, 
                                      final int width, 
                                      final double xAxisPosition, 
				      final double yAxisPosition,
				      final Paint paint){
        final Rectangle rectangle = new Rectangle(height, width, paint);
	rectangle .setStrokeLineCap(StrokeLineCap.ROUND);
        rectangle .setX(xAxisPosition);
	rectangle .setY(yAxisPosition);

	return rectangle;
    }

    private static Shape getCircle(
                                   final double xAxisPosition,
				   final double yAxisPosition,
				   final int    radius,
				   final Paint  paint
				   ){
        return new Circle(xAxisPosition, yAxisPosition, radius, paint);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

        blackRadioButton      .setUserData(Color.BLACK);
	redRadioButton        .setUserData(Color.RED);
	greenRadioButton      .setUserData(Color.GREEN);
	blueRadioButton       .setUserData(Color.BLUE);

	smallRadioButton      .setUserData(PenRadius.SMALL);
	mediumRadioButton     .setUserData(PenRadius.MEDIUM);
	largeRadioButton      .setUserData(PenRadius.LARGE);
        
	circleRadioButton     .setUserData(PenShape.CIRCLE);
	rectangleRadioButton  .setUserData(PenShape.RECTANGLE);
    }
    
    private enum PenRadius{
        SMALL(2), MEDIUM(4), LARGE(6);

	private final int radius;

	private PenRadius(final int radius){ 
	    this.radius = radius; 
	}

	public int getRadius() { 
	    return this.radius; 
	}
    }

    private enum PenShape{
        RECTANGLE, CIRCLE;
    }
}


