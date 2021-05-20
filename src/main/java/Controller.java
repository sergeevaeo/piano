
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    Model model = new Model();

    @FXML
    private Slider vol;

    @FXML
    void volume() {
        model.setSliderValue((int) vol.getValue());
    }

    @FXML
    void note(KeyEvent event) {
        for (Model.Note note : Model.notes) {
            if (note.key.equals(event.getCode())) {
                model.getChannel().noteOn(note.number, model.getSliderValue());
            }
        }
    }

    @FXML
    void noteOnC() {
        model.getChannel().noteOn(60, model.getSliderValue());
    }

    @FXML
    void noteOnDb() {
        model.getChannel().noteOn(61, model.getSliderValue());
    }

    @FXML
    void noteOnD() {
        model.getChannel().noteOn(62, model.getSliderValue());
    }

    @FXML
    void noteOnEb() {
        model.getChannel().noteOn(63, model.getSliderValue());
    }

    @FXML
    void noteOnE() {
        model.getChannel().noteOn(64, model.getSliderValue());
    }

    @FXML
    void noteOnF() {
        model.getChannel().noteOn(65, model.getSliderValue());
    }

    @FXML
    void noteOnGb() {
        model.getChannel().noteOn(66, model.getSliderValue());
    }

    @FXML
    void noteOnG() {
        model.getChannel().noteOn(67, model.getSliderValue());
    }

    @FXML
    void noteOnAb() {
        model.getChannel().noteOn(68, model.getSliderValue());
    }

    @FXML
    void noteOnA() {
        model.getChannel().noteOn(69, model.getSliderValue());
    }

    @FXML
    void noteOnBb() {
        model.getChannel().noteOn(70, model.getSliderValue());
    }

    @FXML
    void noteOnB() {
        model.getChannel().noteOn(71, model.getSliderValue());
    }

    @FXML
    void noteOnC1() {
        model.getChannel().noteOn(72, model.getSliderValue());
    }


    @FXML
    public void jB() {
        for (int j : Model.jb) {
            model.getChannel().noteOn(j, model.getSliderValue());
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            model.getChannel().noteOff(j);
        }
    }

    @FXML
    public void hB() {
        for (int j : Model.hb) {
            model.getChannel().noteOn(j, model.getSliderValue());
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            model.getChannel().noteOff(j);
        }
    }

    @FXML
    public void gF() {
        for (int j : Model.gf) {
            model.getChannel().noteOn(j, model.getSliderValue());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            model.getChannel().noteOff(j);
        }
    }

    @FXML
    public void reg() {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/register.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Register");
            Scene scene = new Scene(root, 521, 329);
            stage.setScene(scene);
            String stylesheet = getClass().getResource("/styles.css").toExternalForm();
            scene.getStylesheets().add(stylesheet);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
