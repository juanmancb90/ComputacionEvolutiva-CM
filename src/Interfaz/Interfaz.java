/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*Esta clase contiene la generacionde JFrmae correspondientes a los componentes
*graficos de la aplicacion y generacion de eventos para cada componente.
*Ademas se incluye los contructores de objetos de cada clase para invocar los 
*métodos necesarios para mostrar la solucion obtenida
*/
package Interfaz;

import Logica.Seleccion;
import Logica.controlador;
import Logica.cromosoma;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author Denilson Basante
 * @author Juan Manuel Chaguendo Bermeo
 */

//Creacion de la interfaz Gráfica del proyecto codigo por defecto que genera netbeans
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    controlador ctrl;
    Seleccion sel;
    private JLabel[][] jlabel;
    
    
    public Interfaz() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jSPSolucion = new javax.swing.JScrollPane();
        jPCuadro = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jBAplicar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTFtam = new javax.swing.JTextField();
        jBReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFcruce = new javax.swing.JTextField();
        jTFmut = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAResultado = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMISalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMIacerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Computación Evolutiva-Basante, Chaguendo");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/UNIVALLE.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Proyecto de Computación Evolutiva");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cuadro Magicos-Algoritmos Geneticos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Solución Cuadro Mágico-GA"));

        jPCuadro.setToolTipText("Solucion del cuadro magico");

        javax.swing.GroupLayout jPCuadroLayout = new javax.swing.GroupLayout(jPCuadro);
        jPCuadro.setLayout(jPCuadroLayout);
        jPCuadroLayout.setHorizontalGroup(
            jPCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        jPCuadroLayout.setVerticalGroup(
            jPCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        jSPSolucion.setViewportView(jPCuadro);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSPSolucion)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSPSolucion)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Controles"));

        jBAplicar.setText("Aplicar GA");
        jBAplicar.setToolTipText("Aplicar algoritmo genetico");
        jBAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAplicarActionPerformed(evt);
            }
        });

        jLabel7.setText("Tamaño del Cuadro Magico NxN:");

        jTFtam.setText("0");
        jTFtam.setToolTipText("Ingrese el tamaño del Cuadro aqui");
        jTFtam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFtamMouseClicked(evt);
            }
        });

        jBReset.setText("Reset");
        jBReset.setToolTipText("Reset de los componentes de la interfaz");
        jBReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResetActionPerformed(evt);
            }
        });

        jLabel2.setText("Porcentaje de Cruce:");

        jLabel5.setText("Limite de generación:");
        jLabel5.setToolTipText("");

        jTFcruce.setText("0.2");
        jTFcruce.setToolTipText("Ingrese un porcentaje de Cruce");
        jTFcruce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFcruceMouseClicked(evt);
            }
        });

        jTFmut.setText("1000");
        jTFmut.setToolTipText("Ingrese un numero limite de generaciones");
        jTFmut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFmutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFtam)
                    .addComponent(jTFcruce)
                    .addComponent(jTFmut, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBAplicar)
                        .addGap(18, 18, 18)
                        .addComponent(jBReset))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTFtam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFcruce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTFmut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jTAResultado.setColumns(20);
        jTAResultado.setRows(5);
        jTAResultado.setToolTipText("Resultados de la mejor solucion");
        jScrollPane1.setViewportView(jTAResultado);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMISalir.setText("Salir");
        jMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMISalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMIacerca.setText("Acerca de");
        jMIacerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIacercaActionPerformed(evt);
            }
        });
        jMenu2.add(jMIacerca);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Vincular el eventon de salir de la aplicacion al item del menu archivo
    private void jMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMISalirActionPerformed

    //Vincular el evento para mostrar la informacion de los integrantes del proyecto al item acerca de 
    private void jMIacercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIacercaActionPerformed
        // TODO add your handling code here:
        String acercaDe = "Computacion Evolutiva\n"
                + "PROYECTO: Problema Cuadros Magicos-Algoritmo Geneticos\n" + "\n"
                + "FECHA: Junio 11 de 2014\n" + "\n" + "AUTORES:\n"
                + "Denilson Basante-1223086\n" + "denilson.basante@correounivalle.edu.co\n" + "\n"
                + "Juan Manuel Chaguendo-1210090\n" + "juan.chaguendo@correounivalle.edu.co\n" + "\n"
                + "ESCUELA DE INGENIERIA DE SISTEMAS Y COMPUTACION\n" + "UNIVERSIDAD DEL VALLE";

        JOptionPane.showMessageDialog(this, acercaDe, "Acerda de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMIacercaActionPerformed

    private void jBAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAplicarActionPerformed
        // TODO add your handling code here:
        //desactivar componentes mientras se encunetra la solucion del cuadro magico
        jBAplicar.setEnabled(false);
        jTFtam.setEnabled(false);
        jTFtam.setEditable(false);
        jTFcruce.setEnabled(false);
        jTFcruce.setEditable(false);
        jTFmut.setEnabled(false);
        jTFmut.setEditable(false);
    
        long time_start, time_end;
        
       //verificar que los campos no esten vacios
        if((jTFtam.getText() != null) || (jTFcruce.getText() != null ) || (jTFmut.getText() != null))
        {
            
            //capturar valor de entrada del usuario
           int vltam = Integer.parseInt(jTFtam.getText());
           double vlcruce= Double.parseDouble(jTFcruce.getText());
           int limitegeneracion = Integer.parseInt(jTFmut.getText());
           
           
           //creacion del objeto ctrl de la clase controlador con el valor ingresado por el usuario
           ctrl = new controlador(vltam,vlcruce,limitegeneracion);
           
           //capturar tiempo de ejecucion inicial 
           time_start = System.currentTimeMillis();
           
           //Aplicar el algoritmo genetico y cagar la matriz de solucion 
           ctrl.aplicarGA();
           int [][] matriz = ctrl.sel.matrizSolucion();
           
           //capturar el timpo final de ejecucion 
           time_end = System.currentTimeMillis();
           long total_time = (time_end - time_start ) / 1000;
           System.out.println(time_start);
           
           //invocar el metodo de graficacion de la mejor solucion del cuadro magico
           this.graficar(vltam, matriz);
           
           //construccion del string para mostrar resultados acerca de la solucion
           StringBuilder rs=new StringBuilder();
           rs.append("Tiempo de la solucion: "+total_time+" seg.\nGeneracion: "+ctrl.sel.pb.num_generacion +"\nFuncion de Aptitud: "+ctrl.sel.calificacion+" \n");
           jTAResultado.setText(rs.toString());
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Ingrese un valores valido");
        }
    }//GEN-LAST:event_jBAplicarActionPerformed

    private void jTFtamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFtamMouseClicked
        // TODO add your handling code here:
        //borrar el contenido del campo al hacer clic 
        jTFtam.setText("");
    }//GEN-LAST:event_jTFtamMouseClicked

    private void jBResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResetActionPerformed
        // TODO add your handling code here:
        //Borrar los datos y resultamos de los componentes de la interfaz
        //Se vuelve a activar los componentes
        jTFtam.setEnabled(true);
        jTFtam.setEditable(true);
        jTFcruce.setEnabled(true);
        jTFcruce.setEditable(true);
        jTFmut.setEnabled(true);
        jTFmut.setEditable(true);
        jTFcruce.setText("0.2");
        jTFtam.setText("3");
        jTFmut.setText("1000");
        jTAResultado.setText("");
        jPCuadro.removeAll();
        jPCuadro.repaint();
        jBAplicar.setEnabled(true);   
    }//GEN-LAST:event_jBResetActionPerformed

    private void jTFcruceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFcruceMouseClicked
        // TODO add your handling code here:
        //borrar el contenido del campo al hacer clic 
        jTFcruce.setText("");
    }//GEN-LAST:event_jTFcruceMouseClicked

    private void jTFmutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFmutMouseClicked
        // TODO add your handling code here:
        //borrar el contenido del campo al hacer clic 
        jTFmut.setText("");
    }//GEN-LAST:event_jTFmutMouseClicked

    public void graficar (int tamaño, int[][] matriz) 
    {  
        //configuracion del panel y jlabel[][]
        jPCuadro.setLayout(new GridLayout(tamaño, tamaño));
        jlabel = new JLabel[tamaño][tamaño];
        
        //asigancion del borde de cada JLabel
        Border border = BorderFactory.createLineBorder(Color.black, 1);
        
        //dos ciclos que recorren la matriz de solucion del algoritmo genetico para mostrar en el JPanel
        for (int i = 0; i < tamaño; i++) 
        {
            for (int j = 0; j < tamaño; j++) 
            {
                // inicializacion de cada JLabel e inserccion en el Jpanel
                jlabel[i][j] = new JLabel();
                jlabel[i][j].setText(String.valueOf(matriz[i][j]));
                jPCuadro.add(jlabel[i][j]);
                
                // configuracion de propiedades de cada JLabel
                jlabel[i][j].setHorizontalAlignment(SwingConstants.CENTER);
                jlabel[i][j].setBorder(border);
            }
        }
    }
 
    /**
     * @param args the command line arguments
     */
    
    //Ejecucion del proyecto 
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAplicar;
    private javax.swing.JButton jBReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenuItem jMIacerca;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPCuadro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jSPSolucion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTAResultado;
    private javax.swing.JTextField jTFcruce;
    private javax.swing.JTextField jTFmut;
    private javax.swing.JTextField jTFtam;
    // End of variables declaration//GEN-END:variables
}
