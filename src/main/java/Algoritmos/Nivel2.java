
package Algoritmos;

import javax.swing.JOptionPane;

public class Nivel2
{
    
    public void Numero5()
    {
        double[] numeros = new double[8];
        double suma = 0.0;
        
        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de la posicion "+i));
            
        }
        
        for (double p: numeros)
        {
            suma +=p;
            
        }
        
        JOptionPane.showMessageDialog(null, "La suma de los 8 numeros es: "+String.format("%.2f%n",suma));
   
    }
    
    public void Numero6()
    {
        boolean[] asistencia = {true, true, false, true, true, false, false, false, false, true, false, true, true ,false, true, true, false, true, false, false};
        int presente, ausente, contador;
        presente = 0;
        ausente = 0;
        contador = 0;
                
        for (int i = 0; i < asistencia.length; i++)
        {
            if(asistencia[i])
            {
                presente++;       
            }
            if(asistencia[i] == false)
            {
                ausente++;
            }
            contador++;
        }
        
        int promedio = (presente*100)/contador;
        JOptionPane.showMessageDialog(null, "Hay "+presente+ " estudiantes presente y "+ausente+" estudiantes ausentes, el promedio de asistencia es "+promedio+"%");
    }
    
    public void Numero7()
    {
         char[] caracteres = {'j', 'w', 'o', 'a', 'b', 'f', 't', 'i', 'c', 'a', 'e', 'k', 'q', 'l', 'u'}; 
         char[] vocales = {'a', 'e', 'i', 'o', 'u'};
         int contador = 0;
         
         for(int i = 0; i < caracteres.length; i++)
         {
            for (char v: vocales)
            {
                if (caracteres[i] == v)
                {
                    contador++;
                }
            }
             
         }
         
         JOptionPane.showMessageDialog(null, "En total hay "+contador+" vocales");
    }
    
    public void Numero8()
    {
        int [] numeros = new int[15];
        int sumaPares = 0;
        int sumaImpares = 0;
        
        for(int i = 0; i < numeros.length; i++)
        {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de la posicion "+i));//el primer numero nunca cuenta porque 0 no es ni par ni impar
            
        }
        
         for(int i = 0; i < numeros.length; i++)
         {
             if (i %2 == 0)
             {
                 sumaPares += numeros[i];
             }
             
             if(i %2 !=0)
             {
                 sumaImpares += numeros[i];
             }
         }
         
         JOptionPane.showMessageDialog(null, "La suma de los numeros en indices par es de: "+sumaPares+"\n y la suma de los numeros en indices impares es de: "+sumaImpares);
    }
    
    
                
           
    

        
        
    
    
    
    
    

    

    

    
    
    
    
    
    
    
    
    
    
    
    
}
