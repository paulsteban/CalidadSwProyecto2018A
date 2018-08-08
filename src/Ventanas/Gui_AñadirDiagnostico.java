/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Cita;
import Clases.Conexion;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Clases.Consulta;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Gui_AñadirDiagnostico extends javax.swing.JDialog {

    public Gui_AñadirDiagnostico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
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
        jLabel7 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDr = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsulta = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtReceta = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Consulta | Diagnostico | Receta | Archivos al expediente");
        setBackground(new java.awt.Color(153, 255, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Nombre del Paciente:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 180, 39));

        txtPaciente.setEditable(false);
        txtPaciente.setDoubleBuffered(true);
        getContentPane().add(txtPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 243, 39));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Médico Tratrante:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 140, 39));

        txtDr.setEditable(false);
        getContentPane().add(txtDr, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 243, 39));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel14.setText("Motivo de la Consulta:*");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 39));

        txtConsulta.setColumns(20);
        txtConsulta.setRows(5);
        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtConsulta);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 800, 120));

        jLabel15.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel15.setText("Diagnóstico Médico:*");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 180, 39));

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        txtDiagnostico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiagnosticoKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtDiagnostico);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 800, 130));

        jLabel16.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel16.setText("Tratamiento-Medicamentos Recetados:*");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 310, 39));

        txtReceta.setColumns(20);
        txtReceta.setRows(5);
        jScrollPane3.setViewportView(txtReceta);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 790, 120));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 110, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355589_floppy.png"))); // NOI18N
        jButton2.setText("Guardar Atención Médica");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, 40));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Adjuntar.png"))); // NOI18N
        jButton4.setText("Adjuntar Archivos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 860, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paciente.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/medico.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, 70));

        jLabel3.setBackground(new java.awt.Color(153, 255, 153));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel3.setText("REGISTRO DE ATENCIÓN MÉDICA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 350, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String Paciente;
    private String Medico;
    private int ID_Cita = 0;
    private Gui_AgreAtencionMedica AC;

    public void setAC(Gui_AgreAtencionMedica AC) {
        this.AC = AC;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    public void setID_Cita(int ID_Cita) {
        this.ID_Cita = ID_Cita;
    }

    public void MostrarDrPaciente() {
        txtDr.setText(Medico);
        txtPaciente.setText(Paciente);
    }

    public void Guardar() {
        String ConsultaF = txtConsulta.getText().trim();
        String Diagnostico = txtDiagnostico.getText().trim();
        String Receta = txtReceta.getText().trim();

        if (ID_Cita == 0 || ("".equals(ConsultaF) && "".equals(Diagnostico) && "".equals(Receta))) {
            JOptionPane.showMessageDialog(this, "Complete los campos necesarios",
                    "Complete", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Consulta.Agregar_Consulta(ID_Cita, ConsultaF, Diagnostico, Receta);
        Cita.Cita_Atendida(ID_Cita);

        AC.dispose();

        this.setVisible(false);

        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("ID_C", ID_Cita);

        File miDir = new File("");

        String reporte = miDir.getAbsolutePath() + "/src/Reportes/Receta.jasper";

        JasperPrint jp = null;
        try {
            jp = JasperFillManager.fillReport(reporte, parametros, Conexion.con);
        } catch (JRException ex) {

            //   Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        JasperViewer view = new JasperViewer(jp, false);
        view.setTitle("Receta - " + Paciente.trim());

        view.setZoomRatio((float) 0.95);
        view.setVisible(true);

        view.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        view.toFront();

        CopiarArchivos();

        this.dispose();

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Guardar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    int returnVal = 1;
    File[] files;

    public void CopiarArchivos() {

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyy hh_mm a");
            String Fecha = sdf.format(date);
            String carpeta = "/Expedientes/" + Paciente.trim() + "/Cita_" + ID_Cita + "_Fecha_" + Fecha;
            String SO = System.getProperty("os.name");
            CharSequence windows = "windows";
            if (SO.toLowerCase().contains(windows)) {

                carpeta = carpeta.replace('/', '\\');
            }
            File ruta = new File("");
            String ruta_carpeta = ruta.getAbsolutePath() + carpeta;

            File folder = new File(ruta_carpeta);

            if (!folder.exists()) {
                folder.mkdirs();
            }

            CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
            };

            for (File file : files) {
                String ruta_archivo_destino = ruta_carpeta + "/" + file.getName();

                if (SO.toLowerCase().contains(windows)) {

                    ruta_archivo_destino = ruta_archivo_destino.replace('/', '\\');
                }
                Path TO = Paths.get(ruta_archivo_destino);
                Path FROM = Paths.get(file.getAbsolutePath());

                //   File target = new File("/"+file.getName());
                try {
                    Files.copy(FROM, TO, options);
                    // Files.copy(Paths.get(System.getProperty("user.dir"),ruta_carpeta), file.toPath());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Archivos No guardados en el expediente " + Paciente.trim() + ""
                            + "en la carpeta Cita_" + ID_Cita + "_Fecha_" + Fecha,
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;

                }

            }

            JOptionPane.showMessageDialog(this, "Archivos guardados en el expediente de " + Paciente.trim() + ""
                    + "en la carpeta Cita_" + ID_Cita + "_Fecha_" + Fecha,
                    "Guardado", JOptionPane.INFORMATION_MESSAGE);

            int opcion = JOptionPane.showConfirmDialog(this, "Desea ver los archivos del expediente?", "Ver archivos", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                Desktop desktop = null;

                if (Desktop.isDesktopSupported()) {
                    desktop = Desktop.getDesktop();
                }
                try {
                    desktop.open(folder);
                } catch (IOException e) {
                }
            }
        }

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        returnVal = chooser.showOpenDialog(this);
        files = chooser.getSelectedFiles();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_TAB) {
            txtDiagnostico.requestFocus();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_txtConsultaKeyTyped

    private void txtDiagnosticoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiagnosticoKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_TAB) {
            txtReceta.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnosticoKeyTyped

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
            java.util.logging.Logger.getLogger(Gui_AñadirDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_AñadirDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_AñadirDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_AñadirDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Gui_AñadirDiagnostico dialog = new Gui_AñadirDiagnostico(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtConsulta;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtDr;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextArea txtReceta;
    // End of variables declaration//GEN-END:variables
}
