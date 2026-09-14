
package main;
import Algoritmos.*;
import javax.swing.JOptionPane;

public class Menu 
{
    int opcion = 0;
    
    Nivel1 nivel1 = new Nivel1();
    Nivel2 nivel2 = new Nivel2();
    Nivel3 nivel3 = new Nivel3();
    
    public void menu()
    {
        
        
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Indique el ejercicio a evaluar\n"
            +"Los ejercicios van del 1 al 12"));
            
            switch(opcion)
            {
                case 1:
                    nivel1.Numero1();
                    break;
                    
                    
                case 2:
                    nivel1.Numero2();
                    break;
                    
                case 3:
                    nivel1.Numero3();
                    
                    break;
                    
                case 4:
                    nivel1.Numero4();
                    break;
                    
                case 5:
                    nivel2.Numero5();
                    break;
                    
                case 6:
                    nivel2.Numero6();
                    break;
                    
                case 7:
                    nivel2.Numero7();
                    break;
                    
                case 8:
                    nivel2.Numero8();
                    break;
                    
                case 9:
                    nivel3.Numero9();
                    break;
                    
                case 10:
                    nivel3.Numero10();
                    break;
                    
                case 11:
                    nivel3.Numero11();
                    break;
                    
                case 12:
                    nivel3.Numero12();
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "seleccione una opcion valida");
                        
                    
                  
                
                
                
                
                
            }
                    
                
            
                    
                
            
            
        }while (opcion != 21);
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
