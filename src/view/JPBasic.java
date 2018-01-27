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
public class JPBasic extends JPanel{
    
    /**
     * Atributos
     */
    private Controller controller;
    private JButton num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,point,clear,sum,sub,mult,div,equal,ans,
            parenthesisRight, parenthesisLeft;
    
    /**
     * Metodo constructor
     * @param controller instancia del controlador
     */
    public JPBasic(Controller controller){
        this.controller = controller;
        init();
    }
    
    /**
     * Metodo que inicializa los componentes
     */
    private void init(){
        this.setLayout(new GridLayout(5, 4));
        
        num1 = createButton("1");        
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
        equal = createButton("=");
        sum = createButton("+");
        sub = createButton("-");
        mult = createButton("*");
        div = createButton("/");
        clear = createButton("CLC");
        ans = createButton("ANS");
        parenthesisLeft = createButton("(");
        parenthesisRight = createButton(")");
        
        this.add(num1);
        this.add(num2);
        this.add(num3);
        this.add(sum);
        this.add(num4);
        this.add(num5);
        this.add(num6);
        this.add(sub);
        this.add(num7);
        this.add(num8);
        this.add(num9);
        this.add(mult);
        this.add(num0);
        this.add(point);
        this.add(ans);
        this.add(div);
        this.add(parenthesisLeft);
        this.add(parenthesisRight);
        this.add(equal);
        this.add(clear);
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
