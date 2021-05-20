import javafx.scene.input.KeyCode;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.util.Arrays;
import java.util.List;

public class Model {
    int sliderValue;

    public void setSliderValue(int sliderValue) {
        this.sliderValue = sliderValue;
    }

    public int getSliderValue() {
        return sliderValue;
    }

    private MidiChannel channel;

    {
        try {
            Synthesizer synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            synthesizer.loadInstrument(synthesizer.getDefaultSoundbank().getInstruments()[0]);
            channel = synthesizer.getChannels()[0];
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }

    }

    public MidiChannel getChannel(){
      return this.channel;
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
            new Note(KeyCode.A, 60),//до
            new Note(KeyCode.W, 61),//додиез
            new Note(KeyCode.S, 62),//ре
            new Note(KeyCode.E, 63),//редиез
            new Note(KeyCode.D, 64),//ми
            new Note(KeyCode.F, 65),//фа
            new Note(KeyCode.T, 66),//фадиез
            new Note(KeyCode.G, 67),//соль
            new Note(KeyCode.Y, 68),//сольдиез
            new Note(KeyCode.H, 69),//ля
            new Note(KeyCode.U, 70),//лядиез
            new Note(KeyCode.J, 71),//си
            new Note(KeyCode.K, 72)//до
    );

    static int[] jb = new int[] {64, 64, 64, 0, 64, 64, 64, 0, 64,
            67, 60, 62, 64, 0, 65, 65, 65, 65, 65, 64, 64, 64, 64,
            62, 62, 64, 62, 0, 67};


    static int[] hb = new int[] {60, 60, 62, 60, 65, 64, 0, 60, 60,
            62, 60, 67, 65, 0, 60, 60, 60, 69, 65, 65, 64, 62, 70,
            70, 69, 65, 67, 65};


    static int[] gf = new int[] {64, 69, 72, 71, 69, 72, 69, 71, 69, 65,
            67, 64, 0,  64, 69, 72, 71, 69, 72, 69, 71, 69, 64,
            63, 62, 0, 62, 65, 68, 71, 0, 62, 65, 68,69};

}
