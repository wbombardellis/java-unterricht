/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composer;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

/**
 *
 * @author wbombardellis
 */
public class Composer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, InvalidMidiDataException, MidiUnavailableException {
        ShortMessage note = new ShortMessage();
        long timeStamp = -1;
        Receiver rcvr = MidiSystem.getReceiver();
        
        int n0 = (int) (Math.random() * 12);
        int n1 = (int) (Math.random() * 12);
        int n2 = (int) (Math.random() * 12);
        int n3 = (int) (Math.random() * 12);
        int n4 = (int) (Math.random() * 12);
        int n5 = (int) (Math.random() * 12);
        int n6 = (int) (Math.random() * 12);
        int n7 = (int) (Math.random() * 12);
        int n8 = (int) (Math.random() * 12);
        int n9 = (int) (Math.random() * 12);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n0, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n1, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n2, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n3, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n4, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n5, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n6, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n7, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n8, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n9, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(1000);
    }
    
}
