import java.util.ArrayList;
import java.util.List;
import milibreria.OperacionFactura;

public class VentaProductos extends javax.swing.JPanel {
     //public static List<VentaProductos> Ventas = new ArrayList<>();
     //public static List<Productos> productos = new ArrayList<>();
     
    // Guardar el contenido actualde la factura (Variable Global)
     public static String ultimaFactura="";
     
    
     
    public VentaProductos() {
        initComponents();
        // Cuando crees el panel, carga la factura guardada (si hay)
        lblfactura.setText(ultimaFactura);//Obtiene la factura cuando crea la venta y no la borra
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        p2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etnombrep = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        etcantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdbmedellin = new javax.swing.JRadioButton();
        rdbnacional = new javax.swing.JRadioButton();
        rdbeuropa = new javax.swing.JRadioButton();
        rdbasia = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btncomprar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        etvalor = new javax.swing.JTextField();
        lblfactura = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        etnombreC = new javax.swing.JTextField();

        p2.setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sistema de Ventas y Envio");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre del Producto:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad del Producto: ");

        etcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etcantidadActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Envio ");

        buttonGroup1.add(rdbmedellin);
        rdbmedellin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbmedellin.setText("Medellin (Sin recargo)");

        buttonGroup1.add(rdbnacional);
        rdbnacional.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbnacional.setText("Nacional (5% de recargo)");
        rdbnacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbnacionalActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbeuropa);
        rdbeuropa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbeuropa.setText("Europa (10% de recargo)");
        rdbeuropa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbeuropaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbasia);
        rdbasia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbasia.setText("Asia (15% de recargo)");
        rdbasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbasiaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setText("Se aplicara recargo segun el valor del producto");

        btncomprar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncomprar.setText("Comprar");
        btncomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomprarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Valor: ");

        lblfactura.setText("-");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Comprador:");

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p2Layout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(jLabel5))
                            .addGroup(p2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etnombrep, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p2Layout.createSequentialGroup()
                                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etnombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(p2Layout.createSequentialGroup()
                                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(rdbmedellin)
                                    .addComponent(rdbnacional)
                                    .addComponent(rdbeuropa)
                                    .addComponent(rdbasia)
                                    .addComponent(btncomprar)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(lblfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(245, 245, 245))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(etnombrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(etcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(etnombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbmedellin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbnacional)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbeuropa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbasia)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(btncomprar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdbnacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbnacionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbnacionalActionPerformed

    private void rdbeuropaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbeuropaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbeuropaActionPerformed

    private void rdbasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbasiaActionPerformed

    private void btncomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomprarActionPerformed
    
        //operaciones.imprimirF(
    //variables para obtener el valor de los textfield
    String nombreP = etnombrep.getText();
    int cantidad = Integer.parseInt(etcantidad.getText());
    double valor = Double.parseDouble(etvalor.getText());
    String nombreC = etnombreC.getText();
    

    //Seleccionar los checkbuttons
    String origen = "medellin";
    
    if(rdbnacional.isSelected()) 
        origen = "Nacional";
    else if(rdbeuropa.isSelected())
        origen = "Europa";
    else if(rdbasia.isSelected())
        origen = "Asia";
     // Generar la factura
            String facturaGenerada = OperacionFactura.generarFactura(nombreC, cantidad, valor, nombreP, origen);

            // Mostrar la factura en el JLabel
            lblfactura.setText(facturaGenerada);

            // Guardar como última factura
            ultimaFactura = facturaGenerada;
    }//GEN-LAST:event_btncomprarActionPerformed

    private void etcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etcantidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncomprar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField etcantidad;
    private javax.swing.JTextField etnombreC;
    private javax.swing.JTextField etnombrep;
    private javax.swing.JTextField etvalor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblfactura;
    private javax.swing.JPanel p2;
    private javax.swing.JRadioButton rdbasia;
    private javax.swing.JRadioButton rdbeuropa;
    private javax.swing.JRadioButton rdbmedellin;
    private javax.swing.JRadioButton rdbnacional;
    // End of variables declaration//GEN-END:variables
}
