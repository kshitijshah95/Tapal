
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kshitij
 */
public class mngTapal extends javax.swing.JFrame {

    /**
     * Creates new form mngTapal
     */
    public mngTapal() {
        this.getContentPane().setBackground(Color.decode("#0099FF"));
        this.setUndecorated(false);
        this.setResizable(false);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtiName = new javax.swing.JTextField();
        btn_en = new javax.swing.JButton();
        btn_strt = new javax.swing.JButton();
        btn_stp = new javax.swing.JButton();
        btn_dis = new javax.swing.JButton();
        btn_des = new javax.swing.JButton();
        btn_ex = new javax.swing.JButton();
        btn_bk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(5, 0, 0));
        jLabel3.setText("Manage Instances");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("Enter Instance Name:");
        jLabel2.setName(""); // NOI18N

        TxtiName.setBackground(new java.awt.Color(254, 253, 251));
        TxtiName.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        TxtiName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 149, 0)));

        btn_en.setBackground(new java.awt.Color(237, 195, 105));
        btn_en.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        btn_en.setForeground(new java.awt.Color(1, 1, 1));
        btn_en.setText("Enable");
        btn_en.setFocusable(false);
        btn_en.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enActionPerformed(evt);
            }
        });

        btn_strt.setBackground(new java.awt.Color(237, 195, 105));
        btn_strt.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        btn_strt.setForeground(new java.awt.Color(1, 1, 1));
        btn_strt.setText("Start");
        btn_strt.setFocusable(false);
        btn_strt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_strtActionPerformed(evt);
            }
        });

        btn_stp.setBackground(new java.awt.Color(237, 195, 105));
        btn_stp.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        btn_stp.setForeground(new java.awt.Color(1, 1, 1));
        btn_stp.setText("Stop");
        btn_stp.setFocusable(false);
        btn_stp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stpActionPerformed(evt);
            }
        });

        btn_dis.setBackground(new java.awt.Color(237, 195, 105));
        btn_dis.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        btn_dis.setForeground(new java.awt.Color(1, 1, 1));
        btn_dis.setText("Disable");
        btn_dis.setFocusable(false);
        btn_dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_disActionPerformed(evt);
            }
        });

        btn_des.setBackground(new java.awt.Color(237, 195, 105));
        btn_des.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        btn_des.setForeground(new java.awt.Color(1, 1, 1));
        btn_des.setText("Destroy");
        btn_des.setFocusable(false);
        btn_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desActionPerformed(evt);
            }
        });

        btn_ex.setBackground(new java.awt.Color(205, 81, 51));
        btn_ex.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        btn_ex.setForeground(new java.awt.Color(1, 1, 1));
        btn_ex.setText("Exit");
        btn_ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exActionPerformed(evt);
            }
        });

        btn_bk.setBackground(new java.awt.Color(205, 81, 51));
        btn_bk.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        btn_bk.setForeground(new java.awt.Color(1, 1, 1));
        btn_bk.setText("Back to Main Menu");
        btn_bk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TxtiName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btn_en, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_strt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_stp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btn_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_des, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btn_bk, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtiName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dis)
                    .addComponent(btn_des)
                    .addComponent(btn_stp)
                    .addComponent(btn_strt)
                    .addComponent(btn_en))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ex))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enActionPerformed

        String instname=TxtiName.getText();

        String cmd="postmulti -i postfix-";
        String cmd2=" -e enable";

        cmd=cmd.concat(instname);
        cmd=cmd.concat(cmd2);

        //EXECUTING BASH COMMAND Enable AN INSTANCE
        try
        {
            Process p5=Runtime.getRuntime().exec(cmd);
            p5.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(p5.getInputStream()));
            String line=reader.readLine();
            while(line!=null)
            {
                System.out.println(line);
                line=reader.readLine();
            }

        }
        catch(IOException | InterruptedException e1) {}

        System.out.println("Instance Enabled.");

    }//GEN-LAST:event_btn_enActionPerformed

    private void btn_strtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_strtActionPerformed

        String instname=TxtiName.getText();

        String cmd="postmulti -i postfix-";
        String cmd2=" -p start";

        cmd=cmd.concat(instname);
        cmd=cmd.concat(cmd2);

        //EXECUTING BASH COMMAND TO START AN INSTANCE
        try
        {
            Process p5=Runtime.getRuntime().exec(cmd);
            p5.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(p5.getInputStream()));
            String line=reader.readLine();
            while(line!=null)
            {
                System.out.println(line);
                line=reader.readLine();
            }

        }
        catch(IOException | InterruptedException e1) {}

        System.out.println("Instance Started.");

    }//GEN-LAST:event_btn_strtActionPerformed

    private void btn_stpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stpActionPerformed

        // TODO add your handling code here:
        String instname=TxtiName.getText();

        String cmd="postmulti -i postfix-";
        String cmd2=" -p stop";

        cmd=cmd.concat(instname);
        cmd=cmd.concat(cmd2);

        //EXECUTING BASH COMMAND TO STOP AN INSTANCE
        try
        {
            Process p5=Runtime.getRuntime().exec(cmd);
            p5.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(p5.getInputStream()));
            String line=reader.readLine();
            while(line!=null)
            {
                System.out.println(line);
                line=reader.readLine();
            }

        }
        catch(IOException | InterruptedException e1) {}

        System.out.println("Instance Stopped.");

    }//GEN-LAST:event_btn_stpActionPerformed

    private void btn_disActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_disActionPerformed
        // TODO add your handling code here:

        String instname=TxtiName.getText();

        String cmd="postmulti -i postfix-";
        String cmd2=" -e disable";

        cmd=cmd.concat(instname);
        cmd=cmd.concat(cmd2);

        //EXECUTING BASH COMMAND TO Disabe AN INSTANCE
        try
        {
            Process p5=Runtime.getRuntime().exec(cmd);
            p5.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(p5.getInputStream()));
            String line=reader.readLine();
            while(line!=null)
            {
                System.out.println(line);
                line=reader.readLine();
            }

        }
        catch(IOException | InterruptedException e1) {}

        System.out.println("Instance Disabled.");

    }//GEN-LAST:event_btn_disActionPerformed

    private void btn_desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desActionPerformed

        // TODO add your handling code here:

        String instname=TxtiName.getText();

        // STOP

        String cmdstop="postmulti -i postfix-";
        String cmdstop2=" -p stop";

        cmdstop=cmdstop.concat(instname);
        cmdstop=cmdstop.concat(cmdstop2);

        //EXECUTING BASH COMMAND TO STOP AN INSTANCE
        try
        {
            Process p5=Runtime.getRuntime().exec(cmdstop);
            p5.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(p5.getInputStream()));
            String line=reader.readLine();
            while(line!=null)
            {
                System.out.println(line);
                line=reader.readLine();
            }

        }
        catch(IOException | InterruptedException e1) {}

        System.out.println("Instance Destroyed.");

        //DISABLE

        String cmd="postmulti -i postfix-";
        String cmd2=" -e disable";

        cmd=cmd.concat(instname);
        cmd=cmd.concat(cmd2);

        //EXECUTING BASH COMMAND TO Disabe AN INSTANCE
        try
        {
            Process p5=Runtime.getRuntime().exec(cmd);
            p5.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(p5.getInputStream()));
            String line=reader.readLine();
            while(line!=null)
            {
                System.out.println(line);
                line=reader.readLine();
            }

        }
        catch(IOException | InterruptedException e1) {}

        System.out.println("");

        //Destroy
        String cmddestroy="postmulti -i postfix-";
        String cmddestroy2=" -e destroy";

        cmddestroy=cmddestroy.concat(instname);
        cmddestroy=cmddestroy.concat(cmddestroy2);

        try
        {
            Process p5=Runtime.getRuntime().exec(cmddestroy);
            p5.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(p5.getInputStream()));
            String line=reader.readLine();
            while(line!=null)
            {
                System.out.println(line);
                line=reader.readLine();
            }

        }
        catch(IOException | InterruptedException e1) {}

        System.out.println("");
    }//GEN-LAST:event_btn_desActionPerformed

    private void btn_exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exActionPerformed
        System.exit(2);
    }//GEN-LAST:event_btn_exActionPerformed

    private void btn_bkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bkActionPerformed
        mainTapal a=new mainTapal();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_btn_bkActionPerformed

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
            java.util.logging.Logger.getLogger(mngTapal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mngTapal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mngTapal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mngTapal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mngTapal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtiName;
    private javax.swing.JButton btn_bk;
    private javax.swing.JButton btn_des;
    private javax.swing.JButton btn_dis;
    private javax.swing.JButton btn_en;
    private javax.swing.JButton btn_ex;
    private javax.swing.JButton btn_stp;
    private javax.swing.JButton btn_strt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}