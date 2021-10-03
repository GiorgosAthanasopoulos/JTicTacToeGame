import java.awt.event.MouseListener;

public class GUI{

    static final int[] turn = {0}; // 0 for X, 1 for O
    static javax.swing.JButton b1;
    static javax.swing.JButton b2;
    static javax.swing.JButton b3;
    static javax.swing.JButton b4;
    static javax.swing.JButton b5;
    static javax.swing.JButton b6;
    static javax.swing.JButton b7;
    static javax.swing.JButton b8;
    static javax.swing.JButton b9;
    static javax.swing.border.Border black;
    static javax.swing.border.Border blue;
    static javax.swing.JButton  l1;
    public static javax.swing.JButton  l2;
    public static javax.swing.JButton  l3;
    static javax.swing.border.Border red;
    public static int scorex;
    public static int scoreo;
    public static java.awt.Color main;
    public static java.awt.Color sec;
    public static javax.swing.JFrame frame;

    public static void main(String[] args){

        String c1 = javax.swing.JOptionPane.showInputDialog("enter main color: ", "MAIN COLOR");
        String c2 = javax.swing.JOptionPane.showInputDialog("enter secondary color: ", "SECOND COLOR");

        if(c1.contains("black")){
            main = java.awt.Color.black;
        }else if(c1.contains("cyan")){
            main = java.awt.Color.cyan;
        }else if(c1.contains("darkGray")){
            main = java.awt.Color.darkGray;
        }else if(c1.contains("lightGray")){
            main = java.awt.Color.lightGray;
        }else if(c1.contains("magenta")){
            main = java.awt.Color.magenta;
        }else if(c1.contains("orange")){
            main = java.awt.Color.orange;
        }else if(c1.contains("pink")){
            main = java.awt.Color.pink;
        }else if(c1.contains("white")){
            main = java.awt.Color.white;
        }else if(c1.contains("yellow")){
            main = java.awt.Color.yellow;
        }else if(c1.contains("gray")){
            main = java.awt.Color.gray;
        }else if(c1.contains("green")){
            main = java.awt.Color.green;
        }else{
            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"color not supported :(");
        }

        if(c2.contains("black")){
            sec = java.awt.Color.black;
            sec = java.awt.Color.blue;
        }else if(c2.contains("cyan")){
            sec = java.awt.Color.cyan;
        }else if(c2.contains("darkGray")){
            sec = java.awt.Color.darkGray;
        }else if(c2.contains("green")){
            sec = java.awt.Color.green;
        }else if(c2.contains("lightGray")){
            sec = java.awt.Color.lightGray;
        }else if(c2.contains("magenta")){
            sec = java.awt.Color.magenta;
        }else if(c2.contains("orange")){
            sec = java.awt.Color.orange;
        }else if(c2.contains("pink")){
            sec = java.awt.Color.pink;
        }else if(c2.contains("white")){
            sec = java.awt.Color.white;
        }else if(c2.contains("yellow")){
            sec = java.awt.Color.yellow;
        }else if(c2.contains("gray")){
            sec = java.awt.Color.gray;
        }else{
            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"color not supported :(");
        }

        frame = new javax.swing.JFrame("GAME");
        frame.setVisible(true);
        frame.setSize(new java.awt.Dimension(600,400));
        java.awt.GridLayout gl = new java.awt.GridLayout(5,3);
        frame.getContentPane().setLayout(gl);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        l1 = new javax.swing.JButton("Turn: X");
        l2 = new javax.swing.JButton("Score X: 0");
        l3 = new javax.swing.JButton("Score O: 0");

        b1 = new javax.swing.JButton("1");
        b2 = new javax.swing.JButton("2");
        b3 = new javax.swing.JButton("3");
        b4 = new javax.swing.JButton("4");
        b5 = new javax.swing.JButton("5");
        b6 = new javax.swing.JButton("6");
        b7 = new javax.swing.JButton("7");
        b8 = new javax.swing.JButton("8");
        b9 = new javax.swing.JButton("9");
        
        b1.setBackground(main);
        b2.setBackground(main);
        b3.setBackground(main);
        b4.setBackground(main);
        b5.setBackground(main);
        b6.setBackground(main);
        b7.setBackground(main);
        b8.setBackground(main);
        b9.setBackground(main);
        l1.setBackground(sec);
        l2.setBackground(sec);
        l3.setBackground(sec);

        javax.swing.JButton exit = new javax.swing.JButton("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent ae){
                int input = javax.swing.JOptionPane.showConfirmDialog(javax.swing.JOptionPane.getRootFrame(), "Are you sure you want to quit?", "EXIT",javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.ERROR_MESSAGE);
                if(input == 0){
                    System.exit(0);
                }
            }
        });
        javax.swing.JButton restart = new javax.swing.JButton("RESTART");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent ae){
                afterWin();
            }
        });
        javax.swing.JButton reset = new javax.swing.JButton("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent ae){
                scorex = 0;
                scoreo = 0;
            }
        });

        exit.setBackground(sec);
        restart.setBackground(sec);
        reset.setBackground(sec);
        exit.setForeground(java.awt.Color.magenta);
        restart.setForeground(java.awt.Color.magenta);
        reset.setForeground(java.awt.Color.magenta);

        frame.getContentPane().add(l1);
        frame.getContentPane().add(l2);
        frame.getContentPane().add(l3);
        frame.getContentPane().add(b1);
        frame.getContentPane().add(b2);
        frame.getContentPane().add(b3);
        frame.getContentPane().add(b4);
        frame.getContentPane().add(b5);
        frame.getContentPane().add(b6);
        frame.getContentPane().add(b7);
        frame.getContentPane().add(b8);
        frame.getContentPane().add(b9);
        frame.getContentPane().add(exit);
        frame.getContentPane().add(restart);
        frame.getContentPane().add(reset);

        red = javax.swing.BorderFactory.createLineBorder(java.awt.Color.red); // red for X, blue for O
        blue = javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue);
        black = javax.swing.BorderFactory.createLineBorder(java.awt.Color.black);

        l1.setBorder(red);
        l2.setBorder(red);
        l3.setBorder(blue);
        l1.setForeground(java.awt.Color.red);
        l2.setForeground(java.awt.Color.red);
        l3.setForeground(java.awt.Color.blue);

        scorex = 0;
        scoreo = 0;

        new runtimeThread();

        frame.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                l2.setText("Score X: " + String.valueOf(scorex));
                l3.setText("Score O: " + String.valueOf(scoreo));
            }
 
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                l2.setText("Score X: " + String.valueOf(scorex));
                l3.setText("Score O: " + String.valueOf(scoreo));
            }
 
            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                l2.setText("Score X: " + String.valueOf(scorex));
                l3.setText("Score O: " + String.valueOf(scoreo));
            }
 
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                l2.setText("Score X: " + String.valueOf(scorex));
                l3.setText("Score O: " + String.valueOf(scoreo));
            }
 
            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                l2.setText("Score X: " + String.valueOf(scorex));
                l3.setText("Score O: " + String.valueOf(scoreo));
            }
        });

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if(turn[0] == 0){
                    if(!b1.getText().equals("X") && !b1.getText().equals("O")){
                        b1.setText("X");
                        turn[0] = 1;
                        l1.setText("Turn: O");
                        b1.setForeground(java.awt.Color.red);
                        b1.setBorder(red);
                        l1.setBorder(blue);
                        l1.setForeground(java.awt.Color.blue);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                        
                    }
                }else{
                    if(!b1.getText().equals("X") && !b1.getText().equals("O")){
                        b1.setText("O");
                        turn[0] = 0;
                        l1.setText("Turn: X");
                        b1.setForeground(java.awt.Color.blue);
                        b1.setBorder(blue);
                        l1.setBorder(red);
                        l1.setForeground(java.awt.Color.red);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if(turn[0] == 0){
                    if(!b2.getText().equals("X") && !b2.getText().equals("O")){
                        b2.setText("X");
                        turn[0] = 1;
                        l1.setText("Turn: O");
                        b2.setForeground(java.awt.Color.red);
                        b2.setBorder(red);
                        l1.setBorder(blue);
                        l1.setForeground(java.awt.Color.blue);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }else{
                    if(!b2.getText().equals("X") && !b2.getText().equals("O")){
                        b2.setText("O");
                        turn[0] = 0;
                        l1.setText("Turn: X");
                        b2.setForeground(java.awt.Color.blue);
                        b2.setBorder(blue);
                        l1.setBorder(red);
                        l1.setForeground(java.awt.Color.red);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if(turn[0] == 0){
                    if(!b3.getText().equals("X") && !b3.getText().equals("O")){
                        b3.setText("X");
                        turn[0] = 1;
                        l1.setText("Turn: O");
                        b3.setForeground(java.awt.Color.red);
                        b3.setBorder(red);
                        l1.setBorder(blue);
                        l1.setForeground(java.awt.Color.blue);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }else{
                    if(!b3.getText().equals("X") && !b3.getText().equals("O")){
                        b3.setText("O");
                        turn[0] = 0;
                        l1.setText("Turn: X");
                        b3.setForeground(java.awt.Color.blue);
                        b3.setBorder(blue);
                        l1.setBorder(red);
                        l1.setForeground(java.awt.Color.red);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if(turn[0] == 0){
                    if(!b4.getText().equals("X") && !b4.getText().equals("O")){
                        b4.setText("X");
                        turn[0] = 1;
                        l1.setText("Turn: O");
                        b4.setForeground(java.awt.Color.red);
                        b4.setBorder(red);
                        l1.setBorder(blue);
                        l1.setForeground(java.awt.Color.blue);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }else{
                    if(!b4.getText().equals("X") && !b4.getText().equals("O")){
                        b4.setText("O");
                        turn[0] = 0;
                        l1.setText("Turn: X");
                        b4.setForeground(java.awt.Color.blue);
                        b4.setBorder(blue);
                        l1.setBorder(red);
                        l1.setForeground(java.awt.Color.red);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }
            }
        });
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if(turn[0] == 0){
                    if(!b5.getText().equals("X") && !b5.getText().equals("O")){
                        b5.setText("X");
                        turn[0] = 1;
                        l1.setText("Turn: O");
                        b5.setForeground(java.awt.Color.red);
                        b5.setBorder(red);
                        l1.setBorder(blue);
                        l1.setForeground(java.awt.Color.blue);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }else{
                    if(!b5.getText().equals("X") && !b5.getText().equals("O")){
                        b5.setText("O");
                        turn[0] = 0;
                        l1.setText("Turn: X");
                        b5.setForeground(java.awt.Color.blue);
                        b5.setBorder(blue);
                        l1.setBorder(red);
                        l1.setForeground(java.awt.Color.red);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }
            }
        });
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if(turn[0] == 0){
                    if(!b6.getText().equals("X") && !b6.getText().equals("O")){
                        b6.setText("X");
                        turn[0] = 1;
                        l1.setText("Turn: O");
                        b6.setForeground(java.awt.Color.red);
                        b6.setBorder(red);
                        l1.setBorder(blue);
                        l1.setForeground(java.awt.Color.blue);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }else{
                    if(!b6.getText().equals("X") && !b6.getText().equals("O")){
                        b6.setText("O");
                        turn[0] = 0;
                        l1.setText("Turn: X");
                        b6.setForeground(java.awt.Color.blue);
                        b6.setBorder(blue);
                        l1.setBorder(red);
                        l1.setForeground(java.awt.Color.red);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }
            }
        });
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if(turn[0] == 0){
                    if(!b7.getText().equals("X") && !b7.getText().equals("O")){
                        b7.setText("X");
                        turn[0] = 1;
                        l1.setText("Turn: O");
                        b7.setForeground(java.awt.Color.red);
                        b7.setBorder(red);
                        l1.setBorder(blue);
                        l1.setForeground(java.awt.Color.blue);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }else{
                    if(!b7.getText().equals("X") && !b7.getText().equals("O")){
                        b7.setText("O");
                        turn[0] = 0;
                        l1.setText("Turn: X");
                        b7.setForeground(java.awt.Color.blue);
                        b7.setBorder(blue);
                        l1.setBorder(red);
                        l1.setForeground(java.awt.Color.red);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }
            }
        });
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if(turn[0] == 0){
                    if(!b8.getText().equals("X") && !b8.getText().equals("O")){
                        b8.setText("X");
                        turn[0] = 1;
                        l1.setText("Turn: O");
                        b8.setForeground(java.awt.Color.red);
                        b8.setBorder(red);
                        l1.setBorder(blue);
                        l1.setForeground(java.awt.Color.blue);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }else{
                    if(!b8.getText().equals("X") && !b8.getText().equals("O")){
                        b8.setText("O");
                        turn[0] = 0;
                        l1.setText("Turn: X");
                        b8.setForeground(java.awt.Color.blue);
                        b8.setBorder(blue);
                        l1.setBorder(red);
                        l1.setForeground(java.awt.Color.red);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }
            }
        });
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if(turn[0] == 0){
                    if(!b9.getText().equals("X") && !b9.getText().equals("O")){
                        b9.setText("X");
                        turn[0] = 1;
                        l1.setText("Turn: O");
                        b9.setForeground(java.awt.Color.red);
                        b9.setBorder(red);
                        l1.setBorder(blue);
                        l1.setForeground(java.awt.Color.blue);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }else{
                    if(!b9.getText().equals("X") && !b9.getText().equals("O")){
                        b9.setText("O");
                        turn[0] = 0;
                        l1.setText("Turn: X");
                        b9.setForeground(java.awt.Color.blue);
                        b9.setBorder(blue);
                        l1.setBorder(red);
                        l1.setForeground(java.awt.Color.red);
                        if(checkWinner().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: X");
                            afterWin();
                            scorex++;
                        }else if(checkWinner().equals("O")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: O");
                            afterWin();
                            scoreo++;
                        }else if(checkWinner().equals("DRAW")){
                            javax.swing.JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(),"Winner: Draw");
                            afterWin();
                        }
                    }
                }
            }
        });
        frame.revalidate();
        frame.repaint();
    }

    public static String checkWinner(){
        String line = "";
        for(int i=0; i<9; i++){
            switch(i){
                case 0:
                    line = b1.getText() + b2.getText() + b3.getText();
                    break;
                case 1:
                    line = b4.getText() + b5.getText() + b6.getText();
                    break;
                case 2:
                    line = b7.getText() + b8.getText() + b9.getText();
                    break;
                case 3:
                    line = b1.getText() + b4.getText() + b7.getText();
                    break;
                case 4:
                    line = b2.getText() + b5.getText() + b8.getText();
                    break;
                case 5:
                    line = b3.getText() + b6.getText() + b9.getText();
                    break;
                case 6:
                    line = b1.getText() + b5.getText() + b9.getText();
                    break;
                case 7:
                    line = b3.getText() + b5.getText() + b7.getText();
                    break;
            }
            if(line.equals("XXX")) return "X";
            else if(line.equals("OOO")) return "O";
        }
        int counter = 0;
        String[] board = new String[] {b1.getText(), b2.getText(), b3.getText(), b4.getText(), b5.getText(), b6.getText(), b7.getText(), b8.getText(), b9.getText()};
        for(int i=0; i<9; i++){
            if(board[i].equals(String.valueOf(i+1))) counter++;
        }
        return counter > 0 ? "NONE" : "DRAW"; 
    }

    public static void afterWin(){
                            if(checkWinner().equals("X")){
                                l1.setText("Turn: X");
                                l1.setForeground(java.awt.Color.red);
                                l1.setBorder(red);
                                turn[0] = 0;
                            }else if(checkWinner().equals("O")){
                                l1.setText("Turn: O");
                                turn[0] = 1;
                                l1.setForeground(java.awt.Color.blue);
                                l1.setBorder(blue);   
                            }else{
                                if(turn[0] == 0){
                                    l1.setText("Turn: X");
                                    l1.setForeground(java.awt.Color.red);
                                    l1.setBorder(red);
                                    turn[0] = 0;
                                }else{
                                    l1.setText("Turn: O");
                                    turn[0] = 1;
                                    l1.setForeground(java.awt.Color.blue);
                                    l1.setBorder(blue);
                                }
                            }
                            b1.setText("1");
                            b2.setText("2");
                            b3.setText("3");
                            b4.setText("4");
                            b5.setText("5");
                            b6.setText("6");
                            b7.setText("7");
                            b8.setText("8");
                            b9.setText("9");
                            b1.setBorder(black);
                            b2.setBorder(black);
                            b3.setBorder(black);
                            b4.setBorder(black);
                            b5.setBorder(black);
                            b6.setBorder(black);
                            b7.setBorder(black);
                            b8.setBorder(black);
                            b9.setBorder(black);
                            b1.setForeground(java.awt.Color.black);
                            b2.setForeground(java.awt.Color.black);
                            b3.setForeground(java.awt.Color.black);
                            b4.setForeground(java.awt.Color.black);
                            b5.setForeground(java.awt.Color.black);
                            b6.setForeground(java.awt.Color.black);
                            b7.setForeground(java.awt.Color.black);
                            b8.setForeground(java.awt.Color.black);
                            b9.setForeground(java.awt.Color.black);
    }

}

class runtimeThread implements Runnable {
    Thread t;
    public runtimeThread() {
        t = new Thread(this, "Thread");
        t.start();
    }
    public void run() {
        while(true){
            try{
                Thread.sleep(100);
            }catch(InterruptedException ie){
                System.out.println(ie.getMessage());
            }
            GUI gui = new GUI();
            gui.l2.setText("Score X: " + String.valueOf(gui.scorex));
            gui.l3.setText("Score O: " + String.valueOf(gui.scoreo));
            gui.frame.revalidate();
            gui.frame.repaint();
        }
    }
}
