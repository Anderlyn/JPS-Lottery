/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.Set;
import javax.swing.JOptionPane;
import proyectoSorteoUsuarios.Jugador;
import proyectoSorteoUsuarios.ListaUsuarios;
import sorteos.LoteriaNacional;
import sorteos.Lotto;
import sorteos.Tiempos;
import sorteos.TresMonasos;
import sorteos.comprasSorteos;
import sorteos.listaResultados;


/**
 *
 * @author als_trash
 */
public class UsuarioInicio extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioInicio
     */
    public Jugador usuarioActual;
    public UsuarioInicio() {
        initComponents();
    }
    public UsuarioInicio(String usuario) {
        initComponents();
        for(Jugador jug : ListaUsuarios.listaUsuarios ){;
            if(jug.getNombreUsuario().equals(usuario)){
                usuarioActual = jug;
            }
        }
        credito.setText("Credito: "+usuarioActual.getCredito());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        credito = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Lotería JPS");

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Retirar Pago");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        credito.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        credito.setText("Credito: ");

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setText("Jugar Loteria Nacional");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setText("Jugar Lotto");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 102, 102));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton6.setText("Jugar 3 Monazos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 102, 102));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton7.setText("Jugar Tiempos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(51, 255, 51));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton8.setText("Ver Resultados");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credito))
                .addGap(69, 69, 69))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jLabel2)
                    .addContainerGap(702, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(credito)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel2)
                    .addContainerGap(448, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Ingreso().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new RetirarPago(usuarioActual).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new JugarLoteriaNacional(this.usuarioActual).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new JugarLotto(this.usuarioActual).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new Jugar3Monazos(this.usuarioActual).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
        new JugarTiempos(this.usuarioActual).setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int montoTiempos = 200;
        int montoLoteriaNacional = 3000;
        int montoTresMonasos = 350;
        int montoLotto = 500;
        int montoGenerado = 0;
        if (listaResultados.resultados.size() == 0) {
            JOptionPane.showMessageDialog(this, "No se han publicado los resultados del sorteo.");
            return;
        }
        
        for (int i = 0; i < comprasSorteos.usuarios.size(); i++){
            if(comprasSorteos.usuarios.get(i).getNombreUsuario() == this.usuarioActual.getNombreUsuario()){
                if(comprasSorteos.sorteos.get(i) instanceof Tiempos ){
                    Tiempos comparador = (Tiempos)comprasSorteos.sorteos.get(i);
                    for (int j = 0; j < listaResultados.resultados.size(); j++) {
                        if(listaResultados.resultados.get(j) instanceof Tiempos){
                            Tiempos comparado = (Tiempos)listaResultados.resultados.get(j);
                            if(comparador.getNumeroJugado().equals(comparado.getResultados())){
                                if(comparador.isReventado()){
                                    montoGenerado += montoTiempos*270;
                                }else{
                                    montoGenerado += montoTiempos*70; 
                                }
                                JOptionPane.showMessageDialog(this, "Felicidades, ganaste en tiempos!");
                            }
                            JOptionPane.showMessageDialog(this, "Sus numeros en tiempos: "+comparador.getNumeroJugado()[0]+", "+comparador.getNumeroJugado()[1]+". Numeros que salieron: "+comparado.getResultados()[0]+", "+comparado.getResultados()[1]);
                        }
                    }
                }
                // Loteria Nacional
                if(comprasSorteos.sorteos.get(i) instanceof LoteriaNacional ){
                    LoteriaNacional comparador = (LoteriaNacional)comprasSorteos.sorteos.get(i);
                    for (int j = 0; j < listaResultados.resultados.size(); j++) {
                        if(listaResultados.resultados.get(j) instanceof LoteriaNacional){
                            LoteriaNacional comparado = (LoteriaNacional)listaResultados.resultados.get(j);
                            if(comparador.getNumeroJugado().equals(comparado.getNumeroGanador())){
                                montoGenerado += 180000000;
                                JOptionPane.showMessageDialog(this, "Felicidades, ganaste la loteria nacional!");
                            }
                            JOptionPane.showMessageDialog(this, "Sus numeros en loterianacional: "+comparador.getNumeroJugado()[0]+", "+comparador.getNumeroJugado()[1]+". Numeros que salieron: "+comparado.getResultado()[0]+", "+comparado.getResultado()[1]);
                        }
                    }
                } 
                // Tres Monasos 
                if(comprasSorteos.sorteos.get(i) instanceof TresMonasos ){
                   TresMonasos comparador = (TresMonasos)comprasSorteos.sorteos.get(i);
                    for (int j = 0; j < listaResultados.resultados.size(); j++) {
                        if(listaResultados.resultados.get(j) instanceof TresMonasos){
                            TresMonasos comparado = (TresMonasos)listaResultados.resultados.get(j);
                            if(comparador.getModalidad().equals("Orden")){
                                // Esto es un test, siempre se gana en este.
                                if(comparado.getResultado().equals(comparado.getResultado())){
                                    montoGenerado += montoTresMonasos*650;
                                    JOptionPane.showMessageDialog(this, "Felicidades, ganaste en tres monasos, en modalidad orden!");
                                }
                            }else if(comparador.getModalidad().equals("Desorden")){
                                int cantidadDeSimilitudes = 0;
                                for (int k = 0; k < 2; k++) {
                                    if(comparador.getNumeroJugado()[0] == comparado.getResultado()[k]){
                                        cantidadDeSimilitudes++; 
                                    }
                                    if(comparador.getNumeroJugado()[1] == comparado.getResultado()[k]){
                                        cantidadDeSimilitudes++; 
                                    }
                                    if(comparador.getNumeroJugado()[2] == comparado.getResultado()[k]){
                                        cantidadDeSimilitudes++; 
                                    }
                                }
                                if (cantidadDeSimilitudes == 3) {
                                    JOptionPane.showMessageDialog(this, "Felicidades, ganaste en tres monasos, en la modalidad de desorden");
                                    montoGenerado += montoTresMonasos*100;
                                }
                                
                            }else if(comparador.getModalidad().equals("ComboOrdenDesorden")){
                                if(comparador.getNumeroJugado().equals(comparado.getResultado())){
                                    montoGenerado += montoTresMonasos*500;
                                    JOptionPane.showMessageDialog(this, "Felicidades, ganaste en tres monasos, en modalidad orden!");
                                }else{
                                    int cantidadDeSimilitudes = 0;
                                    for (int k = 0; k < 2; k++) {
                                        if(comparador.getNumeroJugado()[0] == comparado.getResultado()[k]){
                                            cantidadDeSimilitudes++; 
                                        }
                                        if(comparador.getNumeroJugado()[1] == comparado.getResultado()[k]){
                                            cantidadDeSimilitudes++; 
                                        }
                                        if(comparador.getNumeroJugado()[2] == comparado.getResultado()[k]){
                                            cantidadDeSimilitudes++; 
                                        }
                                    }
                                    if (cantidadDeSimilitudes == 3) {
                                        JOptionPane.showMessageDialog(this, "Felicidades, ganaste en tres monasos, en la modalidad de desorden");
                                        montoGenerado += montoTresMonasos*25;
                                    }  
                                }
                            }else{
                                if(comparador.getNumeroJugado().equals(comparado.getResultado())){
                                    montoGenerado += montoTresMonasos*500;
                                    JOptionPane.showMessageDialog(this, "Felicidades, ganaste en tres monasos, en modalidad 2 ultimos!");
                                }
                                else if(comparador.getNumeroJugado()[1]==comparado.getResultado()[1] && comparador.getNumeroJugado()[2]==comparado.getResultado()[2]){
                                         JOptionPane.showMessageDialog(this, "Felicidades, ganaste en tres monasos, en la modalidad de 2 ultimos");
                                        montoGenerado += montoTresMonasos*15;
                                }
                            }
                            
                            JOptionPane.showMessageDialog(this, "Sus numeros en tres Monasos: "+comparador.getNumeroJugado()[0]+", "+comparador.getNumeroJugado()[1]+", "+comparador.getNumeroJugado()[2]+". Numeros que salieron: "+comparado.getResultado()[0]+", "+comparado.getResultado()[1]+", "+comparado.getResultado()[2]);
                        }
                    }
                } 
                if(comprasSorteos.sorteos.get(i) instanceof Lotto){
                    Lotto comparador = (Lotto)comprasSorteos.sorteos.get(i);
                    for (int j = 0; j < listaResultados.resultados.size(); j++) {
                        if(listaResultados.resultados.get(j) instanceof Lotto){
                            Lotto comparado = (Lotto)listaResultados.resultados.get(j);
                            if(comparador.getNumeroJugado() == comparado.getResultado()){
                                montoGenerado += montoLotto*50;
                                JOptionPane.showMessageDialog(this, "Felicidades, ganaste en la Lotto!");
                            }
                            JOptionPane.showMessageDialog(this, "Sus numeros en Lotto son: "+comparador.getNumeroJugado()+". Numeros que salieron: "+comparado.getResultado());
                        }
                    }
                } 
                comprasSorteos.sorteos.remove(i);
                comprasSorteos.usuarios.remove(i);
            }
            JOptionPane.showMessageDialog(this, "Ganó un total de: "+montoGenerado);
            usuarioActual.setCredito(usuarioActual.getCredito()+montoGenerado);
            credito.setText("Credito: "+usuarioActual.getCredito());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel credito;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}