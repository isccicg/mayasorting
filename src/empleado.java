//////////////////////////////////////////////////////////////////////////////////
import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.DPFPDataAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPDataEvent;
import com.digitalpersona.onetouch.capture.event.DPFPErrorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPErrorEvent;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent;
import com.digitalpersona.onetouch.capture.event.DPFPSensorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPSensorEvent;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
////////////////////////////////////////////////////////////////////////////////////
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

public class empleado extends javax.swing.JFrame {
    
    //Variables que ayudan a capturar, enrolar y verificar
    private DPFPCapture Lector = DPFPGlobal.getCaptureFactory().createCapture();
    private DPFPEnrollment Reclutador = DPFPGlobal.getEnrollmentFactory().createEnrollment();
    private DPFPVerification Verificador = DPFPGlobal.getVerificationFactory().createVerification();
    private DPFPTemplate template;
    public static String TEMPLATE_PROPERTY = "template";
    public DPFPFeatureSet featureinscripcion;
    public DPFPFeatureSet featureverificacion;

    /////////////////////////
    conexionMysql con = new conexionMysql();
    private Dimension dim;
    String codigo;
    String idEmpresa;
    //////////////////////////////////
    
    
    
    /**
     * Creates new form empleado
     */
    public empleado() {
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

        rSPanelsSlider1 = new rojeru_san.RSPanelsSlider();
        jPanel1 = new javax.swing.JPanel();
        rSPanelsSlider2 = new rojeru_san.RSPanelsSlider();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new rojeru_san.RSButtonRiple();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        lblNombre = new javax.swing.JLabel();
        btnMinimizar = new rojeru_san.RSButtonRiple();
        lblImg = new javax.swing.JLabel();
        lblImagenHuella = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnGuardar = new rojeru_san.RSButton();
        jPanel3 = new javax.swing.JPanel();
        rSPanelImage2 = new rojerusan.RSPanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(88, 90, 78));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btn-cerrar.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btn-minimizar.png"))); // NOI18N
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );

        rSPanelsSlider2.add(jPanel2, "card2");

        lblImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblImagenHuella.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(88, 90, 78));

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage2Layout = new javax.swing.GroupLayout(rSPanelImage2);
        rSPanelImage2.setLayout(rSPanelImage2Layout);
        rSPanelImage2Layout.setHorizontalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        rSPanelImage2Layout.setVerticalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addComponent(rSPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(rSPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(lblImagenHuella, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rSPanelsSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(lblImagenHuella, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rSPanelsSlider1.add(jPanel1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        stop();
        principal formPrincipal = new principal();
        formPrincipal.setLocationRelativeTo(null);
        this.setVisible(false);
        formPrincipal.setVisible(true);
        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try {
            guardarHuella();
            Reclutador.clear();
            lblImagenHuella.setIcon(null);
            stop();
            principal formPrincipal = new principal();
            formPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);
            formPrincipal.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Iniciar();
        start();
        EstadoHuellas();
        try {
            carga();
        } catch (SQLException ex) {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dato();
        lblNombre.setText(principal.nombreEmpleado);
        
        btnGuardar.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        // TODO add your handling code here:
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

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
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empleado().setVisible(true);
            }
        });
    }
    
     /////////////////////////////////////////////// metodos runable
    protected void Iniciar() {

        Lector.addDataListener(new DPFPDataAdapter() {
            public void dataAcquired(final DPFPDataEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        EnviarTexto("Huella Capturada");
                        procesarCaptura(e.getSample());
                    }
                });
            }
        });

        Lector.addReaderStatusListener(new DPFPReaderStatusAdapter() {
            @Override
            public void readerConnected(DPFPReaderStatusEvent dpfprs) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        EnviarTexto("Sensor de Huella Activado o conectado");
                    }
                });
            }

            @Override
            public void readerDisconnected(DPFPReaderStatusEvent dpfprs) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        EnviarTexto("Sensor de Huella esta desactivado o no conectado");
                    }
                });
            }
        });

        Lector.addSensorListener(new DPFPSensorAdapter() {
            public void fingerTouched(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        EnviarTexto("El dedo ha sido colocado sobre el lector de huella");
                    }
                });
            }

            public void fingerGone(final DPFPSensorAdapter e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        EnviarTexto("El dedo ha sido quitado del lector de huella");
                    }
                });
            }
        });

        Lector.addErrorListener(new DPFPErrorAdapter() {
            public void errorReader(final DPFPErrorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        EnviarTexto("Error: " + e.getError());
                    }
                });
            }
        });

    }
    
    //////////////////////////////// otros metodos
    public DPFPFeatureSet extraerCaracteristicas(DPFPSample sample, DPFPDataPurpose purpose) {
        DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
        try {
            return extractor.createFeatureSet(sample, purpose);
        } catch (DPFPImageQualityException e) {
            return null;
        }
    }
    /* Guarda los datos de la huella digital actual en la base de datos
     */
    public void guardarHuella() throws FileNotFoundException, IOException {
        //Obtiene los datos del template de la huella actual
        ByteArrayInputStream datosHuella = new ByteArrayInputStream(template.serialize());
        Integer tamañoHuella = template.serialize().length;
        try {
            
            Connection c = con.conectar(); //establece la conexion con la BD
            String sql = "SELECT * FROM ms_empleado WHERE codigo = ? AND ID_EMPRESA = ?";

            System.out.println("" + sql);
            System.out.println("" + codigo);
            System.out.println("" + idEmpresa);

            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setString(1, codigo);
            pstmt.setString(2, idEmpresa);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                //read the data from ResultSet
                PreparedStatement guardar = c.prepareStatement("UPDATE ms_empleado SET huella = ? WHERE codigo = ? AND ID_EMPRESA = ?");
                guardar.setBinaryStream(1, datosHuella);
                guardar.setString(2, codigo);
                guardar.setString(3, idEmpresa);
                guardar.execute();
                guardar.close();

                JOptionPane.showMessageDialog(null, "Huella Guardada Correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "El empleado no existe");
            }
            rs.close();
            pstmt.close();

            con.desconectar();

            btnGuardar.setEnabled(false);
            //btnVerificar.grabFocus();
        } catch (SQLException ex) {
            //Si ocurre un error lo indica en la consola
            System.err.println("Error al guardar los datos de la huella." + ex);
        } finally {
            con.desconectar();
        }
    }
    
    ////////////////////////
    /**
     * Verifica la huella digital actual contra otra en la base de datos
     */
    public void identificarHuella() throws IOException {
        try {
            //Establece los valores para la sentencia SQL
            Connection c = con.conectar();

            //Obtiene todas las huellas de la bd
            PreparedStatement identificarStmt = c.prepareStatement("SELECT nombre,huella FROM ms_empleado");
            ResultSet rs = identificarStmt.executeQuery();

            //Si se encuentra el nombre en la base de datos
            while (rs.next()) {
                //Lee la plantilla de la base de datos
                byte templateBuffer[] = rs.getBytes("huella");
                String nombre = rs.getString("nombre");
                //Crea una nueva plantilla a partir de la guardada en la base de datos
                DPFPTemplate referenceTemplate = DPFPGlobal.getTemplateFactory().createTemplate(templateBuffer);
                //Envia la plantilla creada al objeto contendor de Template del componente de huella digital
                setTemplate(referenceTemplate);
                // Compara las caracteriticas de la huella recientemente capturda con la
                // alguna plantilla guardada en la base de datos que coincide con ese tipo
                DPFPVerificationResult result = Verificador.verify(featureverificacion, getTemplate());
                //compara las plantilas (actual vs bd)
                //Si encuentra correspondencia dibuja el mapa
                //e indica el nombre de la persona que coincidió.
                if (result.isVerified()) {
                    //crea la imagen de los datos guardado de las huellas guardadas en la base de datos
                    JOptionPane.showMessageDialog(null, "Las huella capturada es de " + nombre, "Verificacion de Huella", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            //Si no encuentra alguna huella correspondiente al nombre lo indica con un mensaje
            JOptionPane.showMessageDialog(null, "No existe ningún registro que coincida con la huella", "Verificacion de Huella", JOptionPane.ERROR_MESSAGE);
            setTemplate(null);
        } catch (SQLException e) {
            //Si ocurre un error lo indica en la consola
            System.err.println("Error al identificar huella dactilar." + e.getMessage());
        } finally {
            con.desconectar();
        }
    }
    
    ////  esto es para verificar huella
    public void procesarCaptura(DPFPSample sample) {

        featureinscripcion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);
        featureverificacion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);

//System.out.println(data);
        if (featureinscripcion != null) {
            try {

                System.out.println("Las caracteristicas de la huella han sido creadas");
                Reclutador.addFeatures(featureinscripcion);
                Image image = CrearImagenHuella(sample);
                DibujarHuella(image);

                // System.out.println("dddd"+sample+""+featureinscripcion);
                // btnVerificar.setEnabled(true);
                //   btnIdentificar.setEnabled(true);
            } catch (DPFPImageQualityException ex) {
                System.err.println("Error: " + ex.getMessage());
            } finally {
                EstadoHuellas();
                switch (Reclutador.getTemplateStatus()) {
                    case TEMPLATE_STATUS_READY:
                        stop();
                        setTemplate(Reclutador.getTemplate());
                        EnviarTexto("La plantilla de la huella ha sido creada, ya puede verificarla o identificarla");
                        //           btnIdentificar.setEnabled(false);
                        // btnVerificar.setEnabled(false);
                        btnGuardar.setEnabled(true);
                        btnGuardar.grabFocus();
                        break;
                    case TEMPLATE_STATUS_FAILED:
                        Reclutador.clear();
                        stop();
                        EstadoHuellas();
                        setTemplate(null);
                        //mensaje avisando que falló la wea
                        start();
                        break;
                }
            }
        }
    }
    
    // verifica huella

    public Image CrearImagenHuella(DPFPSample sample) {
        return DPFPGlobal.getSampleConversionFactory().createImage(sample);
    }

    public void DibujarHuella(Image image) {
        lblImagenHuella.setIcon(new ImageIcon(
                image.getScaledInstance(lblImagenHuella.getWidth(), lblImagenHuella.getHeight(), image.SCALE_DEFAULT)
        ));
        repaint();
    }

    public void EstadoHuellas() {
        EnviarTexto("Muestra de Huellas necesarias para Guardar Template: " + Reclutador.getFeaturesNeeded());
    }

    public void EnviarTexto(String string) {
        txtArea.append(string + "\n");
    }

    public void start() {
        Lector.startCapture();
        EnviarTexto("Utilizando lector de huella");
    }

    public void stop() {
        Lector.stopCapture();
        EnviarTexto("No se está usando el lector de huella");
    }

    public DPFPTemplate getTemplate() {
        return template;
    }

    public void setTemplate(DPFPTemplate template) {
        DPFPTemplate old = this.template;
        this.template = template;
        firePropertyChange(TEMPLATE_PROPERTY, old, template);
    }
    ////////////////////////////////////////////////////////////////////
    
String codigoEmpleados;
public String datos(String codigoEmpleado){
    
    codigoEmpleados =codigoEmpleado;
    System.out.println("DATOS "+codigoEmpleado);         
    
    
    return codigoEmpleado;
}
public void carga() throws SQLException, MalformedURLException, FileNotFoundException, IOException{
    //System.out.println("IMAGEN"+principal.codigoEmpleado);
    codigo =principal.codigoEmpleado;
    PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = con.conectar();
            String sql = "SELECT rutaFotografia,ID_EMPRESA FROM ms_empleado WHERE codigo = '" + principal.codigoEmpleado + "' AND ID_EMPRESA = (SELECT ID_EMPRESA FROM ms_empresa WHERE nombre = '" + login.nomEmpresa + "')";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            String rutaImg = rs.getString("rutaFotografia");
            
            System.out.println("imagenenss"+rutaImg);
            
            
              
            
          // try{
           
                idEmpresa = rs.getString("ID_EMPRESA");
                System.out.println("" + rutaImg);
                if(!rutaImg.equals(""))
                {
                    String rutaCon = "";
                    File file = new File("C:\\config.txt"); 
                    BufferedReader br = new BufferedReader(new FileReader(file)); 
                    rutaCon = br.readLine();
                    System.out.println(rutaCon);
                    URL url = new URL("http://"+rutaCon+":81/mayasorting" + rutaImg.substring(2));
                    ImageIcon imagen = new ImageIcon(url);
                    Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_DEFAULT));
                    lblImg.setIcon(icono);
                    this.repaint(); 
                }
             
            //}
           //catch(Exception e){
           
                //stop();
                //principal formPrincipal = new principal();
                //formPrincipal.setLocationRelativeTo(null);
                //this.setVisible(false);
                //formPrincipal.setVisible(true);
          //}      
                
           
}


    ///////////////////////////// fin otros metodos

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnCerrar;
    private rojeru_san.RSButton btnGuardar;
    private rojeru_san.RSButtonRiple btnMinimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImagenHuella;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblNombre;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelImage rSPanelImage2;
    private rojeru_san.RSPanelsSlider rSPanelsSlider1;
    private rojeru_san.RSPanelsSlider rSPanelsSlider2;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
