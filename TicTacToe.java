import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TicTacToe extends TicTacToeMethods {
    public static void main(String args[]) {
        TicTacToe ttt = new TicTacToe();
        ttt.elemBounds();
        frame.setSize(460,500);
        frame.setLayout(null);
        frame.setVisible(true);
        ttt.elemAdd();
        ttt.boxActive0();
        ttt.boxDefaultColor();
        ttt.txtColor();
        ttt.actions();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class TicTacToeMethods {
    static String move = "XOXOXOXOX";
    static char ch = ' ';
    static int i = 0;

    static JFrame frame = new JFrame("Tic Tac Toe by Akbar");

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

    JLabel result = new JLabel();

    JButton start = new JButton("start");

    void elemBounds() {
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
    }
    void boxVisibility1() {
        b1.setVisible(true); b2.setVisible(true); b3.setVisible(true);
        b4.setVisible(true); b5.setVisible(true); b6.setVisible(true);
        b7.setVisible(true); b8.setVisible(true); b9.setVisible(true);
    }
    void boxVisibility0 () {

    }
    void boxActive0() {
        b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); 
        b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
        b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
    }
    void boxActive1 () {
        b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); 
        b4.setEnabled(true); b5.setEnabled(true); b6.setEnabled(true);
        b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    }
    void elemAdd() {
        frame.add(counter);

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
    }
    void actions() {
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b1.setText(checkPos(b1.getText().toString()));
                logic();
                dispCounter();
                if (i % 2 == 0) {
                    b1.setForeground(Color.BLUE);
                } else {
                    b1.setForeground(Color.RED);
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b2.setText(checkPos(b2.getText().toString()));
                logic();
                dispCounter();
                if (i % 2 == 0) {
                    b2.setForeground(Color.BLUE);
                } else {
                    b2.setForeground(Color.RED);
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b3.setText(checkPos(b3.getText().toString()));
                logic();
                dispCounter();
                if (i % 2 == 0) {
                    b3.setForeground(Color.BLUE);
                } else {
                    b3.setForeground(Color.RED);
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b4.setText(checkPos(b4.getText().toString()));
                logic();
                dispCounter();
                if (i % 2 == 0) {
                    b4.setForeground(Color.BLUE);
                } else {
                    b4.setForeground(Color.RED);
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b5.setText(checkPos(b5.getText().toString()));
                logic();
                dispCounter();
                if (i % 2 == 0) {
                    b5.setForeground(Color.BLUE);
                } else {
                    b5.setForeground(Color.RED);
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b6.setText(checkPos(b6.getText().toString()));
                logic();
                dispCounter();
                if (i % 2 == 0) {
                    b6.setForeground(Color.BLUE);
                } else {
                    b6.setForeground(Color.RED);
                }
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b7.setText(checkPos(b7.getText().toString()));
                logic();
                dispCounter();
                if (i % 2 == 0) {
                    b7.setForeground(Color.BLUE);
                } else {
                    b7.setForeground(Color.RED);
                }
            }
        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b8.setText(checkPos(b8.getText().toString()));
                logic();
                dispCounter();
                if (i % 2 == 0) {
                    b8.setForeground(Color.BLUE);
                } else {
                    b8.setForeground(Color.RED);
                }
            }
        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b9.setText(checkPos(b9.getText().toString()));
                logic();
                dispCounter();
                if (i % 2 == 0) {
                    b9.setForeground(Color.BLUE);
                } else {
                    b9.setForeground(Color.RED);
                }
            }
        });
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boxVisibility1();
                boxActive1();
                boxDefaultColor();
                resetAll();
                counter.setText("X's Move");
            }
        });
    }
    void dispCounter() {
        int j = 1;
        char cnt = move.charAt(i);
        counter.setText(String.valueOf(cnt) + "'s Move");
    }
    String checkPos(String box) {
        if(box.equals("")) {
        ch = move.charAt(i);
        box = String.valueOf(ch);
        i++;
        }
        return box;
    }
    void logic() {
        if((b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) || (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O"))) {
            result.setText(b1.getText() + " Won");
            b1.setBackground(Color.GREEN); b2.setBackground(Color.GREEN); b3.setBackground(Color.GREEN);
            boxActive0(); 
            start.setText("Restart"); 
        } else if((b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) || (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O"))) {
            result.setText(b4.getText() + " Won");
            b4.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b6.setBackground(Color.GREEN);
            boxActive0(); 
            start.setText("Restart");   
        } else if((b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) || (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O"))) {
            result.setText(b7.getText() + " Won");
            b7.setBackground(Color.GREEN); b8.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
            boxActive0(); 
            start.setText("Restart");
        } else if((b4.getText().equals("X") && b1.getText().equals("X") && b7.getText().equals("X")) || (b4.getText().equals("O") && b1.getText().equals("O") && b7.getText().equals("O"))) {
            result.setText(b4.getText() + " Won");
            b1.setBackground(Color.GREEN); b4.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
            boxActive0(); 
            start.setText("Restart");
        } else if((b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) || (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O"))) {
            result.setText(b2.getText() + " Won");
            b2.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b8.setBackground(Color.GREEN);
            boxActive0(); 
            start.setText("Restart");
        } else if((b3.getText().equals("X") && b9.getText().equals("X") && b6.getText().equals("X")) || (b3.getText().equals("O") && b9.getText().equals("O") && b6.getText().equals("O"))) {
            result.setText(b3.getText() + " Won");
            b3.setBackground(Color.GREEN); b6.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
            boxActive0(); 
            start.setText("Restart");
        } else if((b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) || (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O"))) {
            result.setText(b1.getText() + " Won");
            b1.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b9.setBackground(Color.GREEN);
            boxActive0(); 
            start.setText("Restart");
        } else if((b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) || (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O"))) {
            result.setText(b5.getText() + " Won");
            b3.setBackground(Color.GREEN); b5.setBackground(Color.GREEN); b7.setBackground(Color.GREEN);
            boxActive0(); 
            start.setText("Restart");
        } else if(i == 8){
            boxActive0(); 
            start.setText("Restart");
        }
    }
    void boxDefaultColor() {
        b1.setBackground(Color.WHITE); b2.setBackground(Color.WHITE); b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE); b5.setBackground(Color.WHITE); b6.setBackground(Color.WHITE);
        b7.setBackground(Color.WHITE); b8.setBackground(Color.WHITE); b9.setBackground(Color.WHITE);
    }
    void txtColor() {
        b1.setFont(new Font("Arial",Font.BOLD,30));
        b2.setFont(new Font("Arial",Font.BOLD,30));
        b3.setFont(new Font("Arial",Font.BOLD,30));
        b4.setFont(new Font("Arial",Font.BOLD,30));
        b5.setFont(new Font("Arial",Font.BOLD,30));
        b6.setFont(new Font("Arial",Font.BOLD,30));
        b7.setFont(new Font("Arial",Font.BOLD,30));
        b8.setFont(new Font("Arial",Font.BOLD,30));
        b9.setFont(new Font("Arial",Font.BOLD,30));
    }
    void resetAll() {
        start.setText("Restart");

        result.setText("");
        b1.setText(""); b2.setText(""); b3.setText("");
        b4.setText(""); b5.setText(""); b6.setText("");
        b7.setText(""); b8.setText(""); b9.setText("");

        counter.setText("X's Move");
        i = 0;
        ch = ' ';
    }
    
    
}