import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class GradeBarChart extends Application {

    @Override
    public void start(Stage stage) {

        // Maximum bar height reference
        double scaleFactor = 3.0; // to make bars visible

        // Create bars
        VBox projectsBox = createBar("Projects - 20%", 20 * scaleFactor, Color.RED);
        VBox quizzesBox = createBar("Quizzes - 10%", 10 * scaleFactor, Color.BLUE);
        VBox midtermBox = createBar("Midterm - 30%", 30 * scaleFactor, Color.GREEN);
        VBox finalBox = createBar("Final - 40%", 40 * scaleFactor, Color.ORANGE);

        // Arrange bars horizontally
        HBox root = new HBox(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(projectsBox, quizzesBox, midtermBox, finalBox);

        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    // Helper method to create each bar with label
    private VBox createBar(String label, double height, Color color) {

        Rectangle bar = new Rectangle(50, height);
        bar.setFill(color);

        Text text = new Text(label);

        VBox box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.getChildren().addAll(bar, text);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
