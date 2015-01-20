
package Interfaces;

import Clases.Reportes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhony
 */
public class Logros extends javax.swing.JFrame {

    /**
     * Creates new form Logros
     */
    public Logros() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
void limpiar(){
   TXTCODASIG.setText("");
   TXTLOG.setText("");
   TXTNOMASIG.setText("");
   TXTGRADASIG.setText("");
   TXTCOLO.setText("");
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEXT = new javax.swing.JButton();
        TBNBCR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBASIG = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTCODASIG = new javax.swing.JTextField();
        TXTNOMASIG = new javax.swing.JTextField();
        TXTGRADASIG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CMBPER = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        TXTLOG = new javax.swing.JTextField();
        BTNBCRLG = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBLOGROS = new javax.swing.JTable();
        BTNSAVE = new javax.swing.JButton();
        BTNPDFLOGRO = new javax.swing.JButton();
        TXTCOLO = new javax.swing.JTextField();
        TBNELI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COLEGIO AMERICANO MENNO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIÓN DE LOGROS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 40));

        btnEXT.setText("SALIR");
        btnEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXTActionPerformed(evt);
            }
        });
        jPanel1.add(btnEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 90, 30));

        TBNBCR.setText("BUSCAR ASIGNATURA");
        TBNBCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBNBCRActionPerformed(evt);
            }
        });
        jPanel1.add(TBNBCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 30));

        TBASIG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        TBASIG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TBASIGMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TBASIG);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 610, 120));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CÓDIGO ASIGNATURA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOMBRE ASIGNATURA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 190, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GRADO ASIGNATURA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 140, 30));

        TXTCODASIG.setEditable(false);
        TXTCODASIG.setBackground(new java.awt.Color(255, 255, 255));
        TXTCODASIG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(TXTCODASIG, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 160, 30));

        TXTNOMASIG.setEditable(false);
        TXTNOMASIG.setBackground(new java.awt.Color(255, 255, 255));
        TXTNOMASIG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(TXTNOMASIG, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 190, 30));

        TXTGRADASIG.setEditable(false);
        TXTGRADASIG.setBackground(new java.awt.Color(255, 255, 255));
        TXTGRADASIG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(TXTGRADASIG, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 140, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PERIODO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 100, 30));

        CMBPER.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO" }));
        jPanel1.add(CMBPER, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("LOGRO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 60, 30));

        TXTLOG.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTLOG, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 710, 30));

        BTNBCRLG.setText("BUSCAR LOGRO");
        BTNBCRLG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBCRLGActionPerformed(evt);
            }
        });
        jPanel1.add(BTNBCRLG, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 130, 30));

        TBLOGROS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        TBLOGROS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TBLOGROSMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TBLOGROS);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 700, 120));

        BTNSAVE.setText("GRABAR");
        BTNSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSAVEActionPerformed(evt);
            }
        });
        jPanel1.add(BTNSAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 110, 30));

        BTNPDFLOGRO.setText("REPORTE");
        BTNPDFLOGRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPDFLOGROActionPerformed(evt);
            }
        });
        jPanel1.add(BTNPDFLOGRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 90, 30));

        TXTCOLO.setEditable(false);
        TXTCOLO.setBackground(new java.awt.Color(255, 255, 255));
        TXTCOLO.setForeground(new java.awt.Color(255, 255, 255));
        TXTCOLO.setBorder(null);
        jPanel1.add(TXTCOLO, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 60, -1));

        TBNELI.setText("ELIMINAR");
        TBNELI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBNELIActionPerformed(evt);
            }
        });
        jPanel1.add(TBNELI, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXTActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnEXTActionPerformed

    private void TBNBCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBNBCRActionPerformed
        String sql;
    try{
        Connection con=null;
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        Statement st=con.createStatement();
        sql="Select Codigo, Asignatura, Grado from asignaturas";
        ResultSet rstb=st.executeQuery(sql);
        ResultSetMetaData rsmd = rstb.getMetaData();
        int col=rsmd.getColumnCount();
        DefaultTableModel modelo=new DefaultTableModel();
        for(int i=1;i<=col;i++){modelo.addColumn(rsmd.getColumnLabel(i));}
        while(rstb.next()){
            String fila[]=new String[col];
            for(int j=0;j<col;j++){fila[j]=rstb.getString(j+1);}
            modelo.addRow(fila);
}
        TBASIG.setModel(modelo);
        rstb.close();
        con.close();
        
}catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Asignaturas.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_TBNBCRActionPerformed

    private void TBASIGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBASIGMousePressed
        int fila = this.TBASIG.getSelectedRow();
//        limpiar();
        try {
            this.TXTCODASIG.setText(TBASIG.getValueAt(fila, 0).toString());
            this.TXTNOMASIG.setText(TBASIG.getValueAt(fila, 1).toString());
            this.TXTGRADASIG.setText(TBASIG.getValueAt(fila, 2).toString());
            } catch (Exception e) {
            }
    }//GEN-LAST:event_TBASIGMousePressed

    private void BTNBCRLGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBCRLGActionPerformed
        String sql;
    try{
        Connection con=null;
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        Statement st=con.createStatement();
        String cod, peri;
        cod = TXTCODASIG.getText();
        peri = CMBPER.getSelectedItem().toString();
        sql="Select Logro, Codigo_Logro from logros WHERE Codigo_Asignatura = '"+cod+"' and Periodo = '"+peri+"'";
        ResultSet rstb=st.executeQuery(sql);
        ResultSetMetaData rsmd = rstb.getMetaData();
        int col=rsmd.getColumnCount();
        DefaultTableModel modelo=new DefaultTableModel();
        for(int i=1;i<=col;i++){modelo.addColumn(rsmd.getColumnLabel(i));}
        while(rstb.next()){
            String fila[]=new String[col];
            for(int j=0;j<col;j++){fila[j]=rstb.getString(j+1);}
            modelo.addRow(fila);
}
        TBLOGROS.setModel(modelo);
        rstb.close();
        con.close();
        
}catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Logros.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_BTNBCRLGActionPerformed

    private void BTNSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSAVEActionPerformed
        if (BTNSAVE.getText().equals("GRABAR")){
        try{
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        String codasig, log, per;
        String sql = "";
        codasig = TXTCODASIG.getText();
        log = TXTLOG.getText();
        per = CMBPER.getSelectedItem().toString();
        sql = "insert into logros (Codigo_Asignatura, Logro, Periodo) values (?, ?, ?)";
        PreparedStatement psd = con.prepareStatement(sql);
        psd.setString(1,codasig);
        psd.setString(2,log);
        psd.setString(3,per);
        int n = psd.executeUpdate();
        if(n>0){
        JOptionPane.showMessageDialog(null,"Información Guardada con Éxito");
        }
        con.close();
        
}catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Logros.class.getName()).log(Level.SEVERE, null, ex);
}
        limpiar();
        } else{
        try{
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        Statement st=con.createStatement();
        String logro, codigo;
        String sql = "";
        logro = TXTLOG.getText();
        codigo = TXTCOLO.getText();
        sql="UPDATE logros SET Logro = '"+logro+"' "+"WHERE Codigo_Logro = '"+codigo+"'";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Datos Almacenados con Éxito");
        
        con.close();
        
}catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Logros.class.getName()).log(Level.SEVERE, null, ex);
}
       limpiar();
       BTNSAVE.setText("GRABAR");
        
        }   
    }//GEN-LAST:event_BTNSAVEActionPerformed

    private void TBLOGROSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLOGROSMousePressed
        int fila = this.TBLOGROS.getSelectedRow();
//        limpiar();
        try {
            this.TXTLOG.setText(TBLOGROS.getValueAt(fila, 0).toString());
            this.TXTCOLO.setText(TBLOGROS.getValueAt(fila, 1).toString());
            } catch (Exception e) {
            }
        BTNSAVE.setText("MODIFICAR");
    }//GEN-LAST:event_TBLOGROSMousePressed

    private void BTNPDFLOGROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPDFLOGROActionPerformed
        Reportes direc= new Reportes();
        direc.resportesPDF("ReportesCAM\\reportlogros.jrxml");
    }//GEN-LAST:event_BTNPDFLOGROActionPerformed

    private void TBNELIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBNELIActionPerformed
        try{
        String sql = "";
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        Statement st=con.createStatement();
        String dni;
        dni = TXTCOLO.getText();
        sql = "DELETE FROM logros WHERE Codigo_Logro = '"+dni+"'";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Información Eliminada");
        con.close();   
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Logros.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar(); 
    }//GEN-LAST:event_TBNELIActionPerformed

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
            java.util.logging.Logger.getLogger(Logros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBCRLG;
    private javax.swing.JButton BTNPDFLOGRO;
    private javax.swing.JButton BTNSAVE;
    private javax.swing.JComboBox CMBPER;
    private javax.swing.JTable TBASIG;
    private javax.swing.JTable TBLOGROS;
    private javax.swing.JButton TBNBCR;
    private javax.swing.JButton TBNELI;
    private javax.swing.JTextField TXTCODASIG;
    private javax.swing.JTextField TXTCOLO;
    private javax.swing.JTextField TXTGRADASIG;
    private javax.swing.JTextField TXTLOG;
    private javax.swing.JTextField TXTNOMASIG;
    private javax.swing.JButton btnEXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
