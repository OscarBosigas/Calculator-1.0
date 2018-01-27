/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class JFMainWindow extends JFrame{
    
    /**
     * Atributos
     */
    private Controller controller;
    private JTextField text;
    private JPBasic jPBasic;
    private JPAdvanced jPAdvanced;
    private JPProgrammer jPProgrammer;
    private JBMenuBar jBMenuBar;
    private String memory;
    
    /**
     * Metodo constructor
     * @param controller instancia del controlador
     */
    public JFMainWindow(Controller controller){
        this.controller = controller;
        this.jPBasic = new JPBasic(controller);
        this.jPAdvanced = new JPAdvanced(controller);
        this.jPProgrammer = new JPProgrammer(controller);
        this.jBMenuBar = new JBMenuBar(controller);
        this.memory = "";
        init();
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
        
    /**
     * Metodo para inicializar componentes y caraacteristicas
     */
    private void init(){      
        this.setFocusable(true);
        this.setSize(500,600);
        this.setLocationRelativeTo(null);
        this.setTitle("Calculadora 1.0");        
        this.setBackground(Color.white);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        Image icono = Toolkit.getDefaultToolkit().getImage(("src/images/calculator.png"));
	this.setIconImage(icono);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close(controller);
            }
        });
        
        text = new JTextField();
        text.setPreferredSize(new Dimension(700,50));
        text.setBorder(BorderFactory.createTitledBorder("ANS"));
        text.setHorizontalAlignment(JTextField.RIGHT);
        Font fuente = new Font("Dialog", Font.BOLD, 30);
        text.setFont(fuente);
        
        this.setJMenuBar(jBMenuBar);
        this.add(text, BorderLayout.NORTH);
        this.add(jPBasic, BorderLayout.CENTER);
    }
    
    /**
     * 
     * @param controller 
     */
    private void close(Controller controller) {
        int resp = JOptionPane.showConfirmDialog(this, "Desea salir?");
        if (0 == resp) {
            System.exit(0);
        }
    }
    
    /**
     * Metodo que cambia la interfaz a modo avanzado
     */
    public void advanced(){        
        this.setSize(760,600);
        this.remove(jPBasic);
        this.remove(jPProgrammer);
        this.add(jPBasic , BorderLayout.WEST);
        this.add(jPAdvanced, BorderLayout.EAST);
        this.repaint();
    }
    
    /**
     * Metodo que cambia la interfaz a modo basico
     */
    public void basic(){        
        this.setSize(500,600);        
        this.remove(jPBasic);
        this.remove(jPAdvanced);
        this.remove(jPProgrammer);
        this.add(jPBasic , BorderLayout.CENTER);
        this.repaint();
    }
    
    /**
     * Metodo que cambia la interfaz a modo programador
     */
    public void programmer(){
        this.setSize(500,600); 
        this.remove(jPBasic);
        this.remove(jPAdvanced);
        this.add(jPProgrammer , BorderLayout.CENTER);
        this.repaint();
    }
    
    /**
     * Metodo que retorna el texto del componente
     * @return texto escrito en el componente
     */
    public String getCalc(){
        return this.text.getText();
    }
    
    /**
     * Metodo que pone el texto en el componente
     * @param text texto a ingresar
     */
    public void setAns(String text){
        this.text.setText(text);
    }
    
    /**
     * Metodo que actualiza la interfaz a modo binario
     */
    public void binary(){
        jPProgrammer.binary();
    }
    
    /**
     * Metodo que actualiza la interfaz a modo hexadecimal
     */
    public void hexa(){
        jPProgrammer.hexadecimal();
    }
    
    /**
     * Metodo que actualiza la interfaz a modo octal
     */
    public void octal(){
        jPProgrammer.octal();
    }
    
    /**
     * Metodo que cambia la interfaz para las unidades
     * @param name radianes o grados
     */
    public void unites(String name){
        this.text.setBorder(BorderFactory.createTitledBorder(name));
        this.text.repaint();
        this.repaint();
    }
}
