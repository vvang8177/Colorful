/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorful;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/**
 * Attempt to make a random colorful dialog window for each run.
 * @author Vues
 */
public class Colorful {
    
    static boolean run = true;
    static Random r = new Random();
    static int color1[] = new int[10];
    static int color2[] = new int[10];
    static int color3[] = new int[10];    
    static int allColors[][] = new int[3][];
    static int pick;
    static JFrame frame = new JFrame("Colorful");
    static GridLayout grid = new GridLayout (2,5);
    static JPanel topFirst = new JPanel();
    static JPanel topSec = new JPanel();
    static JPanel topThird = new JPanel();
    static JPanel topFourth = new JPanel();
    static JPanel topFifth = new JPanel();
    static JPanel botFirst = new JPanel();
    static JPanel botSec = new JPanel();
    static JPanel botThird = new JPanel();
    static JPanel botFourth = new JPanel();
    static JPanel botFifth = new JPanel();
    
    
    public static void movingSquare(){
        frame.setTitle("Colorful - MovingSquare");
            for(int i = 0; i<=1; i++)
                {   
                    int rando1 = r.nextInt(256-0)+0;
                    int rando2 = r.nextInt(256-0)+0;
                    color1[i]=rando1;
                    color2[i]=rando2;
                }
            
            allColors[0]=color1;
            allColors[1]=color2;
            
            //Start 
            topFirst.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            topSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            try{
                Thread.sleep(500);
                frame.repaint();
                }catch (InterruptedException e){
                
             }
            
            topFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topSec.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            topThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            try{
                Thread.sleep(500);
                frame.repaint();
                }catch (InterruptedException e){
                
             }
            
            topFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topThird.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            topFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            try{
                Thread.sleep(500);
                frame.repaint();
                }catch (InterruptedException e){
                
             }
            
            topFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFourth.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            topFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            try{
                Thread.sleep(500);
                frame.repaint();
                }catch (InterruptedException e){
                
             }
            
            topFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFifth.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            botFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            try{
                Thread.sleep(500);
                frame.repaint();
                }catch (InterruptedException e){
                
             }
            
            topFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFifth.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            try{
                Thread.sleep(500);
                frame.repaint();
                }catch (InterruptedException e){
                
             }
            
            topFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFourth.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            botFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            try{
                Thread.sleep(500);
                frame.repaint();
                }catch (InterruptedException e){
                
             }
            
            topFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botThird.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            botFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            try{
                Thread.sleep(500);
                frame.repaint();
                }catch (InterruptedException e){
                
             }
            
            topFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botSec.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            botThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            try{
                Thread.sleep(500);
                frame.repaint();
                }catch (InterruptedException e){
                
             }
            
            topFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFirst.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            botSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            try{
                Thread.sleep(500);
                frame.repaint();
                }catch (InterruptedException e){
                
             }
            

            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
            
            try{
                Thread.sleep(1500);
                frame.repaint();
                
                }catch (InterruptedException e){
                
             }
              
    }
    
    
    public static void checker(){
        frame.setTitle("Colorful - Checker");
                  
            for(int i = 0; i<=1; i++)
                {   
                    int rando1 = r.nextInt(256-0)+0;
                    int rando2 = r.nextInt(256-0)+0;
                    color1[i]=rando1;
                    color2[i]=rando2;
                }
            
            allColors[0]=color1;
            allColors[1]=color2;
            
            topFirst.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            topSec.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topThird.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            topFourth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            topFifth.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            botFirst.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botSec.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            botThird.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
            botFourth.setBackground(new Color(allColors[0][0], allColors[0][1], allColors[0][2]));
            botFifth.setBackground(new Color(allColors[1][0], allColors[1][1], allColors[1][2]));
      
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
      
            try{
                Thread.sleep(1500);
                frame.repaint();
                
                }catch (InterruptedException e){
                
                }
      
            
        
    }
    
    public static void rainbow(){
        frame.setTitle("Colorful - Rainbow");
                        
            for(int i = 0; i<=9; i++)
                {   
                    int rando1 = r.nextInt(256-0)+0;
                    int rando2 = r.nextInt(256-0)+0;
                    int rando3 = r.nextInt(256-0)+0;
                    color1[i]=rando1;
                    color2[i]=rando2;
                    color3[i]=rando3;
                }
            
            allColors[0]=color1;
            allColors[1]=color2;
            allColors[2]=color3;
            
            topFirst.setBackground(new Color(allColors[0][0], allColors[1][0], allColors[2][0]));
            topSec.setBackground(new Color(allColors[0][1], allColors[1][1], allColors[2][1]));
            topThird.setBackground(new Color(allColors[0][2], allColors[1][2], allColors[2][2]));
            topFourth.setBackground(new Color(allColors[0][3], allColors[1][3], allColors[2][3])); 
            topFifth.setBackground(new Color(allColors[0][4], allColors[1][4], allColors[2][4]));
            botFirst.setBackground(new Color(allColors[0][5], allColors[1][5], allColors[2][5]));
            botSec.setBackground(new Color(allColors[0][6], allColors[1][6], allColors[2][6]));
            botThird.setBackground(new Color(allColors[0][7], allColors[1][7], allColors[2][7]));
            botFourth.setBackground(new Color(allColors[0][8], allColors[1][8], allColors[2][8]));
            botFifth.setBackground(new Color(allColors[0][9], allColors[1][9], allColors[2][9]));
            
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
      
            try{
                Thread.sleep(1500);
                frame.repaint();
                               
            }catch (InterruptedException e){
                
            }
      
            
    }
    
    
    public static void createBox() {
        //Create and set up the window.
        frame.setSize(800,500);
        frame.setLayout(grid);
        grid.layoutContainer(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(topFirst);
        frame.add(topSec);
        frame.add(topThird);
        frame.add(topFourth);
        frame.add(topFifth);
        frame.add(botFirst);
        frame.add(botSec);
        frame.add(botThird);
        frame.add(botFourth);
        frame.add(botFifth);
        topFirst.setBorder(new LineBorder(Color.BLACK));
        topSec.setBorder(new LineBorder(Color.BLACK));
        topThird.setBorder(new LineBorder(Color.BLACK));
        topFourth.setBorder(new LineBorder(Color.BLACK));
        topFifth.setBorder(new LineBorder(Color.BLACK));
        botFirst.setBorder(new LineBorder(Color.BLACK));
        botSec.setBorder(new LineBorder(Color.BLACK));
        botThird.setBorder(new LineBorder(Color.BLACK));
        botFourth.setBorder(new LineBorder(Color.BLACK));
        botFifth.setBorder(new LineBorder(Color.BLACK));
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        createBox();
        while(run){
            
            pick = r.nextInt(3-0)+0;            
            switch (pick) {
                case 0:
                    checker();
                    break;
                case 1:
                    rainbow();
                   break;
                case 2:
                    movingSquare();
                    break;
                default:
                    break;
            }
        }
        
        
    }
    
}
