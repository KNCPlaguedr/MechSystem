package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import model.CarroDAO;
import model.Carrodef;
import model.Carroinfo;

public class Registrar_Defeito extends javax.swing.JFrame {

    public Registrar_Defeito() {

        initComponents();
        setResizable(false);
        estilizarTelaRegistrarDefeito();

        LocalDate dataAtualLocalDate = LocalDate.now();
        entradaTxt.setText(Carroinfo.converterParaJava(dataAtualLocalDate.toString()));

        placaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });

        placaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    voltarBtnActionPerformed(null);
                }
            }
        });

        descTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });

        descTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    voltarBtnActionPerformed(null);
                }
            }
        });

    }

    static class UpperCaseDocumentFilter extends DocumentFilter {

        @Override
        public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
            fb.insertString(offset, text.toUpperCase(), attr);
        }

        @Override
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            fb.replace(offset, length, text.toUpperCase(), attrs);
        }
    }

    private void estilizarTelaRegistrarDefeito() {
        setLocationRelativeTo(null);

        Color corFundo = new Color(30, 30, 30);
        Color corCard = new Color(45, 45, 45);
        Color corInput = new Color(60, 60, 60);
        Color corTexto = new Color(240, 240, 240);
        Color corBtn = new Color(58, 12, 163);

        jPanel2.setBackground(corFundo);
        jPanel3.setBackground(corCard);

        javax.swing.JLabel[] labels = {jLabel1, jLabel2, jLabel3, jLabel4};
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

        JTextField[] txts = {placaTxt, entradaTxt};
        for (JTextField txt : txts) {
            txt.setBackground(corInput);
            txt.setForeground(corTexto);
            txt.setCaretColor(corTexto);
            txt.setBorder(BorderFactory.createLineBorder(corBtn, 1));
        }

        JTextArea[] areas = {descTxt};
        for (JTextArea area : areas) {
            area.setBackground(corInput);
            area.setForeground(corTexto);
            area.setCaretColor(corTexto);
            area.setBorder(BorderFactory.createLineBorder(corBtn, 1));
            area.setLineWrap(true);
            area.setWrapStyleWord(true);
        }

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

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        jLabel1 = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        placaTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descTxt = new javax.swing.JTextArea();
        cadBtn = new javax.swing.JButton();
        entradaTxt = new javax.swing.JTextField();

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

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(720, 360));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24));
        jLabel1.setText("Registrar Problema");

        voltarBtn.setText("Voltar");
        voltarBtn.setFocusable(false);
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Placa");

        placaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                placaTxtKeyPressed(evt);
            }
        });

        jLabel3.setText("Data de entrada");

        jLabel4.setText("Descrição do defeito");

        descTxt.setColumns(20);
        descTxt.setRows(5);
        jScrollPane1.setViewportView(descTxt);

        cadBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14));
        cadBtn.setText("Cadastrar");
        cadBtn.setFocusable(false);
        cadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadBtnActionPerformed(evt);
            }
        });

        entradaTxt.setEditable(false);
        entradaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(120, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(voltarBtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2)
                                                                .addComponent(placaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(40, 40, 40)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3)
                                                                .addComponent(entradaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(120, Short.MAX_VALUE))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(placaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(entradaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
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
                        .addGroup(jPanel2Layout.createSequentialGroup()
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
        Cliente c = new Cliente();
        c.setVisible(true);
        dispose();
    }

    private void cadBtnActionPerformed(java.awt.event.ActionEvent evt) {

        Carrodef df = new Carrodef();

        try {

            if (validarFormato(placaTxt.getText())) {
                if (validar(df)) {
                    CarroDAO.defeito(df);
                    JOptionPane.showMessageDialog(null, "Defeito registrado com sucesso");
                    dispose();
                    Menu m = new Menu();
                    m.setVisible(true);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Insira a placa no formato válido");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registrar_Defeito.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void entradaTxtActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void placaTxtKeyPressed(java.awt.event.KeyEvent evt) {
        ((AbstractDocument) placaTxt.getDocument()).setDocumentFilter(new UpperCaseDocumentFilter());
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Registrar_Defeito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Defeito().setVisible(true);
            }
        });
    }

    public boolean validar(Carrodef df) {

        LocalDate dataAtualLocalDate = LocalDate.now();

        String Placa = placaTxt.getText();
        String Data = dataAtualLocalDate.toString();
        String Desc = descTxt.getText();
        String Status = "Não";

        try {

            if (Placa.isBlank() || Placa.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Insira a placa");
                return false;
            } else {
                df.setCarro_placa(Placa);
            }

            if (Data.isBlank() || Data.isEmpty()) {
                return false;
            } else {
                df.setEntrada(Data);
            }
            if (Desc.isBlank() || Desc.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Insira a descrição do defeito");
                return false;
            } else {
                df.setDesc(Desc);
            }

            df.setStatus(Status);

            return true;

        } catch (Exception e) {

        }
        return false;

    }

    public static boolean validarFormato(String texto) {
        String regex = "^([A-Z]{3}-\\d{4}|[A-Z]{3}\\d[A-Z]\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        return matcher.matches();
    }

    private javax.swing.JButton cadBtn;
    private javax.swing.JTextArea descTxt;
    private javax.swing.JTextField entradaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField placaTxt;
    private javax.swing.JButton voltarBtn;
}
