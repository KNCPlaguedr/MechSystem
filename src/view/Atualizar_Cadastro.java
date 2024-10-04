
package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import model.ClienteDAO;
import model.Clienteinfo;
import model.Idcpfcliente;
import view.Menu;

public class Atualizar_Cadastro extends javax.swing.JFrame {

    Clienteinfo ci = new Clienteinfo();
    
    private String cpf;
    
    
   public Atualizar_Cadastro(String CPF,String cpf) {
    ci = ClienteDAO.buscarPorCPF(CPF); // Este método buscarPorCPF já deve existir na sua classe ClienteDAO
        
    this.cpf = cpf;
    
    System.out.println("cpf antigo é " + cpf);
     
    initComponents();
    
     
    
     cepTxt.setDocument(new Atualizar_Cadastro.NumericDocument());
        numTxt.setDocument(new Atualizar_Cadastro.NumericDocument());
        cpfTxt.setDocument(new Atualizar_Cadastro.NumericDocument());
        telTxt.setDocument(new Atualizar_Cadastro.NumericDocument());
        
        
        nomeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
         
         nomeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
         
         sobrenomeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
         
         sobrenomeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
         
         cepTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
         
         cepTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
         
         ruaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
         
         ruaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
         
         numTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
         
         numTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
         
         estaCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
         
         estaCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
         
         cityTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
         
         cityTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
         
         cpfTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
         
         cpfTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
         
         telTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
         
         telTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
         
         insert();
    
}
    private Atualizar_Cadastro(){
        
    }
    
     private class NumericDocument extends PlainDocument {
        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            if (str == null) {
                return;
            }
            // Verifica se o texto contém apenas números, parênteses ou caracteres especiais permitidos
            if (str.matches("[0-9().-]+")) {
                super.insertString(offs, str, a); // Insere apenas se contiver números, parênteses ou caracteres especiais
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sobrenomeTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cepTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ruaTxt = new javax.swing.JTextField();
        numTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        estaCb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        telTxt = new javax.swing.JTextField();
        cadBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atualizar cadastro");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro Cliente");

        voltarBtn.setText("Voltar");
        voltarBtn.setToolTipText("Voltar ao menu");
        voltarBtn.setFocusable(false);
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        nomeTxt.setToolTipText("Nome");

        jLabel3.setText("Sobrenome");

        sobrenomeTxt.setToolTipText("Sobrenome");

        jLabel4.setText("CEP");

        cepTxt.setToolTipText("CEP");
        cepTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cepTxtKeyPressed(evt);
            }
        });

        jLabel5.setText("Rua");

        ruaTxt.setToolTipText("Rua");

        numTxt.setToolTipText("Número da casa");
        numTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTxtActionPerformed(evt);
            }
        });

        jLabel6.setText("N°");

        jLabel7.setText("Estado");

        estaCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        estaCb.setToolTipText("Estado");

        jLabel8.setText("Cidade");

        cityTxt.setToolTipText("Cidade");

        jLabel9.setText("CPF");

        cpfTxt.setToolTipText("CPF");
        cpfTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTxtActionPerformed(evt);
            }
        });
        cpfTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpfTxtKeyPressed(evt);
            }
        });

        jLabel10.setText("Telefone");

        telTxt.setToolTipText("Telefone");
        telTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telTxtKeyPressed(evt);
            }
        });

        cadBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        cadBtn.setText("Atualizar");
        cadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(140, 140, 140)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sobrenomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(ruaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(telTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(cadBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(voltarBtn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sobrenomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ruaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadBtn)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
      Listar_Up_Cad luc = new Listar_Up_Cad();
      luc.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void cadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadBtnActionPerformed
  Clienteinfo c = new Clienteinfo();
  Idcpfcliente id = new Idcpfcliente();
  
  id.setCpf(cpf);
        
          
try {
    if(validarFormato()){ 
        if(validar(c)){
            ClienteDAO.atualizar(c,cpf);
            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");
            dispose();
            Listar_Up_Cad luc = new Listar_Up_Cad();
            luc.setVisible(true);
        }
        else {
            
        }
    } else {
       
    }
} catch(Exception e) {
   
}         
    }//GEN-LAST:event_cadBtnActionPerformed

    private void cepTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepTxtKeyPressed
       formatCEP();
    }//GEN-LAST:event_cepTxtKeyPressed

    private void cpfTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTxtActionPerformed
        formatCPF();
    }//GEN-LAST:event_cpfTxtActionPerformed

    private void cpfTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfTxtKeyPressed
        formatCPF();
    }//GEN-LAST:event_cpfTxtKeyPressed

    private void telTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telTxtKeyPressed
       autoCompletePhoneNumber();
    }//GEN-LAST:event_telTxtKeyPressed

    private void numTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTxtActionPerformed
        formatNumero();
    }//GEN-LAST:event_numTxtActionPerformed

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
            java.util.logging.Logger.getLogger(Atualizar_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atualizar_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atualizar_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atualizar_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atualizar_Cadastro().setVisible(true);
            }
        });
    }
    
     private boolean insert(){
    
    Atualizar_Cadastro a = new Atualizar_Cadastro();
    
    nomeTxt.setText(ci.getNome());
    sobrenomeTxt.setText(ci.getSobrenome());
    cepTxt.setText(ci.getCep());
    ruaTxt.setText(ci.getRua());
    numTxt.setText(ci.getNumero());
    estaCb.setSelectedItem(ci.getEstado());
    cityTxt.setText(ci.getCidade());
    cpfTxt.setText(ci.getCpf());
    telTxt.setText(ci.getTelefone());
    return true;
    
    }
    
    
    public boolean validarFormato(){
     
        try {
            String CPF = cpfTxt.getText();
            String Numero = numTxt.getText();
            String CEP = cepTxt.getText();
            String Telefone = telTxt.getText();

            if (Clienteinfo.isValidCPF(CPF)) {
                if (Clienteinfo.isValidCEP(CEP)) {
                    if (Clienteinfo.isValidTelefone(Telefone)) {
                        if (Clienteinfo.isValidNumero(Numero)) {

                        } else {
                            JOptionPane.showMessageDialog(null, "Insira um número válido");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Insira um telefone válido");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Insira um CEP válido");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Insira um CPF válido");
            }

            return true;

        } catch (Exception e) {

        }
        return false;

    }

    public boolean validar(Clienteinfo c) {

        try {

            if (nomeTxt.getText().isBlank() || nomeTxt.getText().isEmpty() || nomeTxt.getText().length() > 50) {

                JOptionPane.showMessageDialog(null, "Insira o nome ");
                return false;
            } else {
                c.setNome(nomeTxt.getText());
            }

            if (sobrenomeTxt.getText().isBlank() || sobrenomeTxt.getText().isEmpty() || sobrenomeTxt.getText().length() > 100) {
                JOptionPane.showMessageDialog(null, "Insira o sobrenome");
                return false;
            } else {
                c.setSobrenome(sobrenomeTxt.getText());
            }

            if (cepTxt.getText().isBlank() || cepTxt.getText().isEmpty() || cepTxt.getText().length() > 9) {
            JOptionPane.showMessageDialog(null, "Insira o CEP");
            return false;
            } else {
            c.setCep(cepTxt.getText());
            }

            if (ruaTxt.getText().isBlank() || ruaTxt.getText().isEmpty() || ruaTxt.getText().length() > 70) {
            JOptionPane.showMessageDialog(null, "Insira a rua/logradouro");
            return false;
            } else {
            c.setRua(ruaTxt.getText());
            }

            if (numTxt.getText().isBlank() || numTxt.getText().isEmpty() || numTxt.getText().length() > 6) {
            JOptionPane.showMessageDialog(null, "Insira o número da residência");
            return false;
            } else {
            c.setNumero(numTxt.getText());
            }

            c.setEstado(estaCb.getSelectedItem().toString());

            if (cityTxt.getText().isBlank() || cityTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Insira a cidade ");
                return false;
            } else {
                c.setCidade(cityTxt.getText());
            }

            if (cpfTxt.getText().isBlank() || cpfTxt.getText().isEmpty() || cpfTxt.getText().length() > 14) {
                JOptionPane.showMessageDialog(null, "Insira o CPF");
                return false;
            } else {
                c.setCpf(cpfTxt.getText());
            }

            if (telTxt.getText().isBlank() || telTxt.getText().isEmpty() || telTxt.getText().length() > 14) {
                JOptionPane.showMessageDialog(null, "Insira o ");
                return false;
            } else {
                c.setTelefone(telTxt.getText());
            }

            
            
            return true;

        } catch (Exception e) {

        }
        return false;
    }

    private void formatNumero() {
        String Numero = numTxt.getText();

        if (Numero.length() > 5) {
            Numero = Numero.substring(0, 5);
        }
        numTxt.setText(Numero);
    }

    private void formatCPF() {
        String text = cpfTxt.getText().replaceAll("[^0-9]", "");

        if (text.length() > 10) {
            text = text.substring(0, 10);
        }

        if (text.length() > 3) {
            text = text.substring(0, 3) + "." + text.substring(3);
        }
        if (text.length() > 7) {
            text = text.substring(0, 7) + "." + text.substring(7);
        }
        if (text.length() > 11) {
            text = text.substring(0, 11) + "-" + text.substring(11);
        }
        cpfTxt.setText(text);
    }

    private void formatCEP() {
        String text = cepTxt.getText().replaceAll("[^0-9]", "");

        if (text.length() > 7) {
            text = text.substring(0, 7);
        }

        if (text.length() > 5) {
            text = text.substring(0, 5) + "-" + text.substring(5);
        }

        cepTxt.setText(text);
    }

    private void autoCompletePhoneNumber() {
        String text = telTxt.getText().replaceAll("[^0-9]", "");

        if (text.length() > 10) {
            text = text.substring(0, 10); // Limita o texto a 10 dígitos
        }

        if (text.matches("\\d{10}")) {
            telTxt.setText("(" + text.substring(0, 2) + ")" + text.substring(2, 7) + "-" + text.substring(7));
        } else if (text.matches("\\d{7,8}")) {
            telTxt.setText("(" + text.substring(0, 2) + ")" + text.substring(2, 6) + "-" + text.substring(6));
        } else {
            
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadBtn;
    private javax.swing.JTextField cepTxt;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JComboBox<String> estaCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField numTxt;
    private javax.swing.JTextField ruaTxt;
    private javax.swing.JTextField sobrenomeTxt;
    private javax.swing.JTextField telTxt;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
