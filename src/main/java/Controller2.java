import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.TextField;
public class Controller2 {

    Model model = new Model();

    @FXML
    public TextField login;

    @FXML
    private TextField melody;

    @FXML
    public Button first;

    @FXML
    private Button second;

    @FXML
    private Button third;

    @FXML
    private Button forth;

    @FXML
    private Button fifth;

    public String log;
    @FXML
    void name() {
        log =  login.getText();
    }

    private String key;
    @FXML
    void nums(){
        key = melody.getText();
    }

    @FXML
    void press(KeyEvent event) {
        if(event.getCode().equals(KeyCode.ENTER)){
            if(!first.isVisible()) {
                first.setVisible(true);
                first.setText(log);
                aSubKey = key.split(" ");
            } else if(!second.isVisible()){
                second.setVisible(true);
                second.setText(log);
                bSubKey = key.split(" ");
            } else if(!third.isVisible()){
                third.setVisible(true);
                third.setText(log);
                cSubKey = key.split(" ");
            } else if(!forth.isVisible()){
                forth.setVisible(true);
                forth.setText(log);
                dSubKey = key.split(" ");
            } else if(!fifth.isVisible()){
                fifth.setVisible(true);
                fifth.setText(log);
                eSubKey = key.split(" ");
            }
        }
    }

    String[] aSubKey;
    String[] bSubKey;
    String[] cSubKey;
    String[] dSubKey;
    String[] eSubKey;


    @FXML
    public void a() {
        for (String j : aSubKey) {
            Integer i = null;
            try {
                i = Integer.valueOf(j);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            model.getChannel().noteOn(59 + i, 90);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            model.getChannel().noteOff(59 + i);
        }
    }

    @FXML
    public void b(){
        for (String j : bSubKey) {
            Integer i = null;
            try {
                i = Integer.valueOf(j);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            model.getChannel().noteOn(59 + i, 90);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            model.getChannel().noteOff(59 + i);
        }

    }

    @FXML
    public void c(){
        for (String j : cSubKey) {
            Integer i = null;
            try {
                i = Integer.valueOf(j);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            model.getChannel().noteOn(59 + i, 90);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           model.getChannel().noteOff(59 + i);
        }

    }

    @FXML
    public void d(){
        for (String j : dSubKey) {
            Integer i = null;

            try {
                i = Integer.valueOf(j);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            model.getChannel().noteOn(59 + i, 90);

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            model.getChannel().noteOff(59 + i);
        }

    }

    @FXML
    public void e(){
        for (String j : eSubKey) {
            Integer i = null;
            try {
                i = Integer.valueOf(j);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            model.getChannel().noteOn(59 + i, 90);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            model.getChannel().noteOff(59 + i);
        }
    }

}
