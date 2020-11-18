/**
 * Sample Skeleton for 'painter.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class PainterController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="blackRadioButton"
    private RadioButton blackRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="colorToggleGroup"
    private ToggleGroup colorToggleGroup; // Value injected by FXMLLoader

    @FXML // fx:id="redRadioButton"
    private RadioButton redRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="greenRadioButton"
    private RadioButton greenRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="blueRadioButton"
    private RadioButton blueRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="smallRadioButton"
    private RadioButton smallRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="sizeToggleGroup"
    private ToggleGroup sizeToggleGroup; // Value injected by FXMLLoader

    @FXML // fx:id="mediumRadioButton"
    private RadioButton mediumRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="largeRadioButton"
    private RadioButton largeRadioButton; // Value injected by FXMLLoader

    @FXML // fx:id="undoButton"
    private Button undoButton; // Value injected by FXMLLoader

    @FXML // fx:id="clearButton"
    private Button clearButton; // Value injected by FXMLLoader

    @FXML // fx:id="drawingAreaPane"
    private Pane drawingAreaPane; // Value injected by FXMLLoader

    @FXML
    void clearButtonPressed(ActionEvent event) {

    }

    @FXML
    void colorRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {

    }

    @FXML
    void sizeRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void undoButtonPressed(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert blackRadioButton != null : "fx:id=\"blackRadioButton\" was not injected: check your FXML file 'painter.fxml'.";
        assert colorToggleGroup != null : "fx:id=\"colorToggleGroup\" was not injected: check your FXML file 'painter.fxml'.";
        assert redRadioButton != null : "fx:id=\"redRadioButton\" was not injected: check your FXML file 'painter.fxml'.";
        assert greenRadioButton != null : "fx:id=\"greenRadioButton\" was not injected: check your FXML file 'painter.fxml'.";
        assert blueRadioButton != null : "fx:id=\"blueRadioButton\" was not injected: check your FXML file 'painter.fxml'.";
        assert smallRadioButton != null : "fx:id=\"smallRadioButton\" was not injected: check your FXML file 'painter.fxml'.";
        assert sizeToggleGroup != null : "fx:id=\"sizeToggleGroup\" was not injected: check your FXML file 'painter.fxml'.";
        assert mediumRadioButton != null : "fx:id=\"mediumRadioButton\" was not injected: check your FXML file 'painter.fxml'.";
        assert largeRadioButton != null : "fx:id=\"largeRadioButton\" was not injected: check your FXML file 'painter.fxml'.";
        assert undoButton != null : "fx:id=\"undoButton\" was not injected: check your FXML file 'painter.fxml'.";
        assert clearButton != null : "fx:id=\"clearButton\" was not injected: check your FXML file 'painter.fxml'.";
        assert drawingAreaPane != null : "fx:id=\"drawingAreaPane\" was not injected: check your FXML file 'painter.fxml'.";

    }
}

