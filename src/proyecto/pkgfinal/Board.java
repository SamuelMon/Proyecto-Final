/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal;

import java.awt.Color;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Board extends javax.swing.JFrame {

    public ArrayList<JLabel> lista = new ArrayList<>();
    public int totalPos, seg, min, segTotal, actualPos = 0, points = 0, points2 = 0, actualTime, player2Pos = 0, adv;
    public String[] question = new String[5];
    public Pregunta type = new Pregunta();
    public boolean state = true, show = false, change = false, player2 = false, turno = false, vis = false;
    public ArrayList<Integer> optionList = new ArrayList<>();
    public Random rdm = new Random();
    public ImageIcon imageHelp, imageButton;

    /**
     * Creates new form Board
     */
    //Establezco el estado inicial de los componentes de la parte gráfica
    public Board() {
        initComponents();
        puntaje.setText("Jugador 1: " + String.valueOf(points));
        puntaje2.setText("Jugador 2: " + String.valueOf(points2));
        imageButton = new ImageIcon("src/imagenes/dado1.png");
        rollDice.setIcon(imageButton);
        puntaje.setVisible(false);
        puntaje2.setVisible(false);
        time.setVisible(false);
        rollDice.setVisible(false);
        responder.setVisible(false);
        option1.setVisible(false);
        option2.setVisible(false);
        option3.setVisible(false);
        option4.setVisible(false);
        pregunta.setVisible(false);
        help.setVisible(false);
        hint.setVisible(false);
        playerTurn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        answers = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        singleplayer = new javax.swing.JButton();
        rollDice = new javax.swing.JButton();
        puntaje = new javax.swing.JLabel();
        option1 = new javax.swing.JRadioButton();
        option2 = new javax.swing.JRadioButton();
        option3 = new javax.swing.JRadioButton();
        responder = new javax.swing.JButton();
        option4 = new javax.swing.JRadioButton();
        pregunta = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        hint = new javax.swing.JButton();
        multiplayer = new javax.swing.JButton();
        puntaje2 = new javax.swing.JLabel();
        playerTurn = new javax.swing.JLabel();
        numTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(0, 5));
        jScrollPane1.setViewportView(panel);

        singleplayer.setText("1 Jugador");
        singleplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleplayerActionPerformed(evt);
            }
        });

        rollDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollDiceActionPerformed(evt);
            }
        });

        puntaje.setText("Puntaje");

        answers.add(option1);
        option1.setText("Opcion1");

        answers.add(option2);
        option2.setText("Opcion 2");

        answers.add(option3);
        option3.setText("Opcion 3");

        responder.setText("Responder");
        responder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderActionPerformed(evt);
            }
        });

        answers.add(option4);
        option4.setText("Opcion 4");

        pregunta.setText("Pregunta");

        time.setText("00:00:00");

        hint.setText("?");
        hint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintActionPerformed(evt);
            }
        });

        multiplayer.setText("2 Jugadores");
        multiplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplayerActionPerformed(evt);
            }
        });

        puntaje2.setText("Puntaje 2");

        playerTurn.setText("Turno: J1");

        numTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numTxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(option3)
                                            .addComponent(option4)
                                            .addComponent(option2)
                                            .addComponent(option1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(responder)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(hint)))
                                        .addGap(0, 14, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(pregunta)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(help)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(singleplayer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiplayer))
                            .addComponent(playerTurn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rollDice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(puntaje)
                            .addComponent(puntaje2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(time)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(time))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(puntaje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(singleplayer)
                                    .addComponent(multiplayer)
                                    .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puntaje2)
                            .addComponent(playerTurn)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rollDice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pregunta)
                        .addGap(2, 2, 2)
                        .addComponent(help)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(responder)
                            .addComponent(hint))
                        .addGap(51, 133, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botón para iniciar el juego en un solo jugador
    private void singleplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleplayerActionPerformed
        // TODO add your handling code here:
        totalPos = Integer.parseInt(numTxt.getText());
        if (totalPos > 2){
        //Limpio el panel existente para cuando se quiera reiniciar el juego, asi como la lista de labels.
        panel.removeAll();
        lista.clear();
        actualPos = 0;
        //Llamo al método para crear el tablero
        createBoard(totalPos);
        //Marco la posicion inicial con un color diferente
        lista.get(actualPos).setBackground(Color.red);
        puntaje.setText("Puntaje: " + points);
        }else{
            JOptionPane.showMessageDialog(null, "Por favor ingrese números mayores a 2");
        }
    }//GEN-LAST:event_singleplayerActionPerformed

    //Botón para tirar el dado
    private void rollDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollDiceActionPerformed
        // TODO add your handling code here:
        //Compruebo el tamaño del tablero para configurar el maximo valor del dado
        if (totalPos <= 10) {
            adv = rdm.nextInt(3) + 1;
        } else {
            adv = rdm.nextInt(6) + 1;
        }
        //Establezco los casos para el número sacado por el dado
        //Tambien se cambia la imagen del boton dependiendo de lo que saque
        switch (adv) {
            case 1:
                imageButton = new ImageIcon("src/imagenes/dado1.png");
                rollDice.setIcon(imageButton);
                break;
            case 2:
                imageButton = new ImageIcon("src/imagenes/dado2.png");
                rollDice.setIcon(imageButton);
                break;
            case 3:
                imageButton = new ImageIcon("src/imagenes/dado3.png");
                rollDice.setIcon(imageButton);
                break;
            case 4:
                imageButton = new ImageIcon("src/imagenes/dado4.png");
                rollDice.setIcon(imageButton);
                break;
            case 5:
                imageButton = new ImageIcon("src/imagenes/dado5.png");
                rollDice.setIcon(imageButton);
                break;
            case 6:
                imageButton = new ImageIcon("src/imagenes/dado6.png");
                rollDice.setIcon(imageButton);
                break;
        }

        //Se comprueba si se inició el juego con uno o dos jugadores
        if (player2 == true) {
            //Se comprueba el turno actual. En caso de ser falso, es el turno del jugador uno.
            if (turno == false) {
                //Se "limpia" la posicion actual
                lista.get(actualPos).setBackground(Color.yellow);
                //Se comprueba que con el número sacado no se salga del tablero
                //Y se cambia el turno en caso de ser asi
                if (advancePosition(actualPos) == -1) {
                    turno = !turno;
                    playerTurn.setText("Turno: J2");
                } else {
                    //Se llama al método advancePosition para avanzar la posición
                    actualPos = advancePosition(actualPos);
                }
            } else {
                //Este caso es igual que el anterior pero para el jugador dos
                lista.get(player2Pos).setBackground(Color.yellow);
                if (advancePosition(player2Pos) == -1) {
                    turno = !turno;
                    playerTurn.setText("Turno: J1");
                } else {
                    player2Pos = advancePosition(player2Pos);
                }
            }
            //Se comparan las posiciones de ambos jugadores
            if (player2Pos == actualPos) {
                //Si es igual se pinta esa posicion de un color diferente
                lista.get(actualPos).setBackground(Color.magenta);
            } else {
                //Sino se pintan ambos por separado
                lista.get(player2Pos).setBackground(Color.blue);
                lista.get(actualPos).setBackground(Color.red);
            }

        } else {
            //El caso para un jugador funciona igual que el caso para dos
            //Pero no hay necesidad de hacer la comprobación de turno asi que solo se pinta la posición donde caiga
            lista.get(actualPos).setBackground(Color.yellow);
            if (advancePosition(actualPos) == -1) {
                lista.get(actualPos).setBackground(Color.red);
            } else {
                actualPos = advancePosition(actualPos);
                lista.get(actualPos).setBackground(Color.red);
            }
        }
    }//GEN-LAST:event_rollDiceActionPerformed

    //Boton para responder a la pregunta
    private void responderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responderActionPerformed
        // TODO add your handling code here:
        //Asigno un texto al String respuesta con el método comprobarRespuesta
        String respuesta = comprobarRespuesta();
        //Compruebo a respuesta y tomo acciones para cada caso
        if (respuesta.equals("No")) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una opción antes de responder");
        } else {
            if (respuesta.equals("Correcto")) {
                JOptionPane.showMessageDialog(null, respuesta);
            } else {
                JOptionPane.showMessageDialog(null, respuesta);
            }
            //Nuevamente compruebo si se inició el juego para uno o dos jugadores
            if (player2 == true) {
                //Compruebo el turno
                if (turno == false) {
                    //Si la respuesta es correcta se suman 100 puntos
                    if (respuesta.equals("Correcto")) {
                        points = points + 100;
                    } else {
                        //Sino se le restan 150 y se le retrocede la mitad del avance
                        points = points - 150;
                        lista.get(actualPos).setBackground(Color.yellow);
                        actualPos = (int) (actualPos - Math.ceil(adv / 2));
                    }
                    //Se cambia el texto que muestra el turno actual
                    playerTurn.setText("Turno: J2");
                } else {
                    //Este es el caso para el segundo jugador
                    //Se hacen las mismas comprobaciones y acciones que con el primero
                    if (respuesta.equals("Correcto")) {
                        points2 = points2 + 100;
                    } else {
                        points2 = points2 - 150;
                        lista.get(player2Pos).setBackground(Color.yellow);
                        player2Pos = (int) (player2Pos - Math.ceil(adv / 2));

                    }
                    playerTurn.setText("Turno: J1");
                }
                //Se comprueban sus posiciones y se pintan.
                if (actualPos == player2Pos) {
                    lista.get(player2Pos).setBackground(Color.magenta);
                } else {
                    lista.get(player2Pos).setBackground(Color.blue);
                    lista.get(actualPos).setBackground(Color.red);
                }
                //Se muestran los puntajes actuales luego de haber respondido
                puntaje.setText("Puntaje J1: " + points);
                puntaje2.setText("Puntaje J2: " + points2);
            } else {
                //Este es el caso de si el juego se inició con un solo jugador
                //Igual que con los dos jugadores se comprueba si acertó la pregunta y suma o resta puntos
                if (respuesta.equals("Correcto")) {
                    points = points + 100;
                } else {
                    points = points - 150;
                    lista.get(actualPos).setBackground(Color.yellow);
                    actualPos = (int) (actualPos - Math.ceil(adv / 2));
                    lista.get(actualPos).setBackground(Color.red);
                }
                //Se actualiza el mensaje de los puntos
                puntaje.setText("Puntaje: " + points);
            }
            
            //Compruebo si algun jugador llegó a la última posicion del tablero
            if (totalPos - 1 == actualPos || totalPos - 1 == player2Pos) {
                //Cambio a state a false para que pare el cronometro
                state = false;
                //Se comprueba si hay dos jugadores
                if (player2 == true) {
                    //Se comprueba cual de los dos llegó al final
                    if (totalPos - 1 == actualPos) {
                        JOptionPane.showMessageDialog(null, "<html>Fin del juego.<br/>Tiempo: " + time.getText() + "<br/>El jugador 1 gana");
                    } else {
                        JOptionPane.showMessageDialog(null, "<html>Fin del juego.<br/>Tiempo: " + time.getText() + "<br/>El jugador 2 gana");
                    }
                } else {
                    //Si solo hay un jugador se muestra el tiempo y los puntos que consiguió
                    JOptionPane.showMessageDialog(null, "<html>Fin del juego.<br/>Tiempo: " + time.getText() + "<br/>Puntaje: " + points);
                }
            } else {
                //Si el juego no se ha acabado, habilito la siguiente tirada
                rollDice.setEnabled(true);
            }
            //Oculto las opciones de respuesta
            show = true;
            responder.setVisible(false);
            option1.setVisible(false);
            option2.setVisible(false);
            option3.setVisible(false);
            option4.setVisible(false);
            pregunta.setVisible(false);
            help.setVisible(false);
            hint.setVisible(false);
            //Lismpio la seleccion y el orden de las opciones
            optionList.clear();
            answers.clearSelection();
            //Cambio el turno
            turno = !turno;
        }
    }//GEN-LAST:event_responderActionPerformed

    //Boton para mostrar la ayuda
    private void hintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintActionPerformed
        // TODO add your handling code here:
        //Cambio la visibilidad de la imagen de ayuda a su opuesta
        change = !change;
        help.setVisible(change);
    }//GEN-LAST:event_hintActionPerformed

    //Boton para inciar con dos jugadores
    private void multiplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplayerActionPerformed
        // TODO add your handling code here:
        //Hago verdadero la opcion de los dos jugadores
        player2 = true;
        totalPos = Integer.parseInt(numTxt.getText());
        if (totalPos > 2){
        //Limpio el panel existente para cuando se quiera reiniciar el juego, asi como la lista de labels.
        panel.removeAll();
        lista.clear();
        actualPos = 0;
        //Creo el tablero con el método createBoard
        createBoard(totalPos);
        //Pinto la posicion inicial de ambos jugadores
        lista.get(actualPos).setBackground(Color.magenta);
        puntaje.setVisible(true);
        puntaje2.setVisible(true);
        playerTurn.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Por favor ingrese números mayores a 2");
        }
    }//GEN-LAST:event_multiplayerActionPerformed

    private void numTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_numTxtKeyTyped

    //Método para crear el tablero
    public void createBoard(int boardSquares) {
        //Inicio un ciclo hasta el total de posiciones que le envié al método
        for (int i = 0; i < boardSquares; i++) {
            //Creo un nuevo label y le asigno su posicion como nombre/texto.
            JLabel label = new JLabel(String.valueOf(i + 1));
            //Le pinto el fondo de amarillo y lo configuro como opaque para que se vea el color
            label.setBackground(Color.yellow);
            label.setOpaque(true);
            //Configuro su texto en el centro
            label.setHorizontalAlignment(0);
            //Agrego el label a una lista y a un panel
            lista.add(label);
            panel.add(label);
        }
        //Actualizo la apariencia del panel
        panel.updateUI();
        //Inicio los segundos y minutos en 0 e inicio el cronómetro
        seg = 0;
        min = 0;
        cronometro();
        //Oculto los botones y mustro todo lo que pueda interesar al usuario
        singleplayer.setVisible(false);
        multiplayer.setVisible(false);
        puntaje.setVisible(true);
        time.setVisible(true);
        rollDice.setVisible(true);
        numTxt.setVisible(false);
        //Compruebo si se habilitaron los dos jugadores para mostrar o no el segundo puntaje
        if (player2 == true) {
            puntaje2.setVisible(true);
        }
    }

    //Método de cronómetro
    public void cronometro() {
        //Inicio el estado del cronometro como activo, es decir true
        state = true;
        Thread hilo = new Thread() {
            public void run() {
                //Inicio un ciclo sin parametros
                for (;;) {
                    //Compruebo que el estado del cronometro sea true
                    if (state == true) {
                        try {
                            //Aplico un sleep para retrazar el proceso
                            sleep(1000);
                            //Sumo 1 a los segundos
                            seg++;
                            segTotal++;
                            //Compruebo que cuando alcance 60 segundos se comvierta en 1 minuto
                            if (seg >= 60) {
                                seg = 0;
                                min++;
                            }
                            //Hago ciertas comprobaciones para que se vea de una forma u otra
                            //En verdad esto es innicesario pero considero que asi se ve mejor
                            if (seg < 10 && min < 10) {
                                time.setText("0" + min + ":0" + seg);
                            } else if (min < 10) {
                                time.setText("0" + min + ":" + seg);
                            } else if (seg < 10) {
                                time.setText(min + ":0" + seg);
                            } else {
                                time.setText(min + ":" + seg);
                            }
                        } catch (InterruptedException e) {

                        }
                    } else {
                        //Se configura para cuando state no sea verdadero se rompa el ciclo
                        break;
                    }
                }
            }
        };
        hilo.start();
    }

    //Método para asignar respuestar aleatorias a las opciones
    public void asignarRespuestas() {
        //Se inicia un ciclo hasta que el tamaño de una lista sea 4
        for (int i = 0; optionList.size() < 4; i++) {
            //Se asigna un valor aleatorio
            int opt = rdm.nextInt(4) + 1;
            //Se comprueba que la lista no contenga ya ese valor
            if (!optionList.contains(opt)) {
                //Si no lo contiene se agrega
                optionList.add(opt);
            }
        }
        //Se asignan los valores de la lista (que son aleatorios entre 1 y 4) a las opciones de respuesta
        option1.setText(question[optionList.get(0)]);
        option2.setText(question[optionList.get(1)]);
        option3.setText(question[optionList.get(2)]);
        option4.setText(question[optionList.get(3)]);
    }

    //Método para avanzar posiciones
    public int advancePosition(int pos) {
        //Primero compruebo que es número que me enviaron mas el avance no se salga de la tabla
        if (pos + adv < totalPos) {
            //Se crea un número aleatorio que determina el tipo de pregunta
            int qstn = rdm.nextInt(7)+1;
            //Se crean los diferentes casos para qstn
            //Para algunos se habilita el botón de ayuda y se configura una imagen que se 
            //muestra al presionar el botón
            switch (qstn) {
                case 1:
                    hint.setVisible(false);
                    question = type.preguntaTipo1();
                    break;
                case 2:
                    question = type.preguntaTipo2();
                    hint.setVisible(true);
                    imageHelp = new ImageIcon("src/imagenes/teoremaPitagoras.jpg");
                    help.setIcon(imageHelp);
                    break;
                case 3:
                    question = type.preguntaTipo3();
                    hint.setVisible(true);
                    imageHelp = new ImageIcon("src/imagenes/formulaCuadratica.jpg");
                    help.setIcon(imageHelp);
                    break;
                case 4:
                    question = type.preguntaTipo4();
                    hint.setVisible(true);
                    imageHelp = new ImageIcon("src/imagenes/volumenCilindro.jpg");
                    help.setIcon(imageHelp);
                    break;
                case 5:
                    question = type.preguntaTipo5();
                    hint.setVisible(true);
                    imageHelp = new ImageIcon("src/imagenes/volumenCaja.jpg");
                    help.setIcon(imageHelp);
                    break;
                case 6:
                    question = type.preguntaTipo6();
                    hint.setVisible(false);
                    break;
                case 7:
                    question = type.preguntaTipo7();
                    hint.setVisible(false);
                    break;
            }
            pregunta.setText(question[0]);
            //Asigno las posibles respuestas a las opciones
            asignarRespuestas();
            //Se hacen visibles las opciones de respuesta, asi como la pregunta
            rollDice.setEnabled(false);
            responder.setVisible(true);
            option1.setVisible(true);
            option2.setVisible(true);
            option3.setVisible(true);
            option4.setVisible(true);
            pregunta.setVisible(true);
            actualTime = 0;
            //Retorna la nueva posición
            return (pos + adv);
        } else {
            //En caso de que se salga del tablero retorna -1
            JOptionPane.showMessageDialog(null, "El número sacado se sale del tablero");
            return (-1);
        }
    }

    //Este método comprueba si la respuesta es correcta
    public String comprobarRespuesta() {
        String correcto;
        //Primero comprueba que haya al menos una respuesta seleccionada
        if (!option1.isSelected() && !option2.isSelected() && !option3.isSelected() && !option4.isSelected()) {
            correcto = "No";
            //Si hay alguna seleccionada la compara con la respuesta correcta
        } else if (option1.isSelected() && option1.getText().equals(question[1])) {
            //Si son iguales asigna el mensaje de "Correcto"
            correcto = "Correcto";
        } else if (option2.isSelected() && option2.getText().equals(question[1])) {
            correcto = "Correcto";
        } else if (option3.isSelected() && option3.getText().equals(question[1])) {
            correcto = "Correcto";
        } else if (option4.isSelected() && option4.getText().equals(question[1])) {
            correcto = "Correcto";
        } else {
            //Si no son iguales asigna "Incorrecto"
            correcto = "Incorrecto";
        }
        //Retorna el mensaje
        return (correcto);
    }

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
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup answers;
    private javax.swing.JLabel help;
    private javax.swing.JButton hint;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multiplayer;
    private javax.swing.JTextField numTxt;
    private javax.swing.JRadioButton option1;
    private javax.swing.JRadioButton option2;
    private javax.swing.JRadioButton option3;
    private javax.swing.JRadioButton option4;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel playerTurn;
    private javax.swing.JLabel pregunta;
    private javax.swing.JLabel puntaje;
    private javax.swing.JLabel puntaje2;
    private javax.swing.JButton responder;
    private javax.swing.JButton rollDice;
    private javax.swing.JButton singleplayer;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
