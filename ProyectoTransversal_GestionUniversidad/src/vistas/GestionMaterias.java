package vistas;

import accesoADatos.MateriaData;
import entidades.Materia;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class GestionMaterias extends javax.swing.JInternalFrame {
    
    MateriaData matData = new MateriaData();
    Materia materiaActual = null;
    
    public GestionMaterias() {
        initComponents();
        ocultarBarraTitulo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pCuerpo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTAño = new javax.swing.JTextField();
        pBotonesInf = new javax.swing.JPanel();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jCEstado = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(0, 153, 153));
        setTitle("GESTIÓN MATERIAS");

        jPanel1.setLayout(new java.awt.BorderLayout());

        pTitulo.setBackground(new java.awt.Color(153, 204, 255));
        pTitulo.setPreferredSize(new java.awt.Dimension(696, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/estrategia-de-negocios.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIÓN MATERIAS");

        javax.swing.GroupLayout pTituloLayout = new javax.swing.GroupLayout(pTitulo);
        pTitulo.setLayout(pTituloLayout);
        pTituloLayout.setHorizontalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTituloLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pTituloLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel7))
        );
        pTituloLayout.setVerticalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(pTitulo, java.awt.BorderLayout.NORTH);

        pCuerpo.setBackground(new java.awt.Color(153, 204, 255));
        pCuerpo.setMinimumSize(new java.awt.Dimension(696, 62));
        pCuerpo.setPreferredSize(new java.awt.Dimension(696, 390));
        pCuerpo.setLayout(new java.awt.BorderLayout());

        jLabel9.setText("     ");
        pCuerpo.add(jLabel9, java.awt.BorderLayout.EAST);

        jLabel8.setText("     ");
        pCuerpo.add(jLabel8, java.awt.BorderLayout.WEST);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText(" ");
        pCuerpo.add(jLabel10, java.awt.BorderLayout.SOUTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        pDatos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Año:");

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Estado:");

        jTNombre.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N

        jTAño.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N

        pBotonesInf.setMinimumSize(new java.awt.Dimension(690, 30));
        pBotonesInf.setPreferredSize(new java.awt.Dimension(688, 50));

        jBNuevo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil (1).png"))); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar-datos (1).png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salida (1).png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/basura (1).png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBotonesInfLayout = new javax.swing.GroupLayout(pBotonesInf);
        pBotonesInf.setLayout(pBotonesInfLayout);
        pBotonesInfLayout.setHorizontalGroup(
            pBotonesInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesInfLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pBotonesInfLayout.setVerticalGroup(
            pBotonesInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jBBuscar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar (1).png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Código:");

        jTID.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N

        jCEstado.setText("ACTIVO");

        javax.swing.GroupLayout pDatosLayout = new javax.swing.GroupLayout(pDatos);
        pDatos.setLayout(pDatosLayout);
        pDatosLayout.setHorizontalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jCEstado)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(pDatosLayout.createSequentialGroup()
                .addComponent(pBotonesInf, javax.swing.GroupLayout.PREFERRED_SIZE, 650, Short.MAX_VALUE)
                .addContainerGap())
        );
        pDatosLayout.setVerticalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCEstado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(pBotonesInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel2.add(pDatos, java.awt.BorderLayout.CENTER);

        pCuerpo.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.add(pCuerpo, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        
        try {
            Integer id = Integer.parseInt(jTID.getText());
            materiaActual = matData.buscarMateria(id);
            if (materiaActual != null) {
                jTNombre.setText(materiaActual.getNombre());
                jTAño.setText(Integer.toString(materiaActual.getAnioMateria()));
                jCEstado.setSelected(materiaActual.isActivo());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        
            String nombre = jTNombre.getText();
            Integer año = Integer.parseInt(jTAño.getText());
            Boolean estado = jCEstado.isSelected();
            if (nombre.isEmpty() || año == null) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                return;
            }
            if (materiaActual == null) {
                materiaActual = new Materia(nombre, año, estado);
                matData.guardarMateria(materiaActual);
            } else {
                materiaActual.setNombre(nombre);
                materiaActual.setAnioMateria(año);
                materiaActual.setActivo(estado);
                matData.modificarMateria(materiaActual);
            }

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        
        limpiarCampos();
        
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        
        if (materiaActual != null) {
            matData.eliminarMateria(materiaActual.getIdMateria());
            materiaActual = null;
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No hay una materia seleccionada");
        }
        
    }//GEN-LAST:event_jBEliminarActionPerformed

    
    public void limpiarCampos(){
        jTID.setText("");
        jTNombre.setText("");
        jTAño.setText("");
        jCEstado.setSelected(false);
        materiaActual = null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JCheckBox jCEstado;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTAño;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JPanel pBotonesInf;
    private javax.swing.JPanel pCuerpo;
    private javax.swing.JPanel pDatos;
    private javax.swing.JPanel pTitulo;
    // End of variables declaration//GEN-END:variables

        public void ocultarBarraTitulo(){
        JComponent Barra = null;
        Dimension dimBarra = null;
        Barra = ((BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0,0);
        Barra.setPreferredSize(new Dimension(0,0));
        repaint();
    }
}
