package cod_libreria;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author emendezduran
 */
public class IO {

 /**
 *  El metodo recibe un mensaje y lo muestra por consola
 *
 * @param msg Mensaje tipo String que recibe el metodo  
 * 
 */
    public static void output(String msg) {
        System.out.println(msg);
    }
    
 /**
 *  El metodo recibe un titulo y un mensaje y lo muestra en una ventana
 *
 * @param titulo Esta variable tipo String establece el titulo de la ventana 
 * @param msg Esta variable tipo String establece el mensaje que saldra en la ventana
 */
    public static void output(String titulo, String msg) {
        JOptionPane.showInputDialog(null, msg, titulo, 0);
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
    
    
    
    
    
    
    


