
package Menu;

import Clases.Reportes;
import Interfaces.Asignaturas;
import Interfaces.Boletines;
import Interfaces.Certificados;
import Interfaces.Docentes;
import Interfaces.Estudiantes;
import Interfaces.ExpGru;
import Interfaces.Logros;
import Interfaces.Notas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Principal extends javax.swing.JFrame {

    
private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo CSV", "csv");
    



    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        jXMonthView1 = new org.jdesktop.swingx.JXMonthView();
        clockFace1 = new org.edisoncor.gui.varios.ClockFace();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        IMPNOTAS = new javax.swing.JMenuItem();
        IMPLOGROS = new javax.swing.JMenuItem();
        MNBACKUP = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        JISalir = new javax.swing.JMenuItem();
        Mnestu = new javax.swing.JMenu();
        Mndtest = new javax.swing.JMenuItem();
        Mndoc = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        ITMLOGRO = new javax.swing.JMenuItem();
        MnDirec = new javax.swing.JMenu();
        fichgen = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MNKINDER = new javax.swing.JMenuItem();
        MNTRANS = new javax.swing.JMenuItem();
        MNPRI = new javax.swing.JMenuItem();
        MNSSEG = new javax.swing.JMenuItem();
        MNTER = new javax.swing.JMenuItem();
        MNCUA = new javax.swing.JMenuItem();
        MNQUI = new javax.swing.JMenuItem();
        MNSEX = new javax.swing.JMenuItem();
        MNSEP = new javax.swing.JMenuItem();
        MNOCT = new javax.swing.JMenuItem();
        MNNOV = new javax.swing.JMenuItem();
        MNDEC = new javax.swing.JMenuItem();
        MNUND = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        CNSKINDER = new javax.swing.JMenuItem();
        CNSTRANS = new javax.swing.JMenuItem();
        CNSPRI = new javax.swing.JMenuItem();
        CNSSEG = new javax.swing.JMenuItem();
        CNSTER = new javax.swing.JMenuItem();
        CNSCUA = new javax.swing.JMenuItem();
        CNSQUI = new javax.swing.JMenuItem();
        CNSSEX = new javax.swing.JMenuItem();
        CNSSEP = new javax.swing.JMenuItem();
        CNSOCT = new javax.swing.JMenuItem();
        CNSNOV = new javax.swing.JMenuItem();
        CNSDEC = new javax.swing.JMenuItem();
        CNSUND = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COLEGIO MERICANO MENNO SISTEMA ACADÉMICO");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/principal.png")).getImage());

        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO CAM IMAGEN_2.JPG"))); // NOI18N

        jXMonthView1.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jcMousePanel2Layout = new javax.swing.GroupLayout(jcMousePanel2);
        jcMousePanel2.setLayout(jcMousePanel2Layout);
        jcMousePanel2Layout.setHorizontalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGap(0, 625, Short.MAX_VALUE)
                .addComponent(jXMonthView1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clockFace1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jcMousePanel2Layout.setVerticalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel2Layout.createSequentialGroup()
                .addComponent(clockFace1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jXMonthView1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("INICIO");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenu5.setText("Exportar Información");

        jMenuItem12.setText("Exportar Grupos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem13.setText("Exportar Logros");
        jMenu5.add(jMenuItem13);

        jMenu1.add(jMenu5);

        jMenu6.setText("Importar Información");

        IMPNOTAS.setText("Importar Notas");
        IMPNOTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPNOTASActionPerformed(evt);
            }
        });
        jMenu6.add(IMPNOTAS);

        IMPLOGROS.setText("Importar Logros");
        IMPLOGROS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPLOGROSActionPerformed(evt);
            }
        });
        jMenu6.add(IMPLOGROS);

        jMenu1.add(jMenu6);

        MNBACKUP.setText("Crear Copia de Seguridad");
        MNBACKUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNBACKUPActionPerformed(evt);
            }
        });
        jMenu1.add(MNBACKUP);

        jMenuItem1.setText("Restaurar Copia de Seguridad");
        jMenu1.add(jMenuItem1);

        JISalir.setText("Salir");
        JISalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JISalirMouseClicked(evt);
            }
        });
        JISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JISalirActionPerformed(evt);
            }
        });
        jMenu1.add(JISalir);

        jMenuBar1.add(jMenu1);

        Mnestu.setText("GESTIÓN");

        Mndtest.setText("Datos Estuiantes");
        Mndtest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MndtestActionPerformed(evt);
            }
        });
        Mnestu.add(Mndtest);

        Mndoc.setText("Datos Profesores");
        Mndoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MndocActionPerformed(evt);
            }
        });
        Mnestu.add(Mndoc);

        jMenuItem10.setText("Asignaturas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        Mnestu.add(jMenuItem10);

        jMenuItem11.setText("Notas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        Mnestu.add(jMenuItem11);

        ITMLOGRO.setText("Logros");
        ITMLOGRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ITMLOGROActionPerformed(evt);
            }
        });
        Mnestu.add(ITMLOGRO);

        jMenuBar1.add(Mnestu);

        MnDirec.setText("REPORTES");
        MnDirec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MnDirecMouseReleased(evt);
            }
        });
        MnDirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDirecActionPerformed(evt);
            }
        });

        fichgen.setText("Fichas Generales de Estudiantes");
        fichgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichgenActionPerformed(evt);
            }
        });
        MnDirec.add(fichgen);

        jMenu2.setText("Planilla Generales");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu2MousePressed(evt);
            }
        });

        MNKINDER.setText("KINDER");
        MNKINDER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MNKINDERMousePressed(evt);
            }
        });
        jMenu2.add(MNKINDER);

        MNTRANS.setText("TRANSICION");
        MNTRANS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNTRANSMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MNTRANSMousePressed(evt);
            }
        });
        jMenu2.add(MNTRANS);

        MNPRI.setText("PRIMERO");
        MNPRI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNPRIMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MNPRIMousePressed(evt);
            }
        });
        jMenu2.add(MNPRI);

        MNSSEG.setText("SEGUNDO");
        MNSSEG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNSSEGMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MNSSEGMousePressed(evt);
            }
        });
        MNSSEG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNSSEGActionPerformed(evt);
            }
        });
        jMenu2.add(MNSSEG);

        MNTER.setText("TERCERO");
        MNTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNTERMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MNTERMousePressed(evt);
            }
        });
        jMenu2.add(MNTER);

        MNCUA.setText("CUARTO");
        MNCUA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNCUAMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MNCUAMousePressed(evt);
            }
        });
        jMenu2.add(MNCUA);

        MNQUI.setText("QUINTO");
        MNQUI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNQUIMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MNQUIMousePressed(evt);
            }
        });
        jMenu2.add(MNQUI);

        MNSEX.setText("SEXTO");
        MNSEX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNSEXMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MNSEXMousePressed(evt);
            }
        });
        jMenu2.add(MNSEX);

        MNSEP.setText("SEPTIMO");
        MNSEP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNSEPMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MNSEPMousePressed(evt);
            }
        });
        jMenu2.add(MNSEP);

        MNOCT.setText("OCTAVO");
        MNOCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNOCTMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MNOCTMousePressed(evt);
            }
        });
        jMenu2.add(MNOCT);

        MNNOV.setText("NOVENO");
        MNNOV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNNOVMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MNNOVMousePressed(evt);
            }
        });
        jMenu2.add(MNNOV);

        MNDEC.setText("DECIMO");
        MNDEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNDECMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MNDECMousePressed(evt);
            }
        });
        jMenu2.add(MNDEC);

        MNUND.setText("UNDECIMO");
        MNUND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNUNDMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MNUNDMousePressed(evt);
            }
        });
        jMenu2.add(MNUND);

        MnDirec.add(jMenu2);

        jMenuItem4.setText("Boletines");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        MnDirec.add(jMenuItem4);

        jMenu4.setText("Consolidados");

        CNSKINDER.setText("KINDER");
        CNSKINDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNSKINDERActionPerformed(evt);
            }
        });
        jMenu4.add(CNSKINDER);

        CNSTRANS.setText("TRANSICION");
        CNSTRANS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNSTRANSActionPerformed(evt);
            }
        });
        jMenu4.add(CNSTRANS);

        CNSPRI.setText("PRIMERO");
        CNSPRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNSPRIActionPerformed(evt);
            }
        });
        jMenu4.add(CNSPRI);

        CNSSEG.setText("SEGUNDO");
        CNSSEG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNSSEGActionPerformed(evt);
            }
        });
        jMenu4.add(CNSSEG);

        CNSTER.setText("TERCERO");
        CNSTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNSTERActionPerformed(evt);
            }
        });
        jMenu4.add(CNSTER);

        CNSCUA.setText("CUARTO");
        CNSCUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNSCUAActionPerformed(evt);
            }
        });
        jMenu4.add(CNSCUA);

        CNSQUI.setText("QUINTO");
        CNSQUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNSQUIActionPerformed(evt);
            }
        });
        jMenu4.add(CNSQUI);

        CNSSEX.setText("SEXTO");
        CNSSEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNSSEXActionPerformed(evt);
            }
        });
        jMenu4.add(CNSSEX);

        CNSSEP.setText("SEPTIMO");
        CNSSEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNSSEPActionPerformed(evt);
            }
        });
        jMenu4.add(CNSSEP);

        CNSOCT.setText("OCTAVO");
        CNSOCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNSOCTActionPerformed(evt);
            }
        });
        jMenu4.add(CNSOCT);

        CNSNOV.setText("NOVENO");
        CNSNOV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNSNOVActionPerformed(evt);
            }
        });
        jMenu4.add(CNSNOV);

        CNSDEC.setText("DECIMO");
        CNSDEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNSDECActionPerformed(evt);
            }
        });
        jMenu4.add(CNSDEC);

        CNSUND.setText("UNDECIMO");
        CNSUND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNSUNDActionPerformed(evt);
            }
        });
        jMenu4.add(CNSUND);

        MnDirec.add(jMenu4);

        jMenuItem8.setText("Certificado");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        MnDirec.add(jMenuItem8);

        jMenuItem9.setText("Directorio Docente");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        MnDirec.add(jMenuItem9);

        jMenuItem2.setText("Reporte Docentes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MnDirec.add(jMenuItem2);

        jMenuBar1.add(MnDirec);

        jMenu3.setText("CONSTANCIAS");

        jMenuItem6.setText("Constancia de matricula");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Constancia Laboral");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

    private void JISalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JISalirMouseClicked
      
    }//GEN-LAST:event_JISalirMouseClicked

    private void JISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JISalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_JISalirActionPerformed

    private void MndtestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MndtestActionPerformed
        Estudiantes estudy= new Estudiantes();
        estudy.setVisible(true);
        
    }//GEN-LAST:event_MndtestActionPerformed

    private void MndocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MndocActionPerformed
        Docentes doce= new Docentes();
        doce.setVisible(true);
    }//GEN-LAST:event_MndocActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Asignaturas asig= new Asignaturas();
        asig.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Notas nota= new Notas();
        nota.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Reportes direc= new Reportes();
        direc.resportesPDF("ReportesCAM\\DirectorioDocente.jrxml");
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       Reportes direc= new Reportes();
        direc.resportesPDF("ReportesCAM\\reportdoc.jrxml");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ITMLOGROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ITMLOGROActionPerformed
        Logros logro= new Logros();
        logro.setVisible(true);
    }//GEN-LAST:event_ITMLOGROActionPerformed

    private void MNSSEGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNSSEGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MNSSEGActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
     
    }//GEN-LAST:event_jMenu2MouseClicked

    private void MNTRANSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNTRANSMouseClicked
        
    }//GEN-LAST:event_MNTRANSMouseClicked

    private void MNSSEGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNSSEGMousePressed
        String dni = MNSSEG.getText();
        cursopdf(dni);
    }//GEN-LAST:event_MNSSEGMousePressed

    private void jMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MousePressed

    }//GEN-LAST:event_jMenu2MousePressed

    private void MNKINDERMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNKINDERMousePressed
        String dni = MNKINDER.getText();
        cursopdf(dni); 
    }//GEN-LAST:event_MNKINDERMousePressed

    private void MnDirecMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnDirecMouseReleased

    }//GEN-LAST:event_MnDirecMouseReleased

    private void MNPRIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNPRIMouseClicked

    }//GEN-LAST:event_MNPRIMouseClicked

    private void MNSSEGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNSSEGMouseClicked
        
    }//GEN-LAST:event_MNSSEGMouseClicked

    private void MNTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNTERMouseClicked
        
    }//GEN-LAST:event_MNTERMouseClicked

    private void MNCUAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNCUAMouseClicked
        
    }//GEN-LAST:event_MNCUAMouseClicked

    private void MNQUIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNQUIMouseClicked
         
    }//GEN-LAST:event_MNQUIMouseClicked

    private void MNSEXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNSEXMouseClicked
         
    }//GEN-LAST:event_MNSEXMouseClicked

    private void MNSEPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNSEPMouseClicked
        
    }//GEN-LAST:event_MNSEPMouseClicked

    private void MNOCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNOCTMouseClicked
         
    }//GEN-LAST:event_MNOCTMouseClicked

    private void MNNOVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNNOVMouseClicked
        
    }//GEN-LAST:event_MNNOVMouseClicked

    private void MNDECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNDECMouseClicked
        
    }//GEN-LAST:event_MNDECMouseClicked

    private void MNUNDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNUNDMouseClicked
         
    }//GEN-LAST:event_MNUNDMouseClicked

    private void MNTRANSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNTRANSMousePressed
        String dni = MNTRANS.getText();
        cursopdf(dni);
    }//GEN-LAST:event_MNTRANSMousePressed

    private void MNPRIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNPRIMousePressed
        String dni = MNPRI.getText();
        cursopdf(dni);
    }//GEN-LAST:event_MNPRIMousePressed

    private void MNTERMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNTERMousePressed
        String dni = MNTER.getText();
        cursopdf(dni);
    }//GEN-LAST:event_MNTERMousePressed

    private void MNCUAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNCUAMousePressed
        String dni = MNCUA.getText();
        cursopdf(dni);
    }//GEN-LAST:event_MNCUAMousePressed

    private void MNQUIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNQUIMousePressed
        String dni = MNQUI.getText();
        cursopdf(dni);
    }//GEN-LAST:event_MNQUIMousePressed

    private void MNSEXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNSEXMousePressed
        String dni = MNSEX.getText();
        cursopdf(dni);
    }//GEN-LAST:event_MNSEXMousePressed

    private void MNSEPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNSEPMousePressed
        String dni = MNSEP.getText();
        cursopdf(dni); 
    }//GEN-LAST:event_MNSEPMousePressed

    private void MNOCTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNOCTMousePressed
        String dni = MNOCT.getText();
        cursopdf(dni);
    }//GEN-LAST:event_MNOCTMousePressed

    private void MNNOVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNNOVMousePressed
        String dni = MNNOV.getText();
        cursopdf(dni); 
    }//GEN-LAST:event_MNNOVMousePressed

    private void MNDECMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNDECMousePressed
        String dni = MNDEC.getText();
        cursopdf(dni); 
    }//GEN-LAST:event_MNDECMousePressed

    private void MNUNDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNUNDMousePressed
        String dni = MNUND.getText();
        cursopdf(dni);
    }//GEN-LAST:event_MNUNDMousePressed

    private void MNBACKUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNBACKUPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MNBACKUPActionPerformed

    private void MnDirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDirecActionPerformed
        
    }//GEN-LAST:event_MnDirecActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Boletines boletin= new Boletines();
        boletin.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void CNSKINDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNSKINDERActionPerformed
        String dni = CNSKINDER.getText();
        consopdf(dni);
    }//GEN-LAST:event_CNSKINDERActionPerformed

    private void CNSTRANSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNSTRANSActionPerformed
        String dni = CNSTRANS.getText();
        consopdf(dni);
    }//GEN-LAST:event_CNSTRANSActionPerformed

    private void CNSPRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNSPRIActionPerformed
        String dni = CNSPRI.getText();
        consopdf(dni);
    }//GEN-LAST:event_CNSPRIActionPerformed

    private void CNSSEGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNSSEGActionPerformed
        String dni = CNSSEG.getText();
        consopdf(dni);
    }//GEN-LAST:event_CNSSEGActionPerformed

    private void CNSTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNSTERActionPerformed
        String dni = CNSTER.getText();
        consopdf(dni);
    }//GEN-LAST:event_CNSTERActionPerformed

    private void CNSCUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNSCUAActionPerformed
        String dni = CNSCUA.getText();
        consopdf(dni);
    }//GEN-LAST:event_CNSCUAActionPerformed

    private void CNSQUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNSQUIActionPerformed
        String dni = CNSQUI.getText();
        consopdf(dni);
    }//GEN-LAST:event_CNSQUIActionPerformed

    private void CNSSEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNSSEXActionPerformed
        String dni = CNSSEX.getText();
        consopdf(dni);
    }//GEN-LAST:event_CNSSEXActionPerformed

    private void CNSSEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNSSEPActionPerformed
        String dni = CNSSEP.getText();
        consopdf(dni);
    }//GEN-LAST:event_CNSSEPActionPerformed

    private void CNSOCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNSOCTActionPerformed
        String dni = CNSOCT.getText();
        consopdf(dni);
    }//GEN-LAST:event_CNSOCTActionPerformed

    private void CNSNOVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNSNOVActionPerformed
        String dni = CNSNOV.getText();
        consopdf(dni);
    }//GEN-LAST:event_CNSNOVActionPerformed

    private void CNSDECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNSDECActionPerformed
        String dni = CNSDEC.getText();
        consopdf(dni);
    }//GEN-LAST:event_CNSDECActionPerformed

    private void CNSUNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNSUNDActionPerformed
        String dni = CNSUND.getText();
        consopdf(dni);
    }//GEN-LAST:event_CNSUNDActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Certificados certi= new Certificados();
        certi.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        ExpGru expo= new ExpGru();
        expo.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void IMPNOTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPNOTASActionPerformed
        //Creamos JFileChooser
        JFileChooser dlg = new JFileChooser();
        //Llamamos metodo setFileFlter
        dlg.setFileFilter(filter);
        //abrimos ventana para escojer archivo
        int option = dlg.showOpenDialog(this);
        //click en boton abrir
        if(option==JFileChooser.APPROVE_OPTION){
           //obtener nombre archivo
            String fil = dlg.getSelectedFile().getPath();
            //obterner direccion de archivo
            String file = dlg.getSelectedFile().toString();
            file=file.replace("\\","\\\\");
             String sql;
            sql = "";
            try{
                    Connection con=null;
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
                    Statement st=con.createStatement();
                    System.out.println(file);
                    sql="load data local infile '"+file+"' into table notas fields terminated by ',' lines terminated by '\n'";
                    System.out.println(sql);
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Datos Importados con Éxito");
                    con.close();
        
                }catch (ClassNotFoundException | SQLException ex) {
                    ex.printStackTrace();
                        Logger.getLogger(Asignaturas.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_IMPNOTASActionPerformed

    private void IMPLOGROSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPLOGROSActionPerformed
        //Creamos JFileChooser
        JFileChooser dlg = new JFileChooser();
        //Llamamos metodo setFileFlter
        dlg.setFileFilter(filter);
        //abrimos ventana para escojer archivo
        int option = dlg.showOpenDialog(this);
        //click en boton abrir
        if(option==JFileChooser.APPROVE_OPTION){
           //obtener nombre archivo
            String fil = dlg.getSelectedFile().getPath();
            //obterner direccion de archivo
            String file = dlg.getSelectedFile().toString();
            file=file.replace("\\","\\\\");
            String sql;
            sql = "";
            try{
                    Connection con=null;
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3307/americano","root","admin");
                    Statement st=con.createStatement();
                    System.out.println(file);
                    sql="load data local infile '"+file+"' into table logros fields terminated by ',' lines terminated by '\n'";
                    System.out.println(sql);
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Datos Importados con Éxito");
                    con.close();
        
                }catch (ClassNotFoundException | SQLException ex) {
                    ex.printStackTrace();
                        Logger.getLogger(Asignaturas.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    }//GEN-LAST:event_IMPLOGROSActionPerformed

    private void fichgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichgenActionPerformed
        Reportes direc= new Reportes();
        direc.resportesPDF("ReportesCAM\\reportgenest.jrxml");
    }//GEN-LAST:event_fichgenActionPerformed
       
    
    public void cursopdf(String dni){
        try{
               Reportes direc= new Reportes();
               direc.resportuniPDF("ReportesCAM\\reportcurso.jrxml",dni);
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al cargar el reporte ", "Error", JOptionPane.ERROR);
       }
    
    }
    
    public void consopdf(String dni){
        try{
               Reportes direc= new Reportes();
               direc.resportuniPDF("ReportesCAM\\reportcconso.jrxml",dni);
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al cargar el reporte ", "Error", JOptionPane.ERROR);
       }
    
    }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CNSCUA;
    private javax.swing.JMenuItem CNSDEC;
    private javax.swing.JMenuItem CNSKINDER;
    private javax.swing.JMenuItem CNSNOV;
    private javax.swing.JMenuItem CNSOCT;
    private javax.swing.JMenuItem CNSPRI;
    private javax.swing.JMenuItem CNSQUI;
    private javax.swing.JMenuItem CNSSEG;
    private javax.swing.JMenuItem CNSSEP;
    private javax.swing.JMenuItem CNSSEX;
    private javax.swing.JMenuItem CNSTER;
    private javax.swing.JMenuItem CNSTRANS;
    private javax.swing.JMenuItem CNSUND;
    private javax.swing.JMenuItem IMPLOGROS;
    private javax.swing.JMenuItem IMPNOTAS;
    private javax.swing.JMenuItem ITMLOGRO;
    private javax.swing.JMenuItem JISalir;
    private javax.swing.JMenuItem MNBACKUP;
    private javax.swing.JMenuItem MNCUA;
    private javax.swing.JMenuItem MNDEC;
    private javax.swing.JMenuItem MNKINDER;
    private javax.swing.JMenuItem MNNOV;
    private javax.swing.JMenuItem MNOCT;
    private javax.swing.JMenuItem MNPRI;
    private javax.swing.JMenuItem MNQUI;
    private javax.swing.JMenuItem MNSEP;
    private javax.swing.JMenuItem MNSEX;
    private javax.swing.JMenuItem MNSSEG;
    private javax.swing.JMenuItem MNTER;
    private javax.swing.JMenuItem MNTRANS;
    private javax.swing.JMenuItem MNUND;
    private javax.swing.JMenu MnDirec;
    private javax.swing.JMenuItem Mndoc;
    private javax.swing.JMenuItem Mndtest;
    private javax.swing.JMenu Mnestu;
    private org.edisoncor.gui.varios.ClockFace clockFace1;
    private javax.swing.JMenuItem fichgen;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private org.jdesktop.swingx.JXMonthView jXMonthView1;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    // End of variables declaration//GEN-END:variables
}
