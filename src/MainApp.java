import processing.core.PApplet;

public class MainApp extends PApplet{
    public static void main(String[] args){
        PApplet.main("MainApp",args);

    }

    public void settings(){
        size(800,800);
    }

    public void setup(){
        background(255);
        noStroke();
        fill(0);
    }

    public void draw(){
        stroke(0);
        fill(255,0,255);
        ellipse(width/2,height/2,100,100);
        if (mouseX < 50) {
            rect(0, 0, 50, 100); // Left
        } else {
            rect(50, 0, 50, 100); // Right
        }

        background(204);
        // If the 'A' key is pressed draw a line
        if ((keyPressed == true) && (key == 'A')) {
            line(50, 25, 50, 75);
        } else { // Otherwise, draw an ellipse
            ellipse(50, 50, 50, 50);
        }
    }
}
