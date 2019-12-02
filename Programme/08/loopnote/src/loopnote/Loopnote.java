package loopnote;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

/**
 *
 * @author wbombardellis
 */
public class Loopnote {

    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
        ShortMessage note = new ShortMessage();
        long timeStamp = -1;
        Receiver rcvr = MidiSystem.getReceiver();
        
        while (true) {
            note.setMessage(ShortMessage.NOTE_ON, 0, 60, 100);
            rcvr.send(note, timeStamp);
            Thread.sleep(1000);
        }
        
//        int count = 1;
//        while (count <= 100) {
//            note.setMessage(ShortMessage.NOTE_ON, 0, 60, 100);
//            rcvr.send(note, timeStamp);
//            Thread.sleep(100);
//            
//            count++;
//        }
        
//        int frequency = 0;
//        while (frequency < 128) {
//            note.setMessage(ShortMessage.NOTE_ON, 0, frequency, 100);
//            rcvr.send(note, timeStamp);
//            Thread.sleep(100);
//            
//            frequency++;
//        }
    }
    
}
