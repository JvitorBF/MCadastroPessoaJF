/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.MCadastroPessoa.view;

import br.com.senactech.MCadastroPessoa.util.ValidaCPF;
import br.com.senactech.MCadastroPessoaJF.model.Pessoa;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static mcadastropessoaJF.MCadastroPessoaJF.cadPessoas;

/**
 *
 * @author João Vitor
 */
public class pessoaCadastro extends javax.swing.JFrame {

    JButton btnClick = null;

    /**
     * Creates new form cadPessoa
     */
    public pessoaCadastro() {
        initComponents();
        this.setLocationRelativeTo(null);
        cadPessoas.mokPessoas();
        addRowToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgStatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlNome = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlIdade = new javax.swing.JLabel();
        jlStatus = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jtfCPF = new javax.swing.JTextField();
        jtfsNome = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JTextField();
        jtfIdade = new javax.swing.JTextField();
        jrbAtivo = new javax.swing.JRadioButton();
        jrbInativo = new javax.swing.JRadioButton();
        jbSalvar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPessoa = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jbDeletar = new javax.swing.JButton();
        jbConfirmar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbPesqCPF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Pessoas");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Pessoa");

        jSeparator1.setForeground(new java.awt.Color(204, 0, 51));

        jlNome.setText("<html><b>Nome:</b><font color=\"red\">*</font> ");

        jlCPF.setText("<html><b>CPF:</b><font color=\"red\">*</font> ");

        jlEndereco.setText("<html><b>Endereco:</b><font color=\"red\">*</font> ");

        jlTelefone.setText("<html><b>Telefone:</b><font color=\"red\">*</font> ");

        jlIdade.setText("<html><b>Idade:</b><font color=\"red\">*</font> ");

        jlStatus.setText("<html><b>Status:</b><font color=\"red\">*</font> ");

        jtfEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEnderecoKeyTyped(evt);
            }
        });

        jtfCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCPFKeyTyped(evt);
            }
        });

        jtfsNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfsNomeKeyTyped(evt);
            }
        });

        jtfTelefone.setToolTipText("xx - xxxxxxxxx");
        jtfTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTelefoneKeyTyped(evt);
            }
        });

        jtfIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIdadeKeyTyped(evt);
            }
        });

        bgStatus.add(jrbAtivo);
        jrbAtivo.setText("Ativo");

        bgStatus.add(jrbInativo);
        jrbInativo.setText("Inativo");

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(204, 0, 51));

        jtPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Telefone", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPessoa);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jbDeletar.setText("Deletar");
        jbDeletar.setEnabled(false);
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbConfirmar.setText("Confirmar");
        jbConfirmar.setEnabled(false);
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbPesqCPF.setForeground(new java.awt.Color(0, 51, 204));
        jbPesqCPF.setText("Pesquisa CPF");
        jbPesqCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesqCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jSeparator1)
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbAtivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbInativo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbPesqCPF))
                                .addComponent(jtfsNome, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                .addComponent(jtfEndereco)))))
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSair)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfsNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCPF)
                    .addComponent(jbPesqCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAtivo)
                    .addComponent(jrbInativo)
                    .addComponent(jlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbLimpar))
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSair)
                    .addComponent(jbDeletar)
                    .addComponent(jbConfirmar)
                    .addComponent(jbEditar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        jtfCPF.setText("");
        jtfEndereco.setText("");
        jtfIdade.setText("");
        jtfTelefone.setText("");
        jtfsNome.setText("");
        bgStatus.clearSelection();
        jtfsNome.requestFocus();

        jbSalvar.setEnabled(true);
        jbEditar.setEnabled(false);
        jbConfirmar.setEnabled(false);
        jbDeletar.setEnabled(false);
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtfsNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfsNomeKeyTyped
        // TODO add your handling code here:   
        String caracteres = "0987654321/[]{}=+-_)(*&¨%$#@!<>;:?";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfsNomeKeyTyped

    private void jtfCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCPFKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfCPFKeyTyped

    private void jtfEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEnderecoKeyTyped
        // TODO add your handling code here:
        String caracteres = "/[]{}=+_)(*&¨%$#@!<>;:?«»ºª";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfEnderecoKeyTyped

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
        btnClick = (JButton) evt.getSource();

        if (validaImputs()) {
            int id = cadPessoas.gerarId();
            String nomePessoa = jtfsNome.getText();
            String cpf = jtfCPF.getText();
            String endereco = jtfEndereco.getText();
            String telefone = jtfTelefone.getText();
            int idade = Integer.parseInt(jtfIdade.getText());
            boolean status = jrbAtivo.isSelected();
            Pessoa p = new Pessoa(id, nomePessoa, cpf, endereco, telefone, idade, status);
            cadPessoas.add(p);
            JOptionPane.showMessageDialog(this, "Pessoa foi salva com sucesso!");
            jbLimpar.doClick();
            addRowToTable();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtfTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTelefoneKeyTyped
        // TODO add your handling code here:
        String keyText = "0123456789-()";
        if (!keyText.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfTelefoneKeyTyped

    private void jtfIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdadeKeyTyped
        // TODO add your handling code here:
        String keyText = "0123456789";
        if (!keyText.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfIdadeKeyTyped

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    // Botão Deletar inicia como desabilitado, pois logo ao clicar na tabela, ele é setado como TRUE 
    private void jtPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPessoaMouseClicked
        // TODO add your handling code here:
        jbDeletar.setEnabled(true);
        jbEditar.setEnabled(true);
        jbSalvar.setEnabled(false);
    }//GEN-LAST:event_jtPessoaMouseClicked

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        // TODO add your handling code here:
        jbEditar.setEnabled(false);
        int linha_da_tabela;
        String CPF;
        linha_da_tabela = jtPessoa.getSelectedRow();
        CPF = (String) jtPessoa.getValueAt(linha_da_tabela, 1);
        Pessoa p = cadPessoas.getByDoc(CPF);
        Object[] resp = {"sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(this,
                "Deseja realmente deletar " + p.getNomePessoa() + "?",
                ".: Deletar :.", JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE, null, resp, resp[0]);
        if (resposta == 0) {
            cadPessoas.deletar(p);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Pessoa deletada com sucesso!",
                    ".: Deletar :.", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Entendemos a sua decisão!",
                    ".: Deletar :.", JOptionPane.INFORMATION_MESSAGE);
        }
        jbDeletar.setEnabled(false);
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:

        // Ajustando o comportamento dos botões
        jbDeletar.setEnabled(false);
        jbSalvar.setEnabled(false);
        jbEditar.setEnabled(false);
        jtfCPF.setEnabled(false);
        jbConfirmar.setEnabled(true);
        jbLimpar.setText("Cancelar");

        //carregar os dados da pessoa selecionada 
        int linha_da_tabela;
        String CPF;
        linha_da_tabela = jtPessoa.getSelectedRow();
        CPF = (String) jtPessoa.getValueAt(linha_da_tabela, 1);
        Pessoa p = cadPessoas.getByDoc(CPF);

        jtfsNome.setText(p.getNomePessoa());
        jtfCPF.setText(p.getCpf());
        jtfEndereco.setText(p.getEndereco());
        jtfTelefone.setText(p.getTelefone());
        jtfIdade.setText(Integer.toString(p.getIdade()));
        if (p.isStatus()) {
            jrbAtivo.setSelected(true);
            jrbInativo.setSelected(false);
        } else {
            jrbAtivo.setSelected(false);
            jrbInativo.setSelected(true);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        // TODO add your handling code here:
        btnClick = (JButton) evt.getSource();
        if (validaImputs()) {
            Pessoa p = cadPessoas.getByDoc(jtfCPF.getText());

            p.setNomePessoa(jtfsNome.getText());
            p.setCpf(jtfCPF.getText());
            p.setEndereco(jtfEndereco.getText());
            p.setIdade(Integer.parseInt(jtfIdade.getText()));
            p.setTelefone(jtfTelefone.getText());
            if (jrbAtivo.isSelected()) {
                p.setStatus(true);
            } else {
                p.setStatus(false);
            }
            addRowToTable();

            jbConfirmar.setEnabled(false);
            jbSalvar.setEnabled(true);
            jbLimpar.setEnabled(true);

            jbLimpar.doClick();
            jbLimpar.setText("Limpar");

            String msg = "Dados atualizado com sucesso!";
            JOptionPane.showMessageDialog(this, msg, ".: Atualizar :.", JOptionPane.INFORMATION_MESSAGE);
        } else {
            jbLimpar.doClick();
            jtfCPF.setEnabled(true);
        }
        jtfCPF.setEnabled(true);

    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbPesqCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesqCPFActionPerformed
        // TODO add your handling code here:
        if (!ValidaCPF.isCPF(jtfCPF.getText())) {
            JOptionPane.showMessageDialog(this,
                    "CPF informado esta incorreto!!!",
                    ".: Erro :.", JOptionPane.ERROR_MESSAGE);
            jtfCPF.requestFocus();

        } else if (cadPessoas.verCPF(jtfCPF.getText())) {
            Pessoa p = cadPessoas.getByDoc(jtfCPF.getText());

            jtfsNome.setText(p.getNomePessoa());
            jtfCPF.setText(p.getCpf());
            jtfEndereco.setText(p.getEndereco());
            jtfTelefone.setText(p.getTelefone());
            jtfIdade.setText(Integer.toString(p.getIdade()));
            if (p.isStatus()) {
                jrbAtivo.setSelected(true);
                jrbInativo.setSelected(false);
            } else {
                jrbAtivo.setSelected(false);
                jrbInativo.setSelected(true);
            }
            jbConfirmar.setEnabled(true);
            jbSalvar.setEnabled(false);

        }
    }//GEN-LAST:event_jbPesqCPFActionPerformed

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
            java.util.logging.Logger.getLogger(pessoaCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pessoaCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pessoaCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pessoaCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pessoaCadastro().setVisible(true);
            }
        });
    }

    //Cria obj model e recebe a modelagem da tabela JtPessoa do JFrame
    private void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jtPessoa.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        Object rowData[] = new Object[4]; //cria vetor para as colunas da tabela
        for (Pessoa p : cadPessoas.getAll()) {
            rowData[0] = p.getNomePessoa();
            rowData[1] = p.getCpf();
            rowData[2] = p.getTelefone();
            if (p.isStatus()) {
                rowData[3] = "Ativo";
            } else {
                rowData[3] = "Inativo";
            }
            model.addRow(rowData);
        }
    }

    private boolean validaImputs() {
        String telefone = jtfTelefone.getText();
        if (jtfsNome.getText().isBlank()
                || jtfCPF.getText().isBlank()
                || jtfEndereco.getText().isBlank()
                || jtfIdade.getText().isBlank()
                || jtfTelefone.getText().isBlank()
                || bgStatus.getSelection() == null) {

            JOptionPane.showMessageDialog(this,
                    "Todos os campos devem ser preenchidos!",
                    ".: Erro :.", JOptionPane.ERROR_MESSAGE);
            jtfsNome.requestFocus();
            return false;
        }

        if (telefone.length() != 10 && telefone.length() != 11) {
            JOptionPane.showMessageDialog(this,
                    "Telefone informado esta incorreto",
                    ".: Erro :.", JOptionPane.ERROR_MESSAGE);
            jtfTelefone.requestFocus();
            return false;
        }

        if (!jtfIdade.getText().isBlank()) {
            int idade = Integer.parseInt(jtfIdade.getText());
            if (idade == 0 || idade > 120) {
                JOptionPane.showMessageDialog(this,
                        "Idade informada esta incorreta!",
                        ".: Erro :.", JOptionPane.ERROR_MESSAGE);
                jtfIdade.requestFocus();
                return false;
            }
        }
        if (btnClick.getText() == "Salvar") {
            if (!ValidaCPF.isCPF(jtfCPF.getText())) {
                JOptionPane.showMessageDialog(this,
                        "CPF informado esta incorreto!!!",
                        ".: Erro :.", JOptionPane.ERROR_MESSAGE);
                jtfCPF.requestFocus();
                return false;
            } else if (cadPessoas.verCPF(jtfCPF.getText())) {
                JOptionPane.showMessageDialog(this,
                        "CPF já cadastrado!!!",
                        ".: Erro :.", JOptionPane.ERROR_MESSAGE);
                jtfCPF.requestFocus();
                return false;
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbPesqCPF;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlIdade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JRadioButton jrbAtivo;
    private javax.swing.JRadioButton jrbInativo;
    private javax.swing.JTable jtPessoa;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfIdade;
    private javax.swing.JTextField jtfTelefone;
    private javax.swing.JTextField jtfsNome;
    // End of variables declaration//GEN-END:variables

}
