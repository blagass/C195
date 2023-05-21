package brandonlagasse.c195.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MainScreenController implements Initializable {

public Button toCustomersButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void toCustomers(ActionEvent actionEvent) throws Exception {

    }

    public void toAppointments(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("appointment-view.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 800, 600);
        String css = this.getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setTitle("Add Appointment");
        stage.setScene(scene);
        stage.show();
    }

    public void toReports(ActionEvent actionEvent) {
    }
}
