
package View;

import Controller.SGMU;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controller.Servicio;

public class DetalleServicio extends javax.swing.JFrame {
    private SGMU sgmu;
    
    public DetalleServicio() {
        initComponents();
        sgmu = new SGMU();
    }
    
    public void setLabels(Servicio servicio){
            float costoTotal = 0;
            this.l_ciudad.setText(servicio.getCpostal());
            if(servicio.getTipopaquete().equals("S")){
                this.l_tipo_paquete.setText("Sobre");
            }else if (servicio.getTipopaquete().equals("PP")){
                this.l_tipo_paquete.setText("Paquete Pequeño");
            }else if (servicio.getTipopaquete().equals("PM")){
                this.l_tipo_paquete.setText("Paquete Mediano");
            }else{
                this.l_tipo_paquete.setText("Paquete Grande");
            }
            this.l_fecha.setText(servicio.getFservicio().toString());
            this.l_hora.setText(servicio.getH_inicio());
            this.l_Ctotal.setText(Float.toString(servicio.getVpaquete()));
            this.l_tarifa_c.setText(Float.toString(servicio.getPcomision()));
            this.l_precioP.setText("$ "+Float.toString(servicio.getVpaquete()));
    }
    
    public void tablaDetalleServicio(ResultSet rs) throws SQLException{
        int cont=0;
        try{            
            DefaultTableModel modelo  = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            modelo.setColumnIdentifiers(new Object[]{"Direccion", "Descripcion de la indicacion"}); 
            while(rs.next()){
                cont++;
                modelo.addRow(new Object[]{rs.getString(1), rs.getString(2)});                
            }
            float valor_total = Float.parseFloat(this.l_Ctotal.getText())+(Float.parseFloat(this.l_tarifa_c.getText())*cont);
            this.l_Ctotal.setText("$ "+Float.toString(valor_total));
            this.l_tarifa_c.setText("$ "+l_tarifa_c.getText()+" x "+cont+" recorridos");
            this.Table.setModel(modelo);
            this.Table.setRowHeight(30);      
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        b_inicio = new javax.swing.JButton();
        l_ciudad = new javax.swing.JLabel();
        l_tipo_paquete = new javax.swing.JLabel();
        l_tarifa_c = new javax.swing.JLabel();
        l_precioP = new javax.swing.JLabel();
        l_Ctotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        l_fecha = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        l_hora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 120, 120));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DETALLE DEL SERVICIO");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ciudad:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo paquete:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio paquete:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tarifa ciudad:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("COSTO ESTIMADO");

        b_inicio.setBackground(java.awt.Color.orange);
        b_inicio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b_inicio.setText("INICIO");
        b_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_inicioActionPerformed(evt);
            }
        });

        l_ciudad.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        l_ciudad.setForeground(new java.awt.Color(255, 255, 255));
        l_ciudad.setText("Ciudad");

        l_tipo_paquete.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        l_tipo_paquete.setForeground(new java.awt.Color(255, 255, 255));
        l_tipo_paquete.setText("Tipo Paquete");

        l_tarifa_c.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        l_tarifa_c.setForeground(new java.awt.Color(255, 255, 255));
        l_tarifa_c.setText("Tarifa Ciudad");

        l_precioP.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        l_precioP.setForeground(new java.awt.Color(255, 255, 255));
        l_precioP.setText("Precio Paquete");

        l_Ctotal.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        l_Ctotal.setForeground(new java.awt.Color(255, 255, 255));
        l_Ctotal.setText("estimado");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha servicio:");

        l_fecha.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        l_fecha.setForeground(new java.awt.Color(255, 255, 255));
        l_fecha.setText("fecha");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hora servicio:");

        l_hora.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        l_hora.setForeground(new java.awt.Color(255, 255, 255));
        l_hora.setText("Hora");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(201, 201, 201)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(l_Ctotal)
                                    .addGap(29, 29, 29))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(114, 114, 114)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(l_hora)
                                            .addComponent(l_tipo_paquete)
                                            .addComponent(l_ciudad)
                                            .addComponent(l_fecha))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addComponent(jLabel10))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(90, 90, 90)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(l_tarifa_c)
                                .addComponent(l_precioP))
                            .addGap(121, 121, 121)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(b_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(l_ciudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(l_tipo_paquete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(l_fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(l_hora))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(l_Ctotal))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(l_tarifa_c))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(l_precioP))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(b_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_inicioActionPerformed
        Index index = new Index();
        index.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b_inicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton b_inicio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_Ctotal;
    private javax.swing.JLabel l_ciudad;
    private javax.swing.JLabel l_fecha;
    private javax.swing.JLabel l_hora;
    private javax.swing.JLabel l_precioP;
    private javax.swing.JLabel l_tarifa_c;
    private javax.swing.JLabel l_tipo_paquete;
    // End of variables declaration//GEN-END:variables

}
