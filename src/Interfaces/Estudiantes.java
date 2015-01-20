package Interfaces;

//import Menu.Principal;
//import conexion.conectate;
//import java.awt.Component;
import Clases.Reportes;
import java.awt.Image;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.DefaultTableModel;

public class Estudiantes extends javax.swing.JFrame {

    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de imagen", "jpg");
    String rutaimagen;

    //Para la conexion
    //conectate con;
    //CallableStatement cst;
    //ResultSet q;
    //Statement sentencia;
    //DefaultTableModel m;
    //CREAMOS UN OBJETO DE LA CLASE FOTOCLASS
    //fotoclass f = new fotoclass();  
    //private Object TXTFOTOD;
    public Estudiantes() {
        initComponents();
        rutaimagen = "";
        this.setLocationRelativeTo(null);
        limpiar();
        bloquear();
        //con= new conectate();

    }

    void limpiar() {
        TXTESTU.setText("");
        TXTAPE.setText("");
        TXTRUTAFOTO.setText("C:/Users/Jhony/Documents/NetBeansProjects/CAM/src/Imagenes/guji.jpg");
        TXTDOCID.setText("");
        TXTDOND.setText("");
        TXTNACI.setText("");
        TXTDIREC.setText("");
        TXTNOMPA.setText("");
        TXTTELPA.setText("");
        TXTNOMMA.setText("");
        TXTTELMA.setText("");
        TXTNOMACU.setText("");
        TXTTELACU.setText("");
        TXTOBSMED.setText("");
        TXTEPS.setText("");
        TXTRH.setText("");
        TXTOBSGEN.setText("");
        cmbgrad.setSelectedItem("NINGUNO");
        cmbdoc.setSelectedItem("NINGUNO");
        TXTFOTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guji_1.png")));
    }

    void bloquear() {
        TXTESTU.setEnabled(false);
        TXTAPE.setEnabled(false);
        //TXTSEGAPE.setEnabled(false);
        TXTDOCID.setEnabled(false);
        TXTDOND.setEnabled(false);
        TXTNACI.setEnabled(false);
        TXTDIREC.setEnabled(false);
        TXTNOMPA.setEnabled(false);
        TXTTELPA.setEnabled(false);
        TXTNOMMA.setEnabled(false);
        TXTTELMA.setEnabled(false);
        TXTNOMACU.setEnabled(false);
        TXTTELACU.setEnabled(false);
        TXTOBSMED.setEnabled(false);
        TXTEPS.setEnabled(false);
        TXTRH.setEnabled(false);
        TXTOBSGEN.setEnabled(false);
        BTNGRA.setEnabled(false);
        BTNMO.setEnabled(false);
        BTNELI.setEnabled(false);
        BTNBUSC.setEnabled(false);
        BTNPDF.setEnabled(false);
    }

    void desbloquear1() {
        TXTESTU.setEnabled(true);
        TXTAPE.setEnabled(true);
   //TXTSEGAPE.setEnabled(true);
    }

    void desbloquear2() {
        TXTDOCID.setEnabled(true);
        TXTDOND.setEnabled(true);
        TXTNACI.setEnabled(true);
        TXTDIREC.setEnabled(true);
        TXTNOMPA.setEnabled(true);
        TXTTELPA.setEnabled(true);
        TXTNOMMA.setEnabled(true);
        TXTTELMA.setEnabled(true);
        TXTNOMACU.setEnabled(true);
        TXTTELACU.setEnabled(true);
        TXTOBSMED.setEnabled(true);
        TXTEPS.setEnabled(true);
        TXTRH.setEnabled(true);
        TXTOBSGEN.setEnabled(true);
        BTNGRA.setEnabled(true);
        BTNMO.setEnabled(true);
        BTNELI.setEnabled(true);
        BTNBUSC.setEnabled(true);
        BTNPDF.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BTNGRA = new org.edisoncor.gui.button.ButtonTask();
        BTNMO = new org.edisoncor.gui.button.ButtonTask();
        BTNELI = new org.edisoncor.gui.button.ButtonTask();
        BTNBUSC = new org.edisoncor.gui.button.ButtonTask();
        btnfoto = new org.edisoncor.gui.button.ButtonTask();
        jLabel1 = new javax.swing.JLabel();
        TXTESTU = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTDOCID = new javax.swing.JTextField();
        TXTDOND = new javax.swing.JTextField();
        btnsal = new org.edisoncor.gui.button.ButtonTask();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbgrad = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TXTDIREC = new javax.swing.JTextField();
        cmbdoc = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TXTNOMACU = new javax.swing.JTextField();
        TXTNOMPA = new javax.swing.JTextField();
        TXTNOMMA = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TXTTELACU = new javax.swing.JTextField();
        TXTTELPA = new javax.swing.JTextField();
        TXTTELMA = new javax.swing.JTextField();
        BTNPDF = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        TXTOBSMED = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TXTOBSGEN = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TXTAPE = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TXTEPS = new javax.swing.JTextField();
        TXTRH = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TXTRUTAFOTO = new javax.swing.JTextField();
        TXTFOTO = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        TXTNACI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COLEGIO AMERICANO MENNO");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/estudiantes.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNGRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save_all.png"))); // NOI18N
        BTNGRA.setText("GRABAR");
        BTNGRA.setCategoryFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTNGRA.setDescription(" ");
        BTNGRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGRAActionPerformed(evt);
            }
        });
        jPanel1.add(BTNGRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 130, 50));

        BTNMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modify 1.png"))); // NOI18N
        BTNMO.setText("MODIFICAR");
        BTNMO.setCategoryFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTNMO.setDescription(" ");
        BTNMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMOActionPerformed(evt);
            }
        });
        jPanel1.add(BTNMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 150, 50));

        BTNELI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        BTNELI.setText("ELIMINAR");
        BTNELI.setCategoryFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTNELI.setDescription(" ");
        jPanel1.add(BTNELI, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 140, 50));

        BTNBUSC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Loading.png"))); // NOI18N
        BTNBUSC.setText("BUSCAR");
        BTNBUSC.setCategoryFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTNBUSC.setDescription(" ");
        BTNBUSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBUSCActionPerformed(evt);
            }
        });
        jPanel1.add(BTNBUSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 140, 50));

        btnfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/users.png"))); // NOI18N
        btnfoto.setText("AGREGAR FOTO");
        btnfoto.setCategoryFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnfoto.setDescription(" ");
        btnfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 200, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NOMBRE ESTUDIANTE:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 140, 25));

        TXTESTU.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTESTU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXTESTUMouseClicked(evt);
            }
        });
        TXTESTU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTESTUActionPerformed(evt);
            }
        });
        jPanel1.add(TXTESTU, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 290, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("DOCUMENTO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 90, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("TIPO DE DOCUMENTO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("DE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 30, 25));

        TXTDOCID.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTDOCID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXTDOCIDMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TXTDOCIDMouseReleased(evt);
            }
        });
        TXTDOCID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTDOCIDKeyReleased(evt);
            }
        });
        jPanel1.add(TXTDOCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 120, 25));

        TXTDOND.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTDOND, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 120, 25));

        btnsal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/24.png"))); // NOI18N
        btnsal.setText("SALIR");
        btnsal.setCategoryFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnsal.setDescription(" ");
        btnsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalActionPerformed(evt);
            }
        });
        jPanel1.add(btnsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 120, 50));

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("GESTIÓN DE ESTUDIANTES");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("GRADO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 60, 25));

        cmbgrad.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cmbgrad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NINGUNO", "KINDER", "TRANSICION", "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO", "SEPTIMO", "OCTAVO", "NOVENO", "DECIMO", "UNDECIMO" }));
        cmbgrad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbgradItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbgrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("FECHA DE NACIMIENTO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("DIRECCION:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 80, 25));

        TXTDIREC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTDIREC, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 230, 25));

        cmbdoc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cmbdoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NINGUNO", "R. CIVIL", "T. DE IDENTIDAD", "C. DE CIUDADANÍA" }));
        cmbdoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbdocItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 140, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("ACUDIENTE:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 140, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("NOMBRE DEL PADRE:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("NOMBRE DE LA MADRE:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, 25));

        TXTNOMACU.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTNOMACU, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 230, 25));

        TXTNOMPA.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTNOMPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 230, 25));

        TXTNOMMA.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTNOMMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 230, 25));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("TELEFONO:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 80, 25));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("TELEFONO:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 80, 25));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("TELEFONO:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 80, 25));

        TXTTELACU.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTTELACU, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 180, 25));

        TXTTELPA.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTTELPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 180, 25));

        TXTTELMA.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTTELMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 180, 25));

        BTNPDF.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        BTNPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PDF_Icon_32.png"))); // NOI18N
        BTNPDF.setText("       REPORTE");
        BTNPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPDFActionPerformed(evt);
            }
        });
        jPanel1.add(BTNPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, 170, 50));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("OBERVACIONES MÉDICAS:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, 25));

        TXTOBSMED.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTOBSMED, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 530, 25));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("OBSERVACIONES GENERALES: ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 190, 25));

        TXTOBSGEN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTOBSGEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 500, 25));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("APELLIDOS:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, 25));

        TXTAPE.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTAPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 290, 25));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("EPS:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 50, 25));

        TXTEPS.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTEPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 210, 25));

        TXTRH.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(TXTRH, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 120, 25));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("RH:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 40, 25));

        TXTRUTAFOTO.setEditable(false);
        TXTRUTAFOTO.setBackground(new java.awt.Color(255, 255, 255));
        TXTRUTAFOTO.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        TXTRUTAFOTO.setForeground(new java.awt.Color(255, 255, 255));
        TXTRUTAFOTO.setBorder(null);
        jPanel1.add(TXTRUTAFOTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 250, -1));

        TXTFOTO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXTFOTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guji_1.png"))); // NOI18N
        jPanel1.add(TXTFOTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 155, 175));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 700, 130));
        jPanel1.add(TXTNACI, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 230, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNMOActionPerformed

    private void TXTESTUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTESTUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTESTUActionPerformed

    private void btnsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalActionPerformed

    private void btnfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfotoActionPerformed
        //Creamos JFileChooser
        JFileChooser dlg = new JFileChooser();
        //Llamamos metodo setFileFlter
        dlg.setFileFilter(filter);
        //abrimos ventana para escojer imagen
        int option = dlg.showOpenDialog(this);
        //click en boton abrir
        if (option == JFileChooser.APPROVE_OPTION) {
            //obtener nombre archivo
            String fil = dlg.getSelectedFile().getPath();
            //obterner direccion pra guardar imagen
            String file = dlg.getSelectedFile().toString();
            TXTFOTO.setIcon(new ImageIcon(fil));
            //modificar imagen
            ImageIcon icon = new ImageIcon(fil);
            //extrae la imagen del icono
            Image img = icon.getImage();
            //cambiar tamaño a imagen
            Image newimg = img.getScaledInstance(155, 175, java.awt.Image.SCALE_SMOOTH);
            //Genera IMAGEICON con la nueva imagen
            ImageIcon newIcon = new ImageIcon(newimg);
            TXTFOTO.setIcon(newIcon);
            TXTFOTO.setSize(155, 175);
            TXTRUTAFOTO.setText(fil);
            rutaimagen = "";

        }

    }//GEN-LAST:event_btnfotoActionPerformed

    private void TXTDOCIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTDOCIDMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDOCIDMouseReleased

    private void TXTDOCIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTDOCIDKeyReleased

        if (!TXTDOCID.getText().matches("[0-9--]*")) {
            JOptionPane.showMessageDialog(null, "Sólo se permiten números", "ADVERENCIA", JOptionPane.ERROR_MESSAGE);
            TXTDOCID.setText("");
            TXTDOCID.requestFocus();
        }
    }//GEN-LAST:event_TXTDOCIDKeyReleased

    private void TXTESTUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTESTUMouseClicked

    }//GEN-LAST:event_TXTESTUMouseClicked

    private void TXTDOCIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTDOCIDMouseClicked

    }//GEN-LAST:event_TXTDOCIDMouseClicked

    private void cmbgradItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbgradItemStateChanged
        desbloquear1();
        TXTESTU.requestFocus();
    }//GEN-LAST:event_cmbgradItemStateChanged

    private void cmbdocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbdocItemStateChanged
        desbloquear2();
        TXTDOCID.requestFocus();
    }//GEN-LAST:event_cmbdocItemStateChanged

    private void BTNGRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGRAActionPerformed
        //SE VALIDAN LOS CAMPOS DE TEXTO ANTES DE SER GUARDADOS PARA VER SI ALGUNO DE ELLOS ESTAN VACIOS, SI ASI FUESE MUESTRA
        //UN MENSAJE CORRESPONDIENTE AL CAMPO QUE ESTA SIN LLENAR
        if (this.TXTESTU.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR EL NOMBRE DEL ESTUDIANTE", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TXTESTU.requestFocus();
        } else if (this.TXTAPE.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR PRIMER APELLIDO DEL ESTUDIANTE", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TXTAPE.requestFocus();
        } else if (this.TXTDOCID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR EL DOCUMENTO DEL ESTUDIANTE", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TXTDOCID.requestFocus();
        } else {
            try {
                Connection con = null;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/americano", "root", "admin");
                String grado, nombre, ape, tdoc, doci;
                String donde, nato, direc, nompa, telpa;
                String nomma, telma, nomacu, telacu, medici;
                String eps, rh, gener, fotog;
                String sql = "";
                grado = cmbgrad.getSelectedItem().toString();
                nombre = TXTESTU.getText();
                ape = TXTAPE.getText();
                tdoc = cmbdoc.getSelectedItem().toString();
                doci = TXTDOCID.getText();
                donde = TXTDOND.getText();
                nato = TXTNACI.getText();
                direc = TXTDIREC.getText();
                nompa = TXTNOMPA.getText();
                telpa = TXTTELPA.getText();
                nomma = TXTNOMMA.getText();
                telma = TXTTELMA.getText();
                nomacu = TXTNOMACU.getText();
                telacu = TXTTELACU.getText();
                medici = TXTOBSMED.getText();
                eps = TXTEPS.getText();
                rh = TXTRH.getText();
                gener = TXTOBSGEN.getText();
                fotog = TXTRUTAFOTO.getText();
                System.out.println(fotog);
                sql = "insert into estudiantes (Grad, Nomestu, Apellid, Tipodoc, Documentoid, De, Nacimiento, Direcci, Nombrepadre, Telpadre, Nombremadre, Telmadre, Nombreacu, Telacu, Obsemed, Eps, Rh, Obssegen, Fotogra) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                //System.out.println(sql);
                PreparedStatement psd = con.prepareStatement(sql);
                psd.setString(1, grado);
                psd.setString(2, nombre);
                psd.setString(3, ape);
                psd.setString(4, tdoc);
                psd.setString(5, doci);
                psd.setString(6, donde);
                psd.setString(7, nato);
                psd.setString(8, direc);
                psd.setString(9, nompa);
                psd.setString(10, telpa);
                psd.setString(11, nomma);
                psd.setString(12, telma);
                psd.setString(13, nomacu);
                psd.setString(14, telacu);
                psd.setString(15, medici);
                psd.setString(16, eps);
                psd.setString(17, rh);
                psd.setString(18, gener);
                psd.setString(19, fotog);
                int n = psd.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "Datos Almacenados con Éxito");
                }
                con.close();

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
            }
            limpiar();
        }
        bloquear();
    }//GEN-LAST:event_BTNGRAActionPerformed

    private void BTNBUSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBUSCActionPerformed
        String sql;
        String apel;
        apel = TXTAPE.getText();
//        System.out.println(apel);
        //String columnas;
        try {
            Connection con = null;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/americano", "root", "admin");
            Statement st = con.createStatement();
        //System.out.println(tb);
            //columnas="desc "+tb;
            //System.out.println(columnas);
            sql = "Select Grad, Nomestu, Apellid, Documentoid from estudiantes where Apellid = '" + apel + "'";
//        sql="Select Grad, Nomestu, Apellid from estudiantes where Apellid = '"+apel+"'";
//        System.out.println(sql);
            ResultSet rstb = st.executeQuery(sql);
        //ResultSet rscol=st.executeQuery(columnas);
            //while(rscol.next()){System.out.println(rscol.getString(1));}
            ResultSetMetaData rsmd = rstb.getMetaData();
            int col = rsmd.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            for (int i = 1; i <= col; i++) {
                modelo.addColumn(rsmd.getColumnLabel(i));
            }
            while (rstb.next()) {
                String fila[] = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rstb.getString(j + 1);
                }
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
            rstb.close();
            con.close();

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTNBUSCActionPerformed

    private void BTNPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPDFActionPerformed
        int fila = this.tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un estudiante");
        } else {
            try {
                String dni = tabla.getValueAt(fila, 3).toString();
                Reportes direc = new Reportes();
                direc.resportuniPDF("ReportesCAM\\reportest.jrxml", dni);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al cargar el reporte del Docente", "Error", JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_BTNPDFActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        int fila = this.tabla.getSelectedRow();
    }//GEN-LAST:event_tablaMousePressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask BTNBUSC;
    private org.edisoncor.gui.button.ButtonTask BTNELI;
    private org.edisoncor.gui.button.ButtonTask BTNGRA;
    private org.edisoncor.gui.button.ButtonTask BTNMO;
    private javax.swing.JButton BTNPDF;
    private javax.swing.JTextField TXTAPE;
    private javax.swing.JTextField TXTDIREC;
    private javax.swing.JTextField TXTDOCID;
    private javax.swing.JTextField TXTDOND;
    private javax.swing.JTextField TXTEPS;
    private javax.swing.JTextField TXTESTU;
    private javax.swing.JLabel TXTFOTO;
    private javax.swing.JTextField TXTNACI;
    private javax.swing.JTextField TXTNOMACU;
    private javax.swing.JTextField TXTNOMMA;
    private javax.swing.JTextField TXTNOMPA;
    private javax.swing.JTextField TXTOBSGEN;
    private javax.swing.JTextField TXTOBSMED;
    private javax.swing.JTextField TXTRH;
    private javax.swing.JTextField TXTRUTAFOTO;
    private javax.swing.JTextField TXTTELACU;
    private javax.swing.JTextField TXTTELMA;
    private javax.swing.JTextField TXTTELPA;
    private org.edisoncor.gui.button.ButtonTask btnfoto;
    private org.edisoncor.gui.button.ButtonTask btnsal;
    private javax.swing.JComboBox cmbdoc;
    private javax.swing.JComboBox cmbgrad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
