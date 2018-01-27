/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class JPAdvanced extends JPanel{
    
    /**
     * Atributos
     */
    private Controller controller;
    private JButton percent,pow,root,factorial,sin,cos,tan,sinh,cosh,tanh,e,pi,round,logTen,logn;
    
    /**
     * Metodo constructor
     * @param controller instancia del controlador
     */
    public JPAdvanced(Controller controller){
        this.controller = controller;
        init();
    }
    
    /**
     * Metodo que inicializa los componentes
     */
    private void init(){
        this.setLayout(new GridLayout(5, 3));
        
        percent = createButton("%");
        pow = createButton("^");
        root = createButton("root");
        factorial = createButton("X!");
        sin = createButton("sin");
        cos = createButton("cos");
        tan = createButton("tan");
        sinh = createButton("sinh");
        cosh = createButton("cosh");
        tanh = createButton("tanh");
        e = createButton("e");
        pi = createButton("pi");
        round = createButton("round");
        logTen = createButton("log");
        logn = createButton("logn");
        
        this.add(percent);
        this.add(pow);
        this.add(root);
        this.add(factorial);
        this.add(sin);
        this.add(cos);
        this.add(tan);
        this.add(sinh);
        this.add(cosh);
        this.add(tanh);
        this.add(logTen);
        this.add(logn);
        this.add(e);
        this.add(pi);
        this.add(round);
        
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
    
}
