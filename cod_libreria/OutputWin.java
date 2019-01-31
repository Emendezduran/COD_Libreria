package cod_libreria;
//@author emendezduran

import javax.swing.JOptionPane;

public class OutputWin extends IO {

    @Override
    public void mostrar(String msg) {
        mostrar(msg, "Ventana");
    }

    public void mostrar(String msg, String titulo){
        JOptionPane.showInputDialog(null, msg, titulo);
    }
    
}
