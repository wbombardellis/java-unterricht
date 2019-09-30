/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naturalscale;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

/**
 *
 * @author wbombardellis
 */
public class Naturalscale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
        ShortMessage note = new ShortMessage();
        long timeStamp = -1;
        Receiver rcvr = MidiSystem.getReceiver();
        
        // Choose note Middle C (60) on channel 0 with volume 100
        note.setMessage(ShortMessage.NOTE_ON, 0, 60, 100);
        // Start playing note
        rcvr.send(note, timeStamp);
        // Let it play for one second
        Thread.sleep(1000);
        
        // D
        note.setMessage(ShortMessage.NOTE_ON, 0, 62, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        // E
        note.setMessage(ShortMessage.NOTE_ON, 0, 64, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        // F
        note.setMessage(ShortMessage.NOTE_ON, 0, 65, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        // G
        note.setMessage(ShortMessage.NOTE_ON, 0, 67, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        // A
        note.setMessage(ShortMessage.NOTE_ON, 0, 69, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        // B
        note.setMessage(ShortMessage.NOTE_ON, 0, 71, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        // C
        note.setMessage(ShortMessage.NOTE_ON, 0, 72, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
    }
    
}
