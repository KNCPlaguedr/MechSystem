/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import model.CarroDAO;
import model.Carroinfo;
import model.ClienteInfoNovoVeiculo;
import view.Cliente;

public class Novo_Veiculo extends javax.swing.JFrame {

    private String cpf;
    
    
    public Novo_Veiculo(){
        initComponents();
    }
    
    public Novo_Veiculo(String cpf){
        
        this.cpf = cpf;
        
        initComponents();
        
        
        
        
        
        
        
         marcaCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null); 
                }
            }
        });
         
         marcaCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
        
         modelTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
         
         modelTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
        
          anoCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
          
          anoCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
          
           combCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
           
           combCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
           
            cambCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
            
            cambCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
            
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
             
              caixaCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
              
              caixaCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   voltarBtnActionPerformed(null);
                }
            }
        });
         
               corCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadBtnActionPerformed(null);
                }
            }
        });
               
               corCb.addKeyListener(new java.awt.event.KeyAdapter() {
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

  

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modelTxt = new javax.swing.JTextField();
        marcaCb = new javax.swing.JComboBox<>();
        anoCb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        placaTxt = new javax.swing.JTextField();
        combCb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cambCb = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        caixaCb = new javax.swing.JComboBox<>();
        cadBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        corCb = new javax.swing.JComboBox<>();

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

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel4.setText("Ano Fabricação");

        marcaCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aston Martin", "Audi", "Bentley", "BMW", "Bugatti", "BYD", "Cadillac", "Chery", "Chevrolet", "Chrysler", "Citroën", "Dodge", "Fiat", "Ferrari", "Ford", "GMC", "Honda", "Hyundai", "Infiniti", "Iveco", "Jaguar", "JAC Motors", "Jeep", "Kia", "Land Rover", "Lexus", "Lifan", "Maserati", "McLaren", "Mercedes-Benz", "Mini", "Mitsubishi", "Nissan", "Peugeot", "Porsche", "RAM", "Renault", "Rolls-Royce", "Smart", "SsangYong", "Subaru", "Suzuki", "Tesla", "Toyota", "Troller", "Volkswagen", "Volvo", "Wuling", "Zotye" }));

        anoCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024/2024", "2023/2024", "2023/2023", "2022/2023", "2022/2022", "2021/2022", "2021/2021", "2020/2021", "2020/2020", "2019/2020", "2019/2019", "2018/2019", "2018/2018", "2017/2018", "2017/2017", "2016/2017", "2016/2016", "2015/2016", "2015/2015", "2014/2015", "2014/2014", "2013/2014", "2013/2013", "2012/2013", "2012/2012", "2011/2012", "2011/2011", "2010/2011", "2010/2010", "2009/2010", "2009/2009", "2008/2009", "2008/2008", "2007/2008", "2007/2007", "2006/2007", "2006/2006", "2005/2006", "2005/2005", "2004/2005", "2004/2004", "2003/2004", "2003/2003", "2002/2003", "2002/2002", "2001/2002", "2001/2001", "2000/2001", "2000/2000", "1999/2000", "1999/1999", "1998/1999", "1998/1998", "1997/1998", "1997/1997", "1996/1997", "1996/1996", "1995/1996", "1995/1995", "1994/1995", "1994/1994", "1993/1994", "1993/1993", "1992/1993", "1992/1992", "1991/1992", "1991/1991", "1990/1991", "1990/1990", "1989/1990", "1989/1989", "1988/1989", "1988/1988", "1987/1988", "1987/1987", "1986/1987", "1986/1986", "1985/1986", "1985/1985", "1984/1985", "1984/1984", "1983/1984", "1983/1983", "1982/1983", "1982/1982", "1981/1982", "1981/1981", "1980/1981", "1980/1980", "1979/1980", "1979/1979", "1978/1979", "1978/1978", "1977/1978", "1977/1977", "1976/1977", "1976/1976", "1975/1976", "1975/1975", "1974/1975", "1974/1974", "1973/1974", "1973/1973", "1972/1973", "1972/1972", "1971/1972", "1971/1971", "1970/1971", "1970/1970", "1969/1970", "1969/1969", "1968/1969", "1968/1968", "1967/1968", "1967/1967", "1966/1967", "1966/1966", "1965/1966", "1965/1965", "1964/1965", "1964/1964", "1963/1964", "1963/1963", "1962/1963", "1962/1962", "1961/1962", "1961/1961", "1960/1961", "1960/1960", "1959/1960", "1959/1959", "1958/1959", "1958/1958", "1957/1958", "1957/1957", "1956/1957", "1956/1956", "1955/1956", "1955/1955", "1954/1955", "1954/1954", "1953/1954", "1953/1953", "1952/1953", "1952/1952", "1951/1952", "1951/1951", "1950/1951", "1950/1950" }));

        jLabel6.setText("Combustível");

        jLabel7.setText("Placa");

        placaTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                placaTxtFocusLost(evt);
            }
        });
        placaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                placaTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                placaTxtKeyReleased(evt);
            }
        });

        combCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Diesel", "Gás Natural", "Etanol", "Flex", "Elétrico", "Híbrido" }));

        jLabel8.setText("Câmbio");

        cambCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automático" }));

        jLabel9.setText("Carroceria");

        caixaCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedã", "Hatchback", "Perua/Wagon", "SUV", "Crossover", "Cupê", "Conversível", "Picape", "Sport" }));

        cadBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        cadBtn.setText("Cadastrar");
        cadBtn.setFocusable(false);
        cadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadBtnActionPerformed(evt);
            }
        });

        jLabel10.setText("Cor");

        corCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branco", "Prata", "Preto", "Cinza", "Azul marinho", "Vermelho", "Bege", "Verde escuro", "Azul claro", "Marrom", "Laranja", "Azul metálico", "Cinza metálico", "Verde metálico", "Vermelho metálico" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(voltarBtn))
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(marcaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(modelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(placaTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(anoCb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combCb, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(caixaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(cambCb, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(corCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marcaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(placaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combCb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cambCb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caixaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(corCb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadBtn)
                        .addGap(17, 17, 17))))
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
        Cliente c = new Cliente();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void cadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadBtnActionPerformed
Carroinfo c = new Carroinfo();

try {
    if (validarFormato(placaTxt.getText())) {
        if (validar(c)) {
            CarroDAO.cadastrar(c);
            JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso");
            dispose();
            Menu m = new Menu();
            m.setVisible(true);
        } else {
            // Lógica para lidar com o caso em que o objeto c não é válido
        }
    } else {
        JOptionPane.showMessageDialog(null, "Insira a placa no formato válido");
    }
} catch (SQLException ex) {
    Logger.getLogger(Novo_Veiculo.class.getName()).log(Level.SEVERE, null, ex);
    System.out.print(ex);
}
    }//GEN-LAST:event_cadBtnActionPerformed

    private void placaTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placaTxtKeyPressed
((AbstractDocument) placaTxt.getDocument()).setDocumentFilter(new UpperCaseDocumentFilter());        
    }//GEN-LAST:event_placaTxtKeyPressed

    private void placaTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placaTxtKeyReleased
        
    }//GEN-LAST:event_placaTxtKeyReleased

    private void placaTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_placaTxtFocusLost
       
    }//GEN-LAST:event_placaTxtFocusLost

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
            java.util.logging.Logger.getLogger(Novo_Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Novo_Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Novo_Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Novo_Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Novo_Veiculo().setVisible(true);
            }
        });
    }
    
    
   
    
    
    public boolean validar(Carroinfo c){
        
        try{
        
            
            
           c.setCliente_cpf(cpf);
            
            c.setMarca(marcaCb.getSelectedItem().toString());
            
            
            if(modelTxt.getText().isBlank() || modelTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Insira o modelo");
                return false;
            }else{
                c.setModelo(modelTxt.getText());
            }
            
            c.setAnofab(anoCb.getSelectedItem().toString());
            
            c.setCombustivel(combCb.getSelectedItem().toString());
            
            c.setCambio(cambCb.getSelectedItem().toString());
            
            if(placaTxt.getText().isBlank() || placaTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Insira a placa");
                return false;
            }else{
                c.setPlaca(placaTxt.getText());
            }
            
            c.setCarroceria(caixaCb.getSelectedItem().toString());
            
            c.setCor(corCb.getSelectedItem().toString());
            
            return true;
            
        }catch(Exception e){
            
        }
        return false;
        
        
    }
    
  public static boolean validarFormato(String texto) {
    // Define a expressão regular para o formato desejado
    String regex = "^([A-Z]{3}-\\d{4}|[A-Z]{3}\\d[A-Z]\\d{2})$";

    // Compila a expressão regular em um padrão
    Pattern pattern = Pattern.compile(regex);

    // Cria um objeto Matcher para fazer a correspondência com o texto fornecido
    Matcher matcher = pattern.matcher(texto);

    // Retorna true se o texto corresponder ao padrão, false caso contrário
    return matcher.matches();
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> marcaCb;
    private javax.swing.JTextField modelTxt;
    private javax.swing.JTextField placaTxt;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
