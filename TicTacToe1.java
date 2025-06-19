import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class TicTacToe1 {

    static String move = "XOXOXOXOX";
    static char ch = ' ';
    static int i = 0;

    public static void main(String args[]) {
        JFrame frame = new JFrame("Tic Tac Toe by Akbar");

        JLabel counter = new JLabel();

        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();
        JButton b5 = new JButton();
        JButton b6 = new JButton();
        JButton b7 = new JButton();
        JButton b8 = new JButton();
        JButton b9 = new JButton();

        b1.setBackground(Color.WHITE); b2.setBackground(Color.WHITE); b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE); b5.setBackground(Color.WHITE); b6.setBackground(Color.WHITE);
        b7.setBackground(Color.WHITE); b8.setBackground(Color.WHITE); b9.setBackground(Color.WHITE);

        b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
        b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
        b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);



        JLabel result = new JLabel();

        JButton start = new JButton("start");

        counter.setBounds(180,50,100,40);

        b1.setBounds(100,100,80,80);
        b2.setBounds(190,100,80,80);
        b3.setBounds(280,100,80,80);
        b4.setBounds(100,190,80,80);
        b5.setBounds(190,190,80,80);
        b6.setBounds(280,190,80,80);
        b7.setBounds(100,280,80,80);
        b8.setBounds(190,280,80,80);
        b9.setBounds(280,280,80,80);

        result.setBounds(135,370,100,40);

        start.setBounds(245,370,80,40);

        

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!b1.getText().equals("")) return;
            
                ch = move.charAt(i);
                b1.setText(String.valueOf(ch));
                i++;

                if((b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) || (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b2.setBackground(Color.GREEN); b3.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) || (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b4.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b6.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) || (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b7.getText() + " Won");
                    b7.setBackground(Color.GREEN); b8.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b1.getText().equals("X") && b7.getText().equals("X")) || (b4.getText().equals("O") && b1.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b1.setBackground(Color.GREEN); b4.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) || (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O"))) {
                    result.setText(b2.getText() + " Won");
                    b2.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b8.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b9.getText().equals("X") && b6.getText().equals("X")) || (b3.getText().equals("O") && b9.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b3.getText() + " Won");
                    b3.setBackground(Color.GREEN); b6.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) || (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) || (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b5.getText() + " Won");
                    b3.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                }
                else if(i == 8){
                    result.setText("DRAW! Try again");
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);

                    start.setText("Restart");
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!b2.getText().equals("")) return;
            
                ch = move.charAt(i);
                b2.setText(String.valueOf(ch));
                i++;
                if((b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) || (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b2.setBackground(Color.GREEN); b3.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) || (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b4.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b6.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) || (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b7.getText() + " Won");
                    b7.setBackground(Color.GREEN); b8.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b1.getText().equals("X") && b7.getText().equals("X")) || (b4.getText().equals("O") && b1.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b1.setBackground(Color.GREEN); b4.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) || (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O"))) {
                    result.setText(b2.getText() + " Won");
                    b2.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b8.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b9.getText().equals("X") && b6.getText().equals("X")) || (b3.getText().equals("O") && b9.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b3.getText() + " Won");
                    b3.setBackground(Color.GREEN); b6.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) || (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) || (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b5.getText() + " Won");
                    b3.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } 
                else if(i == 8){
                    result.setText("DRAW! Try again");
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);

                    start.setText("Restart");
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(!b3.getText().equals("")) return;
            
                ch = move.charAt(i);
                b3.setText(String.valueOf(ch));
                i++;
                if((b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) || (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b2.setBackground(Color.GREEN); b3.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) || (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b4.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b6.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) || (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b7.getText() + " Won");
                    b7.setBackground(Color.GREEN); b8.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b1.getText().equals("X") && b7.getText().equals("X")) || (b4.getText().equals("O") && b1.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b1.setBackground(Color.GREEN); b4.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) || (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O"))) {
                    result.setText(b2.getText() + " Won");
                    b2.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b8.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b9.getText().equals("X") && b6.getText().equals("X")) || (b3.getText().equals("O") && b9.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b3.getText() + " Won");
                    b3.setBackground(Color.GREEN); b6.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) || (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) || (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b5.getText() + " Won");
                    b3.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if(i == 8){
                    result.setText("DRAW! Try again");
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);

                    start.setText("Restart");
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!b4.getText().equals("")) return;
            
                ch = move.charAt(i);
                b4.setText(String.valueOf(ch));
                i++;
                if((b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) || (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b2.setBackground(Color.GREEN); b3.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) || (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b4.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b6.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) || (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b7.getText() + " Won");
                    b7.setBackground(Color.GREEN); b8.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b1.getText().equals("X") && b7.getText().equals("X")) || (b4.getText().equals("O") && b1.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b1.setBackground(Color.GREEN); b4.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) || (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O"))) {
                    result.setText(b2.getText() + " Won");
                    b2.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b8.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b9.getText().equals("X") && b6.getText().equals("X")) || (b3.getText().equals("O") && b9.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b3.getText() + " Won");
                    b3.setBackground(Color.GREEN); b6.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) || (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) || (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b5.getText() + " Won");
                    b3.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if(i == 8){
                    result.setText("DRAW! Try again");
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);

                    start.setText("Restart");
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!b5.getText().equals("")) return;
            
                ch = move.charAt(i);
                b5.setText(String.valueOf(ch));
                i++;
                if((b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) || (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b2.setBackground(Color.GREEN); b3.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) || (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b4.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b6.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) || (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b7.getText() + " Won");
                    b7.setBackground(Color.GREEN); b8.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b1.getText().equals("X") && b7.getText().equals("X")) || (b4.getText().equals("O") && b1.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b1.setBackground(Color.GREEN); b4.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) || (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O"))) {
                    result.setText(b2.getText() + " Won");
                    b2.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b8.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b9.getText().equals("X") && b6.getText().equals("X")) || (b3.getText().equals("O") && b9.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b3.getText() + " Won");
                    b3.setBackground(Color.GREEN); b6.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) || (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) || (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b5.getText() + " Won");
                    b3.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if(i == 8){
                    result.setText("DRAW! Try again");
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);

                    start.setText("Restart");
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!b6.getText().equals("")) return;
            
                ch = move.charAt(i);
                b6.setText(String.valueOf(ch));
                i++;
                if((b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) || (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b2.setBackground(Color.GREEN); b3.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) || (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b4.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b6.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) || (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b7.getText() + " Won");
                    b7.setBackground(Color.GREEN); b8.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b1.getText().equals("X") && b7.getText().equals("X")) || (b4.getText().equals("O") && b1.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b1.setBackground(Color.GREEN); b4.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) || (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O"))) {
                    result.setText(b2.getText() + " Won");
                    b2.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b8.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b9.getText().equals("X") && b6.getText().equals("X")) || (b3.getText().equals("O") && b9.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b3.getText() + " Won");
                    b3.setBackground(Color.GREEN); b6.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) || (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) || (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b5.getText() + " Won");
                    b3.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if(i == 8){
                    result.setText("DRAW! Try again");
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);

                    start.setText("Restart");
                }
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!b7.getText().equals("")) return;
            
                ch = move.charAt(i);
                b7.setText(String.valueOf(ch));
                i++;
                if((b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) || (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b2.setBackground(Color.GREEN); b3.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) || (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b4.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b6.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) || (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b7.getText() + " Won");
                    b7.setBackground(Color.GREEN); b8.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b1.getText().equals("X") && b7.getText().equals("X")) || (b4.getText().equals("O") && b1.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b1.setBackground(Color.GREEN); b4.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) || (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O"))) {
                    result.setText(b2.getText() + " Won");
                    b2.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b8.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b9.getText().equals("X") && b6.getText().equals("X")) || (b3.getText().equals("O") && b9.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b3.getText() + " Won");
                    b3.setBackground(Color.GREEN); b6.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) || (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) || (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b5.getText() + " Won");
                    b3.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if(i == 8){
                    result.setText("DRAW! Try again");
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);

                    start.setText("Restart");
                }
            }
        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!b8.getText().equals("")) return;
            
                ch = move.charAt(i);
                b8.setText(String.valueOf(ch));
                i++;
                if((b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) || (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b2.setBackground(Color.GREEN); b3.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) || (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b4.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b6.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) || (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b7.getText() + " Won");
                    b7.setBackground(Color.GREEN); b8.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b1.getText().equals("X") && b7.getText().equals("X")) || (b4.getText().equals("O") && b1.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b1.setBackground(Color.GREEN); b4.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) || (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O"))) {
                    result.setText(b2.getText() + " Won");
                    b2.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b8.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b9.getText().equals("X") && b6.getText().equals("X")) || (b3.getText().equals("O") && b9.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b3.getText() + " Won");
                    b3.setBackground(Color.GREEN); b6.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) || (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) || (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b5.getText() + " Won");
                    b3.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if(i == 8){
                    result.setText("DRAW! Try again");
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);

                    start.setText("Restart");
                }
            }
        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!b9.getText().equals("")) return;
            
                ch = move.charAt(i);
                b9.setText(String.valueOf(ch));
                i++;
                if((b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) || (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b2.setBackground(Color.GREEN); b3.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) || (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b4.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b6.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) || (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b7.getText() + " Won");
                    b7.setBackground(Color.GREEN); b8.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b4.getText().equals("X") && b1.getText().equals("X") && b7.getText().equals("X")) || (b4.getText().equals("O") && b1.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b4.getText() + " Won");
                    b1.setBackground(Color.GREEN); b4.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) || (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O"))) {
                    result.setText(b2.getText() + " Won");
                    b2.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b8.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b9.getText().equals("X") && b6.getText().equals("X")) || (b3.getText().equals("O") && b9.getText().equals("O") && b6.getText().equals("O"))) {
                    result.setText(b3.getText() + " Won");
                    b3.setBackground(Color.GREEN); b6.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) || (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O"))) {
                    result.setText(b1.getText() + " Won");
                    b1.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if((b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) || (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O"))) {
                    result.setText(b5.getText() + " Won");
                    b3.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
                } else if(i == 8){
                    result.setText("DRAW! Try again");
                    b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
                    b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
                    b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);

                    start.setText("Restart");
                }
            }
        });


        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b1.setVisible(true); b2.setVisible(true); b3.setVisible(true);
                b4.setVisible(true); b5.setVisible(true); b6.setVisible(true);
                b7.setVisible(true); b8.setVisible(true); b9.setVisible(true);


                b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); 
                b4.setEnabled(true); b5.setEnabled(true); b6.setEnabled(true);
                b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);

                b1.setBackground(Color.WHITE); b2.setBackground(Color.WHITE); b3.setBackground(Color.WHITE);
                b4.setBackground(Color.WHITE); b5.setBackground(Color.WHITE); b6.setBackground(Color.WHITE);
                b7.setBackground(Color.WHITE); b8.setBackground(Color.WHITE); b9.setBackground(Color.WHITE);

                start.setText("Restart");

                result.setText("");

                b1.setText(""); b2.setText(""); b3.setText("");
                b4.setText(""); b5.setText(""); b6.setText("");
                b7.setText(""); b8.setText(""); b9.setText("");

                i = 0;
                ch = ' ';
            }
        });
             
        

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);

        frame.add(result);

        frame.add(start);

        frame.setSize(460,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

