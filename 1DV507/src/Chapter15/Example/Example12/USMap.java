package Chapter15.Example.Example12;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Scanner;

public class USMap extends Application {
    @Override
    public void start(Stage stage) {
        MapPane map = new MapPane();

        Scene scene = new Scene(map, 1200, 800);
        stage.setTitle("USMap");
        stage.setScene(scene);
        stage.show();

        map.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                map.enlarge();
            }
            else if (e.getCode() == KeyCode.DOWN) {
                map.shrink();
            }
        });
        map.requestFocus();
    }

    class MapPane extends BorderPane {
        private Group group = new Group();

        MapPane() {
            // Load coordinates from a file
            ArrayList<ArrayList<Point2D>> points = getPoints();

            // Add points to the polygon list
//            for (ArrayList<Point2D> point : points) {
//                Polygon polygon = new Polygon();
//                // Add points to the polygon list
//                for (int j = 0; j < point.size(); j++) {
//                    polygon.getPoints().addAll(point.get(j).getX(), -point.get(j).getY());
//                }
            for (int i = 0; i < points.size(); i++) {
                Polygon polygon = new Polygon();
                // Add points to the polygon list
                for (int j = 0; j < points.get(i).size(); j++) {
                    polygon.getPoints().addAll(points.get(i).get(j).getX(), -points.get(i).get(j).getY());
                }
                polygon.setFill(Color.WHITE);
                polygon.setStroke(Color.BLACK);
                polygon.setStrokeWidth(1 / 14.0);

                polygon.setOnMouseClicked(e -> {
                    if (e.getButton() == MouseButton.PRIMARY) {
                        polygon.setFill(Color.RED);
                    } else if (e.getButton() == MouseButton.SECONDARY) {
                        polygon.setFill(Color.BLUE);
                    } else {
                        polygon.setFill(Color.WHITE);
                    }
                });

                group.getChildren().add(polygon);
            }

            group.setScaleX(14);
            group.setScaleY(14);
            this.setCenter(group);
        }
        public void enlarge() {
            group.setScaleX(1.1 * group.getScaleX());
            group.setScaleY(1.1 * group.getScaleY());
        }

        public void shrink() {
            group.setScaleX(0.9 * group.getScaleX());
            group.setScaleY(0.9 * group.getScaleY());
        }

        private ArrayList<ArrayList<Point2D>> getPoints() {
            ArrayList<ArrayList<Point2D>> points = new ArrayList<>();

            try (Scanner input = new Scanner(new java.net.URL("http://liveexample.pearsoncmg.com/data/usmap/txt").openStream())) {
                while (input.hasNext()) {
                    String s = input.nextLine();
                    if (Character.isAlphabetic(s.charAt(0))) {
                        points.add(new ArrayList<>()); // For a new state
                    }
                    else {
                        Scanner scanAString = new Scanner(s); // Scan one point
                        double y = scanAString.nextDouble();
                        double x = scanAString.nextDouble();
                        points.get(points.size() - 1).add(new Point2D(x, y));
                    }
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }

            return points;
        }
    }
}
