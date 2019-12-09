/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stuffs;

import java.io.File;
import java.io.IOException;
 
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Musicplayerscript implements LineListener {
    
    static private Clip clip;
    
    boolean playCompleted;
    
    static void megalovaina(){
        Boolean isPlaying = false;
        String audioFilePath = "./src/Stuffs/mega.wav";
        Musicplayerscript player = new Musicplayerscript();
        if(!isPlaying){
            player.audiocontrol(audioFilePath,"play");
        }
        else{
            clip.stop();
        }
    }
    void audiocontrol(String audioFilePath, String command) {
        File audioFile = new File(audioFilePath);
        
        
            try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                AudioFormat format = audioStream.getFormat();

                DataLine.Info info = new DataLine.Info(Clip.class, format);

                clip = AudioSystem.getClip();

                clip.open(audioStream);

                clip.start();

                
                
                

                

            } catch (UnsupportedAudioFileException ex) {
                System.out.println("The specified audio file is not supported.");
                ex.printStackTrace();
            } catch (LineUnavailableException ex) {
                System.out.println("Audio line for playing back is unavailable.");
                ex.printStackTrace();
            } catch (IOException ex) {
                System.out.println("Error playing the audio file.");
                ex.printStackTrace();
            }
        
        
         
    }

    
    @Override
    public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
         
        if (type == LineEvent.Type.START) {
            System.out.println("Playback started.");
             
        } else if (type == LineEvent.Type.STOP) {
            playCompleted = true;
            System.out.println("Playback completed.");
        }
 
    }
 
    public static void main(String[] args) {
        Musicplayerscript player = new Musicplayerscript();
    }
}
