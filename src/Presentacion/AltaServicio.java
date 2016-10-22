package Presentacion;

import DataTypes.DtServicio;
import Logica.Fabrica;
import Logica.ISistema;
import Manejadores.ManejadorCiudades;
import Manejadores.ManejadorProveedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Logica.Ciudad;
import Logica.Proveedor;
import Logica.Servicio;
import java.util.HashMap;
import java.util.Map;


public class AltaServicio extends javax.swing.JInternalFrame {

    private ISistema IS;
    private Menu menu;
    private AltaServicio2 ventana2;
    
    public AltaServicio(Menu men) {
        initComponents();
        ManejadorProveedor proveedores = ManejadorProveedor.getinstance();
        ManejadorCiudades ciudades = ManejadorCiudades.getInstance();
        
        entradaDescripcion.setLineWrap(true);
        entradaDescripcion.setWrapStyleWord(true);
        
        //ZONA DE DATOS DE PRUEBA
        //-------------------------------------------------------------------
        
        //-------------------------------------------------------------------
        ArrayList auxiliarProveedores = proveedores.getProveedores();
        ArrayList auxiliarCiudades = ciudades.getCiudades();
        
        
        int tamano = auxiliarProveedores.size();
        
        for(int i=0; i<tamano; i++){
            
            entradaProveedor.addItem(auxiliarProveedores.get(i).toString());
        }
        
        entradaCiudadDestino.addItem("");
        tamano = auxiliarCiudades.size();
        for(int i=0; i<tamano; i++){
            entradaCiudadOrigen.addItem(auxiliarCiudades.get(i).toString());
            entradaCiudadDestino.addItem(auxiliarCiudades.get(i).toString());
        }
        
        //Siguientes lineas sirven
        Fabrica fabrica = Fabrica.getInstance();
        //IS = fabrica.getISistema();
        menu = men;
        ventana2 = new AltaServicio2(this);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        entradaPrecio = new javax.swing.JTextField();
        entradaNombre = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        entradaDescripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        entradaProveedor = new javax.swing.JComboBox();
        entradaCiudadOrigen = new javax.swing.JComboBox();
        entradaCiudadDestino = new javax.swing.JComboBox();

        jLabel2.setText("Precio");

        jLabel1.setText("Descripcion");

        jLabel3.setText("Nombre");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        entradaDescripcion.setColumns(20);
        entradaDescripcion.setRows(5);
        jScrollPane1.setViewportView(entradaDescripcion);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Alta Servicio");

        jLabel4.setText("Proveedor");

        jLabel5.setText("Ciudad Origen");

        jLabel7.setText("Ciudad Destino");

        entradaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSiguiente))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(entradaPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(entradaNombre)
                                    .addComponent(entradaProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(entradaCiudadOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(entradaCiudadDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(entradaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void entradaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaProveedorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        
        //Estas 6 lineas de codigo siguentes crean el dataType ahora pasa a la ventana 2
        //-----------------------------------------------------------------------------
        
        
        
        //ArrayList<String> cat = new ArrayList();
        if(entradaCiudadOrigen.getSelectedItem() == entradaCiudadDestino.getSelectedItem()){
            JOptionPane.showMessageDialog(null, "Las ciudades iguales","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            if(entradaNombre.getText().isEmpty() || entradaDescripcion.getText().isEmpty() || entradaPrecio.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Hay campos vacios","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                    Float.parseFloat(entradaPrecio.getText());
                    menu.add(ventana2);
                    this.setVisible(false);
                    ventana2.setVisible(true);
                }catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "Precio no es un campo numerico","Error",JOptionPane.ERROR_MESSAGE);
                }  
            }
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    public String getEntradaNombre(){
        return entradaNombre.getText();
    }
    
    public String getEntradaPrecio(){
        return entradaPrecio.getText();
    }
    
    public String getEntradaDescripcion(){
        return entradaDescripcion.getText();
    }
    
    public String getEntradaProveedor(){
        return entradaProveedor.getSelectedItem().toString();
    }
    
    public String getEntradaCiudadOrigen(){
        return entradaCiudadOrigen.getSelectedItem().toString();
    }
    
    public void setVentana2(){
        ventana2 = new AltaServicio2(this);
    }
    
    public String getEntradaCiudadDestino(){
        return entradaCiudadDestino.getSelectedItem().toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox entradaCiudadDestino;
    private javax.swing.JComboBox entradaCiudadOrigen;
    private javax.swing.JTextArea entradaDescripcion;
    private javax.swing.JTextField entradaNombre;
    private javax.swing.JTextField entradaPrecio;
    private javax.swing.JComboBox entradaProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}