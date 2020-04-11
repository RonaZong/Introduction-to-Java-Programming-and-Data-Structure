package Chapter15.Example.Example9;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application {
    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();

        // Add an image view and add it to pane
        ImageView imageView = new ImageView("image/us.gif");
        pane.getChildren().add(imageView);

        // Create a path transition
        PathTransition pt = new PathTransition(Duration.millis(10000), new Line(100, 200, 100, 0), imageView);
        pt.setCycleCount(5);
        pt.play();

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 200);
        stage.setTitle("FlagRisingAnimation");
        stage.setScene(scene);
        stage.show();
    }
}
