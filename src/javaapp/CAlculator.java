/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
//Caculator Class
public class CAlculator extends JFrame implements ActionListener{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 300;
    private final JTextField inputOutputField; 
    private String action="blank" ;
    private double value1 = 0; 
    private double value2 = 0; 
    private double memory1 =0.0; 
    private double memory2 =0.0; 
//Creates a caculator Object and sets it visible
    public static void main(String[] args){
        CAlculator calc = new CAlculator();
        calc.setVisible(true);
    }

    public CAlculator(){
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Calculator"); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new FlowLayout()); 
        inputOutputField = new JTextField("", 25);
        inputOutputField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
       textPanel.add(inputOutputField);
       contentPane.add(textPanel, BorderLayout.CENTER);
       FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
       FlowLayout f2 = new FlowLayout(FlowLayout.CENTER,35,26);
     
       
             
      
       
       
   //Adds buttons to the caculators face
        Jb1 = new JButton("7");
        Jb1.addActionListener(this);
        contentPane.add(Jb1);
        
        Jb2 = new JButton("8");
        Jb2.addActionListener(this);
       contentPane.add(Jb2);
     
        
        Jb3 = new JButton("9");
        Jb3.addActionListener(this);
        contentPane.add(Jb3);
        
        Jb4 = new JButton("Reset");
        Jb4.addActionListener(this);
        contentPane.add(Jb4);
        
        Jb5 = new JButton("Off/On");
        Jb5.addActionListener(this);
        contentPane.add(Jb5);
        
        Jb6 = new JButton("4");
        Jb6.addActionListener(this);
        contentPane.add(Jb6);
        
        Jb7 = new JButton("5");
        Jb7.addActionListener(this);
        contentPane.add(Jb7);
        
        Jb8 = new JButton("6");
        Jb8.addActionListener(this);
        contentPane.add(Jb8);
        
        Jb9 = new JButton("+");
        Jb9.addActionListener(this);
        contentPane.add(Jb9);
        
        Jb10 = new JButton("-");
        Jb10.addActionListener(this);
        contentPane.add(Jb10);
        
        Jb11 = new JButton("1");
        Jb11.addActionListener(this);
        contentPane.add(Jb11);
        
        Jb12 = new JButton("2");
        Jb12.addActionListener(this);
        contentPane.add(Jb12);
        
        Jb13 = new JButton("3");
        Jb13.addActionListener(this);
        contentPane.add(Jb13);
        
        Jb14 = new JButton("*");
        Jb14.addActionListener(this);
        contentPane.add(Jb14);
        
        Jb15 = new JButton("/");
        Jb15.addActionListener(this);
        contentPane.add(Jb15);
        
        Jb16 = new JButton("0");
        Jb16.addActionListener(this);
        contentPane.add(Jb16);
        
        Jb17 = new JButton(".");
        Jb17.addActionListener(this);
        contentPane.add(Jb17);
      
        Jb18 = new JButton("Del");
             Jb18.addActionListener(this);
        contentPane.add(Jb18);
        
         Jb19 = new JButton("=");
         Jb19.addActionListener(this);
        contentPane.add(Jb19);
    }
    
     private javax.swing.JButton Jb1;
    private javax.swing.JButton Jb10;
    private javax.swing.JButton Jb11;
    private javax.swing.JButton Jb12;
    private javax.swing.JButton Jb13;
    private javax.swing.JButton Jb14;
    private javax.swing.JButton Jb15;
    private javax.swing.JButton Jb16;
    private javax.swing.JButton Jb17;
    private javax.swing.JButton Jb18;
    private javax.swing.JButton Jb19;
    private javax.swing.JButton Jb2;
    private javax.swing.JButton Jb3;
    private javax.swing.JButton Jb4;
    private javax.swing.JButton Jb5;
    private javax.swing.JButton Jb6;
    private javax.swing.JButton Jb7;
    private javax.swing.JButton Jb8;
    private javax.swing.JButton Jb9;
   
//Preforms the action when each button is pressed

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       String currentText = inputOutputField.getText();

       Container contentPane = getContentPane();

            if(e.getActionCommand().equals("="))
            {
                  value2 = Double.parseDouble(currentText);
                  inputOutputField.setText("");      
                  
                  if(action.equals("add"))
                  {
                        action = "blank";
                        inputOutputField.setText(value1 + value2 + "");
                  }
                  else if(action.equals("sub"))
                  {
                        action = "blank";
                        inputOutputField.setText(value1 - value2 + "");
                  }
                  else if(action.equals("mult"))
                  {
                        action = "blank";
                        inputOutputField.setText(value1 * value2 + "");
                  }
                  else if(action.equals("div"))
                  {
                        action = "blank";
                        inputOutputField.setText(value1 / value2 + "");
                  }
                  
                  
                  else 
                  {
                        if(currentText.length() > 0)
                        inputOutputField.setText(currentText);
                        else 
                        inputOutputField.setText("");
                  }
                  
            }

            else if(e.getActionCommand().equals("+"))
            {
                  action = "add"; 
                  value1 = Double.parseDouble(currentText);
                  inputOutputField.setText("");      
            }
            else if(e.getActionCommand().equals("-"))
            {
                  action = "sub"; 
                  value1 = Double.parseDouble(currentText);
                  inputOutputField.setText("");      
            }
            else if(e.getActionCommand().equals("*"))
            {
                  action = "mult";
                  value1 = Double.parseDouble(currentText); 
                  inputOutputField.setText("");      
            }
            else if(e.getActionCommand().equals("/"))
            {
                  action = "div";
                  value1 = Double.parseDouble(currentText); 
                  inputOutputField.setText("");      
            }
            else if(e.getActionCommand().equals("Reset"))
            {
                  inputOutputField.setText("");      
            }
            else if(e.getActionCommand().equals("Del"))
            {
                  memory1 = memory1-1;    
                  inputOutputField.setText("");
            }
            else if(e.getActionCommand().equals("Off/On"))
            {
                 System.exit(0);
            }
            else if(action.equals("."))
                  {
                        action = "blank";
                        inputOutputField.setText(currentText+=".");
                  }
      
          else
             inputOutputField.setText(currentText += e.getActionCommand());
       
    }
    
    
}
   
    