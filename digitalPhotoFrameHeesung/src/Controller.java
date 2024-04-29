import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private ImageView photoView;

    @FXML
    void button(ActionEvent event) {
        changePhoto();
    }

    private int photoIndex = 0;

    private String[] photoPaths = {
        "Photo 1.png",
        "Photo 2.png",
        "Photo 3.png",
        "Photo 4.png",
        "Photo 5.png"
    };    

    private void changePhoto() {
        if (photoIndex >= photoPaths.length) {
            photoIndex = 0; 
        }
        Image image = new Image(photoPaths[photoIndex++], true); 
        photoView.setImage(image);
    }
}
    