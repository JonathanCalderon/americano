/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Reportes;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class Certificados extends javax.swing.JFrame {

    /**
     * Creates new form Certificados
     */
    public Certificados() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CMBCUR = new javax.swing.JComboBox();
        BTNCUR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBCUR = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        BTNCERT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(560, 540));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CERTIFICACIONES");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("GRADO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 30));

        CMBCUR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CMBCUR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "QUINTO", "SEXTO", "SEPTIMO", "OCTAVO", "NOVENO", "DECIMO", "UNDECIMO" }));
        jPanel1.add(CMBCUR, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 120, 30));

        BTNCUR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BTNCUR.setText("SELECCIONAR");
        BTNCUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCURActionPerformed(evt);
            }
        });
        jPanel1.add(BTNCUR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 130, 30));

        TBCUR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        TBCUR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TBCURMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TBCUR);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 510, 350));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 110, 30));

        BTNCERT.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BTNCERT.setText("CERTIFICADO");
        BTNCERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCERTActionPerformed(evt);
            }
        });
        jPanel1.add(BTNCERT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCURActionPerformed
        String sql;
        String grad;
        grad = CMBCUR.getSelectedItem().toString();
try{
        Connection con=null;
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        Statement st=con.createStatement();
        sql="Select Nomestu, Apellid, Documentoid from estudiantes where Grad = '"+grad+"' order by Apellid";
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
        TBCUR.setModel(modelo);
        rstb.close();
        con.close();
        
}catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_BTNCURActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TBCURMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBCURMousePressed
        int fila = this.TBCUR.getSelectedRow();
    }//GEN-LAST:event_TBCURMousePressed

    private void BTNCERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCERTActionPerformed
        int fila = this.TBCUR.getSelectedRow();
        System.out.println();
       if (fila==-1){
           JOptionPane.showMessageDialog(null, "Debe seleccionar un estudiante");
       }else{
           try{
               String name =TBCUR.getValueAt(fila, 0).toString();
               String coname =TBCUR.getValueAt(fila, 1).toString();
               String dni =TBCUR.getValueAt(fila, 2).toString();
               String cur = CMBCUR.getSelectedItem().toString();
               String nombre = name+" "+coname;
               Reportes direc= new Reportes();
               direc.resportcertiPDF("ReportesCAM\\reportcerti.jrxml",dni,cur,nombre);
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al cargar el reporte del Docente", "Error", JOptionPane.ERROR);
       }
       }
    }//GEN-LAST:event_BTNCERTActionPerformed

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
            java.util.logging.Logger.getLogger(Certificados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Certificados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Certificados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Certificados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Certificados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCERT;
    private javax.swing.JButton BTNCUR;
    private javax.swing.JComboBox CMBCUR;
    private javax.swing.JTable TBCUR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
