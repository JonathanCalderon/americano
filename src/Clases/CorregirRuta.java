
package Clases;

import java.util.StringTokenizer;


public class CorregirRuta {
    String ruta, separador, nuevoseparador;
    
    public CorregirRuta(String laruta, String sep, String nuevosep){
    ruta=laruta;
    separador=sep;
    nuevoseparador=nuevosep;
    }
    
    public String obtenerRutaCorregidaWindows(){
        StringTokenizer tokens=new StringTokenizer(ruta, separador);
        String rutaCorregida = new String();
        int noTokens = tokens.countTokens();
        int i = 1;
        do {
        rutaCorregida +=tokens.nextToken()+nuevoseparador;
        i++;
        }while(i<noTokens);
        rutaCorregida +=tokens.nextToken();
        System.out.println(rutaCorregida+"\n"+noTokens+ " tokens");
        return rutaCorregida;
    }
}   