/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USUARIO
 */
public class Calculator {
    
    /**
     * Atributos
     */
    private double memory;
    private double residue;
    private boolean state;
    private double aux1;
    private double aux2;
    
    /**
     * Metodo constructor
     */
    public Calculator(){
        this.memory = 0;
        this.residue = 0;
        this.state = true;
    }

    public double getAux1() {
        return aux1;
    }

    public void setAux1(double aux1) {
        this.aux1 = aux1;
    }
    
    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getResidue() {
        return residue;
    }

    public void setResidue(double residue) {
        this.residue = residue;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
        
    /**
     * Metodo para sumar dos (2) numeros
     * @param num1 primer numero a sumar
     * @param num2 segundo numero a sumar
     * @return resultado de la suma de los dos numeros
     */
    public double sum(double num1, double num2){
        memory = num1 + num2;
        return memory;
    }
     
    /**
     * Metodo para restar dos (2) numeros
     * @param num1 primer numero a restar
     * @param num2 segund numero a restar
     * @return resultado de la resta de los dos numeros
     */
    public double substraction(double num1, double num2){
        memory = num1 - num2;
        return memory;
    }
    
    /**
     * Metodo para multiplicar dos (2) numeros
     * @param num1 primer numero a multiplicar
     * @param num2 segundo numero a multiplicar
     * @return resultado de la multiplicacion de los dos numeros
     */
    public double multiplication(double num1, double num2){
        memory = num1* num2;
        return memory;
    }
    
    /**
     * Metodo para dividir dos (2) numeros
     * @param num1 primer numero a dividir (dividendo)
     * @param num2 segundo numero a dividir (divisor) 
     * @return resultado de la division de los dos numeros
     * @throws Exception lanza una excepcion cuando el segundo numero o divisor es igual a cero (0)
     */
    public double division(double num1, double num2) throws Exception{
        if(num2 != 0){
            residue = num1 % num2;
            memory = num1 / num2;
            return memory;
        }else{
            throw new Exception("El divisor no puede ser cero (0)");
        }        
    }
    
    /**
     * Metodo para calcular la razi n-esima de un numero
     * @param num numero al que se le calculara la raiz
     * @param index valor del indice de la raiz
     * @return la raiz index del numero
     */
    public double root(double num, double index){
        memory = Math.pow(num, 1/index);
        return memory;
    }
    
    /**
     * Metodo para calcular la potencia n-esima de un numero
     * @param num numero al que se le calculara la potencia
     * @param index valor del indice de la potencia
     * @return la potencia index del numero
     */
    public double pow(double num, double index){
        memory = Math.pow(num, index);
        return memory;
    }
    
    /**
     * Metodo que calcula el logaritmo en base diez (10) de un numero
     * @param num numero al que se la va a calcular su logaritmo
     * @return el valor del logaritmo en base diez (10) del numero
     */
    public double logTen(double num){
        memory = Math.log10(num);
        return memory;
    }
    
    /**
     * Metodo que calcula el logaritmo en base e de un numero
     * @param num numero al que se la va a calcular su logaritmo
     * @return el valor del logaritmo en base e del numero
     */
    public double logE(double num){
        memory = Math.log(num);
        return memory;
    }
    
    /**
     * Metodo que retorna el numero PI
     * @return numero PI
     */
    public double pi(){
        return Math.PI;
    }
    
    /**
     * Metodo que retorna el numero e
     * @return numero e
     */
    public double e(){
        return Math.E;
    }
    
    /**
     * Metodo que calcula el porcentaje de un numero
     * @param num numero al que se le va a calcular el porcentaje
     * @return el numero dividido en cien (100)
     */
    public double percent(double num){
        memory = num/100;
        return memory;
    }
    
    /**
     * Metodo para calcular el factorial de un numero
     * @param num numero al que se le va a calcular el numero
     * @return el factorial del numero
     */
    public double factorial(double num){
        if (num == 0){
            return 1;
        }else{
            return num * factorial(num-1);
        }
    }
    
    /**
     * Metodo para redondear un numero
     * @param num numero a redondear
     * @return el numero redondeado
     */
    public double round(double num){
        return Math.round(num);
    }
    
    /**
     * Metodo que retorna el seno de un angulo en radianes
     * @param num angulo al que se le va a calcular el seno en radianes
     * @return seno del angulo
     */
    public double sin(double num){
        memory = Math.sin(num);
        return memory;
    }
    
    /**
     * Metodo que retorna el coseno de un angulo en radianes
     * @param num angulo al que se le va a calcular el coseno en radianes
     * @return coseno del angulo
     */
    public double cos(double num){
        memory = Math.cos(num);
        return memory;
    }
    
    /**
     * Metodo que retorna la tangente de un angulo en radianes
     * @param num angulo al que se le va a calcular la tangente en radianes
     * @return tangente del angulo
     */
    public double tan(double num){
        memory = Math.tan(num);
        return memory;
    }
    
    /**
     * Metodo que retorna la cosecante de un numero
     * @param num numero al que se le va a calcular la cosecante
     * @return cosecante del numero
     */
    public double sinh(double num){
        memory = Math.sinh(num);
        return memory;
    }
    
    /**
     * Metodo que retorna la secante de un numero
     * @param num numero al que se le va a calcular la secante
     * @return secante del numero
     */
    public double cosh(double num){
        memory = Math.cosh(num);
        return memory;
    }
    
    /**
     * Metodo que retorna la cotangente de un numero
    * @param num numero al que se le va a calcular la cotangente
     * @return cotangente del numero
     */
    public double tanh(double num){
        memory = Math.tanh(num);
        return memory;
    }
    
    /**
     * Metodo que convierte de grados a radianes
     * @param num grados a convertir
     * @return grados convertidos en radianes
     */
    public double toRadians(double num){
        return Math.toRadians(num);
    }
    
    /**
     * Metodo que convierte de radianes a grados
     * @param num radianes a convertir
     * @return radianes convertidos en grados
     */
    public double toDegrees(double num){
        return Math.toDegrees(num);
    }
    
    /**
     * Metodo que convierte un numero decimal a numero binario
     * @param num numero decimal a convertir
     * @return numero binario
     */
    public String toBinary(double num){
        return Integer.toBinaryString((int)num);
    }
    
    /**
     * Metodo que convierte un numero decimal a hexadecimal
     * @param num numero decimal a convertir
     * @return numero hexadecimal
     */
    public String toHexadecimal(double num){
        return Integer.toHexString((int)num);
    }
    
    /**
     * Metodo que convierte un numero decimal a octal
     * @param num numero decimal a convertir
     * @return numero octal
     */
    public String toOctal(double num){
        return Integer.toOctalString((int)num);
    }
    
       
}
