
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.util.Arrays;
import java.util.List;


public class Controller {

    public static MidiChannel channel;

    Synthesizer synthesizer;

    {
        try {
            synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            synthesizer.loadInstrument(synthesizer.getDefaultSoundbank().getInstruments()[0]);
            channel = synthesizer.getChannels()[0];
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static class Note {
        public final KeyCode key;
        public final int number;

        Note(KeyCode key, int number) {
            this.key = key;
            this.number = number;
        }
    }

    public static final List<Note> notes = Arrays.asList(
            new Controller.Note( KeyCode.A, 60),
            new Controller.Note( KeyCode.W, 61),
            new Controller.Note( KeyCode.S, 62),
            new Controller.Note( KeyCode.E, 63),
            new Controller.Note( KeyCode.D, 64),
            new Controller.Note( KeyCode.F, 65),
            new Controller.Note( KeyCode.T, 66),
            new Controller.Note( KeyCode.G, 67),
            new Controller.Note( KeyCode.Y, 68),
            new Controller.Note( KeyCode.H, 69),
            new Controller.Note( KeyCode.U, 70),
            new Controller.Note( KeyCode.J, 71),
            new Controller.Note( KeyCode.K, 72)
    );

    @FXML
    void note(KeyEvent event) {
        for (Note note : notes) {
            if (note.key.equals(event.getCode())) {
                channel.noteOn(note.number, 90);
            }
        }
    }

    @FXML
    void noteOnC() {
            channel.noteOn(60, 90);
    }

    @FXML
    void noteOnDb() {
        channel.noteOn(61, 90);
    }

    @FXML
    void noteOnD() {
        channel.noteOn(62, 90);
    }

    @FXML
    void noteOnEb() {
        channel.noteOn(63, 90);
    }

    @FXML
    void noteOnE() {
        channel.noteOn(64, 90);
    }

    @FXML
    void noteOnF() {
        channel.noteOn(65, 90);
    }

    @FXML
    void noteOnGb() {
        channel.noteOn(66, 90);
    }

    @FXML
    void noteOnG() {
        channel.noteOn(67, 90);
    }

    @FXML
    void noteOnAb() {
        channel.noteOn(68, 90);
    }

    @FXML
    void noteOnA() {
        channel.noteOn(69, 90);
    }

    @FXML
    void noteOnBb() {
        channel.noteOn(70, 90);
    }

    @FXML
    void noteOnB() {
        channel.noteOn(71, 90);
    }

    @FXML
    void noteOnC1() {
        channel.noteOn(72, 90);
    }

}
