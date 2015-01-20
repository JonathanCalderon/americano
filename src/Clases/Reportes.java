package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jhony
 */
public class Reportes {
   Connection cn;
    Statement instrucion;

    public Reportes() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/americano", "root", "admin");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }

//METODO PARA EXPORTAR A PDF UN REPORTE   

    public void resportesPDF(String rut) {
        try {
            JasperReport dirdoc = JasperCompileManager.compileReport(rut);
            JasperPrint info = JasperFillManager.fillReport(dirdoc, null, cn);
            JasperViewer ventanavisor = new JasperViewer(info, false);
            ventanavisor.setTitle("INFORME");
            ventanavisor.setVisible(true);
            cn.close();
        } catch (JRException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR AL EXPORTAR DOCUMENTO");
        }
    }
 
    public void resportuniPDF(String rut, String dni) {
        try {
                JasperReport dirdoc = JasperCompileManager.compileReport(rut);
                Map parametros = new HashMap();
                parametros.put("docdoc",dni);
                JasperPrint info = JasperFillManager.fillReport(dirdoc, parametros, cn);
                JasperViewer ventanavisor = new JasperViewer(info, false);
                ventanavisor.setTitle("INFORME");
                ventanavisor.setVisible(true);
                cn.close();
        } catch (JRException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR AL EXPORTAR DOCUMENTO");
        }
    }   
    
    
    public void resportbolPDF(String rut, String dni, String peri, String año) {
        try {
                JasperReport dirdoc = JasperCompileManager.compileReport(rut);
                Map parametros = new HashMap();
                parametros.put("est",dni);
                parametros.put("periodo",peri);
                parametros.put("año",año);
                JasperPrint info = JasperFillManager.fillReport(dirdoc, parametros, cn);
                JasperViewer ventanavisor = new JasperViewer(info, false);
                ventanavisor.setTitle("INFORME");
                ventanavisor.setVisible(true);
                cn.close();
        } catch (JRException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR AL EXPORTAR DOCUMENTO");
        }
    }
    
    
    public void resportcertiPDF(String rut, String dni, String cur, String nombre) {
        try {
                JasperReport dirdoc = JasperCompileManager.compileReport(rut);
                Map parametros = new HashMap();
                parametros.put("docdoc",dni);
                parametros.put("curso",cur);
                parametros.put("nombre",nombre);
                JasperPrint info = JasperFillManager.fillReport(dirdoc, parametros, cn);
                JasperViewer ventanavisor = new JasperViewer(info, false);
                ventanavisor.setTitle("INFORME");
                ventanavisor.setVisible(true);
                cn.close();
        } catch (JRException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR AL EXPORTAR DOCUMENTO");
        }
    }
}
