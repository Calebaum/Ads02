/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Calebe Cabral
 */
public class Calculos {
    
    //Metodos
    private boolean isOperador(char caracter){
        boolean isOperador = false;
        if (caracter == '-' || caracter == '+' || caracter == '/' || caracter == '*' ){
            isOperador = true;
        }
        return isOperador;
    }
    
    private List<Character> obterOperadores(String expressao){
        List<Character> listaOperadores = new ArrayList<Character>();
        for (int i = 0; i < expressao.length(); i++){
            if (isOperador(expressao.charAt(i))){
                listaOperadores.add(new Character(expressao.charAt(i)));
            }
        }
        return listaOperadores;
    }
    private List<Double> obterNumeros(String expressao){
        List<Double> listaNumeros = new ArrayList<Double>();
        String numeroEmString = "";
        for (int i=0; i<expressao.length();i++){
            if (isOperador(expressao.charAt(i))){
                Double numero = Double.valueOf(numeroEmString);
                listaNumeros.add(numero);
                numeroEmString="";
            }else {
                numeroEmString = numeroEmString.concat("" + expressao.charAt(i));
            }
        }
        if(!numeroEmString.isEmpty())
        {
            Double numero = Double.valueOf(numeroEmString);
            listaNumeros.add(numero);
            }
        return listaNumeros;
        }
    
    private double executarOperacao (double numero1, char operador, double numero2){
        double resultado = 0.0;
        if(operador == '+'){
            resultado = numero1 + numero2;
        }else if (operador == '-'){
            resultado = numero1 - numero2;
        }else if (operador == '/'){
            resultado = numero1 / numero2;
        }else if (operador == '*'){
            resultado = numero1 * numero2;
        }
        return resultado;
    }
    private String calcularValor(List<Double> listaNumeros, List<Character> listaOperadores){
        String resultado = "";
        double total = 0.0;
        int j =0;
        for (int i =0; i<listaNumeros.size()-1; i++){
            if (total == 0){
                double numero1 = listaNumeros.get(i).doubleValue();
                double numero2 = listaNumeros.get(i+1).doubleValue();
                char operador = listaOperadores.get(i).charValue();
                total = executarOperacao(numero1, operador, numero2);
            }
            else if (total >0.0){
                
                double numero2 = listaNumeros.get(i).doubleValue();
                char operador = listaOperadores.get(i).charValue();
                total = executarOperacao(numero2, operador, numero2);
                j++;
                
            }
        }
        resultado= ""+ total;
        return resultado;
    }
    public String calculadora (String expressao){
        String resultado;
        List<Double> listaNumeros = new ArrayList<Double>();
        List<Character> listaOperadores = new ArrayList<Character>();
        listaNumeros = obterNumeros(expressao);
        listaOperadores = obterOperadores(expressao);
        resultado = calcularValor(listaNumeros, listaOperadores);
        return resultado;
    }
    }   
        

