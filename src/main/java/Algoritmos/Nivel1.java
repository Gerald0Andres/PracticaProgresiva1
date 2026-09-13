
package Algoritmos;

import javax.swing.JOptionPane;

public class Nivel1
{
    public void Numero1()
           
    {
        double[] numeros = {12.50, 8.75, 20.00, 5.25};
        
        int contador = 0;
        
        for (int i = 0; i < numeros.length; i++)
        {
            contador++;
        }
        
        JOptionPane.showMessageDialog(null, "La longitu del arreglo es: "+contador+ " y el ultimo numero es: "+numeros[numeros.length-1]);
        
    }
    
    public void Numero2()
    {
        boolean[] posicion = {true, false, true, false, false, true};
        
        int contador = 0;
        
        for(int i = 0; i < posicion.length; i++)
        {
            contador++;
            
            JOptionPane.showMessageDialog(null, "La posicion "+contador+" es: "+posicion[i]);
        }
        
        
    }
    
    public void Numero3()
    {
        int numeros[];
        numeros = new int[8];
        
        for(int i = 0; i < numeros.length; i++)
        {
        numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Indiqueel valor de la posicion "+i));
        
        }
        
        for (int i = 0; i < numeros.length; i++)
        {
            JOptionPane.showMessageDialog(null, "El numero en la posicion "+i+" es: "+numeros[i]);
        }
    }
    
    public void Numero4()
    {
        String p;
        p = "programador";
        
        
        char[] palabra = new char[11];
        
        for (int i = 0; i < palabra.length; i++)
        {
            palabra[i] = p.charAt(i);
            
            JOptionPane.showMessageDialog(null, "palabra: programador\nPosicion "+i+": "+palabra[i]);
            
            
            
            
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
