package cod_libreria;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author emendezduran
 */
public abstract class IO implements Interface {

    @Override
    public abstract void mostrar(String msg);

 /**
 *  El metodo recibe un mensaje y lo muestra por consola
 *
 * @param msg Mensaje tipo String que recibe el metodo  
 * 
 */
    enum Tipo {
        CONSOLA, VENTANA
    };

    
    public static IO crearOutput(Tipo tipo) {

        IO OutputCreado;
        switch (tipo) {
            // creamos un dialogo de consola
            case CONSOLA:
                OutputCreado = new OutputCons();
                break;
            // creamos un dialogo de ventana
            case VENTANA:
                OutputCreado = new OutputWin();
                break;
            default:
                OutputCreado = null;
        }

        return OutputCreado;

    }

/**
 * El metoto habilita la entrada de texto por consola 
 * para que el usuario escriba un mensaje 
 *
 * @return Mensaje introducido por el usuario
 */    

    public static String imput() {
        return new Scanner(System.in).next();
    }

/**
 *  El metodo recibe un mensaje que muestra al usuario y 
 *  habilita la entrada de texto por consola para que el 
 *  usuario escriba un mensaje 
 *
 * @param msg Esta variable tipo String establece el mensaje que recibe el usuario
 * 
 * @return Mensaje introducido por el usuario  
 */
 
    public static String imput(String msg) {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

/**
 *  El metodo recibe un titulo y un mensaje y lo muestra en una ventana
 *  habilita la entrada de texto para que el usuario escriba un mensaje 
 *
 * @param titulo Esta variable tipo String establece el titulo de la ventana 
 * @param msg Esta variable tipo String establece el mensaje que saldra en la ventana
 * 
 * @return Mensaje introducido por el usuario en la ventana 
 */
    
    public static String imput(String titulo, String msg) {
        return JOptionPane.showInputDialog(null, msg, titulo, 0);
    }

/**
 * El metodo recibe una variable de tipo String y verifica si es de tipo int
 *
 * @param str variable de tipo String a verificar
 * 
 * @return  boolean
 * 
 * @exception NumberFormatException
 */
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

/**
 * El metodo recibe una variable tipo String y lo devuelve de tipo int.
 *
 * @param  str  variable String que se quiere parsear 
 * @return      variable de tipo int
 */    
    public static int stringToInt(String str) {
        return Integer.parseInt(str);
    }

}
    
    
    
    
    
    
    


