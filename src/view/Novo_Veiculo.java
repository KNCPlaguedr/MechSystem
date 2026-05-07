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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

import model.CarroDAO;
import model.Carroinfo;

public class Novo_Veiculo extends javax.swing.JFrame {

    private String cpf;

    public Novo_Veiculo() {
        initComponents();
        estilizarTelaNovoVeiculo();
        setResizable(false);
    }

    public Novo_Veiculo(String cpf) {
        this.cpf = cpf;
        initComponents();
        estilizarTelaNovoVeiculo();
        configurarListeners();
    }

    private void configurarListeners() {

        java.awt.event.KeyAdapter enterListener = new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    voltarBtnActionPerformed(null);
                }
            }
        };

        marcaCb.addKeyListener(enterListener);
        modelTxt.addKeyListener(enterListener);
        anoCb.addKeyListener(enterListener);
        placaTxt.addKeyListener(enterListener);
        corCb.addKeyListener(enterListener);
        caixaCb.addKeyListener(enterListener);
        combCb.addKeyListener(enterListener);
        cambCb.addKeyListener(enterListener);
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

    private void estilizarTelaNovoVeiculo() {
        setLocationRelativeTo(null);

        Color corFundo = new Color(30, 30, 30);
        Color corCard = new Color(45, 45, 45);
        Color corInput = new Color(60, 60, 60);
        Color corTexto = new Color(240, 240, 240);
        Color corBtn = new Color(58, 12, 163);

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

        jPanel2.setBackground(corFundo);
        jPanel3.setBackground(corCard);

        javax.swing.JLabel[] labels = {jLabel1, jLabel2, jLabel3, jLabel4, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10};
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

        JComboBox[] combos = {marcaCb, anoCb, combCb, cambCb, caixaCb, corCb};
        for (JComboBox cb : combos) {
            cb.setBackground(corInput);
            cb.setForeground(corTexto);
            cb.setBorder(BorderFactory.createLineBorder(corBtn, 1));

            Object child = cb.getAccessibleContext().getAccessibleChild(0);
            if (child instanceof javax.swing.plaf.basic.BasicComboPopup) {
                ((javax.swing.plaf.basic.BasicComboPopup) child).getList().setBackground(corInput);
                ((javax.swing.plaf.basic.BasicComboPopup) child).getList().setForeground(corTexto);
            }
        }

        JTextField[] txts = {modelTxt, placaTxt};
        for (JTextField txt : txts) {
            txt.setBackground(corInput);
            txt.setForeground(corTexto);
            txt.setCaretColor(corTexto);
            txt.setBorder(BorderFactory.createLineBorder(corBtn, 1));
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();

        jLabel2 = new javax.swing.JLabel();
        marcaCb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        modelTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        anoCb = new javax.swing.JComboBox<>();

        jLabel7 = new javax.swing.JLabel();
        placaTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        corCb = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        caixaCb = new javax.swing.JComboBox<>();

        jLabel6 = new javax.swing.JLabel();
        combCb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cambCb = new javax.swing.JComboBox<>();

        cadBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(720, 380));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24));
        jLabel1.setText("Novo veículo");

        voltarBtn.setText("Voltar");
        voltarBtn.setFocusable(false);
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca");
        jLabel3.setText("Modelo");
        jLabel4.setText("Ano");
        jLabel7.setText("Placa");
        jLabel10.setText("Cor");
        jLabel9.setText("Carroceria");
        jLabel6.setText("Combustível");
        jLabel8.setText("Câmbio");

        String[] marcas = {
            "Audi", "BMW", "BYD", "CAOA Chery", "Chevrolet", "Citroën",
            "Dodge", "Fiat", "Ford", "GWM", "Honda", "Hyundai",
            "JAC", "Jaguar", "Jeep", "Kia", "Land Rover", "Lexus",
            "Mercedes-Benz", "Mini", "Mitsubishi", "Nissan", "Peugeot",
            "Porsche", "Ram", "Renault", "Subaru", "Suzuki",
            "Toyota", "Troller", "Volkswagen", "Volvo"
        };
        marcaCb.removeAllItems();
        for (String m : marcas) {
            marcaCb.addItem(m);
        }

        String[] carrocerias = {
            "Buggy", "Conversível", "Cupê", "Furgão", "Hatchback",
            "Jipe", "Minivan", "Perua / SW", "Picape",
            "Sedã", "SUV", "Van"
        };
        caixaCb.removeAllItems();
        for (String c : carrocerias) {
            caixaCb.addItem(c);
        }

        anoCb.removeAllItems();
        for (int i = 2027; i >= 1950; i--) {
            anoCb.addItem(String.valueOf(i));
        }

        String[] cores = {
            "Amarelo", "Azul", "Azul Claro", "Azul Escuro", "Bege",
            "Branco", "Bronze", "Marrom", "Cinza", "Dourado",
            "Laranja", "Prata", "Preto", "Rosa", "Roxo",
            "Verde", "Vermelho", "Vinho"
        };
        corCb.removeAllItems();
        for (String a : cores) {
            corCb.addItem(a);
        }

        placaTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                placaTxtFocusLost(evt);
            }
        });
        placaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                placaTxtKeyPressed(evt);
            }
        });

        combCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Gasolina", "Diesel", "Gás Natural", "Etanol", "Flex", "Elétrico", "Híbrido"}));
        cambCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Manual", "Automático", "Automatizado"}));

        cadBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14));
        cadBtn.setText("Cadastrar");
        cadBtn.setFocusable(false);
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
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(voltarBtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(marcaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(placaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(combCb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(modelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel10)
                                                        .addComponent(corCb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(cambCb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(anoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(caixaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cadBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                )
                                        )
                                )
                                .addContainerGap(30, Short.MAX_VALUE)
                        )
        );

        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(voltarBtn)
                                        .addComponent(jLabel1))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(marcaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(modelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(anoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(placaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(corCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(caixaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(combCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cambCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)) // Botão mais alto

                                .addContainerGap(30, Short.MAX_VALUE)
                        )
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
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
        Carroinfo c = new Carroinfo();
        try {
            if (validarFormato(placaTxt.getText())) {
                if (validar(c)) {
                    CarroDAO.cadastrar(c);
                    JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso");
                    dispose();
                    Menu m = new Menu();
                    m.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Insira a placa no formato válido (Ex: ABC-1234 ou ABC1D23)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Novo_Veiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void placaTxtKeyPressed(java.awt.event.KeyEvent evt) {
        ((AbstractDocument) placaTxt.getDocument()).setDocumentFilter(new UpperCaseDocumentFilter());
    }

    private void placaTxtFocusLost(java.awt.event.FocusEvent evt) {
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
            Logger.getLogger(Novo_Veiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Novo_Veiculo().setVisible(true);
        });
    }

    public boolean validar(Carroinfo c) {
        try {
            c.setCliente_cpf(cpf);
            c.setMarca(marcaCb.getSelectedItem().toString());

            if (modelTxt.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Insira o modelo");
                return false;
            }
            c.setModelo(modelTxt.getText());

            c.setAnofab(anoCb.getSelectedItem().toString());
            c.setCombustivel(combCb.getSelectedItem().toString());
            c.setCambio(cambCb.getSelectedItem().toString());

            if (placaTxt.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Insira a placa");
                return false;
            }
            c.setPlaca(placaTxt.getText());

            c.setCarroceria(caixaCb.getSelectedItem().toString());
            c.setCor(corCb.getSelectedItem().toString());

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validarFormato(String texto) {
        String regex = "^([A-Z]{3}-\\d{4}|[A-Z]{3}\\d[A-Z]\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        return matcher.matches();
    }

    private javax.swing.JComboBox<String> anoCb;
    private javax.swing.JButton cadBtn;
    private javax.swing.JComboBox<String> caixaCb;
    private javax.swing.JComboBox<String> cambCb;
    private javax.swing.JComboBox<String> combCb;
    private javax.swing.JComboBox<String> corCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> marcaCb;
    private javax.swing.JTextField modelTxt;
    private javax.swing.JTextField placaTxt;
    private javax.swing.JButton voltarBtn;
}
