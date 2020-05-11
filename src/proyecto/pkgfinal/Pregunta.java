/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author raulmontoyaarredondo
 */
public class Pregunta {
    public Random rdn = new Random();
    private String[] questionTypeX = new String[5];
    
    
    public Pregunta(){
        
    }

    /*
    Tipos de pregunta:

    -Tipo 1-
    Cual de los siguinetes valores esta en este "inserte rango" rango?

    Tipo 2
    Cual de los siguientes es el valor de la hipotenusa del triangulo con catetos a= "Inserte a" y b= "Inserte b"?

    Tipo 3
    Elija la opcion que contenga las dos ceros reales de la siguiente ecuacion cuadratica: "Inserte la ecuación" 

    Tipo 4
    Cual de los siguientes es el volumen del cilindro con r="Inserte r" y h="Inserte h"?

    Tipo 5
    Cual de los siguientes es el Volumen de la caja con lados a="Inserte a", b="Inserte b" y c="Inserte c"?

    Tipo 6
    
    */
    
    // Inicio Metodos
        
    public String[] preguntaTipo1(){
        String[] questionType1 = new String[5];
        String range = "";
        int upperLimit = rdn.nextInt(2000)-990;
        int lowerLimit = rdn.nextInt(2000)-1000;
        int combination = rdn.nextInt(4);
        int combination2 = rdn.nextInt(4);
        int correctAnswer =0;
        int option1 = 0;
        int option2 = 0;
        int option3 = 0;
        String mensaje = "";
        
        
        //Compruebo que los limites generados aleatoriamente no sean iguales, en caso de serlo
        //añado 50 a la variable upperLimit
        if (lowerLimit==upperLimit){
            upperLimit = upperLimit + 50;
        }
        //Compruebo que el limitie superior sea mayor que el limite inferior, encaso de uqe nosea asi
        //intercambio los valores de estos.
        if (lowerLimit>upperLimit){
            int x = upperLimit;
            upperLimit = lowerLimit;
            lowerLimit = x;
        }
        
        // Utilizo Switch para tener en cuenta los posibles casos correspondientes a las combinaciones 
        // estre Los parentesis y los corchetes, ya que estos definen si un limite se incluye en el rango
        // o no y puede cambiar las opciones a elegir.
        // El caso elegido dependera de una variable que tiene un valor random entre 0 y 3.
        switch (combination){
            case 0:
            {
                //Asigno a la variable correctAnswer un valor que se encuentre en el intervalo generado
                correctAnswer = lowerLimit + rdn.nextInt(upperLimit - lowerLimit + 1);
                range = "<html><p>Cual de los siguinetes valores esta dentro de este rango: <br/>" +  "[ " + lowerLimit + " , " + upperLimit + " ] .</p></html>";
                
                // Estos if sirven para tener en cuente la posibilidades a la hora de mostrar posibles 
                // respuestas.
                // El caso elegido dependera de una variable que tiene un valor random entre 0 y 3.
                if (combination2 == 0 )
                {
                    option1 = upperLimit + rdn.nextInt(20) + 6;
                    option2 = upperLimit + rdn.nextInt(5)+ 1;
                    option3 = upperLimit + rdn.nextInt(50) + 26;
                }

                if (combination2 == 1 )
                {
                    option1 = lowerLimit - rdn.nextInt(20) - 6;
                    option2 = lowerLimit - rdn.nextInt(5)-1;
                    option3 = lowerLimit - rdn.nextInt(50) - 26;
                }

                if (combination2 == 2 )
                {
                    option1 = lowerLimit - rdn.nextInt(20) - 6;
                    option2 = upperLimit + rdn.nextInt(5) + 1;
                    option3 = lowerLimit - rdn.nextInt(50) - 26;
                }

                if (combination2 == 3 )
                {
                    option1 = upperLimit + rdn.nextInt(20) + 6;
                    option2 = lowerLimit - rdn.nextInt(5) - 1;
                    option3 = upperLimit + rdn.nextInt(50) + 26;
                }  
                break;
            }
            
            case 1:
                {
                    //Asigno a la variable correctAnswer un valor que se encuentre en el intervalo generado
                    correctAnswer = lowerLimit + rdn.nextInt(upperLimit - lowerLimit );
                    range = "<html><p>Cual de los siguientes valores esta dentro de este rango: <br/>" + "[ " + lowerLimit + " , " + upperLimit + " ) .</p></html>";

                    // Estos if sirven para tener en cuente la posibilidades a la hora de mostrar posibles 
                    // respuestas.
                    // El caso elegido dependera de una variable que tiene un valor random entre 0 y 3.
                    if (combination2 == 0 )
                    {
                        option1 = upperLimit + rdn.nextInt(20) + 5;
                        option2 = upperLimit + rdn.nextInt(5);
                        option3 = upperLimit + rdn.nextInt(50) + 25;
                    }

                    if (combination2 == 1 )
                    {
                        option1 = lowerLimit - rdn.nextInt(20) - 6;
                        option2 = lowerLimit - rdn.nextInt(5) - 1;
                        option3 = lowerLimit - rdn.nextInt(50) - 26;
                    }

                    if (combination2 == 2 )
                    {
                        option1 = lowerLimit - rdn.nextInt(20) + 1;
                        option2 = upperLimit + rdn.nextInt(5);
                        option3 = lowerLimit - rdn.nextInt(50) - 21;
                    }

                    if (combination2 == 3 )
                    {
                        option1 = upperLimit + rdn.nextInt(20);
                        option2 = lowerLimit - rdn.nextInt(5) - 1;
                        option3 = upperLimit + rdn.nextInt(50) + 20;
                    }  
                    break;
                }
            
            case 2:
            {
                //Asigno a la variable correctAnswer un valor que se encuentre en el intervalo generado
                correctAnswer = 1 + lowerLimit + rdn.nextInt(upperLimit - lowerLimit );
                range ="<html><p>Cual de los siguinetes valores esta dentro de este rango: <br/>" + "( " + lowerLimit + " , " + upperLimit + " ] .</p></html>";
                
                // Estos if sirven para tener en cuente la posibilidades a la hora de mostrar posibles 
                // respuestas.
                // El caso elegido dependera de una variable que tiene un valor random entre 0 y 3.
                if (combination2 == 0 )
                {
                    option1 = upperLimit + rdn.nextInt(20) + 6;
                    option2 = upperLimit + rdn.nextInt(5) + 1;
                    option3 = upperLimit + rdn.nextInt(50) + 26;
                }

                if (combination2 == 1 )
                {
                    option1 = lowerLimit - rdn.nextInt(20) - 5;
                    option2 = lowerLimit - rdn.nextInt(5);
                    option3 = lowerLimit - rdn.nextInt(50) - 25;
                }

                if (combination2 == 2 )
                {
                    option1 = lowerLimit - rdn.nextInt(20);
                    option2 = upperLimit + rdn.nextInt(5) + 1;
                    option3 = lowerLimit - rdn.nextInt(50) - 20;
                }

                if (combination2 == 3 )
                {
                    option1 = upperLimit + rdn.nextInt(20) + 5;
                    option2 = lowerLimit - rdn.nextInt(5);
                    option3 = upperLimit + rdn.nextInt(50) + 25;
                }
                break;
            }
            
            case 3:
            {
                //Asigno a la variable correctAnswer un valor que se encuentre en el intervalo generado
                correctAnswer = 1+ lowerLimit + rdn.nextInt(upperLimit - lowerLimit - 1);
                range ="<html><p>Cual de los siguinetes valores esta dentro de este rango: <br/>" + "( " + lowerLimit + " , " + upperLimit + " ) .</p></html>";
                
                // Estos if sirven para tener en cuente la posibilidades a la hora de mostrar posibles 
                // respuestas.
                // El caso elegido dependera de una variable que tiene un valor random entre 0 y 3.

                if (combination2 == 0 )
                {
                    option1 = upperLimit + rdn.nextInt(20) + 5;
                    option2 = upperLimit + rdn.nextInt(5);
                    option3 = upperLimit + rdn.nextInt(50) + 25;
                }

                if (combination2 == 1 )
                {
                    option1 = lowerLimit - rdn.nextInt(20) - 5;
                    option2 = lowerLimit - rdn.nextInt(5);
                    option3 = lowerLimit - rdn.nextInt(50) - 25;
                }

                if (combination2 == 2 )
                {
                    option1 = lowerLimit - rdn.nextInt(20);
                    option2 = upperLimit + rdn.nextInt(5);
                    option3 = lowerLimit - rdn.nextInt(50) - 20;
                }

                if (combination2 == 3 )
                {
                    option1 = upperLimit + rdn.nextInt(20);
                    option2 = lowerLimit - rdn.nextInt(5);
                    option3 = upperLimit + rdn.nextInt(50) + 20;
                }
                break;    
            }
            
            default:
            {
                JOptionPane.showMessageDialog(null,"Hubo un error al generar el numero random en la variable combination, porfavor reporte este error a los desarrolladores");
                break;
            }
        }//Fin switch
        
        // Asigno a las posiciones de un vector todo lo necesario para imprimir en pantalla la pregunta generada    
        questionType1[0] = range;
        questionType1[1] = String.valueOf(correctAnswer);
        questionType1[2] = String.valueOf(option1);
        questionType1[3] = String.valueOf(option2);
        questionType1[4] = String.valueOf(option3);
        
        
        return questionType1;
    }
    
    public String[] preguntaTipo2(){
        
        String[] questionType2 = new String[5];
        int a = rdn.nextInt(15) + 3;
        int b = rdn.nextInt(15) + 1;
        int combination = rdn.nextInt(4);
        double correctAnswer = 0;
        int guide = 0;
        double option1 = 0;
        double option2 = 0;
        double option3 = 0;
        
        if (Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2))%1 == 0){
            correctAnswer =Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
            guide = 1;
        }
        else{
            correctAnswer =Math.pow(a, 2)+ Math.pow(b, 2);
            guide = 2;
        }
        
        if (combination == 0 )
        {
           option1 = correctAnswer + rdn.nextInt(20) + 6;
           option2 = correctAnswer + rdn.nextInt(5) + 1;
           option3 = correctAnswer + rdn.nextInt(50) + 26;
        }

        if (combination == 1 )
        {
            option1 = correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - 1;
            option2 = correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (correctAnswer/3);
            option3 = correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (2 * (correctAnswer/3));
        }

        if (combination == 2 )
        {
            option1 = correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - 1;
            option2 = correctAnswer + rdn.nextInt(5) + 1;
            option3 = correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (2 * (correctAnswer/3));
        }

        if (combination == 3 )
        {
            option1 = correctAnswer + rdn.nextInt(20) + 6;
            option2 = correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (correctAnswer/3);
            option3 = correctAnswer + rdn.nextInt(50) + 26;
        }
        
        questionType2[0]="<html><p>Cual de los siguientes es el valor de la hipotenusa del triangulo con catetos <br/>a= " + a + ", b= " + b + "</p></html>";
        if(guide == 1){
            questionType2[1] =String.valueOf((int)correctAnswer);
            questionType2[2] =String.valueOf((int)option1) ;
            questionType2[3] =String.valueOf((int)option2) ;
            questionType2[4] =String.valueOf((int)option3) ;
        }
        else if(guide == 2){
            questionType2[1] ="√" + String.valueOf((int)correctAnswer);
            questionType2[2] ="√" + String.valueOf((int)option1) ;
            questionType2[3] ="√" + String.valueOf((int)option2) ;
            questionType2[4] ="√" + String.valueOf((int)option3) ;
        }

        return questionType2;
    }
    

    public String[] preguntaTipo3(){
        
        //Declaro las variables necesacria para generar y retornar una pregunta tipo 3
        String[] questionType3 = new String[5];
        String[][] equationMatrix = new String [50][5];
        int rdnQuestion=rdn.nextInt(50);
        
        try{
            //Declaro una variable de tipo File y la inicializo con un archivo txt
            //previamente preparado con un formato repetitivo
            File equationFile = new File("preguntaEcuacion.txt");
            
            //Declaro una variable tipo Scanner , que sera la que lea el objeto 
            //tipo File
            Scanner scan = new Scanner(equationFile);
            
            //Con estos dos ciclos recorro una matriz y voy asignando un valor a cada 
            //posicion, este valor asignado es una linea del archivo previamente declarado
            for (int i = 0; i < 50; i++) {
                for (int j = 0; j < 5; j++) {
                    String line = scan.nextLine();
                    equationMatrix[i][j]= line;
                }
            }
            
            //Agrego el mensaje que será mostrado al usuario en la primer posicion de 
            //cada fila
            for (int i = 0; i < 50; i++) {
                equationMatrix[i][0] = "<html><p>Elija la opcion que contenga las dos ceros reales de la siguiente ecuacion cuadratica: " + equationMatrix[i][0] + "</p></html>";
            }
            
            //Con este ciclo asigno a un vector de tipo string una fila de la matriz 
            //previamente llenada
            for(int i = 0; i < 5; i++) {
                questionType3[i] = equationMatrix[rdnQuestion][i];
            }
            
            //retorno el vector que contiene todo lo neesario para imprimir una pregunta
            //de tipo 3
            return questionType3;
            
        }
        catch(FileNotFoundException e){
            JOptionPane.showConfirmDialog(null,"El pinchi archivo no existe");
            return null;
        }
    }

    public String[] preguntaTipo4(){
        
        //Declaro las variables necesacria para generar y retornar una pregunta tipo 4
        String[] questionType4 = new String[5];
        int radio = rdn.nextInt(10)+1;
        int height = rdn.nextInt(15)+1;
        int combination = rdn.nextInt(4);
        String question ="<html><p>Cual de los siguientes es el volumen del cilindro con:<br/> r= " + radio + " m" + ", h= " + height + "m</p></html>";
        int correctAnswer =(int) (Math.pow(radio,2) * height);
        int option1 = 0;
        int option2 = 0;
        int option3 = 0;
        
        //Con base en un valor aleatorio generado con cuatro posibles valores:0,1,2,3
        //se les asignará a las variables option un valor por encima o por debajo de la respuesa correcta
        if (combination == 0 )
        {
            option1 = correctAnswer + rdn.nextInt(10) + 1;
            option2 = correctAnswer + rdn.nextInt(5) + 1;
            option3 = correctAnswer + rdn.nextInt(15) + 1;
        }

        if (combination == 1 )
        {
            option1 = correctAnswer - rdn.nextInt(10) - 1;
            option2 = correctAnswer - rdn.nextInt(5) - 1;
            option3 = correctAnswer - rdn.nextInt(15) - 1;
        }

        if (combination == 2 )
        {
            option1 = correctAnswer - rdn.nextInt(10) - 1;
            option2 = correctAnswer + rdn.nextInt(5) + 1;
            option3 = correctAnswer - rdn.nextInt(15) - 1;
        }

        if (combination == 3 )
        {
            option1 = correctAnswer + rdn.nextInt(10) + 1;
            option2 = correctAnswer - rdn.nextInt(5) - 1;
            option3 = correctAnswer + rdn.nextInt(15) + 1;
        }
        
        //En caso de que los numeros generados sean negativos, se les multiplicará por -1
        if (option1< 0){
            option1 = option1 * (-1);
        }
        if (option2< 0){
            option2 = option2 * (-1);
        }
        if (option3< 0){
            option3 = option3 * (-1);
        }
        

        //Asigno los valores generados a pociciones de un vector 
        questionType4[0] = question;
        questionType4[1] = String.valueOf(correctAnswer) + "π m^3";
        questionType4[2] = String.valueOf(option1)+ "π m^3";
        questionType4[3] = String.valueOf(option2)+ "π m^3";
        questionType4[4] = String.valueOf(option3)+ "π m^3";
        
        //retorno el vector
        return questionType4;
    }
    
    public String[] preguntaTipo5(){
        
        //Declaro las variables necesacria para generar y retornar una pregunta tipo 5
        String[] questionType5 = new String[5];
        int a = rdn.nextInt(10) +1;
        int b = rdn.nextInt(10) +1;
        int c = rdn.nextInt(10) +1;
        String question = "<html><p>Cual de los siguientes es el Volumen de la caja con lados:<br/>a= " + a + " m"+ ", b= " + b + " m "+ "y c= " + c + " m.</p></html>";
        int combination = rdn.nextInt(4);
        int correctAnswer = a * b * c;
        int option1 = 0;
        int option2 = 0;
        int option3 = 0;
        
        //Con base en un valor aleatorio generado con cuatro posibles valores:0,1,2,3
        //se les asignará a las variables option un valor por encima o por debajo de la respuesa correcta
        if (combination == 0 )
        {
            option1 = correctAnswer + rdn.nextInt(10) + 6;
            option2 = correctAnswer + rdn.nextInt(5) + 1;
            option3 = correctAnswer + rdn.nextInt(15) + 16;
        }

        if (combination == 1 )
        {
            option1 = correctAnswer - rdn.nextInt((correctAnswer/3)) - 1;
            option2 = correctAnswer - rdn.nextInt((correctAnswer/3)) - (correctAnswer/3);
            option3 = correctAnswer - rdn.nextInt((correctAnswer/3)) - (2 * (correctAnswer/3));
        }

        if (combination == 2 )
        {
            option1 = correctAnswer - rdn.nextInt((correctAnswer/3)) - 1 ;
            option2 = correctAnswer + rdn.nextInt(5) + 1;
            option3 = correctAnswer - rdn.nextInt((correctAnswer/3)) - (2 * (correctAnswer/3));
        }

        if (combination == 3 )
        {
            option1 = correctAnswer + rdn.nextInt(20) + 6;
            option2 = correctAnswer - rdn.nextInt((correctAnswer/3)) - (correctAnswer/3);
            option3 = correctAnswer + rdn.nextInt(50) + 26;
        }
        
        //Asigno los valores generados a pociciones de un vector 
        questionType5[0] = question;
        questionType5[1] = String.valueOf(correctAnswer) + " m^3";
        questionType5[2] = String.valueOf(option1)+ " m^3";
        questionType5[3] = String.valueOf(option2)+ " m^3";
        questionType5[4] = String.valueOf(option3)+ " m^3";
        
        //retorno el vector
        return questionType5;
        
    }
}
