
import javax.swing.*;
import java.awt.*;
import java.text.*;

public class ServicoStreaming extends javax.swing.JFrame {
    
    public ServicoStreaming() {
        initComponents();
        setTitle("Calculadora de Planos de Streaming");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        jLabelResultado.setText("");
        jComboBoxHdrExclusivo.setVisible(false);
        jLabelHdrExclusivo.setVisible(false);
         jTextFieldPrecoBase.setEnabled(false);
        jComboBoxQualidadeDispositivosUsuarios.setEnabled(false);
        jComboBoxHdrExclusivo.setEnabled(false);
        jButtonCalcula.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSelecione = new javax.swing.JLabel();
        jComboBoxPlano = new javax.swing.JComboBox<>();
        jLabelPrecoBase = new javax.swing.JLabel();
        jTextFieldPrecoBase = new javax.swing.JTextField();
        jLabelQualidadeDispositivosUsuarios = new javax.swing.JLabel();
        jComboBoxQualidadeDispositivosUsuarios = new javax.swing.JComboBox<>();
        jButtonCalcula = new javax.swing.JButton();
        jLabelHdrExclusivo = new javax.swing.JLabel();
        jComboBoxHdrExclusivo = new javax.swing.JComboBox<>();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSelecione.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelSelecione.setText("Selecione o tipo de plano:");

        jComboBoxPlano.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jComboBoxPlano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "BÁSICO", "PREMIUM", "FAMILIAR", "4K", "CONTEÚDO EXCLUSIVO" }));
        jComboBoxPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPlanoActionPerformed(evt);
            }
        });

        jLabelPrecoBase.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelPrecoBase.setText("Preço Básico R$:");

        jTextFieldPrecoBase.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jLabelQualidadeDispositivosUsuarios.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelQualidadeDispositivosUsuarios.setText("Qualidade: ");

        jComboBoxQualidadeDispositivosUsuarios.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jComboBoxQualidadeDispositivosUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HD", "FULL HD" }));

        jButtonCalcula.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButtonCalcula.setText("Calcular Preço");
        jButtonCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculaActionPerformed(evt);
            }
        });

        jLabelHdrExclusivo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelHdrExclusivo.setText("HDR:");

        jComboBoxHdrExclusivo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jComboBoxHdrExclusivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIM", "NÃO" }));

        jLabelResultado.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultado.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelPrecoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCalcula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelSelecione, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                                .addComponent(jLabelQualidadeDispositivosUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelHdrExclusivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldPrecoBase)
                                .addComponent(jComboBoxQualidadeDispositivosUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxHdrExclusivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxPlano, 0, 238, Short.MAX_VALUE)))))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSelecione)
                    .addComponent(jComboBoxPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrecoBase)
                    .addComponent(jTextFieldPrecoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQualidadeDispositivosUsuarios)
                    .addComponent(jComboBoxQualidadeDispositivosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHdrExclusivo)
                    .addComponent(jComboBoxHdrExclusivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 28, Short.MAX_VALUE)
                .addComponent(jButtonCalcula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPlanoActionPerformed
        // TODO add your handling code here:
        int opcao = jComboBoxPlano.getSelectedIndex();
        boolean teste = opcao != 0;
        jTextFieldPrecoBase.setEnabled(teste);
        jComboBoxQualidadeDispositivosUsuarios.setEnabled(teste);
        jComboBoxHdrExclusivo.setEnabled(teste);
        jButtonCalcula.setEnabled(teste);
        jLabelResultado.setText("");
        String[] lista = {"1", "2", "3", "4", "5"};
        switch(opcao){
            case 1:
                jTextFieldPrecoBase.setText("");
                jLabelQualidadeDispositivosUsuarios.setText("Qualidade:");
                jComboBoxQualidadeDispositivosUsuarios.removeAllItems();
                jComboBoxQualidadeDispositivosUsuarios.addItem("HD");
                jComboBoxQualidadeDispositivosUsuarios.addItem("FULL HD");
                jLabelHdrExclusivo.setVisible(false);
                jComboBoxHdrExclusivo.setVisible(false);
                break;
            case 2:
                jTextFieldPrecoBase.setText("");
                jLabelQualidadeDispositivosUsuarios.setText("Dispositivos:");
                jComboBoxQualidadeDispositivosUsuarios.removeAllItems();
                lista = new String[]{"1", "2", "3", "4", "5"};
                for(String valor: lista){
                    jComboBoxQualidadeDispositivosUsuarios.addItem(valor);
                }
                jLabelHdrExclusivo.setVisible(false);
                jComboBoxHdrExclusivo.setVisible(false);
                break;
            case 3:
                jTextFieldPrecoBase.setText("");
                jLabelQualidadeDispositivosUsuarios.setText("Usuários:");
                jComboBoxQualidadeDispositivosUsuarios.removeAllItems();
                lista = new String[]{"1", "2", "3", "4", "5"};
                for(String valor: lista){
                    jComboBoxQualidadeDispositivosUsuarios.addItem(valor);
                }
                jLabelHdrExclusivo.setVisible(false);
                jComboBoxHdrExclusivo.setVisible(false);
                break;
            case 4:
                jTextFieldPrecoBase.setText("");
                jLabelQualidadeDispositivosUsuarios.setText("Dispositivos:");
                jComboBoxQualidadeDispositivosUsuarios.removeAllItems();
                lista = new String[]{"1", "2", "3", "4", "5"};
                for(String valor: lista){
                    jComboBoxQualidadeDispositivosUsuarios.addItem(valor);
                }
                jLabelHdrExclusivo.setText("HDR");
                jLabelHdrExclusivo.setVisible(true);
                jComboBoxHdrExclusivo.setVisible(true);
                break;
            case 5:
                jTextFieldPrecoBase.setText("");
                jLabelQualidadeDispositivosUsuarios.setText("Dispositivos:");
                jComboBoxQualidadeDispositivosUsuarios.removeAllItems();
                lista = new String[]{"1", "2", "3", "4", "5"};
                for(String valor: lista){
                    jComboBoxQualidadeDispositivosUsuarios.addItem(valor);
                }
                jLabelHdrExclusivo.setText("Conteúdo Extra");
                jLabelHdrExclusivo.setVisible(true);
                jComboBoxHdrExclusivo.setVisible(true);
                break;
            default:
                jTextFieldPrecoBase.setEnabled(false);
                jComboBoxQualidadeDispositivosUsuarios.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxPlanoActionPerformed

    private void jButtonCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculaActionPerformed
        // TODO add your handling code here:
        NumberFormat Formatter = new DecimalFormat("#,##0.00");
        Double valor = 0.0;
        jLabelResultado.setText("!!!ERRO!!!");
        try{
            valor = Double.valueOf(jTextFieldPrecoBase.getText());
        }catch(Exception e){
            jTextFieldPrecoBase.setText("");
            JOptionPane.showMessageDialog(null, "Valor inválido.");
            return;
        }
        if(valor<=0.0){
			JOptionPane.showMessageDialog(null, "Valor inválido.");
            return;
		}
        int opcao = jComboBoxPlano.getSelectedIndex();
        switch(opcao){
            case 1:
				PlanoBasico planoBasico = new PlanoBasico(valor, jComboBoxQualidadeDispositivosUsuarios.getSelectedItem().toString());
				jLabelResultado.setText("Valor: R$ "+ Formatter.format(planoBasico.calculaPreco()));
				break;
            case 2:
                PlanoPremium planoPremium = new PlanoPremium(valor, Integer.parseInt(jComboBoxQualidadeDispositivosUsuarios.getSelectedItem().toString()));
                jLabelResultado.setText("Valor: R$ "+ Formatter.format(planoPremium.calculaPreco()));
                break;
            case 3:
                PlanoFamiliar planoFamiliar = new PlanoFamiliar(valor, Integer.parseInt(jComboBoxQualidadeDispositivosUsuarios.getSelectedItem().toString()));
                jLabelResultado.setText("Valor: R$ "+ Formatter.format(planoFamiliar.calculaPreco()));
                break;    
            case 4:
                Plano4K plano4K = new Plano4K(valor, Integer.parseInt(jComboBoxQualidadeDispositivosUsuarios.getSelectedItem().toString()), jComboBoxHdrExclusivo.getSelectedIndex()==0);
                jLabelResultado.setText("Valor: R$ "+ Formatter.format(plano4K.calculaPreco()));
                break; 
            case 5:
                PlanoExclusivo planoExclusivo = new PlanoExclusivo(valor, Integer.parseInt(jComboBoxQualidadeDispositivosUsuarios.getSelectedItem().toString()), jComboBoxHdrExclusivo.getSelectedIndex()==0);
                jLabelResultado.setText("Valor: R$ "+ Formatter.format(planoExclusivo.calculaPreco()));
                break; 
        }
    }//GEN-LAST:event_jButtonCalculaActionPerformed

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
            java.util.logging.Logger.getLogger(ServicoStreaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServicoStreaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServicoStreaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServicoStreaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicoStreaming().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcula;
    private javax.swing.JComboBox<String> jComboBoxHdrExclusivo;
    private javax.swing.JComboBox<String> jComboBoxPlano;
    private javax.swing.JComboBox<String> jComboBoxQualidadeDispositivosUsuarios;
    private javax.swing.JLabel jLabelHdrExclusivo;
    private javax.swing.JLabel jLabelPrecoBase;
    private javax.swing.JLabel jLabelQualidadeDispositivosUsuarios;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelSelecione;
    private javax.swing.JTextField jTextFieldPrecoBase;
    // End of variables declaration//GEN-END:variables
}
