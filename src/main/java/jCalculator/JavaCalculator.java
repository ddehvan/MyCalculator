/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author Davoud
 */
public class JavaCalculator extends javax.swing.JFrame {

    /**
     * Creates new form JavaCalculator
     */
    public JavaCalculator() {
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

        txtDisplay = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnSix = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnMul = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnClearEntry = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBackSpace = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        txtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisplay.setText("0");
        txtDisplay.setToolTipText("");
        txtDisplay.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 0, 0), null, null)));
        txtDisplay.setFocusable(false);

        btnSix.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSix.setText("6");
        btnSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnSix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnZero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnZero.setText("0");
        btnZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnZero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnFive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFive.setText("5");
        btnFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnFive.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnFour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFour.setText("4");
        btnFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnFour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnNine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNine.setText("9");
        btnNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnNine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnTwo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTwo.setText("2");
        btnTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnTwo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnPoint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPoint.setText(".");
        btnPoint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnPoint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnThree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThree.setText("3");
        btnThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnThree.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnEight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEight.setText("8");
        btnEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnEight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnOne.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOne.setText("1");
        btnOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnOne.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnSeven.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSeven.setText("7");
        btnSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnSeven.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnMul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMul.setText("*");
        btnMul.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnMul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDiv.setText("÷");
        btnDiv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnDiv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnMin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMin.setText("-");
        btnMin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPlus.setText("+");
        btnPlus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnPlus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEqual.setText("=");
        btnEqual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnEqual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnClearEntry.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClearEntry.setText("CE");
        btnClearEntry.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnClearEntry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("C");
        btnClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnClear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        btnBackSpace.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBackSpace.setText("◄");
        btnBackSpace.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btnBackSpace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnClearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnClearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDisplay)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    float firstNum,secondNum,result;
    String operator = "";
    boolean firstDigit = true ;
    int lastKey = 0;
    
    private void btnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsActionPerformed
        inputText(evt);
    }//GEN-LAST:event_btnsActionPerformed

    private void btnsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_btnsKeyPressed
 
    public void inputText(java.awt.event.ActionEvent evt){
        javax.swing.JButton btn = (javax.swing.JButton) evt.getSource();
        if (btn == btnBackSpace){
            if(!firstDigit){
                txtDisplay.setText(txtDisplay.getText().substring(0, txtDisplay.getText().length()-1));
                if (txtDisplay.getText().equals("")){
                    txtDisplay.setText("0");
                    firstDigit=true;
                }   
            }

            return;
        }
        String btnText = btn.getText();
        switch(btnText){
            case "C" -> {
                firstNum = 0;
                secondNum = 0;
                txtDisplay.setText("0");
                firstDigit = true;
                return;
            }
            case "CE" -> {
                txtDisplay.setText("0");
                firstDigit = true;
                return;
            }
            case "+" , "-", "*" , "÷" -> {
                //if (!operatorPressed){
                    if (!operator.equals("")){
                        ActionEvent e = new ActionEvent(btnEqual,16,"");
                        inputText(e);
                    }
                    firstNum = Float.parseFloat(txtDisplay.getText());
                    secondNum = 0;
                    operator = btnText;
                    firstDigit = true;
                //}
                return;
            }
            case "=" -> {
                secondNum = Float.parseFloat(txtDisplay.getText());
                switch (operator){
                    case "+" ->{
                        result = firstNum + secondNum;
                        break;
                    }
                    case "-" ->{
                        result = firstNum - secondNum;
                        break;
                    }
                    case "*" ->{
                        result = firstNum * secondNum;
                        break;
                    }
                    case "÷" ->{
                        result = firstNum / secondNum;
                        break;
                    }
                }
                if (result == (int)result)
                    txtDisplay.setText(String.valueOf((int)result));
                else
                    txtDisplay.setText(String.valueOf(result));
                firstNum = 0;
                secondNum = 0;
                firstDigit = true;
                operator = "";
                return;
            }
            case "." -> {
                if (firstDigit)  txtDisplay.setText("0");
                    if (txtDisplay.getText().contains(".")) return;
                    else txtDisplay.setText(txtDisplay.getText() + btnText);
                    firstDigit=false;
                    return;
                } 
            //default -> {}
        }       
        if (firstDigit){
            if (btnText.equals("0")) return;
                    txtDisplay.setText(btnText);
        }
        else{
            if(txtDisplay.getText().length()==14) return;
            txtDisplay.setText(txtDisplay.getText() + btnText);
        }
        firstDigit = false;
    }
    public void keyPressed(java.awt.event.KeyEvent evt){
        ActionEvent e;
        switch(evt.getKeyCode()){
            case KeyEvent.VK_0,KeyEvent.VK_NUMPAD0 ->{
                e = new ActionEvent(btnZero,0,"");
                break;
            }
            case KeyEvent.VK_1,KeyEvent.VK_NUMPAD1 ->{
                e = new ActionEvent(btnOne,1,"");
                break;
            }
            case KeyEvent.VK_2,KeyEvent.VK_NUMPAD2 ->{
                e = new ActionEvent(btnTwo,2,"");
                break;
            }
            case KeyEvent.VK_3,KeyEvent.VK_NUMPAD3 ->{
                e = new ActionEvent(btnThree,3,"");
                break;
            }
            case KeyEvent.VK_4,KeyEvent.VK_NUMPAD4 ->{
                e = new ActionEvent(btnFour,4,"");
                break;
            }
            case KeyEvent.VK_5,KeyEvent.VK_NUMPAD5 ->{
                e = new ActionEvent(btnFive,5,"");
                break;
            }
            case KeyEvent.VK_6,KeyEvent.VK_NUMPAD6 ->{
                e = new ActionEvent(btnSix,6,"");
                break;
            }
            case KeyEvent.VK_7,KeyEvent.VK_NUMPAD7 ->{
                e = new ActionEvent(btnSeven,7,"");
                break;
            }
            case KeyEvent.VK_8,KeyEvent.VK_NUMPAD8 ->{
                e = new ActionEvent(btnEight,8,"");
                break;
            }
            case KeyEvent.VK_9,KeyEvent.VK_NUMPAD9 ->{
                e = new ActionEvent(btnNine,9,"");
                break;
            }
            case KeyEvent.VK_BACK_SPACE ->{
                e = new ActionEvent(btnBackSpace,10,"");
                break;
            }
            case KeyEvent.VK_PLUS, KeyEvent.VK_ADD ->{
                e = new ActionEvent(btnPlus,11,"");
                break;
            }
            case KeyEvent.VK_MINUS, KeyEvent.VK_SUBTRACT ->{
                e = new ActionEvent(btnMin,12,"");
                break;
            }
            case KeyEvent.VK_MULTIPLY ->{
                e = new ActionEvent(btnMul,13,"");
                break;
            }
            case KeyEvent.VK_DIVIDE ->{
                e = new ActionEvent(btnDiv,14,"");
                break;
            }
            case KeyEvent.VK_ESCAPE ->{
                if (lastKey == KeyEvent.VK_ESCAPE)
                    e = new ActionEvent(btnClear,18,"");
                else
                    e = new ActionEvent(btnClearEntry,15,"");
                break;
                
            }
            case KeyEvent.VK_ENTER ->{
                e = new ActionEvent(btnEqual,16,"");
                break;
            }
            case KeyEvent.VK_DECIMAL ->{
                e = new ActionEvent(btnPoint,17,"");
                break;
            }
            default ->{
                e = null;
            }
        }
        lastKey = evt.getKeyCode();
        if (e != null) inputText(e);
    }
            
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
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new JavaCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackSpace;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearEntry;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
