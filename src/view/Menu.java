package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.border.AbstractBorder;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        estilizarTelaMenu();
        setResizable(false);

    }

    private void estilizarTelaMenu() {

        setLocationRelativeTo(null);

        java.awt.Color corFundoMenu = new java.awt.Color(30, 30, 30);
        java.awt.Color corCardMenu = new java.awt.Color(45, 45, 45);
        java.awt.Color corTextoMenu = new java.awt.Color(240, 240, 240);
        java.awt.Color corBtnMenu = new java.awt.Color(58, 12, 163);

        jPanel2.setBackground(corFundoMenu);

        jPanel3.setBackground(corCardMenu);
//jPanel4.setBackground(corCardMenu);

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

//Titulo
        veiBtn.setForeground(corTextoMenu);
        cadBtn.setForeground(corTextoMenu);
        upCadbtn.setForeground(corTextoMenu);
        clienteBtn.setForeground(corTextoMenu);
        sairBtn.setForeground(corTextoMenu);

        veiBtn.setBackground(corBtnMenu);
        cadBtn.setBackground(corBtnMenu);
        upCadbtn.setBackground(corBtnMenu);
        clienteBtn.setBackground(corBtnMenu);
        sairBtn.setBackground(corBtnMenu);


//veiculo
        veiBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                veiBtn.setBackground(corBtnMenu.darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                veiBtn.setBackground(corBtnMenu);
            }
        });

//cadastro
        cadBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadBtn.setBackground(corBtnMenu.darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadBtn.setBackground(corBtnMenu);
            }
        });

//atualizar cadastro
        upCadbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upCadbtn.setBackground(corBtnMenu.darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                upCadbtn.setBackground(corBtnMenu);
            }
        });

//cliente
        clienteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clienteBtn.setBackground(corBtnMenu.darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                clienteBtn.setBackground(corBtnMenu);
            }
        });

//sair
        sairBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sairBtn.setBackground(corBtnMenu.darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                sairBtn.setBackground(corBtnMenu);
            }
        });

    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        veiBtn = new javax.swing.JButton();
        cadBtn = new javax.swing.JButton();
        upCadbtn = new javax.swing.JButton();
        clienteBtn = new javax.swing.JButton();
        sairBtn = new javax.swing.JButton();

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
        setTitle("Menu");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(720, 360)); //DEFINE O TAMANHO DO BLOCO INTERIOR

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24));
        jLabel1.setForeground(Color.white);
        jLabel1.setText("Menu");
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        veiBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14));
        veiBtn.setText("Veículos");
        veiBtn.setToolTipText("Veículos");
        veiBtn.setFocusable(false);
        veiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiBtnActionPerformed(evt);
            }
        });

        cadBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14));
        cadBtn.setText("Cadastrar Cliente");
        cadBtn.setToolTipText("Cadastrar cliente");
        cadBtn.setFocusable(false);
        cadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadBtnActionPerformed(evt);
            }
        });

        upCadbtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14));
        upCadbtn.setText("Atualizar Cadastro");
        upCadbtn.setToolTipText("Atualizar cadastro");
        upCadbtn.setFocusable(false);
        upCadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upCadbtnActionPerformed(evt);
            }
        });

        clienteBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14));
        clienteBtn.setText("Cliente");
        clienteBtn.setToolTipText("Cliente");
        clienteBtn.setFocusable(false);
        clienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteBtnActionPerformed(evt);
            }
        });

        sairBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14));
        sairBtn.setText("Sair");
        sairBtn.setFocusable(false);
        sairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);

        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(230, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(upCadbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                        .addComponent(cadBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clienteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(veiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(230, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
        );

        // VERTICAL
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(clienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(upCadbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(veiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(sairBtn)
                                .addGap(20, 20, 20))
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

    private void veiBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Veiculo v = new Veiculo();
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_veiBtnActionPerformed

    private void cadBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Cadastrar_Cliente cc = new Cadastrar_Cliente();
        cc.setVisible(true);
        dispose();
    }

    private void upCadbtnActionPerformed(java.awt.event.ActionEvent evt) {

        Listar_Up_Cad luc = new Listar_Up_Cad();
        luc.setVisible(true);
        dispose();

    }

    private void clienteBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Cliente c = new Cliente();
        c.setVisible(true);
        dispose();
    }

    private void sairBtnActionPerformed(java.awt.event.ActionEvent evt) {
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        dispose();
    }

    /**
     * @param args
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    private javax.swing.JButton cadBtn;
    private javax.swing.JButton clienteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton sairBtn;
    private javax.swing.JButton upCadbtn;
    private javax.swing.JButton veiBtn;
}
