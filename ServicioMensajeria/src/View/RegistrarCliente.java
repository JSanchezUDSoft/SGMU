package View;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import Controller.SGMU;//Obligatorio
import Util.SMException;//Obligatorio
import javax.swing.JOptionPane;//Obligatorio
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DogMey
 */
public class RegistrarCliente extends javax.swing.JFrame {
    private SGMU sgmu;//Obligatorio
    private String tipdoc;
    private String numdoc;
    private String n_1;
    private String n_2;
    private String n_a1;
    private String n_a2;
    private String correo;
    private Long celular;
    private String direccion;

    public String getTipdoc() {
        return tipdoc;
    }

    public void setTipdoc(String tipdoc) {
        this.tipdoc = tipdoc;
    }

    public String getNumdoc() {
        return numdoc;
    }

    public void setNumdoc(String numdoc) {
        this.numdoc = numdoc;
    }

    public String getN_1() {
        return n_1;
    }

    public void setN_1(String n_1) {
        this.n_1 = n_1;
    }

    public String getN_2() {
        return n_2;
    }

    public void setN_2(String n_2) {
        this.n_2 = n_2;
    }

    public String getN_a1() {
        return n_a1;
    }

    public void setN_a1(String n_a1) {
        this.n_a1 = n_a1;
    }

    public String getN_a2() {
        return n_a2;
    }

    public void setN_a2(String n_a2) {
        this.n_a2 = n_a2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    /**
     * Creates new form Proyecto
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public RegistrarCliente() {
        initComponents();
        sgmu = new SGMU();//Obligatorio
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t_n_1 = new javax.swing.JTextField();
        b_guardar = new javax.swing.JButton();
        b_volver = new javax.swing.JButton();
        t_tipdoc = new javax.swing.JComboBox<>();
        t_numdoc = new javax.swing.JTextField();
        t_n_2 = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        t_n_a1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t_n_a2 = new javax.swing.JTextField();
        t_direccion = new javax.swing.JTextField();
        t_correo = new javax.swing.JTextField();
        t_celular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jInternalFrame1.setMaximumSize(new java.awt.Dimension(720, 480));
        jInternalFrame1.setMinimumSize(new java.awt.Dimension(720, 480));
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(720, 480));
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));
        setSize(new java.awt.Dimension(720, 480));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR CLIENTE");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de documento:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Primer nombre:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Segundo nombre:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Primer apellido:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Número de documento:");

        t_n_1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t_n_1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        t_n_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_n_1.setPreferredSize(new java.awt.Dimension(200, 21));

        b_guardar.setBackground(new java.awt.Color(48, 189, 65));
        b_guardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b_guardar.setText("GUARDAR");
        b_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guardarActionPerformed(evt);
            }
        });

        b_volver.setBackground(new java.awt.Color(0, 216, 246));
        b_volver.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b_volver.setText("VOLVER");
        b_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_volverActionPerformed(evt);
            }
        });

        t_tipdoc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t_tipdoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de Ciudadanía", "Cedula de extranjería", "Tarjeta de Identidad" }));

        t_numdoc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t_numdoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        t_numdoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_numdoc.setPreferredSize(new java.awt.Dimension(200, 21));

        t_n_2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t_n_2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        t_n_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_n_2.setPreferredSize(new java.awt.Dimension(200, 21));

        b_cancelar.setBackground(new java.awt.Color(252, 0, 0));
        b_cancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b_cancelar.setText("CANCELAR");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        t_n_a1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t_n_a1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        t_n_a1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_n_a1.setPreferredSize(new java.awt.Dimension(200, 21));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Segundo apellido:");

        t_n_a2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t_n_a2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        t_n_a2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_n_a2.setPreferredSize(new java.awt.Dimension(200, 21));

        t_direccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t_direccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        t_direccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_direccion.setPreferredSize(new java.awt.Dimension(200, 21));

        t_correo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t_correo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        t_correo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_correo.setPreferredSize(new java.awt.Dimension(200, 21));

        t_celular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t_celular.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        t_celular.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_celular.setPreferredSize(new java.awt.Dimension(200, 21));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Celular:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dirección:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_numdoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t_n_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t_n_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t_celular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t_n_a2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t_n_a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t_correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t_tipdoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(118, 118, 118))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_tipdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t_numdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_n_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_n_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_n_a1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_n_a2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volverActionPerformed
        ValidarCliente validar = new ValidarCliente();
        validar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b_volverActionPerformed

    private void b_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guardarActionPerformed
        if(t_numdoc.getText().equals("")){
            showMessageDialog(null, "Numero de documento no especificado");
        }else if(t_n_1.getText().equals("")){
            showMessageDialog(null, "Primer nombre no especificado");
        }else if(t_n_a1.getText().equals("")){
            showMessageDialog(null, "Primer apellido no especificado");
        }else if(t_correo.getText().equals("")){
            showMessageDialog(null, "correo no especificado");
        }else if(t_celular.getText().equals("")){
            showMessageDialog(null, "celular no especificado");
        }else if(t_direccion.getText().equals("")){
            showMessageDialog(null, "direccion no especificado");
        }else{
            if(t_tipdoc.getSelectedItem().toString().equals("Cedula de Ciudadanía")){
                this.setTipdoc("CC");
            }else if(t_tipdoc.getSelectedItem().toString().equals("Cedula de extranjería")){
                this.setTipdoc("CE");
            }else{
                this.setTipdoc("TI");
            }
            System.out.println(tipdoc);
        
            try {
                this.setNumdoc(t_numdoc.getText());
                this.setN_1(t_n_1.getText());
                this.setN_2(t_n_2.getText());
                this.setN_a1(t_n_a1.getText());
                this.setN_a2(t_n_a2.getText());
                this.setCorreo(t_correo.getText());
                this.setCelular(Long.parseLong(t_celular.getText()));
                this.setDireccion(t_direccion.getText());
                RegistrarServicio regis_servicio = new RegistrarServicio();
                regis_servicio.setVisible(true);
                this.setVisible(false);
                sgmu.registrarCliente(this.getTipdoc(), this.getNumdoc(),this.getN_1(),this.getN_2(), this.getN_a1(), this.getN_a2(),this.getCorreo(), this.getCelular(),this.getDireccion());
            } catch (SMException f) {
              JOptionPane.showMessageDialog(null, f, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_b_guardarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        Index index = new Index();
        index.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_guardar;
    private javax.swing.JButton b_volver;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t_celular;
    private javax.swing.JTextField t_correo;
    private javax.swing.JTextField t_direccion;
    private javax.swing.JTextField t_n_1;
    private javax.swing.JTextField t_n_2;
    private javax.swing.JTextField t_n_a1;
    private javax.swing.JTextField t_n_a2;
    private javax.swing.JTextField t_numdoc;
    private javax.swing.JComboBox<String> t_tipdoc;
    // End of variables declaration//GEN-END:variables
}