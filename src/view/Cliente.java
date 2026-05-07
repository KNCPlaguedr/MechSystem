package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.AbstractBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import model.ClienteDAO;
import model.ClienteInfoNovoVeiculo;

public class Cliente extends javax.swing.JFrame {

    private final Color COR_FUNDO = new Color(30, 30, 30);
    private final Color COR_CARD = new Color(45, 45, 45);
    private final Color COR_TEXTO = new Color(240, 240, 240);
    private final Color COR_BTN = new Color(58, 12, 163);
    private final Color COR_CAMPO_BG = new Color(60, 60, 60);
    private final Color COR_BORDA = new Color(80, 80, 80);

    public Cliente() {
        initComponents();
        estilizarTelaCliente();
        configurarEventos();
    }

    private void configurarEventos() {
        cpfTxt.setDocument(new NumericDocument());

        java.awt.event.KeyAdapter escapeListener = new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    voltarBtnActionPerformed(null);
                }
            }
        };

        nomeTxt.addKeyListener(escapeListener);
        sobrenomeTxt.addKeyListener(escapeListener);

        cpfTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    voltarBtnActionPerformed(null);
                }
                formatCPF();
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

    private void configurarCampo(JTextField campo) {
        campo.setBackground(COR_CAMPO_BG);
        campo.setForeground(COR_TEXTO);
        campo.setCaretColor(COR_TEXTO);
        campo.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(COR_BORDA, 1),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    }

    private void configurarBotao(JButton btn) {
        btn.setBackground(COR_BTN);
        btn.setForeground(Color.WHITE);
        btn.setFocusable(false);

        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn.setBackground(COR_BTN.darker());
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn.setBackground(COR_BTN);
            }
        });
    }

    private void estilizarTelaCliente() {
        setLocationRelativeTo(null);
        jPanel2.setBackground(COR_FUNDO);
        jPanel3.setBackground(COR_CARD);

        configurarBotao(voltarBtn);
        configurarBotao(nvBtn);
        configurarBotao(rdefBnt);

        configurarCampo(nomeTxt);
        configurarCampo(sobrenomeTxt);
        configurarCampo(cpfTxt);


         jPanel3.setBorder(new AbstractBorder() {

            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int shadowSize = 10;
                float opacity = 0.4f; //opacidade

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


       voltarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                voltarBtn.setBackground(COR_BTN.darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                voltarBtn.setBackground(COR_BTN);
            }
        });

         nvBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nvBtn.setBackground(COR_BTN.darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                nvBtn.setBackground(COR_BTN);
            }
        });

         rdefBnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rdefBnt.setBackground(COR_BTN.darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                rdefBnt.setBackground(COR_BTN);
            }
        });

    }

    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sobrenomeTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JTextField();
        rdefBnt = new javax.swing.JButton();
        nvBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24));
        jLabel1.setText("Cliente");
        jLabel1.setForeground(COR_TEXTO);

        jLabel2.setText("Nome");
        jLabel2.setForeground(COR_TEXTO);

        jLabel3.setText("Sobrenome");
        jLabel3.setForeground(COR_TEXTO);

        jLabel4.setText("CPF");
        jLabel4.setForeground(COR_TEXTO);

        nomeTxt.setToolTipText("Nome");
        sobrenomeTxt.setToolTipText("Sobrenome");
        cpfTxt.setToolTipText("CPF");

        rdefBnt.setText("Registrar Defeito");
        rdefBnt.addActionListener(evt -> rdefBntActionPerformed(evt));

        nvBtn.setText("Novo Veículo");
        nvBtn.addActionListener(evt -> nvBtnActionPerformed(evt));

        voltarBtn.setText("Voltar");
        voltarBtn.addActionListener(evt -> voltarBtnActionPerformed(evt));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);

        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30) // Margem esquerda interna
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addGap(10, 10, 10))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(nomeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)) // Flexível
                                                .addGap(20, 20, 20) // Espaço entre os campos
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(sobrenomeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))) // Flexível

                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)) // Tamanho fixo igual à metade
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(nvBtn)
                                                .addGap(10, 10, 10)
                                                .addComponent(rdefBnt)))
                                .addGap(30, 30, 30))
        );

        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
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
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rdefBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
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

        try {
           
            Menu m = new Menu();
            m.setVisible(true);
            dispose();
            System.out.println("");
        } catch (Exception e) {
        }
    }

    private void nvBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String nome = nomeTxt.getText();
        String sobrenome = sobrenomeTxt.getText();
        String cpf = cpfTxt.getText();

        ClienteInfoNovoVeiculo c = new ClienteInfoNovoVeiculo();
        c.setNome(nome);
        c.setSobrenome(sobrenome);
        c.setCpf(cpf);

        try {
            if (ClienteDAO.adicionar(c)) {
                Novo_Veiculo nv = new Novo_Veiculo(cpf);
                nv.setVisible(true);
                dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void rdefBntActionPerformed(java.awt.event.ActionEvent evt) {
        String nome = nomeTxt.getText();
        String sobrenome = sobrenomeTxt.getText();
        String cpf = cpfTxt.getText();

        ClienteInfoNovoVeiculo c = new ClienteInfoNovoVeiculo();
        c.setNome(nome);
        c.setSobrenome(sobrenome);
        c.setCpf(cpf);

        try {
            if (ClienteDAO.adicionar(c)) {
                Registrar_Defeito rd = new Registrar_Defeito();
                rd.setVisible(true);
                dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Cliente().setVisible(true);
        });
    }

    // Variáveis
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField sobrenomeTxt;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JButton nvBtn;
    private javax.swing.JButton rdefBnt;
    private javax.swing.JButton voltarBtn;
}
