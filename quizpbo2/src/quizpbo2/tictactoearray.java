package quizpbo2;

import javax.swing.JOptionPane;
import java.util.Random;


public class tictactoearray extends javax.swing.JFrame {
    
    
    int turn = 2;
    int buttonused[] = {0,0,0,0,0,0,0,0,0};
    int pXwon[] = {0,0,0,0,0,0,0,0,0};
    int pOwon[] = {0,0,0,0,0,0,0,0,0};
    
    void penuh(){
        if(turn == 12){
            JOptionPane.showMessageDialog(rootPane, "Silahkan Reset!!");
        }
    }
    
    void AutoInput(){
        Random r = new Random();
        int rand = 0;
        while(true){
            rand = r.nextInt(9);
            if(rand != 0) break;
        }
        if(rand == 0){
            if(buttonused[rand]==0){
                turn++;
                b0.setText("O");
                buttonused[0] = 1;
                pOwon[0] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
            }else{
                AutoInput();
            }
        }
        if (rand == 1){
            if(buttonused[rand]==0){
                turn++;
                b1.setText("O");
                buttonused[1] = 1;
                pOwon[1] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
            }else{
                AutoInput();
            }
        }
        if (rand == 2){
            if(buttonused[rand]==0){
                turn++;
                b2.setText("O");
                buttonused[2] = 1;
                pOwon[2] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
            }else{
                AutoInput();
            }
        }
        if (rand == 3){
            if(buttonused[rand] == 0){
                turn++;
                b3.setText("O");
                buttonused[3] = 1;
                pOwon[3] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
            }else{
                AutoInput();
            }    
        }
        if (rand == 4){
            if(buttonused[rand]==0){
                turn++;
                b4.setText("O");
                buttonused[4] = 1;
                pOwon[4] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
            }else{
                AutoInput();
            }
        }
        if (rand == 5){
            if(buttonused[rand] == 0){
                turn++;
                b5.setText("O");
                buttonused[5] = 1;
                pOwon[5] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
            }else{
                AutoInput();
            }
        }
        if (rand == 6){
            if(buttonused[rand] == 0){
                turn++;
                b6.setText("O");
                buttonused[6] = 1;
                pOwon[6] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
                
            }else{
                AutoInput();
            }
        }
        if (rand == 7){
            if(buttonused[rand] == 0){
                turn++;
                b7.setText("O");
                buttonused[7] = 1;
                pOwon[7] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }

            }else{
                AutoInput();
            }
        }
        if (rand == 8){
            if(buttonused[rand] == 0){
                turn++;
                b8.setText("O");
                buttonused[8] = 1;
                pOwon[8] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
            }else{
                AutoInput();
            }    
        }
    }
    int pXwon(){
        if (pXwon[0] == 1 && pXwon[1] == 1 && pXwon[2] == 1){
            return 1;
        }
        if (pXwon[3] == 1 && pXwon[4] == 1 && pXwon[5] == 1){
            return 1;
        }
        if (pXwon[6] == 1 && pXwon[7] == 1 && pXwon[8] == 1){
            return 1;
        }
        if (pXwon[0] == 1 && pXwon[3] == 1 && pXwon[6] == 1){
            return 1;
        }
        if (pXwon[1] == 1 && pXwon[4] == 1 && pXwon[7] == 1){
            return 1;
        }
        if (pXwon[2] == 1 && pXwon[5] == 1 && pXwon[8] == 1){
            return 1;
        }
        if (pXwon[2] == 1 && pXwon[4] == 1 && pXwon[6] == 1){
            return 1;
        }
        if (pXwon[0] == 1 && pXwon[4] == 1 && pXwon[8] == 1){
            return 1;
        }
        return 0;
    }
    int pOwon(){
        if (pOwon[0] == 1 && pOwon[1] == 1 && pOwon[2] == 1){
            return 1;
        }
        if (pOwon[3] == 1 && pOwon[4] == 1 && pOwon[5] == 1){
            return 1;
        }
        if (pOwon[6] == 1 && pOwon[7] == 1 && pOwon[8] == 1){
            return 1;
        }
        if (pOwon[0] == 1 && pOwon[3] == 1 && pOwon[6] == 1){
            return 1;
        }
        if (pOwon[1] == 1 && pOwon[4] == 1 && pOwon[7] == 1){
            return 1;
        }
        if (pOwon[2] == 1 && pOwon[5] == 1 && pOwon[8] == 1){
            return 1;
        }
        if (pOwon[2] == 1 && pOwon[4] == 1 && pOwon[6] == 1){
            return 1;
        }
        if (pOwon[0] == 1 && pOwon[4] == 1 && pOwon[8] == 1){
            return 1;
        }
        return 0;
    }
    void resetGame(){
        b0.setText("");
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        turn = 2;
        for(int i = 0; i < 9;i++){
            buttonused[i] = 0;
            pXwon[i] = 0;
            pOwon[i] = 0;
        }
    }
    
    public tictactoearray() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b0 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        tbReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tbPlayer = new javax.swing.JButton();
        tbComputer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b0.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        tbReset.setText("Reset");
        tbReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbResetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");

        tbPlayer.setText("Player");
        tbPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbPlayerActionPerformed(evt);
            }
        });

        tbComputer.setText("Computer");
        tbComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbComputerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbComputer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbReset, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addComponent(tbPlayer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbComputer)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbReset)
                        .addGap(40, 40, 40))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(buttonused[1]==0){
            if(turn%2==0){
                turn++;
                b1.setText("X");
                buttonused[1] = 1;
                pXwon[1] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
                else if(turn%2 != 0){
                    AutoInput();
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS Button is Already Used");
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if(buttonused[7]==0){
            if(turn%2==0){
                turn++;
                b7.setText("X");
                buttonused[7] = 1;
                pXwon[7] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
                else if(turn%2 != 0){
                    AutoInput();
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS Button is Already Used");
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void tbResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbResetActionPerformed
        resetGame();
    }//GEN-LAST:event_tbResetActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        if(buttonused[0]==0){
            if(turn%2==0){
                turn++;
                b0.setText("X");
                buttonused[0] = 1;
                pXwon[0] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
                else if(turn%2 != 0){
                    AutoInput();
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS Button is Already Used");
        }
    }//GEN-LAST:event_b0ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(buttonused[2]==0){
            if(turn%2==0){
                turn++;
                b2.setText("X");
                buttonused[2] = 1;
                pXwon[2] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
                else if(turn%2 != 0){
                    AutoInput();
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS Button is Already Used");
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(buttonused[3]==0){
            if(turn%2==0){
                turn++;
                b3.setText("X");
                buttonused[3] = 1;
                pXwon[3] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
                else if(turn%2 != 0){
                    AutoInput();
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS Button is Already Used");
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(buttonused[4]==0){
            if(turn%2==0){
                turn++;
                b4.setText("X");
                buttonused[4] = 1;
                pXwon[4] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
                else if(turn%2 != 0){
                    AutoInput();
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS Button is Already Used");
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(buttonused[5]==0){
            if(turn%2==0){
                turn++;
                b5.setText("X");
                buttonused[5] = 1;
                pXwon[5] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
                else if(turn%2 != 0){
                    AutoInput();
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS Button is Already Used");
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if(buttonused[6]==0){
            if(turn%2==0){
                turn++;
                b6.setText("X");
                buttonused[6] = 1;
                pXwon[6] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
                else if(turn%2 != 0){
                    AutoInput();
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS Button is Already Used");
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(buttonused[8]==0){
            if(turn%2==0){
                turn++;
                b8.setText("X");
                buttonused[8] = 1;
                pXwon[8] = 1;
                penuh();
                int resultX = pXwon();
                int resultO = pOwon();
                if(resultX == 1){
                    JOptionPane.showMessageDialog(rootPane, "Player Win!!!");
                    resetGame();
                }
                else if(resultO == 1){
                    JOptionPane.showMessageDialog(rootPane, "Computer Win!!!");
                    resetGame();
                }
                else if(turn%2 != 0){
                    AutoInput();
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS Button is Already Used");
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void tbPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbPlayerActionPerformed
        JOptionPane.showMessageDialog(rootPane,"Silahkan mengisi!!!");
    }//GEN-LAST:event_tbPlayerActionPerformed

    private void tbComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbComputerActionPerformed
        turn++;
        AutoInput();
    }//GEN-LAST:event_tbComputerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tictactoearray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoearray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoearray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoearray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoearray().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton tbComputer;
    private javax.swing.JButton tbPlayer;
    private javax.swing.JButton tbReset;
    // End of variables declaration//GEN-END:variables
}
