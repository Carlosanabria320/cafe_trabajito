/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Diseño;

import Archivos_Planos.fecha;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatLightOwlIJTheme;
import javax.swing.UIManager;

public class Productos extends javax.swing.JFrame {

    fecha f1 = new fecha();

    public Productos() {
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
        mmostrarfecha();
    }

    public void mmostrarfecha() {

        Fecha_6.setText(f1.fe);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Fecha_6 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Georgia", 3, 43)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 102, 0));
        jLabel36.setText("AROMA");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 47));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel39.setText("NIT: 0012023014403-12");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        jLabel38.setFont(new java.awt.Font("Impact", 0, 90)); // NOI18N
        jLabel38.setText("Agregar");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel40.setFont(new java.awt.Font("Georgia", 1, 35)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 102, 0));
        jLabel40.setText("&");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jLabel41.setFont(new java.awt.Font("Impact", 0, 90)); // NOI18N
        jLabel41.setText("Productos");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel42.setFont(new java.awt.Font("Georgia", 3, 43)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 102, 0));
        jLabel42.setText("ESPÚMA");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xls-file_9680334 (1).png"))); // NOI18N
        jPanel2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 90, 90, 65));

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivo-pdf.png"))); // NOI18N
        jPanel2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 90, 85, 65));

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 13, 150));

        jLabel63.setFont(new java.awt.Font("Georgia", 1, 40)); // NOI18N
        jLabel63.setText("Exportar");
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 20, -1, 55));

        jLabel37.setFont(new java.awt.Font("Georgia", 1, 40)); // NOI18N
        jLabel37.setText("Datos");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 20, -1, 55));

        Fecha_6.setEditable(false);
        Fecha_6.setBackground(new java.awt.Color(255, 255, 255));
        Fecha_6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Fecha_6.setBorder(null);
        Fecha_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha_6ActionPerformed(evt);
            }
        });
        jPanel2.add(Fecha_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 131, 31));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 200, 22));
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 540, 22));
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 200, 22));
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 200, 22));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/product-owner_12575542 (1).png"))); // NOI18N
        jLabel10.setText("Id Producto");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 34));

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/categorizacion.png"))); // NOI18N
        jLabel11.setText("Categoria");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        jLabel15.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/products_4400754.png"))); // NOI18N
        jLabel15.setText("Nombre");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, 30));

        jLabel19.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/etiqueta-del-precio.png"))); // NOI18N
        jLabel19.setText("Precio");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, 30));

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Producto", "Nombre", "Categoria", "Precio", "Descripcion_Producto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, 720, 400));

        jLabel58.setBackground(new java.awt.Color(255, 102, 0));
        jLabel58.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel58.setText("Mostrar");
        jPanel3.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 600, -1, -1));

        jLabel59.setBackground(new java.awt.Color(255, 102, 0));
        jLabel59.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel59.setText("Actualizar");
        jPanel3.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 600, -1, -1));

        jLabel60.setBackground(new java.awt.Color(255, 102, 0));
        jLabel60.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel60.setText("Eliminar");
        jPanel3.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 600, -1, -1));

        jLabel61.setBackground(new java.awt.Color(255, 102, 0));
        jLabel61.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel61.setText("Crear Factura");
        jPanel3.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 600, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 102, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/product_815272 (1).png"))); // NOI18N
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 90, 50));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/product-description_17627492.png"))); // NOI18N
        jLabel16.setText("Descripción_Producto");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 36));

        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 540, 100));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 10, 500));
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 200, 20));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/package_925750.png"))); // NOI18N
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 510, 120, 90));

        jButton6.setBackground(new java.awt.Color(255, 102, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/product-return_12575552.png"))); // NOI18N
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 510, 120, 90));

        jButton8.setBackground(new java.awt.Color(255, 102, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_1898856.png"))); // NOI18N
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 510, 120, 90));

        jButton9.setBackground(new java.awt.Color(255, 102, 0));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 510, 120, 90));

        jButton7.setForeground(new java.awt.Color(255, 102, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion (2).png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 60, 40));

        jTextField6.setText("\n");
        jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 520, 32));

        jButton10.setBackground(new java.awt.Color(255, 102, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 120, 90));

        jLabel62.setBackground(new java.awt.Color(255, 102, 0));
        jLabel62.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel62.setText("Agregar");
        jPanel3.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 600, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/id-card_951575.png"))); // NOI18N
        jLabel1.setText("Id Ingrediente");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 200, 40));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 200, 40));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 200, 40));

        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 200, 40));

        jPanel3.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 200, 40));
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 200, 20));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/book_10509207.png"))); // NOI18N
        jLabel2.setText("Nombre Ingrediente");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Fecha_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha_6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            // UIManager.setLookAndFeel(new FlatLightLaf());

            FlatLightOwlIJTheme.setup();
            UIManager.put("Button.arc", 200);
            UIManager.put("TextComponent.arc", 100);
            UIManager.put("Component.arc", 100);
            
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fecha_6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
