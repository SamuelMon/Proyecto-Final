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
public class GUI extends javax.swing.JFrame {

    public Random rdn = new Random();
    public String[] questionType1 = new String[5];
    public String[] questionType3 = new String[5];


    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }
    


    
    
    
    
    
    

    
    
    
    // Inicio Metodos
        
    //Genera un caso aleartorio de la pregunta tipo 1
    public String[] preguntaTipo1(){
        
        String[] questionType1 = new String[5];
        String message = "";
        int upperLimit = rdn.nextInt(2000)-990;
        int lowerLimit = rdn.nextInt(2000)-1000;
        int combination = rdn.nextInt(4);
        int combination2 = rdn.nextInt(4);
        int correctAnswer =0;
        int option1 = 0;
        int option2 = 0;
        int option3 = 0;
        String mensaje = "";
        
        
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
                message = "Cual de las siguientes opciones pertenece a intervalo definido por [ " + lowerLimit + " , " + upperLimit + "] .".toString();
                
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
                    option2 = lowerLimit - rdn.nextInt(5);
                    option3 = upperLimit + rdn.nextInt(50) + 26;
                }  
                break;
            }
            
            case 1:
                {
                    //Asigno a la variable correctAnswer un valor que se encuentre en el intervalo generado
                    correctAnswer = lowerLimit + rdn.nextInt(upperLimit - lowerLimit );
                    message = "Cual de las siguientes opciones pertenece a intervalo definido por [ " + lowerLimit + " , " + upperLimit + ") .".toString();

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
                        option1 = lowerLimit - rdn.nextInt(20) - 5;
                        option2 = upperLimit + rdn.nextInt(5);
                        option3 = lowerLimit - rdn.nextInt(50) - 25;
                    }

                    if (combination2 == 3 )
                    {
                        option1 = upperLimit + rdn.nextInt(20) + 5;
                        option2 = lowerLimit - rdn.nextInt(5) - 1;
                        option3 = upperLimit + rdn.nextInt(50) + 25;
                    }  
                    break;
                }
            
            case 2:
            {
                //Asigno a la variable correctAnswer un valor que se encuentre en el intervalo generado
                correctAnswer = 1 + lowerLimit + rdn.nextInt(upperLimit - lowerLimit );
                message = "Cual de las siguientes opciones pertenece a intervalo definido por ( " + lowerLimit + " , " + upperLimit + "] .".toString();
                
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
                    option2 = lowerLimit - rdn.nextInt(5);
                    option3 = lowerLimit - rdn.nextInt(50) - 26;
                }

                if (combination2 == 2 )
                {
                    option1 = lowerLimit - rdn.nextInt(20) - 6;
                    option2 = upperLimit + rdn.nextInt(5);
                    option3 = lowerLimit - rdn.nextInt(50) - 26;
                }

                if (combination2 == 3 )
                {
                    option1 = upperLimit + rdn.nextInt(20) + 6;
                    option2 = lowerLimit - rdn.nextInt(5);
                    option3 = upperLimit + rdn.nextInt(50) + 26;
                }
                break;
            }
            
            case 3:
            {
                //Asigno a la variable correctAnswer un valor que se encuentre en el intervalo generado
                correctAnswer = 1+ lowerLimit + rdn.nextInt(upperLimit - lowerLimit - 1);
                message = "Cual de las siguientes opciones pertenece a intervalo definido por ( " + lowerLimit + " , " + upperLimit + ") .".toString();
                
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
                    option2 = lowerLimit - rdn.nextInt(5);
                    option3 = lowerLimit - rdn.nextInt(50) - 26;
                }

                if (combination2 == 2 )
                {
                    option1 = lowerLimit - rdn.nextInt(20) - 6;
                    option2 = upperLimit + rdn.nextInt(5);
                    option3 = lowerLimit - rdn.nextInt(50) - 26;
                }

                if (combination2 == 3 )
                {
                    option1 = upperLimit + rdn.nextInt(20) + 6;
                    option2 = lowerLimit - rdn.nextInt(5);
                    option3 = upperLimit + rdn.nextInt(50) + 26;
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
        questionType1[0] = message;
        questionType1[1] = String.valueOf(correctAnswer);
        questionType1[2] = String.valueOf(option1);
        questionType1[3] = String.valueOf(option2);
        questionType1[4] = String.valueOf(option3);
        return questionType1;
    }
    
    
    public String[] preguntatipo3(){
        String[][] equationMatrix = new String [50][5];
        int rdnQuestion=rdn.nextInt(50);
        
        try{
            File equationFile = new File("preguntaEcuacion.txt");
            Scanner scan = new Scanner(equationFile);
            
            for (int i = 0; i < 50; i++) {
                for (int j = 0; j < 5; j++) {
                    String line = scan.nextLine();
                    equationMatrix[i][j]= line;
                }
            }
            for(int i = 0; i < 5; i++) {
                questionType3[i] = equationMatrix[rdnQuestion][i];
            }
            return (questionType3);
        }
        catch(FileNotFoundException e){
            JOptionPane.showConfirmDialog(null,"El pinchi archivo no existe");
        }
        return null;
    }
    
    // Fin Metodos
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Iniciar = new javax.swing.JButton();
        ecuacion = new javax.swing.JLabel();
        opcion1 = new javax.swing.JLabel();
        opcion2 = new javax.swing.JLabel();
        opcion3 = new javax.swing.JLabel();
        opcion4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Iniciar.setText("Iniciar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        ecuacion.setText("jLabel1");

        opcion1.setText("jLabel1");

        opcion2.setText("jLabel2");

        opcion3.setText("jLabel3");

        opcion4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(Iniciar)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcion4)
                    .addComponent(opcion3)
                    .addComponent(opcion2)
                    .addComponent(opcion1)
                    .addComponent(ecuacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Iniciar)
                .addGap(51, 51, 51)
                .addComponent(ecuacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcion1)
                .addGap(18, 18, 18)
                .addComponent(opcion2)
                .addGap(18, 18, 18)
                .addComponent(opcion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcion4)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        questionType3 = preguntatipo3();
        ecuacion.setText(questionType3[0]);
        opcion1.setText(questionType3[1]);
        opcion2.setText(questionType3[2]);
        opcion3.setText(questionType3[3]);
        opcion4.setText(questionType3[4]);
    }//GEN-LAST:event_IniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JLabel ecuacion;
    private javax.swing.JLabel opcion1;
    private javax.swing.JLabel opcion2;
    private javax.swing.JLabel opcion3;
    private javax.swing.JLabel opcion4;
    // End of variables declaration//GEN-END:variables
}
