

import java.awt.Color;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



public class CadastroAlunosVIEW extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    
    
    public CadastroAlunosVIEW() {
        initComponents();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTurma = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        cadastroBtn = new javax.swing.JButton();
        btnFoto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BarraSuperior = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(604, 520));
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(40, 40, 40));
        bg.setForeground(new java.awt.Color(30, 30, 30));
        bg.setMaximumSize(new java.awt.Dimension(604, 520));
        bg.setMinimumSize(new java.awt.Dimension(604, 520));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Lt", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 165, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("CADASTRO");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 211, -1));

        txtTurma.setBackground(new java.awt.Color(54, 54, 54));
        txtTurma.setFont(new java.awt.Font("Roboto Lt", 1, 12)); // NOI18N
        txtTurma.setForeground(new java.awt.Color(204, 204, 204));
        txtTurma.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTurma.setText("O nome da sua turma");
        txtTurma.setToolTipText("");
        txtTurma.setBorder(null);
        txtTurma.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTurmaMousePressed(evt);
            }
        });
        bg.add(txtTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 211, 40));

        txtName.setBackground(new java.awt.Color(54, 54, 54));
        txtName.setFont(new java.awt.Font("Roboto Lt", 1, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(204, 204, 204));
        txtName.setText("Escreva seu nome completo.");
        txtName.setBorder(null);
        txtName.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtName.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtNameAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNameMousePressed(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        bg.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 211, 40));

        txtMatricula.setBackground(new java.awt.Color(54, 54, 54));
        txtMatricula.setFont(new java.awt.Font("Roboto Lt", 1, 12)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(204, 204, 204));
        txtMatricula.setText("O seu número da matricula");
        txtMatricula.setBorder(null);
        txtMatricula.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMatriculaMousePressed(evt);
            }
        });
        bg.add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 211, 40));

        cadastroBtn.setBackground(new java.awt.Color(255, 165, 0));
        cadastroBtn.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        cadastroBtn.setForeground(new java.awt.Color(255, 255, 255));
        cadastroBtn.setText("CADASTRAR");
        cadastroBtn.setBorder(null);
        cadastroBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastroBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cadastroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroBtnMouseClicked(evt);
            }
        });
        bg.add(cadastroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 154, 40));

        btnFoto.setBackground(new java.awt.Color(54, 54, 54));
        btnFoto.setFont(new java.awt.Font("Roboto Lt", 1, 14)); // NOI18N
        btnFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnFoto.setText("Escolher foto");
        btnFoto.setBorder(null);
        btnFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFoto.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFotoMouseClicked(evt);
            }
        });
        bg.add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 211, 40));

        jLabel2.setFont(new java.awt.Font("Roboto Lt", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Lt", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Turma:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Lt", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Matricula:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Indie Flower", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("}");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 40, -1));

        jLabel7.setFont(new java.awt.Font("Indie Flower", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("public class Welcome{");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, -1));

        jLabel8.setFont(new java.awt.Font("Indie Flower", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("public static void main(String[] args) {");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 320, 30));

        jLabel9.setFont(new java.awt.Font("Indie Flower", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("System.out.println(\"Seja bem-vindo!\");");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 300, -1));

        jLabel10.setFont(new java.awt.Font("Indie Flower", 2, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("}");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 40, -1));

        BarraSuperior.setBackground(new java.awt.Color(40, 40, 40));
        BarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraSuperiorMouseDragged(evt);
            }
        });
        BarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraSuperiorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BarraSuperiorLayout = new javax.swing.GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        BarraSuperiorLayout.setVerticalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 560, 40));

        exitBtn.setBackground(new java.awt.Color(40, 40, 40));

        exitTxt.setFont(new java.awt.Font("Roboto Cn", 1, 24)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(255, 165, 0));
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtNameAncestorAdded
        // TODO add your handling code here
    }//GEN-LAST:event_txtNameAncestorAdded

    private void BarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraSuperiorMousePressed

    private void BarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraSuperiorMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(new Color(255,165,0));
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(new Color(40, 40, 40));
    }//GEN-LAST:event_exitTxtMouseExited

    private void btnFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseClicked
       

    }//GEN-LAST:event_btnFotoMouseClicked

    private void txtNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMousePressed
        if (txtName.getText().equals("Escreva seu nome completo.")){
            
        txtName.setText("");
        txtName.setForeground(Color.white);
        }
        if (txtMatricula.getText().isEmpty()){
        txtMatricula.setText("O seu número da matricula");
        txtMatricula.setForeground(new Color(204,204,204));
        }
        if (txtTurma.getText().isEmpty()){
        txtTurma.setText("O nome da sua turma");
        txtTurma.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_txtNameMousePressed

    private void txtMatriculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatriculaMousePressed
        if (txtMatricula.getText().equals("O seu número da matricula")){
        txtMatricula.setText("");
        txtMatricula.setForeground(Color.white);
        }
        if (txtName.getText().isEmpty()){
        txtName.setText("Escreva seu nome completo.");
        txtName.setForeground(new Color(204,204,204));
        }
        if (txtTurma.getText().isEmpty()){
        txtTurma.setText("O nome da sua turma");
        txtTurma.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtMatriculaMousePressed

    private void txtTurmaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTurmaMousePressed
        if (txtTurma.getText().equals("O nome da sua turma")){
        txtTurma.setText("");
        txtTurma.setForeground(Color.white);
        }
        if (txtName.getText().isEmpty()){
        txtName.setText("Escreva seu nome completo.");
        txtName.setForeground(new Color(204,204,204));
        }
        if (txtMatricula.getText().isEmpty()){
        txtMatricula.setText("O seu número da matricula");
        txtMatricula.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtTurmaMousePressed

    private void cadastroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroBtnMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "tentativa de login com dados:\nName: " + txtName.getText() + "\nMatricula: " + txtMatricula.getText() + "\nTurma: " + txtTurma.getText()+ javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cadastroBtnMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAlunosVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton cadastroBtn;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTurma;
    // End of variables declaration//GEN-END:variables

}
