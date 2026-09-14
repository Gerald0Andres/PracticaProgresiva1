
package Algoritmos;

import javax.swing.JOptionPane;

public class Nivel3 
{
    public void Numero9()
    {
        int numeros[] = new int[10];
        int mayor, menor;
        mayor = 1;
        menor = 999999999;
        
         for (int i = 0; i < numeros.length; i++)
         {
             numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion "+i));
         }
        
        for (int i = 0; i < numeros.length; i++)
        {
            if (mayor  < numeros[i])
            {
                mayor = numeros[i];
            }
            
            if (menor > numeros[i])
            {
                menor = numeros[i];
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "El numero mayor es: "+mayor+" y el menor es: "+menor);
        
    }
    
    public void Numero10()
    {
        int numeros[] = {-1, 23, 65, 234, 75, 4, 76, 60, 893, 3, 24, 17, 6};
        int verificar = -1;
        
        int respuesta = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor a verificar"));
        
        
        
        for(int i = 0; i < numeros.length; i++)
        {
            if (numeros[i] == respuesta)
            verificar = i;
            
        }
        
        JOptionPane.showMessageDialog(null, "La posicion del numero "+respuesta+" es el indice: "+verificar);
    }
    
    public void Numero11()
    {
        int numeros[] = new int[12];
        int contador;
        
        contador = 0;
        
        for (int i = 0; i < numeros.length; i++)
        {
           numeros[i] = Integer.parseInt( JOptionPane.showInputDialog("ingrese el valor del indice "+i));
            
        }
        
        int verificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a contar en el arreglo"));
        for (int i = 0; i < numeros.length; i++)
        {
            if(numeros[i] == verificar)
            {
                contador++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "el numero "+verificar+" se encuentra un total de "+contador+" veces en el arreglo");
        
        
    }
    
    public void Numero12()
{
    char caracteres[] = {'g', 'e', 'l', '4', '%', '0', 'm', '*', ' ', '4', 'u'};
    char vocales[] = {'a', 'e', 'i', 'o', 'u'};
    char consonantes[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        
    int vocaless = 0;
    int consonantess = 0;
    int simbolos = 0;
        
    for (int i = 0; i < caracteres.length; i++)
    {
        char actual = caracteres[i];
        boolean esVocal = false;
        boolean esConsonante = false;
            
        
        for (int m = 0; m < vocales.length; m++)
        {
            if (actual == vocales[m])
            {
                esVocal = true;
                break; 
            }
        }
            
       
        if (esVocal)
        {
            vocaless++;
        }
        else
        {
            
            for (int n = 0; n < consonantes.length; n++)
            {
                if (actual == consonantes[n])
                {
                    esConsonante = true;
                    break; 
                }
            }
                
            if (esConsonante)
            {
                consonantess++;
            }
            else
            {
                
                simbolos++;
            }
        }
    }
        
    JOptionPane.showMessageDialog(null, "En total hay " + vocaless + " vocales, " + consonantess + " consonantes y " + simbolos + " símbolos.");
}
}
