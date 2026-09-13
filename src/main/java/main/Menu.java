
package main;
import Algoritmos.*;
import javax.swing.JOptionPane;

public class Menu 
{
    int opcion = 0;
    
    Nivel1 nivel1 = new Nivel1();
    
    public void menu()
    {
        
        
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Indique el ejercicio a evaluar"));
            
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
                    
                  
                
                
                
                
                
            }
                    
                
            
                    
                
            
            
        }while (opcion != 21);
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
