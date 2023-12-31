/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Domeng
 */
public class Calculator extends javax.swing.JFrame {

    double num1,num2,res;
    
    String op;
    /**
     * Creates new form Calculator
     */
    public Calculator() {
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

        textF = new javax.swing.JTextField();
        buttonMultiply = new javax.swing.JButton();
        buttonBackSpace = new javax.swing.JButton();
        buttonDivide = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        buttonSubtract = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        buttonEquals = new javax.swing.JButton();
        buttonDot = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(300, 450));
        setMinimumSize(new java.awt.Dimension(300, 450));
        setPreferredSize(new java.awt.Dimension(300, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textF.setBackground(new java.awt.Color(255, 255, 255));
        textF.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        textF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(textF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, -1));

        buttonMultiply.setBackground(new java.awt.Color(153, 153, 153));
        buttonMultiply.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonMultiply.setText("x");
        buttonMultiply.setBorder(null);
        buttonMultiply.setPreferredSize(new java.awt.Dimension(60, 60));
        buttonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        buttonBackSpace.setBackground(new java.awt.Color(153, 153, 153));
        buttonBackSpace.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonBackSpace.setText("←");
        buttonBackSpace.setBorder(null);
        buttonBackSpace.setPreferredSize(new java.awt.Dimension(120, 60));
        buttonBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackSpaceActionPerformed(evt);
            }
        });
        getContentPane().add(buttonBackSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        buttonDivide.setBackground(new java.awt.Color(153, 153, 153));
        buttonDivide.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonDivide.setText("÷");
        buttonDivide.setToolTipText("");
        buttonDivide.setBorder(null);
        buttonDivide.setPreferredSize(new java.awt.Dimension(60, 60));
        buttonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivideActionPerformed(evt);
            }
        });
        getContentPane().add(buttonDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        buttonClear.setBackground(new java.awt.Color(153, 153, 153));
        buttonClear.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonClear.setText("C");
        buttonClear.setBorder(null);
        buttonClear.setPreferredSize(new java.awt.Dimension(60, 60));
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        getContentPane().add(buttonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        button6.setBackground(new java.awt.Color(153, 153, 153));
        button6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button6.setText("6");
        button6.setBorder(null);
        button6.setPreferredSize(new java.awt.Dimension(60, 60));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        getContentPane().add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        buttonSubtract.setBackground(new java.awt.Color(153, 153, 153));
        buttonSubtract.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonSubtract.setText("-");
        buttonSubtract.setBorder(null);
        buttonSubtract.setPreferredSize(new java.awt.Dimension(60, 60));
        buttonSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubtractActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        button5.setBackground(new java.awt.Color(153, 153, 153));
        button5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button5.setText("5");
        button5.setBorder(null);
        button5.setPreferredSize(new java.awt.Dimension(60, 60));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        getContentPane().add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        button4.setBackground(new java.awt.Color(153, 153, 153));
        button4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button4.setText("4");
        button4.setBorder(null);
        button4.setPreferredSize(new java.awt.Dimension(60, 60));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        getContentPane().add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        button3.setBackground(new java.awt.Color(153, 153, 153));
        button3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button3.setText("3");
        button3.setBorder(null);
        button3.setPreferredSize(new java.awt.Dimension(60, 60));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        buttonAdd.setBackground(new java.awt.Color(153, 153, 153));
        buttonAdd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonAdd.setText("+");
        buttonAdd.setBorder(null);
        buttonAdd.setPreferredSize(new java.awt.Dimension(60, 60));
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        button2.setBackground(new java.awt.Color(153, 153, 153));
        button2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button2.setText("2");
        button2.setBorder(null);
        button2.setPreferredSize(new java.awt.Dimension(60, 60));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        button1.setBackground(new java.awt.Color(153, 153, 153));
        button1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button1.setText("1");
        button1.setBorder(null);
        button1.setPreferredSize(new java.awt.Dimension(60, 60));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        buttonEquals.setBackground(new java.awt.Color(153, 153, 153));
        buttonEquals.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        buttonEquals.setText("=");
        buttonEquals.setBorder(null);
        buttonEquals.setPreferredSize(new java.awt.Dimension(120, 60));
        buttonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqualsActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        buttonDot.setBackground(new java.awt.Color(153, 153, 153));
        buttonDot.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonDot.setText(".");
        buttonDot.setBorder(null);
        buttonDot.setPreferredSize(new java.awt.Dimension(60, 60));
        buttonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDotActionPerformed(evt);
            }
        });
        getContentPane().add(buttonDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        button0.setBackground(new java.awt.Color(153, 153, 153));
        button0.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button0.setText("0");
        button0.setBorder(null);
        button0.setPreferredSize(new java.awt.Dimension(60, 60));
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });
        getContentPane().add(button0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        button7.setBackground(new java.awt.Color(153, 153, 153));
        button7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button7.setText("9");
        button7.setBorder(null);
        button7.setPreferredSize(new java.awt.Dimension(60, 60));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        getContentPane().add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        button8.setBackground(new java.awt.Color(153, 153, 153));
        button8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button8.setText("8");
        button8.setBorder(null);
        button8.setPreferredSize(new java.awt.Dimension(60, 60));
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        getContentPane().add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        button9.setBackground(new java.awt.Color(153, 153, 153));
        button9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button9.setText("7");
        button9.setBorder(null);
        button9.setPreferredSize(new java.awt.Dimension(60, 60));
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        getContentPane().add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
           textF.setText(textF.getText() + button0.getText());
    }//GEN-LAST:event_button0ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
           textF.setText(textF.getText() + button1.getText());
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
           textF.setText(textF.getText() + button2.getText());
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
            textF.setText(textF.getText() + button3.getText());
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
           textF.setText(textF.getText() + button4.getText());
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        textF.setText(textF.getText() + button5.getText());
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        textF.setText(textF.getText() + button6.getText());
    }//GEN-LAST:event_button6ActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        textF.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        textF.setText(textF.getText() + button7.getText());
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        textF.setText(textF.getText() + button8.getText());
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        textF.setText(textF.getText() + button9.getText());
    }//GEN-LAST:event_button9ActionPerformed

    private void buttonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDotActionPerformed
        textF.setText(textF.getText() + buttonDot.getText());
    }//GEN-LAST:event_buttonDotActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        num1 = Double.parseDouble(textF.getText());
        textF.setText("");
        op = "+";
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqualsActionPerformed
        num2 = Double.parseDouble(textF.getText());
        
        if(op == "+"){
            res = Double.parseDouble(textF.getText());
            res = num1+num2;
            textF.setText(Double.toString(res));
            op = "";
        }
        else if(op == "-"){
            res = Double.parseDouble(textF.getText());
            res = num1-num2;
            textF.setText(Double.toString(res));
            op = "";
        }
         else if(op == "*"){
            res = Double.parseDouble(textF.getText());
            res = num1*num2;
            textF.setText(Double.toString(res));
            op = "";
        }
         else if(op == "/"){
            res = Double.parseDouble(textF.getText());
            res = num1-num2;
            textF.setText(Double.toString(res));
            op = "";
        }
    }//GEN-LAST:event_buttonEqualsActionPerformed

    private void buttonSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubtractActionPerformed
        num1= Double.parseDouble(textF.getText());
        textF.setText("");
        op="-";
    }//GEN-LAST:event_buttonSubtractActionPerformed

    private void buttonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultiplyActionPerformed
        num1 = Double.parseDouble(textF.getText());
        textF.setText("");
        op="*";
    }//GEN-LAST:event_buttonMultiplyActionPerformed

    private void buttonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivideActionPerformed
        num1 = Double.parseDouble(textF.getText());
        textF.setText("");
        op="/";
    }//GEN-LAST:event_buttonDivideActionPerformed

    private void buttonBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackSpaceActionPerformed
        String currentText = textF.getText();
        currentText = currentText.substring(0,currentText.length()-1);
        textF.setText(currentText);
        
    }//GEN-LAST:event_buttonBackSpaceActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonBackSpace;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDivide;
    private javax.swing.JButton buttonDot;
    private javax.swing.JButton buttonEquals;
    private javax.swing.JButton buttonMultiply;
    private javax.swing.JButton buttonSubtract;
    private javax.swing.JTextField textF;
    // End of variables declaration//GEN-END:variables
}
