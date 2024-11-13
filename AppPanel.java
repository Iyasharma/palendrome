import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AppPanel extends JPanel {
    int a=0;
    int b=0;
    BufferedImage bgImage;
    Timer timer;
    int xPos = 0;
    int yPos = 0;

    AppPanel() {
        setSize(500, 500);
        // setBackground(Color.BLUE);
        loadBgImage();
        callPaintAgain();
        // addKeyboardControls();
        setFocusable(true);
    }

    void loadBgImage() {
        try {
            bgImage = ImageIO.read(AppPanel.class.getResource("car.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        pen.drawImage(bgImage, xPos, yPos, 50, 50, null);
    }

    void callPaintAgain() {
        
        timer = new Timer(50, (ab) -> {
            
            
            if(b==0){
                if(xPos<440)
                xPos=xPos+10;
                else{
                    b=1;
                }
            }
            if(b==1){
                if(xPos>=10)
                xPos=xPos-10;
               else{
                b=0;
               }
            }
            if(a==0){
                if(yPos<410)
                yPos=yPos+5;
                else{
                    a=1;
                }
            }
            if(a==1){
                if(yPos>=10)
                yPos=yPos-5;
               else{
                a=0;
               }
            }
            
         
           
        repaint();
        });
        timer.start();
    }

    // void addKeyboardControls() {
    //     addKeyListener(new KeyListener() {

    //         @Override
    //         public void keyTyped(KeyEvent e) {
    //             throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    //         }

    //         @Override
    //         public void keyPressed(KeyEvent e) {

    //             if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
    //                 xPos = xPos + 1; // right move
    //             }

    //             if (e.getKeyCode() == KeyEvent.VK_LEFT) {
    //                 xPos = xPos - 1; // left move
    //             }
    //             if (e.getKeyCode() == KeyEvent.VK_DOWN) {
    //                 yPos = yPos + 1; // left move
    //             }
    //             if (e.getKeyCode() == KeyEvent.VK_UP) {
    //                 yPos = yPos - 1; // left move
    //             }
    //             throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    //         }

    //         @Override
    //         public void keyReleased(KeyEvent e) {
    //             throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    //         }

    //     });
    // }
    
}