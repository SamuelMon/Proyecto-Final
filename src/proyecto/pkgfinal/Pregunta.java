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
    Cual es el area de el rectangulo con lados a=""insertar a" y b="insertar b" 
    
    Tipo 7
    Cual es el area de el circulo con r="insertar r"
    
    Tipo 8
    Cual es la solucion del sistemas de ecuaciones lineales.
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
        
        //Con base en un valor aleatorio generado con cuatro posibles valores:0,1,2,3
        //se les asignará a las variables option un valor por encima o por debajo de la respuesa correcta
        switch (combination){
            case 0:{
                option1 = correctAnswer + rdn.nextInt(20) + 6;
                option2 = correctAnswer + rdn.nextInt(5) + 1;
                option3 = correctAnswer + rdn.nextInt(50) + 26;
                break;
            }

            case 1:{
                option1 = correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - 1;
                option2 = correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (correctAnswer/3);
                option3 = correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (2 * (correctAnswer/3));
                break;
            }

            case 2:{
                option1 = correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - 1;
                option2 = correctAnswer + rdn.nextInt(5) + 1;
                option3 = correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (2 * (correctAnswer/3));
                break;
            }

            case 3:{
                option1 = correctAnswer + rdn.nextInt(20) + 6;
                option2 = correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (correctAnswer/3);
                option3 = correctAnswer + rdn.nextInt(50) + 26;
                break;
            }
            
            default:{
                JOptionPane.showConfirmDialog(null,"Hubo un error en la variable COMBINATION, porfavor reporte este problema","ERROR",JOptionPane.CLOSED_OPTION);
                break;
            }
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
        switch (combination){
            case 0:{
                option1 = correctAnswer + rdn.nextInt(10) + 1;
                option2 = correctAnswer + rdn.nextInt(5) + 1;
                option3 = correctAnswer + rdn.nextInt(15) + 1;
                break;
            }

            case 1:{
                option1 =(int) correctAnswer - rdn.nextInt(10) - 1;
                option2 =(int) correctAnswer - rdn.nextInt(5) - 1;
                option3 =(int) correctAnswer - rdn.nextInt(15) - 1;
                break;
            }

            case 2:{
                option1 =(int) correctAnswer - rdn.nextInt(10) - 1;
                option2 = correctAnswer + rdn.nextInt(5) + 1;
                option3 =(int) correctAnswer - rdn.nextInt(15) - 1;
                break;
            }

            case 3:{
                option1 = correctAnswer + rdn.nextInt(10) + 1;
                option2 =(int) correctAnswer - rdn.nextInt(5) - 1;
                option3 = correctAnswer + rdn.nextInt(15) + 1;
                break;
            }
            
            default:{
                JOptionPane.showConfirmDialog(null,"Hubo un error en la variable COMBINATION, porfavor reporte este problema","ERROR",JOptionPane.CLOSED_OPTION);
                break;
            }
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

        switch (combination){
            case 0:{
                option1 = correctAnswer + rdn.nextInt(10) + 6;
                option2 = correctAnswer + rdn.nextInt(5) + 1;
                option3 = correctAnswer + rdn.nextInt(15) + 16;
                break;
            }

            case 1:{
                option1 =(int) correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - 1;
                option2 =(int) correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (correctAnswer/3);
                option3 =(int) correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (2 * (correctAnswer/3));
                break;
            }

            case 2:{
                option1 =(int) correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - 1 ;
                option2 = correctAnswer + rdn.nextInt(5) + 1;
                option3 =(int) correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (2 * (correctAnswer/3));
                break;
            }

            case 3:{
                option1 = correctAnswer + rdn.nextInt(20) + 6;
                option2 =(int) correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (correctAnswer/3);
                option3 = correctAnswer + rdn.nextInt(50) + 26;
                break;
            }
            
            default:{
                JOptionPane.showConfirmDialog(null,"Hubo un error en la variable COMBINATION, porfavor reporte este problema","ERROR",JOptionPane.CLOSED_OPTION);
                break;
            }
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
    
    public String[] preguntaTipo6(){
        //Declaro las variables necesacria para generar y retornar una pregunta tipo 6
        String[] questionType6 = new String[5];
        int b = rdn.nextInt(10)+10;
        int a = rdn.nextInt(25)+10;
        int combination = rdn.nextInt(4);
        String question ="<html><p>Cual de los siguientes es el area del rectangulo con:<br/> a= " + a + " m" + ", b= " + b + "m</p></html>";
        int correctAnswer = a*b;
        int option1 = 0;
        int option2 = 0;
        int option3 = 0;
        
        //Con base en un valor aleatorio generado con cuatro posibles valores:0,1,2,3
        //se les asignará a las variables option un valor por encima o por debajo de la respuesa correcta

        switch (combination){
            case 0:{
                option1 = correctAnswer + rdn.nextInt(10) + 6;
                option2 = correctAnswer + rdn.nextInt(5) + 1;
                option3 = correctAnswer + rdn.nextInt(15) + 16;
                break;
            }

            case 1:{
                option1 =(int) correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - 1;
                option2 =(int) correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (correctAnswer/3);
                option3 =(int)correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (2 * (correctAnswer/3));
                break;
            }

            case 2:{
                option1 = (int)correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - 1 ;
                option2 = correctAnswer + rdn.nextInt(5) + 1;
                option3 = (int)correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (2 * (correctAnswer/3));

                break;
            }

            case 3:{
                option1 = correctAnswer + rdn.nextInt(20) + 6;
                option2 = (int)correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (correctAnswer/3);
                option3 = correctAnswer + rdn.nextInt(50) + 26;
                break;
            }
            
            default:{
                JOptionPane.showConfirmDialog(null,"Hubo un error en la variable COMBINATION, porfavor reporte este problema","ERROR",JOptionPane.CLOSED_OPTION);
                break;
            }
        }
        
        

        //Asigno los valores generados a pociciones de un vector 
        questionType6[0] = question;
        questionType6[1] = String.valueOf(correctAnswer) + " m^2";
        questionType6[2] = String.valueOf(option1)+ " m^2";
        questionType6[3] = String.valueOf(option2)+ " m^2";
        questionType6[4] = String.valueOf(option3)+ " m^2";
        
        //retorno el vector
        return questionType6;
    }
    
    public String[] preguntaTipo7(){
        //Declaro las variables necesacria para generar y retornar una pregunta tipo 7
        String[] questionType7 = new String[5];
        int r = rdn.nextInt(25)+15;
        int combination = rdn.nextInt(4);
        String question ="<html><p>Cual de los siguientes es el area del circulo con:<br/> r= " + r + " m</p></html>";
        int correctAnswer = (int)Math.pow(r, 2);
        int option1 = 0;
        int option2 = 0;
        int option3 = 0;
        
        //Con base en un valor aleatorio generado con cuatro posibles valores:0,1,2,3
        //se les asignará a las variables option un valor por encima o por debajo de la respuesa correcta

        switch (combination){
            case 0:{
                option1 = correctAnswer + rdn.nextInt(10) + 6;
                option2 = correctAnswer + rdn.nextInt(5) + 1;
                option3 = correctAnswer + rdn.nextInt(15) + 16;
            break;
            }

            case 1:{
                option1 =(int) correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - 1;
                option2 =(int)correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (correctAnswer/3);
                option3 =(int)correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (2 * (correctAnswer/3));
                break;
            }

            case 2:{
                option1 = (int)correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - 1 ;
                option2 = correctAnswer + rdn.nextInt(5) + 1;
                option3 =(int) correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (2 * (correctAnswer/3));
                break;
            }

            case 3:{
                option1 = correctAnswer + rdn.nextInt(20) + 6;
                option2 = (int) correctAnswer - rdn.nextInt((int)(correctAnswer/3)) - (correctAnswer/3);
                option3 = correctAnswer + rdn.nextInt(50) + 26;
                break;
            }
            
            default:{
                JOptionPane.showConfirmDialog(null,"Hubo un error en la variable COMBINATION, porfavor reporte este problema","ERROR",JOptionPane.CLOSED_OPTION);
                break;
            }
        }
        
        
        

        //Asigno los valores generados a pociciones de un vector 
        questionType7[0] = question;
        questionType7[1] = String.valueOf(correctAnswer) + "π m^2";
        questionType7[2] = String.valueOf(option1)+ "π m^2";
        questionType7[3] = String.valueOf(option2)+ "π m^2";
        questionType7[4] = String.valueOf(option3)+ "π m^2";
        
        //retorno el vector
        return questionType7;
    }
    
    public String[] preguntaTipo8(){
        
        String[] questionType8 = new String[5];
        int x= rdn.nextInt(31) - 15;
        int y= rdn.nextInt(31) - 15;
        int combination1 = rdn.nextInt(4);
        int combination2 = rdn.nextInt(4);
        int coefficientX1 = rdn.nextInt(21) - 10;
        int coefficientY1 = rdn.nextInt(21) - 10;
        int coefficientX2 = rdn.nextInt(21) - 10;
        int coefficientY2 = rdn.nextInt(21) - 10;
        int independentTerm1 = (x*coefficientX1) + (y*coefficientY1);
        int independentTerm2 = (x*coefficientX2) + (y*coefficientY2);
        int optionX1=0;
        int optionX2=0;
        int optionX3=0;
        int optionY1=0;
        int optionY2=0;
        int optionY3=0;
        String correctAnswer = "X = " + x + ", Y =" + y;
        String option1="";
        String option2="";
        String option3="";
        String equation1="";        
        String equation2="";        
        
        //Controlo el caso en el que ambos coeficiente son 0, lo que 
        if((coefficientX1==0) && (coefficientY1==0)){
            coefficientX1 = 1;
        }
        if((coefficientX2==0) && (coefficientY2==0)){
            coefficientX2 = 1;
        }
        
        //Evito que los coeficioentes sean iguales para evitar el caso de generar dos ecuaciones iguales y 
        //el sistema no tenga solucionque 
        if(coefficientX1==coefficientX2){
            coefficientX1++;
        }
        if(coefficientY1==coefficientY2){
            coefficientY1++;
        }

        //Con base en un valor aleatorio generado con cuatro posibles valores:0,1,2,3
        //se les asignará a las variables option un valor por encima o por debajo de la respuesa correcta
        switch (combination1){
            case 0:{
                optionX1 = x + rdn.nextInt(6) + 4;
                optionX2 = x + rdn.nextInt(3) + 1;
                optionX3 = x + rdn.nextInt(10) + 10;
                break;
            }
        

            case 1:{
                optionX1 =(int) x + rdn.nextInt(6) - 4;
                optionX2 =(int) x + rdn.nextInt(3) - 1;
                optionX3 =(int) x + rdn.nextInt(10) - 10;
                break;
            }
            
            case 2:{
                optionX1 = (int)x - rdn.nextInt(3) - 1 ;
                optionX2 = x + rdn.nextInt(5) + 1;
                optionX3 =(int) x - rdn.nextInt(6) - 4;
                break;
            }

            case 3:{
                optionX1 = x + rdn.nextInt(20) + 6;
                optionX2 = (int) x - rdn.nextInt(3) - 1;
                optionX3 = x + rdn.nextInt(50) + 26;
                break;
            }
            default:{
                JOptionPane.showConfirmDialog(null,"Hubo un error en la variable COMBINATION1, porfavor reporte este problema","ERROR",JOptionPane.CLOSED_OPTION);
                break;
            }
        }

        //Con base en un valor aleatorio generado con cuatro posibles valores:0,1,2,3
        //se les asignará a las variables option un valor por encima o por debajo de la respuesa correcta
        switch (combination2){
            case 0:{
            optionY1 = y + rdn.nextInt(6) + 4;
            optionY2 = y + rdn.nextInt(3) + 1;
            optionY3 = y + rdn.nextInt(10) + 10;
            break;
            }

            case 1:{
                optionY1 =(int) y - rdn.nextInt(6) - 4;
                optionY2 =(int) y - rdn.nextInt(3) - 1;
                optionY3 =(int) y - rdn.nextInt(10) - 10;
                break;
            }

            case 2:{
                optionY1 =(int) y - rdn.nextInt(3) - 1 ;
                optionY2 = y + rdn.nextInt(5) + 1;
                optionY3 =(int) y - rdn.nextInt(6) - 4;
                break;
            }

            case 3:{
                optionY1 = y + rdn.nextInt(20) + 6;
                optionY2 = (int) y - rdn.nextInt(3) - 1;
                optionY3 = y + rdn.nextInt(50) + 26;
                break;
            }
            
            default:{
                JOptionPane.showConfirmDialog(null,"Hubo un error en la variable COMBINATION2, porfavor reporte este problema","ERROR",JOptionPane.CLOSED_OPTION);
                break;
            }
        }
        
        //Segun el signo de los terminos independientes, la ecuacion se escribe de una manera u otra
        if((coefficientX1>0) && (coefficientY1<0)){
            equation1 = "" + coefficientX1 + "X - " + Math.abs(coefficientY1) + "Y = " + independentTerm1 ;
        }
        
        if((coefficientX1<0) && (coefficientY1>0)){
            equation1 = "- " + Math.abs(coefficientX1) + "X + " + coefficientY1 + "Y = " + independentTerm1 ;
        }
        
        if((coefficientX2>0) && (coefficientY2<0)){
            equation2 = "" + coefficientX2 + "X - " + Math.abs(coefficientY2) + "Y = " + independentTerm2 ;
        }
        
        if((coefficientX2<0) && (coefficientY2>0)){
            equation2 = "- " + Math.abs(coefficientX2) + "X + " + coefficientY2 + "Y = " + independentTerm2 ;
        }
        
        if((coefficientX1<0) && (coefficientY1<0)){
            equation1 = "- " + Math.abs(coefficientX1) + "X - " + Math.abs(coefficientY1) + "Y = " + independentTerm1 ;
        }
        
        if((coefficientX1>0) && (coefficientY1>0)){
            equation1 = "" + coefficientX1 + "X + " + coefficientY1 + "Y = " + independentTerm1 ;
        }
        
        if((coefficientX2<0) && (coefficientY2<0)){
            equation2 = "- " + Math.abs(coefficientX2) + "X - " + Math.abs(coefficientY2) + "Y = " + independentTerm2 ;
        }
        
        if((coefficientX2>0) && (coefficientY2>0)){
            equation2 = "" + coefficientX2 + "X + " + coefficientY2 + "Y = " + independentTerm2 ;
        }
        
        if((coefficientX1==0) && (coefficientY1<0)){
            equation1= "- " + Math.abs(coefficientY1)+ "Y = " + independentTerm1; 
        }
        
        if((coefficientX1==0) && (coefficientY1>0)){
            equation1=coefficientY1+ "Y = " + independentTerm1; 
        }
        
        if((coefficientY1==0) && (coefficientX1<0)){
            equation1= "- " + Math.abs(coefficientX1)+ "X = " + independentTerm1; 
        }
        
        if((coefficientY1==0) && (coefficientX1>0)){
            equation1=coefficientX1+ "X = " + independentTerm1; 
        }
        
        if((coefficientX2==0) && (coefficientY2<0)){
            equation2= "- " + Math.abs(coefficientY2)+ "Y = " + independentTerm2; 
        }
        
        if((coefficientX2==0) && (coefficientY2>0)){
            equation2=coefficientY2+ "Y = " + independentTerm2; 
        }
        
        if((coefficientY2==0) && (coefficientX2<0)){
            equation2= "- " + Math.abs(coefficientX2)+ "X = " + independentTerm2; 
        }
        
        if((coefficientY2==0) && (coefficientX2>0)){
            equation2=coefficientX2+ "X = " + independentTerm2; 
        }
        
        option1 = "X = " + optionX1 + ", Y =" + optionY1;
        option2 = "X = " + optionX2 + ", Y =" + optionY2;
        option3 = "X = " + optionX3 + ", Y =" + optionY3;
        
        questionType8[0]= "<html><p>En cuentre los valores para X y Y en los que en ambas ecuaciones se cumpla la igualdad<br/>" + equation1 + " <br/>" + equation2 + "<p><html>";
        questionType8[1]= correctAnswer;
        questionType8[2]=option1;
        questionType8[3]=option2;
        questionType8[4]=option3;
        //retorno el vector
        return questionType8;
    }
}
