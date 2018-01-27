/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class JPProgrammer extends JPanel{
    
    /**
     * Atributos
     */
    private Controller controller;
    private JButton bin,hexa,octal,num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,point,a,b,c,d,e,f;
    
    /**
     * Metodo constructor
     * @param controller instancia del controlador
     */
    public JPProgrammer(Controller controller){
        this.controller = controller;
        init();
    }
    
    /**
     * Metodo que inicializa los componentes
     */
    private void init(){
        this.setLayout(new GridLayout(5, 4));
        
        bin = createButton("Binario");
        hexa = createButton("Hexadecimal");
        octal = createButton("Octal");num1 = createButton("1");        
        num2 = createButton("2");        
        num3 = createButton("3");
        num4 = createButton("4");
        num5 = createButton("5");
        num6 = createButton("6");
        num7 = createButton("7");
        num8 = createButton("8");        
        num9 = createButton("9");
        num0 = createButton("0");
        point = createButton(".");
        a = createButton("A");
        b = createButton("B");
        c = createButton("C");
        d = createButton("D");
        e = createButton("E");
        f = createButton("F");
        
        this.add(num1);
        this.add(num2);
        this.add(num3);
        this.add(num4);
        this.add(num5);
        this.add(num6);
        this.add(num7);
        this.add(num8);
        this.add(num9);
        this.add(num0);
        this.add(a);
        this.add(b);
        this.add(c);
        this.add(d);
        this.add(e);
        this.add(f);
        this.add(point);
        this.add(bin);
        this.add(hexa);
        this.add(octal);
        
    }
    
    /**
     * Metodo para crear botones
     * @param text texto del boton el cual tambien corresponde a su escuchador
     * @return el boton creado
     */
    private JButton createButton(String text){
        JButton aux = new JButton(text);
        aux.setActionCommand(text);
        aux.addActionListener(controller);
        aux.setFocusable(false);        
        Font fuente = new Font("Dialog", Font.BOLD, 30);
        aux.setFont(fuente);
        return aux;
    }
    
    /**
     * Metodo para actualizar la interfaz a modo binario
     */
    public void binary(){
        num2.setEnabled(false);        
        num3.setEnabled(false);
        num4.setEnabled(false);
        num5.setEnabled(false);
        num6.setEnabled(false);
        num7.setEnabled(false);
        num8.setEnabled(false);
        num9.setEnabled(false);          
        a.setEnabled(false);        
        b.setEnabled(false);        
        c.setEnabled(false);        
        d.setEnabled(false);        
        e.setEnabled(false);
        f.setEnabled(false);
    }
    
    /**
     * Metodo para actualizar la interfaz a modo hexadecimal
     */
    public void hexadecimal(){
        num2.setEnabled(true);        
        num3.setEnabled(true);
        num4.setEnabled(true);
        num5.setEnabled(true);
        num6.setEnabled(true);
        num7.setEnabled(true);
        num8.setEnabled(true);
        num9.setEnabled(true);         
        a.setEnabled(true);        
        b.setEnabled(true);        
        c.setEnabled(true);        
        d.setEnabled(true);        
        e.setEnabled(true);
        f.setEnabled(true);
    }
    
    /**
     * Metodo que actualiza la interfaz a modo octal
     */
    public void octal(){
        num2.setEnabled(true);        
        num3.setEnabled(true);
        num4.setEnabled(true);
        num5.setEnabled(true);
        num6.setEnabled(true);
        num7.setEnabled(true);
        num8.setEnabled(true);
        num9.setEnabled(false);         
        a.setEnabled(false);        
        b.setEnabled(false);        
        c.setEnabled(false);        
        d.setEnabled(false);        
        e.setEnabled(false);
        f.setEnabled(false);
    }
}
