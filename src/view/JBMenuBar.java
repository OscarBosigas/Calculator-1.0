/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author USUARIO
 */
public class JBMenuBar extends JMenuBar{
    
    /**
     * Atributos
     */
    private JMenu file,type,help;
    private JRadioButtonMenuItem basic, advanced, programmer, radians, degrees;
    private JMenuItem info;
    private ButtonGroup group;
    private Controller controller;
    
    /**
     * Metodo constructor
     * @param controller instancia del controlador
     */
    public JBMenuBar(Controller controller){
        this.controller = controller;
        init();
    }
    
    /**
     * Metodo que inicializa los componentes
     */
    private void init(){
        group = new ButtonGroup();
        file = createMenu("Basica");
        type = createMenu("Unidades");
        help = createMenu("Ayuda");
        
        info = new JMenuItem("Acerca de");
        info.setActionCommand("Acerca");
        
        basic = createSubMenu("Basica");
        advanced = createSubMenu("Avanzada");
        programmer = createSubMenu("Programador");
        degrees = createSubMenu("Grados");
        radians = createSubMenu("Radians");
        
        file.add(basic);
        file.add(advanced);
        file.add(programmer);
        
        type.add(degrees);
        type.add(radians);
        
        help.add(info);
        
        this.add(file);
        this.add(type);
        this.add(help);
        
    }
    
    /**
     * Metodo que crea menus
     * @param name nombre y accion del menu
     * @return menu creado con sus respectivas caracteristicas
     */
    private JMenu createMenu(String name){
        JMenu aux = new JMenu(name);
        aux.setActionCommand(name);
        aux.addActionListener(controller);
        return aux;
    }
    
    /**
     * Metodo que crea submenus de tipo RadioButton
     * @param name nombre del submenu
     * @return 
     */
    private JRadioButtonMenuItem createSubMenu(String name){
        JRadioButtonMenuItem aux = new JRadioButtonMenuItem(name);
        aux.setActionCommand(name);
        aux.addActionListener(controller);
        group.add(aux);
        return aux;
    }
    
}
