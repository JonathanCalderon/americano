
package Interfaces;

import Clases.Reportes;
import java.awt.Image;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class Docentes extends javax.swing.JFrame {

    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de imagen", "jpg");
    String rutaimagen;
    
    
    
    public Docentes() {
        initComponents();
        this.setLocationRelativeTo(null);
        limpiar();
        rutaimagen="";
    }

    void limpiar(){
   TXTNOMDOC.setText("");
   TXTPRIAPEDOC.setText("");
   TXTDOCDOC.setText("");
   TXTTEL.setText("");
   TXTEMAIL.setText("");
   CMBCUR.setSelectedItem("NINGUNO");
   txtphoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guji_1.png")));
   rutaphoto.setText("");
   }
  

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CMBCUR = new javax.swing.JComboBox();
        txtphoto = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TXTNOMDOC = new javax.swing.JTextField();
        TXTPRIAPEDOC = new javax.swing.JTextField();
        TXTDOCDOC = new javax.swing.JTextField();
        TXTTEL = new javax.swing.JTextField();
        TXTEMAIL = new javax.swing.JTextField();
        BTNADC = new org.edisoncor.gui.button.ButtonTask();
        BTNACT = new org.edisoncor.gui.button.ButtonTask();
        BTNEXT = new org.edisoncor.gui.button.ButtonTask();
        buttonTask4 = new org.edisoncor.gui.button.ButtonTask();
        BTNPDF = new javax.swing.JButton();
        rutaphoto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBDOC = new javax.swing.JTable();
        BTNSUP = new org.edisoncor.gui.button.ButtonTask();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COLEGIO AMERICANO MENNO");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/docente.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIÓN DE DOCENTES");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NOMBRE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("APELLIDOS:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 160, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("DOCUMENTO DE IDENTIDAD:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 180, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CORREO ELECTRÓNICO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 170, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("DIRECCIÓN DE CURSO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 180, 30));

        CMBCUR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NINGUNO", "KINDER", "TRANSICION", "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO", "SEPTIMO", "OCTAVO", "NOVENO", "DECIMO", "UNDECIMO" }));
        jPanel1.add(CMBCUR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 160, 30));

        txtphoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtphoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guji_1.png"))); // NOI18N
        txtphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        jPanel1.add(txtphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 155, 175));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("NÚMERO TELEFÓNICO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 160, 30));
        jPanel1.add(TXTNOMDOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 300, 30));
        jPanel1.add(TXTPRIAPEDOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 300, 30));
        jPanel1.add(TXTDOCDOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 300, 30));
        jPanel1.add(TXTTEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 300, 30));
        jPanel1.add(TXTEMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 300, 30));

        BTNADC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        BTNADC.setText("Adicionar");
        BTNADC.setCategoryFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTNADC.setDescription(" ");
        BTNADC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNADCActionPerformed(evt);
            }
        });
        jPanel1.add(BTNADC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 160, 50));

        BTNACT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualiza.png"))); // NOI18N
        BTNACT.setText("Actualizar");
        BTNACT.setCategoryFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTNACT.setDescription(" ");
        BTNACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNACTActionPerformed(evt);
            }
        });
        jPanel1.add(BTNACT, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 150, 50));

        BTNEXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        BTNEXT.setText("Salir");
        BTNEXT.setCategoryFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTNEXT.setDescription(" ");
        BTNEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEXTActionPerformed(evt);
            }
        });
        jPanel1.add(BTNEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 140, 60));

        buttonTask4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Profile_1.png"))); // NOI18N
        buttonTask4.setText("Agregar Foto");
        buttonTask4.setDescription(" ");
        buttonTask4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask4ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTask4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 200, 50));

        BTNPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PDF_Icon_32.png"))); // NOI18N
        BTNPDF.setText("     Reporte");
        BTNPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPDFActionPerformed(evt);
            }
        });
        jPanel1.add(BTNPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 180, 50));

        rutaphoto.setEditable(false);
        rutaphoto.setBackground(new java.awt.Color(255, 255, 255));
        rutaphoto.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        rutaphoto.setForeground(new java.awt.Color(255, 255, 255));
        rutaphoto.setBorder(null);
        jPanel1.add(rutaphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 230, -1));

        TBDOC.setModel(new javax.swing.table.DefaultTableModel(
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
        TBDOC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TBDOCMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TBDOC);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 770, 230));

        BTNSUP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/remove.png"))); // NOI18N
        BTNSUP.setText("Eliminar");
        BTNSUP.setCategoryFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTNSUP.setDescription(" ");
        BTNSUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSUPActionPerformed(evt);
            }
        });
        jPanel1.add(BTNSUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 150, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEXTActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTNEXTActionPerformed

    private void buttonTask4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask4ActionPerformed
       //Creamos JFileChooser
        JFileChooser dlg = new JFileChooser();
        //Llamamos metodo setFileFlter
        dlg.setFileFilter(filter);
        //abrimos ventana para escojer imagen
        int option = dlg.showOpenDialog(this);
        //click en boton abrir
        if(option==JFileChooser.APPROVE_OPTION){
           //obtener nombre archivo
            String fil = dlg.getSelectedFile().getPath();
            //obterner direccion pra guardar imagen
            String file = dlg.getSelectedFile().toString();
            txtphoto.setIcon(new ImageIcon(fil));
            //modificar imagen
            ImageIcon icon= new ImageIcon(fil);
            //extrae la imagen del icono
            Image img = icon.getImage();
            //cambiar tamaño a imagen
            Image newimg = img.getScaledInstance(155, 175, java.awt.Image.SCALE_SMOOTH);
            //Genera IMAGEICON con la nueva imagen
            ImageIcon newIcon = new ImageIcon(newimg);
            txtphoto.setIcon(newIcon);
            txtphoto.setSize(155,175);
            rutaphoto.setText(fil);
            rutaimagen = "";
            
        }
    }//GEN-LAST:event_buttonTask4ActionPerformed

    private void BTNADCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNADCActionPerformed
       if (BTNADC.getText().equals("Adicionar")){
        if (this.TXTNOMDOC.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR EL NOMBRE DEL DOCENTE", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TXTNOMDOC.requestFocus();
        } else if (this.TXTPRIAPEDOC.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR LOS APELLIDOS DEL DOCENTE", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TXTPRIAPEDOC.requestFocus();
        } else if (this.TXTDOCDOC.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR EL DOCUMENTO DEL DOCENTE", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TXTDOCDOC.requestFocus();
        }else if (this.TXTTEL.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR EL TELÉFONO DEL DOCENTE", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TXTTEL.requestFocus();
        }else if (this.TXTEMAIL.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR EL CORREO DEL DOCENTE", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TXTEMAIL.requestFocus();
        }else{
        try{
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        String nomb, priape, docid, tele, correo, cur, photo;
        String sql = "";
        nomb = TXTNOMDOC.getText();
        priape = TXTPRIAPEDOC.getText();
        docid = TXTDOCDOC.getText();
        tele = TXTTEL.getText();
        correo = TXTEMAIL.getText();
        cur = CMBCUR.getSelectedItem().toString();
        photo = rutaphoto.getText();
        sql = "insert into docentes (Nombre_Docente, Apellidos, Documento, Telefono, EMail, Curso, Foto) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement psd = con.prepareStatement(sql);
        psd.setString(1,nomb);
        psd.setString(2,priape);
        psd.setString(3,docid);
        psd.setString(4,tele);
        psd.setString(5,correo);
        psd.setString(6,cur);
        psd.setString(7,photo);
        int n = psd.executeUpdate();
        if(n>0){
        JOptionPane.showMessageDialog(null,"Docente Guardado con Éxito");
        }
        con.close();
        
}catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
}
        limpiar();
        }
       } else {
       try{
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        Statement st=con.createStatement();
        String nombre, apellido, cel, correo, cur, photo,docid;
        String sql = "";
        nombre = TXTNOMDOC.getText();
        apellido = TXTPRIAPEDOC.getText();
        cel = TXTTEL.getText();
        docid = TXTDOCDOC.getText();
        correo = TXTEMAIL.getText();
        cur = CMBCUR.getSelectedItem().toString();
        photo = rutaphoto.getText();
        sql="UPDATE docentes SET Nombre_Docente = '"+nombre+"', "+"Apellidos = '"+apellido+"', "+"Telefono = '"+cel+"', "+"EMail = '"+correo+"', "+"Curso = '"+cur+"', "+"Foto = '"+photo+"' "+"WHERE Documento = '"+docid+"'";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Datos Almacenados con Éxito");
        
        con.close();
        
}catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
}
       limpiar();
       BTNACT.setText("Actualizar");
       BTNADC.setText("Adicionar");
       }
    }//GEN-LAST:event_BTNADCActionPerformed

    private void BTNPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPDFActionPerformed
       int fila = this.TBDOC.getSelectedRow();
       if (fila==-1){
           JOptionPane.showMessageDialog(null, "Debe seleccionar un docente");
       }else{
           try{
               String dni =TBDOC.getValueAt(fila, 2).toString();
               Reportes direc= new Reportes();
               direc.resportuniPDF("ReportesCAM\\reportunidoc.jrxml",dni);
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al cargar el reporte del Docente", "Error", JOptionPane.ERROR);
       }
       }
       limpiar();
       BTNACT.setText("Actualizar");
       BTNADC.setText("Adicionar");
    }//GEN-LAST:event_BTNPDFActionPerformed

    private void BTNACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNACTActionPerformed
        if (BTNACT.getText().equals("Actualizar")){
        String sql;
    try{
        Connection con=null;
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        Statement st=con.createStatement();
        sql="Select * from docentes";
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
        TBDOC.setModel(modelo);
        rstb.close();
        con.close();
        
}catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
}
    limpiar();
        } else {
            limpiar();
            BTNACT.setText("Actualizar");
            BTNADC.setText("Adicionar");
        }
    }//GEN-LAST:event_BTNACTActionPerformed

    private void TBDOCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBDOCMousePressed
        BTNADC.setText("Modificar");
        BTNACT.setText("Cancelar");
        limpiar();
        int fila = this.TBDOC.getSelectedRow();
        try {
            this.TXTNOMDOC.setText(TBDOC.getValueAt(fila, 0).toString());
            this.TXTPRIAPEDOC.setText(TBDOC.getValueAt(fila, 1).toString());
            this.TXTDOCDOC.setText(TBDOC.getValueAt(fila, 2).toString());
            this.TXTTEL.setText(TBDOC.getValueAt(fila, 3).toString());
            this.TXTEMAIL.setText(TBDOC.getValueAt(fila, 4).toString());
            this.CMBCUR.setSelectedItem(TBDOC.getValueAt(fila, 5).toString());
            this.rutaphoto.setText(TBDOC.getValueAt(fila, 6).toString());
            String foto;
            foto = rutaphoto.getText();
            //System.out.println(foto);
            txtphoto.setIcon(new ImageIcon(foto));
            ImageIcon icon= new ImageIcon(foto);
            Image img = icon.getImage();
            Image newimg = img.getScaledInstance(155, 175, java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newimg);
            txtphoto.setIcon(newIcon);
            txtphoto.setSize(155,175);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_TBDOCMousePressed

    private void BTNSUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSUPActionPerformed
       try{
        String sql = "";
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
        Statement st=con.createStatement();
        String dni;
        dni=TXTDOCDOC.getText();
        sql = "DELETE FROM docentes WHERE Documento = '"+dni+"'";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Información Eliminada");
        con.close();   
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar(); 
        BTNACT.setText("Actualizar");
        BTNADC.setText("Adicionar");
    }//GEN-LAST:event_BTNSUPActionPerformed

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
            java.util.logging.Logger.getLogger(Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Docentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask BTNACT;
    private org.edisoncor.gui.button.ButtonTask BTNADC;
    private org.edisoncor.gui.button.ButtonTask BTNEXT;
    private javax.swing.JButton BTNPDF;
    private org.edisoncor.gui.button.ButtonTask BTNSUP;
    private javax.swing.JComboBox CMBCUR;
    private javax.swing.JTable TBDOC;
    private javax.swing.JTextField TXTDOCDOC;
    private javax.swing.JTextField TXTEMAIL;
    private javax.swing.JTextField TXTNOMDOC;
    private javax.swing.JTextField TXTPRIAPEDOC;
    private javax.swing.JTextField TXTTEL;
    private org.edisoncor.gui.button.ButtonTask buttonTask4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rutaphoto;
    private javax.swing.JLabel txtphoto;
    // End of variables declaration//GEN-END:variables
}
