
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Adon Banker
 */
public class tictac extends javax.swing.JFrame {

    int turn = 2;
    int buttonused[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int pXwon[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int pOwon[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    int pXwon() {
        if (pXwon[0] == 1 && pXwon[1] == 1 && pXwon[2] == 1) {
            return 1;
        }
        if (pXwon[3] == 1 && pXwon[4] == 1 && pXwon[5] == 1) {
            return 1;
        }
        if (pXwon[6] == 1 && pXwon[7] == 1 && pXwon[8] == 1) {
            return 1;
        }
        if (pXwon[0] == 1 && pXwon[3] == 1 && pXwon[6] == 1) {
            return 1;
        }
        if (pXwon[1] == 1 && pXwon[4] == 1 && pXwon[7] == 1) {
            return 1;
        }
        if (pXwon[2] == 1 && pXwon[5] == 1 && pXwon[8] == 1) {
            return 1;
        }
        if (pXwon[2] == 1 && pXwon[4] == 1 && pXwon[6] == 1) {
            return 1;
        }
        if (pXwon[0] == 1 && pXwon[1] == 1 && pXwon[2] == 1) {
            return 1;
        }
        if (pXwon[0] == 1 && pXwon[4] == 1 && pXwon[8] == 1) {
            return 1;
        }

        return 0;
    }

    int pOwon() {
        if (pOwon[0] == 1 && pOwon[1] == 1 && pOwon[2] == 1) {
            return 1;
        }
        if (pOwon[3] == 1 && pOwon[4] == 1 && pOwon[5] == 1) {
            return 1;
        }
        if (pOwon[6] == 1 && pOwon[7] == 1 && pOwon[8] == 1) {
            return 1;
        }
        if (pOwon[0] == 1 && pOwon[3] == 1 && pOwon[6] == 1) {
            return 1;
        }
        if (pOwon[1] == 1 && pOwon[4] == 1 && pOwon[7] == 1) {
            return 1;
        }
        if (pOwon[2] == 1 && pOwon[5] == 1 && pOwon[8] == 1) {
            return 1;
        }
        if (pOwon[2] == 1 && pOwon[4] == 1 && pOwon[6] == 1) {
            return 1;
        }
        if (pOwon[0] == 1 && pOwon[1] == 1 && pOwon[2] == 1) {
            return 1;
        }
        if (pOwon[0] == 1 && pOwon[4] == 1 && pOwon[8] == 1) {
            return 1;
        }

        return 0;
    }

    public tictac() {
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

        jButton2 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        jLabel1.setText("TICTACTOE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
       if (buttonused[8]== 0) {

            if (turn % 2 == 0) {
                turn++;
              b8.setText("X");
                buttonused[8]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            } else {
                turn++;
                b8.setText("O");
                buttonused[8]= 1;
                pOwon[8]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED !!!!!");
        }   
        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed

        if (buttonused[0] == 0) {

            if (turn % 2 == 0) {
                turn++;
                b0.setText("X");
                buttonused[0] = 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            } else {
                turn++;
                b0.setText("O");
                buttonused[0] = 1;
                pOwon[0] = 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED !!!!!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_b0ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
      
        if (buttonused[1]== 0) {

            if (turn % 2 == 0) {
                turn++;
                b1.setText("X");
                buttonused[1]=1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            } else {
                turn++;
                b1.setText("O");
                buttonused[1]= 1;
                pOwon[1]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED !!!!!");
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

        if (buttonused[2]== 0) {

            if (turn % 2 == 0) {
                turn++;
              b2.setText("X");
                buttonused[2]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            } else {
                turn++;
                b2.setText("O");
                buttonused[2]= 1;
                pOwon[2]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED !!!!!");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
       if (buttonused[7]== 0) {

            if (turn % 2 == 0) {
                turn++;
              b7.setText("X");
                buttonused[7]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            } else {
                turn++;
                b7.setText("O");
                buttonused[7]= 1;
                pOwon[7]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED !!!!!");
        }           // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
       if (buttonused[3]== 0) {

            if (turn % 2 == 0) {
                turn++;
              b3.setText("X");
                buttonused[3]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            } else {
                turn++;
                b3.setText("O");
                buttonused[3]= 1;
                pOwon[3]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED !!!!!");
        }           
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
       if (buttonused[4]== 0) {

            if (turn % 2 == 0) {
                turn++;
              b4.setText("X");
                buttonused[4]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            } else {
                turn++;
                b4.setText("O");
                buttonused[4]= 1;
                pOwon[4]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED !!!!!");
        }           // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       if (buttonused[5]== 0) {

            if (turn % 2 == 0) {
                turn++;
              b5.setText("X");
                buttonused[5]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            } else {
                turn++;
                b5.setText("O");
                buttonused[5]= 1;
                pOwon[5]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED !!!!!");
        }           // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
       if (buttonused[6]== 0) {

            if (turn % 2 == 0) {
                turn++;
              b6.setText("X");
                buttonused[6]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            } else {
                turn++;
                b6.setText("O");
                buttonused[6]= 1;
                pOwon[6]= 1;
                int result1 = pXwon();
                int result2 = pOwon();

                if (result1 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player x won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(rootPane, "player o won");
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED !!!!!");
        }           // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

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
            java.util.logging.Logger.getLogger(tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictac().setVisible(true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
