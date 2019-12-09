package Stuffs;
import java.util.*;
import static Stuffs.Main.DisplayPane;

public class Location 
{
    public static void main(String[] args) 
    {
        
    }
    public String getPosition() {
        return position;
    }
    public int getDepress(){
        return depress;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    int depress = 0;
    String position = "intro";
    public void town1(){
        position = "town1";
        DisplayPane.setText("Sam was a great and noble fighter but in these sad times, there are no monsters left to fight because he has removed the evil that infected this world.\n\nSam has been searching for any remaining monsters for a long time but in his heart he knows he will never find anymore.\n\nSam has wanderded into a small town.");
        Main.button1.setText("Look in a house");
        Main.button2.setText("Talk to trader");
        Main.button3.setText("Find food");
        Main.button4.setText("Stay in the inn");
    }
    public void house1(){
        position = "house1";
        DisplayPane.setText("Sam walks into a house full of ramen noodles and red soda cups.\n\nSam suspects a party that he missed.");
        Main.button1.setText("Look for something to drink");
        Main.button2.setText("Look for anything cool");
        Main.button3.setText("Play some music");
        Main.button4.setText("Leave");
    }
    public void music(){
        position = "music";
        DisplayPane.setText("Sam attempts to turn on the overkill radio-like thing.\n\nSam hears some funny beeping noises.\nThe noises make him think of the music of the future");
        Main.button1.setText("Go back");
        Main.button2.setText("");
        Main.button3.setText("");
        Main.button4.setText("");
    }
    public void house1Eat(){
        position = "house1Eat";
        depress += 10;
        DisplayPane.setText("Sam attempts to find something to drink\n\nSam finds some ... His dression goes up!");
        Main.button1.setText("Go back");
        Main.button2.setText("");
        Main.button3.setText("");
        Main.button4.setText("");
    }
}
