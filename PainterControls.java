
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import javafx.scene.layout.Pane;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PainterControls{
    @FXML // fx:id="colorToggleGroup"
    protected ToggleGroup colorToggleGroup; // Value injected by FXMLLoader

    @FXML // fx:id="sizeToggleGroup"
    protected ToggleGroup sizeToggleGroup; // Value injected by FXMLLoader
 
    @FXML // fx:id="shapeToggleGroup"
    protected ToggleGroup shapeToggleGroup;

    @FXML // fx:id="blackRadioButton"
    protected RadioButton blackRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="redRadioButton"
    protected RadioButton redRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="greenRadioButton"
    protected RadioButton greenRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="blueRadioButton"
    protected RadioButton blueRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="smallRadioButton"
    protected RadioButton smallRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="mediumRadioButton"
    protected RadioButton mediumRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="largeRadioButton"
    protected RadioButton largeRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="circleRadioButton"
    protected RadioButton circleRadioButton;

    @FXML // fx:id="rectangleRadioButton"
    protected RadioButton rectangleRadioButton;

    @FXML // fx:id="drawingAreaPane"
    protected Pane drawingAreaPane; // Value injected by FXMLLoader

    @FXML // fx:id="undoButton"
    protected Button undoButton; // Value injected by FXMLLoader

    @FXML // fx:id="clearButton"
    protected Button clearButton; // Value injected by FXMLLoader


}
