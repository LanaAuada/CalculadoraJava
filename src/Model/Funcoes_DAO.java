
package Model;

import static View.Inicio_GUI.valor1_txt;
import static View.Inicio_GUI.valor2_txt;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Funcoes_DAO {
    

    public static void somar(){
        String y = View.Inicio_GUI.valor1_txt.getText();
        double v1 = Double.parseDouble(y);
        
        y = View.Inicio_GUI.valor2_txt.getText();
        double v2 = Double.parseDouble(y);
        
        double res = v1+v2;
        
        View.Inicio_GUI.resultado_lbl.setText(String.valueOf(res));
        
    }
    
    public static void subtrair(){
        String y = View.Inicio_GUI.valor1_txt.getText();
        double v1 = Double.parseDouble(y);
        
        y = View.Inicio_GUI.valor2_txt.getText();
        double v2 = Double.parseDouble(y);
        
        double res = v1-v2;
        
        View.Inicio_GUI.resultado_lbl.setText(String.valueOf(res));
        
    }
    
    public static void multiplicar(){
        String y = View.Inicio_GUI.valor1_txt.getText();
        double v1 = Double.parseDouble(y);
        
        y = View.Inicio_GUI.valor2_txt.getText();
        double v2 = Double.parseDouble(y);
        
        double res = v1*v2;
        
        View.Inicio_GUI.resultado_lbl.setText(String.valueOf(res));
        
    }
    
    public static void dividir(){
        String y = View.Inicio_GUI.valor1_txt.getText();
        double v1 = Double.parseDouble(y);
        
        y = View.Inicio_GUI.valor2_txt.getText();
        double v2 = Double.parseDouble(y);
        
        double res = v1/v2;
        
        View.Inicio_GUI.resultado_lbl.setText(String.valueOf(res));
        
    }
    
}
