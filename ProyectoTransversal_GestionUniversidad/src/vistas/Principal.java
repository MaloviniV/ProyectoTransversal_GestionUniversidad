package vistas;

import accesoADatos.AlumnoData;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import entidades.Alumno;
import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/recursos/ulp-virtual.jpg"));
        Image miImagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        mAlumno = new javax.swing.JMenu();
        miFormAlumn = new javax.swing.JMenuItem();
        mMateria = new javax.swing.JMenu();
        miFormMater = new javax.swing.JMenuItem();
        mAdministracion = new javax.swing.JMenu();
        miManInsc = new javax.swing.JMenuItem();
        miManipNotas = new javax.swing.JMenuItem();
        mConsultas = new javax.swing.JMenu();
        miAlumnMater = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión Universidad");
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        escritorio.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        mAlumno.setBackground(new java.awt.Color(0, 255, 255));
        mAlumno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mAlumno.setText("Alumno");
        mAlumno.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        miFormAlumn.setText("Gestión Alumnos");
        miFormAlumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFormAlumnActionPerformed(evt);
            }
        });
        mAlumno.add(miFormAlumn);

        jMenuBar1.add(mAlumno);

        mMateria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mMateria.setText("Materia");
        mMateria.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        miFormMater.setText("Gestión de Materias");
        miFormMater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFormMaterActionPerformed(evt);
            }
        });
        mMateria.add(miFormMater);

        jMenuBar1.add(mMateria);

        mAdministracion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mAdministracion.setText("Administración");
        mAdministracion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        miManInsc.setText("Inscripciones");
        miManInsc.setName(""); // NOI18N
        miManInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miManInscActionPerformed(evt);
            }
        });
        mAdministracion.add(miManInsc);

        miManipNotas.setText("Carga de Notas");
        miManipNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miManipNotasActionPerformed(evt);
            }
        });
        mAdministracion.add(miManipNotas);

        jMenuBar1.add(mAdministracion);

        mConsultas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mConsultas.setText("Consultas");
        mConsultas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        miAlumnMater.setText("Alumnos por Materia");
        miAlumnMater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAlumnMaterActionPerformed(evt);
            }
        });
        mConsultas.add(miAlumnMater);

        jMenuBar1.add(mConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miFormAlumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFormAlumnActionPerformed
        mostrarPestaña(new GestionAlumnos());
    }//GEN-LAST:event_miFormAlumnActionPerformed

    private void miFormMaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFormMaterActionPerformed
        mostrarPestaña(new GestionMaterias());
    }//GEN-LAST:event_miFormMaterActionPerformed

    private void miManInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miManInscActionPerformed
        mostrarPestaña(new Inscripciones());
    }//GEN-LAST:event_miManInscActionPerformed

    private void miManipNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miManipNotasActionPerformed
        mostrarPestaña(new ActualizacionDeNotas());
    }//GEN-LAST:event_miManipNotasActionPerformed

    private void miAlumnMaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAlumnMaterActionPerformed
        mostrarPestaña(new ConsultaDeAlumnosPorMateria());
    }//GEN-LAST:event_miAlumnMaterActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mAdministracion;
    private javax.swing.JMenu mAlumno;
    private javax.swing.JMenu mConsultas;
    private javax.swing.JMenu mMateria;
    private javax.swing.JMenuItem miAlumnMater;
    private javax.swing.JMenuItem miFormAlumn;
    private javax.swing.JMenuItem miFormMater;
    private javax.swing.JMenuItem miManInsc;
    private javax.swing.JMenuItem miManipNotas;
    // End of variables declaration//GEN-END:variables

    private void mostrarPestaña(JInternalFrame x) {
        escritorio.removeAll();
        escritorio.repaint();
        x.setVisible(true);
        escritorio.add(x);
        
        //La ventana interna ocupa todo el escritorio (ventana principal)
        try {
            x.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
