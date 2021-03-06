/*
 * Conversor -  Copyright (C) 2013 
 * José María Valera Reales <chemaclass@outlook.es> Twitter: @Chemaclass
 * http://www.chemaclass.com
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Fhulano.AutomatasCelulares.juegovida;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author Chemaclass
 * @version 1.0
 */
public class Vida extends javax.swing.JFrame {

    /**
     * Creates new form Vida
     */
    public Vida() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taTablero = new javax.swing.JTextArea();
        btStart = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btPause = new javax.swing.JButton();
        btStop = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spVelocidad = new javax.swing.JSpinner();
        spTamY = new javax.swing.JSpinner();
        spTamX = new javax.swing.JSpinner();
        lbConsole = new javax.swing.JLabel();
        tfIniciales = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel1.setText("Juego de la Vida");

        taTablero.setColumns(20);
        taTablero.setRows(5);
        jScrollPane1.setViewportView(taTablero);

        btStart.setText("Start");
        btStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStartActionPerformed(evt);
            }
        });

        jLabel2.setText("Tamaño del tablero");

        jLabel3.setText("x");

        jLabel4.setText("y");

        btPause.setText("Pause");
        btPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPauseActionPerformed(evt);
            }
        });

        btStop.setText("Stop");
        btStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStopActionPerformed(evt);
            }
        });

        jLabel5.setText("@Chemaclass");

        jLabel6.setText("Velocidad(ms)");

        spVelocidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spVelocidadStateChanged(evt);
            }
        });

        spTamY.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spTamYStateChanged(evt);
            }
        });

        spTamX.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spTamXStateChanged(evt);
            }
        });

        lbConsole.setText("Welcome!");

        tfIniciales.setText("5,4 5,6 5,7 6,5 6,8 8,7 0,7 0,9 0,11 1,8 1,9 1,12");
        tfIniciales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfInicialesKeyPressed(evt);
            }
        });

        jLabel7.setText("Coordenadas iniciales así x,y :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spTamX, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spTamY, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btStart, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btPause)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btStop))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfIniciales)))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbConsole)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbConsole))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btStart)
                    .addComponent(btPause)
                    .addComponent(btStop)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(spTamY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spTamX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(spVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIniciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStartActionPerformed

        lbConsole.setText("Start");
        //Si está pausado le decimos que se reanude
        if (estado == Estado.STARTED) {
            juego.setRunning(true);
        } //De lo contrario le decimos que empiece un nuevo juego
        else {
            comenzar();
        }        
        btStart.setEnabled(false);
    }//GEN-LAST:event_btStartActionPerformed

    private void comenzar() {

        ArrayList<HashMap<String, Integer>> coordenadas = getCoorIni();

        int tamX = (int) spTamY.getValue();
        int tamY = (int) spTamX.getValue();

        char tablero[][] = new char[tamX][tamY];
        int velocidad = (int) spVelocidad.getValue();
        //Si no se han mandado coordenadas entonces se pondrá el test default
        if (coordenadas.isEmpty()) {
            juego = new Juego(taTablero, tablero, velocidad);
        } //de lo contrario se establecerán dichas coordenadas
        else {
            juego = new Juego(taTablero, tablero, velocidad, coordenadas);
        }
        juego.start();
        estado = Estado.STARTED;
        lbConsole.setText("New game!");
    }

    /**
     * Obtener las coordenadas que se escriben en el input
     *
     * @return lista de hashmap con las coordenadas
     */
    private ArrayList<HashMap<String, Integer>> getCoorIni() {

        String input = tfIniciales.getText().toString();
        //Obtenemos todas las coordenadas, separadas por un espacio
        StringTokenizer st = new StringTokenizer(input, " ");
        ArrayList<HashMap<String, Integer>> coordenadas = new ArrayList();

        try {
            //Mientras haya elementos en el input
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                // Las coordenadas están separadas por una coma ','
                StringTokenizer stmap = new StringTokenizer(token, ",");
                int x = Integer.parseInt(stmap.nextToken());
                int y = Integer.parseInt(stmap.nextToken());
                //Creamos un mapa en el que guardaremos las coordenadas de cada elemento
                HashMap<String, Integer> elemento = new HashMap();
                elemento.put("x", x);
                elemento.put("y", y);
                //añadimos el elemento a la lista
                coordenadas.add(elemento);
                //System.err.println("elemento: "+elemento.toString()+" - size:"+coordenadas.size());
            }
        } catch (java.util.NoSuchElementException | java.lang.NumberFormatException e) {
            //No hay 2 elementos
            System.err.println("NoSuchElementException|java.lang.NumberFormatException> " + e.getMessage());
        }

        return coordenadas;
    }

    private void btPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPauseActionPerformed

        lbConsole.setText("Pause");
        juego.setRunning(false);
        btStart.setEnabled(true);
    }//GEN-LAST:event_btPauseActionPerformed

    private void btStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStopActionPerformed

        lbConsole.setText("Stop");
        juego.stop();
        btStart.setEnabled(true);
        estado = Estado.STOPED;
    }//GEN-LAST:event_btStopActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        spTamX.setValue(55);
        spTamY.setValue(16);
        spVelocidad.setValue((int) 1000);

    }//GEN-LAST:event_formComponentShown

    private void spTamYStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spTamYStateChanged
        if ((int) spTamY.getValue() < 1) {
            spTamY.setValue(1);
        }
    }//GEN-LAST:event_spTamYStateChanged

    private void spTamXStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spTamXStateChanged
        if ((int) spTamX.getValue() < 1) {
            spTamX.setValue(1);
        }
    }//GEN-LAST:event_spTamXStateChanged

    private void spVelocidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spVelocidadStateChanged
        if ((int) spVelocidad.getValue() < 1) {
            spVelocidad.setValue(1);
        }
        if (juego != null) {
            juego.setVelocidad((int) spVelocidad.getValue());
        }
    }//GEN-LAST:event_spVelocidadStateChanged

    private void tfInicialesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfInicialesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            comenzar();
        }
    }//GEN-LAST:event_tfInicialesKeyPressed

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
            java.util.logging.Logger.getLogger(Vida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vida().setVisible(true);
            }
        });
    }
    private Juego juego;
    private Estado estado;

    enum Estado {

        STARTED, STOPED
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPause;
    private javax.swing.JButton btStart;
    private javax.swing.JButton btStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbConsole;
    private javax.swing.JSpinner spTamX;
    private javax.swing.JSpinner spTamY;
    private javax.swing.JSpinner spVelocidad;
    private javax.swing.JTextArea taTablero;
    private javax.swing.JTextField tfIniciales;
    // End of variables declaration//GEN-END:variables
}
