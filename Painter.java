
import java.util.Properties;
import java.io.IOException;
import java.io.FileReader;
import java.net.URL;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Painter extends Application{
    @Override
    public void start(final Stage stage) throws MalformedURLException, IOException{
        final Properties fxmlProperties = new Properties(); 
	fxmlProperties.load(new FileReader("painter.properties"));

	final String fxmlLocation = new StringBuilder(100)
	.append("file://")
	.append(fxmlProperties.getProperty("home"))
	.append(fxmlProperties.getProperty("project folder"))
	.append(fxmlProperties.getProperty("fxml folder"))
	.append(fxmlProperties.getProperty("painter fxml"))
	.toString();

	System.out.println("fxmlLocation " + fxmlLocation);

	stage.setScene(new Scene(FXMLLoader.load(new URL(fxmlLocation))));
	stage.setTitle("Painter");
	stage.show();
    }

    public static void main(final String ... args) throws MalformedURLException, IOException{
        launch(args);
    }
}
