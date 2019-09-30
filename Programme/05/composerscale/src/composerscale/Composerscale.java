/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composerscale;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

/**
 *
 * @author wbombardellis
 */
public class Composerscale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, InvalidMidiDataException, MidiUnavailableException {
        ShortMessage note = new ShortMessage();
        long timeStamp = -1;
        Receiver rcvr = MidiSystem.getReceiver();
        
        int n0 = ((int) (Math.random() * 6)) * 2;
        int n1 = ((int) (Math.random() * 6)) * 2;
        int n2 = ((int) (Math.random() * 6)) * 2;
        int n3 = ((int) (Math.random() * 6)) * 2;
        int n4 = ((int) (Math.random() * 6)) * 2;
        int n5 = ((int) (Math.random() * 6)) * 2;
        int n6 = ((int) (Math.random() * 6)) * 2;
        int n7 = ((int) (Math.random() * 6)) * 2;
        int n8 = ((int) (Math.random() * 6)) * 2;
        int n9 = ((int) (Math.random() * 6)) * 2;
        int n10 = ((int) (Math.random() * 6)) * 2;
        int n11 = ((int) (Math.random() * 6)) * 2;
        int n12 = ((int) (Math.random() * 6)) * 2;
        int n13 = ((int) (Math.random() * 6)) * 2;
        int n14 = ((int) (Math.random() * 6)) * 2;
        int n15 = ((int) (Math.random() * 6)) * 2;
        int n16 = ((int) (Math.random() * 6)) * 2;
        int n17 = ((int) (Math.random() * 6)) * 2;
        int n18 = ((int) (Math.random() * 6)) * 2;
        int n19 = ((int) (Math.random() * 6)) * 2;

        //For a composition on C with the pentatonic scale:
//        int[] penta = {0, 3, 5, 7, 10};
//        
//        int n0 = penta[((int) (Math.random() * 5))];
//        int n1 = penta[((int) (Math.random() * 5))];
//        int n2 = penta[((int) (Math.random() * 5))];
//        int n3 = penta[((int) (Math.random() * 5))];
//        int n4 = penta[((int) (Math.random() * 5))];
//        int n5 = penta[((int) (Math.random() * 5))];
//        int n6 = penta[((int) (Math.random() * 5))];
//        int n7 = penta[((int) (Math.random() * 5))];
//        int n8 = penta[((int) (Math.random() * 5))];
//        int n9 = penta[((int) (Math.random() * 5))];
//        int n10 = penta[((int) (Math.random() * 5))];
//        int n11 = penta[((int) (Math.random() * 5))];
//        int n12 = penta[((int) (Math.random() * 5))];
//        int n13 = penta[((int) (Math.random() * 5))];
//        int n14 = penta[((int) (Math.random() * 5))];
//        int n15 = penta[((int) (Math.random() * 5))];
//        int n16 = penta[((int) (Math.random() * 5))];
//        int n17 = penta[((int) (Math.random() * 5))];
//        int n18 = penta[((int) (Math.random() * 5))];
//        int n19 = penta[((int) (Math.random() * 5))];
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n0, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n1, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n2, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n3, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n4, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n5, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n6, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n7, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n8, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n9, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n10, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n11, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n12, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n13, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n14, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n15, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n16, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n17, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n18, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
        note.setMessage(ShortMessage.NOTE_ON, 0, 60 + n19, 100);
        rcvr.send(note, timeStamp);
        Thread.sleep(500);
    }
    
}
