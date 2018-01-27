/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Calculator;
import view.JFMainWindow;

/**
 *
 * @author USUARIO
 */
public class Controller implements ActionListener{
    
    /**
     * Atributos
     */
    private Calculator calculator;
    private JFMainWindow jFMainWindow;
    private char memory;
    
    /**
     * Metodo constructor
     */
    public Controller(){
        calculator = new Calculator();
        jFMainWindow = new JFMainWindow(this);
        
        jFMainWindow.setVisible(true);
    }

    /**
     * Metodo que toma las acciones del mouse 
     * @param e accion del evento
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "ANS":
                jFMainWindow.setAns(String.valueOf(calculator.getMemory()));
                break;
            case "CLC":
                jFMainWindow.setAns("");
                break;
            case "1":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "1");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "2":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "2");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "3":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "3");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "4":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "4");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "5":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "5");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "6":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "6");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "7":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "7");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "8":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "8");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "9":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "9");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "0":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "0");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case ".":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + ".");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "(":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "(");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case ")":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + ")");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "=":             
                jFMainWindow.setAns(String.valueOf(calculator.getAux1()));                 
                try {
                    analyze();
                } catch (Exception ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "+":
                calculator.setAux1(Double.parseDouble(jFMainWindow.getMemory()));
                jFMainWindow.setMemory("");      
                jFMainWindow.setAns("");
                this.memory = '+';
                break;
            case "-":
                calculator.setAux1(Double.parseDouble(jFMainWindow.getMemory()));
                jFMainWindow.setMemory("");      
                jFMainWindow.setAns("");
                this.memory = '-';
                break;
            case "*":
                calculator.setAux1(Double.parseDouble(jFMainWindow.getMemory()));
                jFMainWindow.setMemory("");      
                jFMainWindow.setAns("");
                this.memory = '*';
                break;
            case "/":
                calculator.setAux1(Double.parseDouble(jFMainWindow.getMemory()));
                jFMainWindow.setMemory("");      
                jFMainWindow.setAns("");
                this.memory = '/';
                break;
            case "^":
                calculator.setAux1(Double.parseDouble(jFMainWindow.getMemory()));
                jFMainWindow.setMemory("");      
                jFMainWindow.setAns("");
                this.memory = '^';
                break;
            case "root":
                calculator.setAux1(Double.parseDouble(jFMainWindow.getMemory()));
                jFMainWindow.setMemory("");      
                jFMainWindow.setAns("");
                this.memory = '&';
                break;
            case "sin":
                if(calculator.isState()){
                    jFMainWindow.setMemory(String.valueOf(calculator.sin(calculator.toRadians(Double.parseDouble(jFMainWindow.getMemory())))));      
                }else{
                    jFMainWindow.setMemory(String.valueOf(calculator.sin(calculator.toDegrees(Double.parseDouble(jFMainWindow.getMemory())))));      
                
                }
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "cos":
                if(calculator.isState()){
                    jFMainWindow.setMemory(String.valueOf(calculator.cos(calculator.toRadians(Double.parseDouble(jFMainWindow.getMemory())))));      
                }else{
                    jFMainWindow.setMemory(String.valueOf(calculator.cos(calculator.toDegrees(Double.parseDouble(jFMainWindow.getMemory())))));      
                
                }
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "tan":
                if(calculator.isState()){
                    jFMainWindow.setMemory(String.valueOf(calculator.tan(calculator.toRadians(Double.parseDouble(jFMainWindow.getMemory())))));      
                }else{
                    jFMainWindow.setMemory(String.valueOf(calculator.tan(calculator.toDegrees(Double.parseDouble(jFMainWindow.getMemory())))));      
                
                }
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "sinh":
                if(calculator.isState()){
                    jFMainWindow.setMemory(String.valueOf(calculator.sinh(calculator.toRadians(Double.parseDouble(jFMainWindow.getMemory())))));      
                }else{
                    jFMainWindow.setMemory(String.valueOf(calculator.sinh(calculator.toDegrees(Double.parseDouble(jFMainWindow.getMemory())))));      
                
                }
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "cosh":
                if(calculator.isState()){
                    jFMainWindow.setMemory(String.valueOf(calculator.cosh(calculator.toRadians(Double.parseDouble(jFMainWindow.getMemory())))));      
                }else{
                    jFMainWindow.setMemory(String.valueOf(calculator.cosh(calculator.toDegrees(Double.parseDouble(jFMainWindow.getMemory())))));      
                
                }jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "tanh":                
                if(calculator.isState()){
                    jFMainWindow.setMemory(String.valueOf(calculator.tanh(calculator.toRadians(Double.parseDouble(jFMainWindow.getMemory())))));      
                }else{
                    jFMainWindow.setMemory(String.valueOf(calculator.tanh(calculator.toDegrees(Double.parseDouble(jFMainWindow.getMemory())))));      
                
                }
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "log":
                jFMainWindow.setMemory(String.valueOf(calculator.logTen(Double.parseDouble(jFMainWindow.getMemory()))));      
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "logn":
                jFMainWindow.setMemory(String.valueOf(calculator.logTen(Double.parseDouble(jFMainWindow.getMemory()))));      
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "round":
                jFMainWindow.setMemory(String.valueOf(calculator.round(Double.parseDouble(jFMainWindow.getMemory()))));      
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "%":
                jFMainWindow.setMemory(String.valueOf(calculator.percent(Double.parseDouble(jFMainWindow.getMemory()))));      
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "X!":
                jFMainWindow.setMemory(String.valueOf(calculator.factorial(Double.parseDouble(jFMainWindow.getMemory()))));      
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "e":
                jFMainWindow.setMemory(String.valueOf(calculator.e()));      
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "pi":
                jFMainWindow.setMemory(String.valueOf(calculator.pi()));      
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "A":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "A");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "B":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "B");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "C":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "C");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "D":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "D");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "E":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "E");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "F":
                jFMainWindow.setMemory(jFMainWindow.getCalc() + "F");
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "Basica":
                jFMainWindow.basic();
                break;
            case "Avanzada":
                jFMainWindow.advanced();
                break;
            case "Programador":
                jFMainWindow.programmer();
                jFMainWindow.binary();
                break;
            case "Binario":
                jFMainWindow.binary();
                jFMainWindow.setMemory(calculator.toBinary(Double.parseDouble(jFMainWindow.getCalc())));
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "Hexadecimal":
                jFMainWindow.hexa();
                jFMainWindow.setMemory(calculator.toHexadecimal(Double.parseDouble(jFMainWindow.getCalc())));
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
            case "Octal":
                jFMainWindow.octal();
                jFMainWindow.setMemory(calculator.toOctal(Double.parseDouble(jFMainWindow.getCalc())));
                jFMainWindow.setAns(jFMainWindow.getMemory());
                break;
                
            case "Grados":
                jFMainWindow.unites("ANS");
                calculator.setState(true);
                break;
            case "Radians":
                jFMainWindow.unites("ANS RADIANS");
                calculator.setState(false);
                break;
            default:
                break;
        }
    }
    
    /**
     * Metodo que analiza la operacion que se debe realizar
     */
    private void analyze() throws Exception{
        double aux = 0;
        switch(this.memory){
            case '+':
                aux = calculator.sum(calculator.getAux1(), Double.parseDouble(jFMainWindow.getMemory()));
                jFMainWindow.setMemory(String.valueOf(aux));
                jFMainWindow.setAns(String.valueOf(aux));
                break;
            case '-':
                aux = calculator.substraction(calculator.getAux1(), Double.parseDouble(jFMainWindow.getMemory()));
                jFMainWindow.setMemory(String.valueOf(aux));
                jFMainWindow.setAns(String.valueOf(aux));
                break;
            case '*':
                aux = calculator.multiplication(calculator.getAux1(), Double.parseDouble(jFMainWindow.getMemory()));
                jFMainWindow.setMemory(String.valueOf(aux));
                jFMainWindow.setAns(String.valueOf(aux));
                break;
            case '/':
                aux = calculator.division(calculator.getAux1(), Double.parseDouble(jFMainWindow.getMemory()));
                jFMainWindow.setMemory(String.valueOf(aux));
                jFMainWindow.setAns(String.valueOf(aux));
                break;
            case '^':
                aux = calculator.pow(calculator.getAux1(), Double.parseDouble(jFMainWindow.getMemory()));
                jFMainWindow.setMemory(String.valueOf(aux));
                jFMainWindow.setAns(String.valueOf(aux));
                break;
            case '&':
                aux = calculator.root(calculator.getAux1(), Double.parseDouble(jFMainWindow.getMemory()));
                jFMainWindow.setMemory(String.valueOf(aux));
                jFMainWindow.setAns(String.valueOf(aux));
                break;
            default:
                break;
        }
    }
}
