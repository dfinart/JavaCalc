package calculator;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


final class CalculatorView extends javax.swing.JFrame {

    
    public CalculatorView() {
        initComponents();
        setVisible(true);
        setFocusable(true);
    }

    
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        resultScrollPane = new javax.swing.JScrollPane();
        resultField = new javax.swing.JTextField();
        operationField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();
        signButton = new javax.swing.JButton();
        divButton = new javax.swing.JButton();
        mulButton = new javax.swing.JButton();
        subButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();
        num1Button = new javax.swing.JButton();
        num2Button = new javax.swing.JButton();
        num3Button = new javax.swing.JButton();
        num4Button = new javax.swing.JButton();
        num5Button = new javax.swing.JButton();
        num6Button = new javax.swing.JButton();
        num7Button = new javax.swing.JButton();
        num8Button = new javax.swing.JButton();
        num9Button = new javax.swing.JButton();
        num0Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocationByPlatform(true);
        setResizable(false);

        resultScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resultScrollPane.setFocusable(false);

        resultField.setEditable(false);
        resultField.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        resultField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resultField.setText("1234567890,123");
        resultField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        resultField.setFocusable(false);
        resultScrollPane.setViewportView(resultField);

        operationField.setEditable(false);
        operationField.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        operationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        operationField.setText("+");
        operationField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        operationField.setFocusable(false);

        resetButton.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 0, 0));
        resetButton.setText("AC");
        resetButton.setFocusable(false);

        cleanButton.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        cleanButton.setForeground(new java.awt.Color(255, 161, 0));
        cleanButton.setText("CE");
        cleanButton.setFocusable(false);

        signButton.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        signButton.setForeground(new java.awt.Color(255, 161, 0));
        signButton.setText("+/-");
        signButton.setFocusable(false);

        divButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        divButton.setForeground(new java.awt.Color(255, 161, 0));
        divButton.setText("÷");
        divButton.setFocusable(false);

        mulButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        mulButton.setForeground(new java.awt.Color(255, 161, 0));
        mulButton.setText("×");
        mulButton.setFocusable(false);

        subButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        subButton.setForeground(new java.awt.Color(255, 161, 0));
        subButton.setText("-");
        subButton.setFocusable(false);

        addButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 161, 0));
        addButton.setText("+");
        addButton.setFocusable(false);

        equalButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        equalButton.setForeground(new java.awt.Color(255, 0, 0));
        equalButton.setText("=");
        equalButton.setFocusable(false);

        dotButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        dotButton.setText(".");
        dotButton.setFocusable(false);

        num1Button.setText("1");
        num1Button.setFocusable(false);

        num2Button.setText("2");
        num2Button.setFocusable(false);

        num3Button.setText("3");
        num3Button.setFocusable(false);

        num4Button.setText("4");
        num4Button.setFocusable(false);

        num5Button.setText("5");
        num5Button.setFocusable(false);

        num6Button.setText("6");
        num6Button.setFocusable(false);

        num7Button.setText("7");
        num7Button.setFocusable(false);

        num8Button.setText("8");
        num8Button.setFocusable(false);

        num9Button.setText("9");
        num9Button.setFocusable(false);

        num0Button.setText("0");
        num0Button.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(num2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(num0Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(resultScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(operationField))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(num4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(num5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(num7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(num8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(num9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(signButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mulButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(num6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(subButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultScrollPane)
                    .addComponent(operationField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mulButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }

    
    public JButton getAddButton() {
        return addButton;
    }

    
    public JButton getResetButton() {
        return resetButton;
    }

    
    public JButton getCleanButton() {
        return cleanButton;
    }

    
    public JTextField getResultField() {
        return resultField;
    }

    
    public JScrollPane getResultScrollPane() {
        return resultScrollPane;
    }

   
    public JButton getDivButton() {
        return divButton;
    }

    
    public JButton getDotButton() {
        return dotButton;
    }

    
    public JButton getEqualButton() {
        return equalButton;
    }

    
    public JButton getMulButton() {
        return mulButton;
    }

    
    public JButton getNum0Button() {
        return num0Button;
    }

   
    public JButton getNum1Button() {
        return num1Button;
    }

    
    public JButton getNum2Button() {
        return num2Button;
    }

    
    public JButton getNum3Button() {
        return num3Button;
    }

    
    public JButton getNum4Button() {
        return num4Button;
    }

   
    public JButton getNum5Button() {
        return num5Button;
    }

    
    public JButton getNum6Button() {
        return num6Button;
    }

    
    public JButton getNum7Button() {
        return num7Button;
    }

    
    public JButton getNum8Button() {
        return num8Button;
    }

    
    public JButton getNum9Button() {
        return num9Button;
    }

    
    public JTextField getOperationField() {
        return operationField;
    }

    
    public JButton getSignButton() {
        return signButton;
    }

    
    public JButton getSubButton() {
        return subButton;
    }

    
    private javax.swing.JButton addButton;
    private javax.swing.JButton cleanButton;
    private javax.swing.JButton divButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton mulButton;
    private javax.swing.JButton num0Button;
    private javax.swing.JButton num1Button;
    private javax.swing.JButton num2Button;
    private javax.swing.JButton num3Button;
    private javax.swing.JButton num4Button;
    private javax.swing.JButton num5Button;
    private javax.swing.JButton num6Button;
    private javax.swing.JButton num7Button;
    private javax.swing.JButton num8Button;
    private javax.swing.JButton num9Button;
    private javax.swing.JTextField operationField;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField resultField;
    private javax.swing.JScrollPane resultScrollPane;
    private javax.swing.JButton signButton;
    private javax.swing.JButton subButton;
    
}