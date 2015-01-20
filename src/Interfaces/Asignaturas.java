
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhony
 */
public class Asignaturas extends javax.swing.JFrame {

   
    public Asignaturas() {
        initComponents();
        limpiar();
        this.setLocationRelativeTo(null);
    }

   void limpiar(){
   TXTCOD.setText("");
   TXTCOD.setEnabled(false);
   TXTASIG.setText("");
   TXTASIG.setEnabled(false);
   TXTGRADO.setText("");
   TXTGRADO.setEnabled(false);
   TXTIH.setText("");
   TXTNOMPRO.setText("");
   TXTNOMPRO.setEnabled(false);
   TXTPRIPRO.setText("");
   TXTPRIPRO.setEnabled(false);
   TXTDOCU.setText("");
   BTNNEO.setText("NUEVO");
   BTNMOD.setText("MODIFICAR");
   }
    
    void desbloquear(){
    TXTCOD.setText("");
    TXTCOD.setEnabled(true);
    TXTASIG.setText("");
    TXTASIG.setEnabled(true);
    TXTGRADO.setText("");
    TXTGRADO.setEnabled(true);
    TXTIH.setText("");
    TXTNOMPRO.setText("");
    TXTPRIPRO.setText("");   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXTASIG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXTNOMPRO = new javax.swing.JTextField();
        TXTPRIPRO = new javax.swing.JTextField();
        BTNMOD = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TXTIH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        asig = new javax.swing.JTable();
        btnconsul = new javax.swing.JButton();
        TXTCOD = new javax.swing.JTextField();
        TXTGRADO = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        BTNNEO = new javax.swing.JButton();
        BTNELI = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBDOCEN = new javax.swing.JTable();
        TXTDOCU = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COLEGIO AMERICANO MENNO");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Modify.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIÓN DE ASIGNATURAS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("GRADO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("ASIGNATURA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 110, 30));
        jPanel1.add(TXTASIG, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 240, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("DOCENTE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 70, 30));
        jPanel1.add(TXTNOMPRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 210, 30));
        jPanel1.add(TXTPRIPRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 220, 30));

        BTNMOD.setText("MODIFICAR");
        BTNMOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMODActionPerformed(evt);
            }
        });
        jPanel1.add(BTNMOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 100, 40));

        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 100, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("CÓDIGO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 60, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("INTENSIDAD HORARIA SEMANAL:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        TXTIH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(TXTIH, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 70, 30));

        asig.setModel(new javax.swing.table.DefaultTableModel(
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
        asig.setSelectionBackground(new java.awt.Color(0, 102, 204));
        asig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                asigMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(asig);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 840, 150));

        btnconsul.setText("CONSULTAR");
        btnconsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsulActionPerformed(evt);
            }
        });
        jPanel1.add(btnconsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 110, 40));
        jPanel1.add(TXTCOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, 30));
        jPanel1.add(TXTGRADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 120, 30));

        jButton1.setText("REPORTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 100, 40));

        BTNNEO.setText("NUEVO");
        BTNNEO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNNEOActionPerformed(evt);
            }
        });
        jPanel1.add(BTNNEO, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 100, 40));

        BTNELI.setText("ELIMINAR");
        BTNELI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNELIActionPerformed(evt);
            }
        });
        jPanel1.add(BTNELI, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 100, 40));

        TBDOCEN.setModel(new javax.swing.table.DefaultTableModel(
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
        TBDOCEN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TBDOCENMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TBDOCEN);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 490, 120));

        TXTDOCU.setEditable(false);
        TXTDOCU.setBackground(new java.awt.Color(255, 255, 255));
        TXTDOCU.setForeground(new java.awt.Color(255, 255, 255));
        TXTDOCU.setBorder(null);
        jPanel1.add(TXTDOCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnconsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsulActionPerformed
       try{
         String sql;
        Connection con=null;
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        Statement st=con.createStatement();
        sql="Select Codigo, Asignatura, Grado, Intensidad_Horaria, Nombre_Docente, Apellidos from asignaturas";
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
        asig.setModel(modelo);
        rstb.close();
        con.close();
        
}catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Asignaturas.class.getName()).log(Level.SEVERE, null, ex);
}
       try{
         String sql;
        Connection con=null;
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        Statement st=con.createStatement();
        sql="Select Nombre_Docente, Apellidos, Documento from docentes";
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
        TBDOCEN.setModel(modelo);
        rstb.close();
        con.close();
        
}catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Asignaturas.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_btnconsulActionPerformed

    private void asigMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asigMousePressed
        int fila = this.asig.getSelectedRow();
        limpiar();
        try {
            this.TXTCOD.setText(asig.getValueAt(fila, 0).toString());
            this.TXTASIG.setText(asig.getValueAt(fila, 1).toString());
            this.TXTGRADO.setText(asig.getValueAt(fila, 2).toString());
            this.TXTIH.setText(asig.getValueAt(fila, 3).toString());
            this.TXTNOMPRO.setText(asig.getValueAt(fila, 4).toString());
            this.TXTPRIPRO.setText(asig.getValueAt(fila, 5).toString());
            } catch (Exception e) {
            }
    }//GEN-LAST:event_asigMousePressed

    private void BTNMODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMODActionPerformed
         if (BTNMOD.getText().equals("MODIFICAR")){
                String sql = "";
                String intho, nompo, apell, cod, docu;
                try{
                    Connection con=null;
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
                    Statement st=con.createStatement();
                    cod = TXTCOD.getText();
                    intho = TXTIH.getText();
                    nompo = TXTNOMPRO.getText();
                    apell =TXTPRIPRO.getText();
                    docu = TXTDOCU.getText();
                    sql="UPDATE asignaturas SET Intensidad_Horaria = '"+intho+"', "+"Nombre_Docente = '"+nompo+"', "+"Apellidos = '"+apell+"', "+"Documento = '"+docu+"' "+"WHERE Codigo = '"+cod+"'";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Datos Almacenados con Éxito");
                    con.close();
        
                }catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(Asignaturas.class.getName()).log(Level.SEVERE, null, ex);
                }limpiar();
                } else{
                limpiar();
         }        
    }//GEN-LAST:event_BTNMODActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Reportes direc= new Reportes();
        direc.resportesPDF("ReportesCAM\\reportasig.jrxml");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTNNEOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNNEOActionPerformed
        if (BTNNEO.getText().equals("NUEVO")){
            BTNMOD.setText("CANCELAR");
        desbloquear();
        BTNNEO.setText("GUARDAR");
        } else {
            try{
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        String codi, asign, grad, ih,nome, conome, docu;
        String sql = "";
        codi = TXTCOD.getText();
        asign = TXTASIG.getText();
        grad = TXTGRADO.getText();
        ih = TXTIH.getText();
        nome = TXTNOMPRO.getText();
        conome = TXTPRIPRO.getText();
        docu = TXTDOCU.getText();
        sql = "insert into asignaturas (Codigo, Asignatura, Grado, Intensidad_Horaria, Nombre_Docente, Apellidos, Documento) values (?, ?, ?, ?, ?, ?, ?)";
//        System.out.println(sql);
        PreparedStatement psd = con.prepareStatement(sql);
        psd.setString(1,codi);
        psd.setString(2,asign);
        psd.setString(3,grad);
        psd.setString(4,ih);
        psd.setString(5,nome);
        psd.setString(6,conome);
        psd.setString(7,docu);
        int n = psd.executeUpdate();
        if(n>0){
        JOptionPane.showMessageDialog(null,"Información Guardada con Éxito");
        }
        con.close();
        
}catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
}
        limpiar();
        }
    }//GEN-LAST:event_BTNNEOActionPerformed

    private void BTNELIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNELIActionPerformed
        try{
        String sql = "";
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        Statement st=con.createStatement();
        String codigo;
        codigo=TXTCOD.getText();
        sql = "DELETE FROM asignaturas WHERE Codigo = '"+codigo+"'";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Asignatura Eliminada");
        con.close();   
}catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
}
        limpiar();
    }//GEN-LAST:event_BTNELIActionPerformed

    private void TBDOCENMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBDOCENMousePressed
        int fila = this.TBDOCEN.getSelectedRow();
        try {
            this.TXTNOMPRO.setText(TBDOCEN.getValueAt(fila, 0).toString());
            this.TXTPRIPRO.setText(TBDOCEN.getValueAt(fila, 1).toString());
            this.TXTDOCU.setText(TBDOCEN.getValueAt(fila, 2).toString());
            } catch (Exception e) {
            }
    }//GEN-LAST:event_TBDOCENMousePressed
    
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
            java.util.logging.Logger.getLogger(Asignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asignaturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNELI;
    private javax.swing.JButton BTNMOD;
    private javax.swing.JButton BTNNEO;
    private javax.swing.JTable TBDOCEN;
    private javax.swing.JTextField TXTASIG;
    private javax.swing.JTextField TXTCOD;
    private javax.swing.JTextField TXTDOCU;
    private javax.swing.JTextField TXTGRADO;
    private javax.swing.JTextField TXTIH;
    private javax.swing.JTextField TXTNOMPRO;
    private javax.swing.JTextField TXTPRIPRO;
    private javax.swing.JTable asig;
    private javax.swing.JButton btnconsul;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
