import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {

 private Stage stage;
 private Scene scene;
 private Parent root;
 
 public void switchToAuburnScene(ActionEvent event) throws IOException {
  root = FXMLLoader.load(getClass().getResource("AuburnScene.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 
 public void switchToUntitled(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("Untitled.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 public void switchToAthlete2(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Athlete2.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
   public void switchToAthlete3(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Athlete3.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
   public void switchToAthlete4(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Athlete4.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
   public void switchToAthlete5(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Athlete5.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
   public void switchToAthlete6(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Athlete6.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
   public void switchToAthlete7(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Athlete7.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
   public void switchToAthlete8(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Athlete8.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
   public void switchToAthlete9(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Athlete9.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
   public void switchToAthlete10(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Athlete10.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
   public void switchToAthlete11(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Athlete11.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
   public void switchToAthlete12(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Athlete12.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
}
