import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage stage) {

        // Create UI components
        TextField rollNoField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

        // Layout using GridPane
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setVgap(10);
        grid.setHgap(10);

        // Add components to grid
        grid.add(new Label("Roll No:"), 0, 0);
        grid.add(rollNoField, 1, 0);

        grid.add(new Label("Name:"), 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(new Label("Age:"), 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(new Label("Email:"), 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submitBtn, 1, 4);

        // Button action
        submitBtn.setOnAction(e -> {

            String rollNo = rollNoField.getText();
            String name = nameField.getText();
            String age = ageField.getText();
            String email = emailField.getText();

            // Validation
            try {
                // Check Roll No
                int r = Integer.parseInt(rollNo);

                // Check Age
                int a = Integer.parseInt(age);

                // Email validation
                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid email format!");
                }

                // Success alert
                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Registration Successful");
                success.setHeaderText("Student Registered Successfully");
                success.setContentText(
                        "Roll No: " + r +
                        "\nName: " + name +
                        "\nAge: " + a +
                        "\nEmail: " + email
                );
                success.showAndWait();

            } catch (NumberFormatException ex) {

                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Validation Error");
                error.setHeaderText("Invalid Numeric Input");
                error.setContentText("Roll No and Age must be integers.");
                error.showAndWait();

            } catch (Exception ex) {

                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Validation Error");
                error.setHeaderText("Invalid Input");
                error.setContentText(ex.getMessage());
                error.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 400, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
                  }
