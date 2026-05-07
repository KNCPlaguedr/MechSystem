package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import model.ClienteDAO;
import model.Clienteinfo;

public class Cadastrar_Cliente extends javax.swing.JFrame {

    public Cadastrar_Cliente() {
        initComponents();

        estilizarTelaCadastrarCliente();
        setResizable(false);

        cepTxt.setDocument(new NumericDocument());
        numTxt.setDocument(new NumericDocument());
        cpfTxt.setDocument(new NumericDocument());
        telTxt.setDocument(new NumericDocument());

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

        estCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });

        estCb.addKeyListener(new java.awt.event.KeyAdapter() {
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

    }

    private class NumericDocument extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            if (str == null) {
                return;
            }
            if (str.matches("[0-9().-]+")) {
                super.insertString(offs, str, a);
            }
        }
    }

    public void estilizarTelaCadastrarCliente() {

        setLocationRelativeTo(null);

        Color corFundo = new Color(30, 30, 30);
        Color corCard = new Color(45, 45, 45);
        Color corInput = new Color(60, 60, 60);
        Color corTexto = new Color(240, 240, 240);
        Color corBtn = new Color(58, 12, 163);

        jPanel2.setBackground(corFundo);
        jPanel3.setBackground(corCard);

        JTextField[] txts = {nomeTxt, sobrenomeTxt, cepTxt, ruaTxt, numTxt, cityTxt, cpfTxt, telTxt};
        for (JTextField txt : txts) {
            txt.setBackground(corInput);
            txt.setForeground(corTexto);
            txt.setCaretColor(corTexto);
            txt.setBorder(BorderFactory.createLineBorder(corBtn, 1));
        }

        JComboBox[] combos = {estCb};
        for (JComboBox combo : combos) {
            combo.setBackground(corInput);
            combo.setForeground(corTexto);
            combo.setBorder(BorderFactory.createLineBorder(corBtn, 1));

            Object child = combo.getAccessibleContext().getAccessibleChild(0);
            if (child instanceof javax.swing.plaf.basic.BasicComboPopup) {
                ((javax.swing.plaf.basic.BasicComboPopup) child).getList().setBackground(corInput);
                ((javax.swing.plaf.basic.BasicComboPopup) child).getList().setForeground(corTexto);

            }
        }

        javax.swing.JLabel[] labels = {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10};
        for (javax.swing.JLabel lbl : labels) {
            lbl.setForeground(corTexto);
        }

        JButton[] btns = {voltarBtn, cadBtn};
        for (JButton btn : btns) {
            btn.setBackground(corBtn);
            btn.setForeground(Color.WHITE);
            btn.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));
            btn.setFocusPainted(false);
        }

        voltarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                voltarBtn.setBackground(corBtn.darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                voltarBtn.setBackground(corBtn);
            }
        });

        cadBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadBtn.setBackground(corBtn.darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadBtn.setBackground(corBtn);
            }
        });

        jPanel3.setBorder(new AbstractBorder() {

            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int shadowSize = 10;
                float opacity = 0.4f;

                for (int i = 0; i < shadowSize; i++) {
                    float alpha = opacity * ((float) (i + 1) / shadowSize);
                    g2.setColor(new Color(0, 0, 0, alpha));

                    g2.drawRoundRect(
                            x + i,
                            y + i,
                            width - (i * 2) - 1,
                            height - (i * 2) - 1,
                            50, 50
                    );
                }
                g2.dispose();
            }

            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(5, 5, 10, 10);
            }

        });

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
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
        estCb = new javax.swing.JComboBox<>();
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
        setTitle("Cadastrar cliente");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(720, 360));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24));
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

        numTxt.setToolTipText("Número");
        numTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTxtActionPerformed(evt);
            }
        });
        numTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numTxtKeyReleased(evt);
            }
        });

        jLabel6.setText("N°");

        jLabel7.setText("Estado");
        estCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        estCb.setToolTipText("Estado");

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

        cadBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14));
        cadBtn.setText("Cadastrar");
        cadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        
      
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    
                    
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    
                   
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(sobrenomeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
                    
                    
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(ruaTxt)) 
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    
                    
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(estCb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cityTxt))) 
                            
                   
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(telTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                )
                .addGap(40, 40, 40))
        );

       
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                
              
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarBtn)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                
                
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
               
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sobrenomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                
                
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
             
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                
                
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                
                
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                
                .addContainerGap(40, Short.MAX_VALUE))
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
    }

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }

    private void cadBtnActionPerformed(java.awt.event.ActionEvent evt) {

        Clienteinfo c = new Clienteinfo();
        try {
            if (validarFormato()) {
                if (validar(c)) {
                    ClienteDAO.cadastrar(c);
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
                    dispose();
                    Menu m = new Menu();
                    m.setVisible(true);
                } else {

                }
            } else {

            }
        } catch (Exception e) {

        }

    }

    private void cpfTxtActionPerformed(java.awt.event.ActionEvent evt) {
        formatCPF();

    }

    private void cpfTxtKeyPressed(java.awt.event.KeyEvent evt) {
        formatCPF();

    }

    private void cepTxtKeyPressed(java.awt.event.KeyEvent evt) {
        formatCEP();
    }

    private void telTxtKeyPressed(java.awt.event.KeyEvent evt) {
        autoCompletePhoneNumber();
    }

    private void numTxtKeyReleased(java.awt.event.KeyEvent evt) {
        formatNumero();
    }

    private void numTxtActionPerformed(java.awt.event.ActionEvent evt) {
        formatNumero();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar_Cliente().setVisible(true);
            }
        });
    }

    public boolean validarFormato() {

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

            c.setEstado(estCb.getSelectedItem().toString());

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
            text = text.substring(0, 10);
        }

        if (text.matches("\\d{10}")) {
            telTxt.setText("(" + text.substring(0, 2) + ")" + text.substring(2, 7) + "-" + text.substring(7));
        } else if (text.matches("\\d{7,8}")) {
            telTxt.setText("(" + text.substring(0, 2) + ")" + text.substring(2, 6) + "-" + text.substring(6));
        } else {

        }
    }

    private javax.swing.JButton cadBtn;
    private javax.swing.JTextField cepTxt;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JComboBox<String> estCb;
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
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField numTxt;
    private javax.swing.JTextField ruaTxt;
    private javax.swing.JTextField sobrenomeTxt;
    private javax.swing.JTextField telTxt;
    private javax.swing.JButton voltarBtn;

}