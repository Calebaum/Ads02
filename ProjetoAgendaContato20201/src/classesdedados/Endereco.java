/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesdedados;

/**
 *
 * @author eugeniojulio
 */
public class Endereco {
    //Atributos
    private String logradoro= "";
    private int numero = 0;
    
    //Metodos
    public Endereco(){
        
    }
    public Endereco(String logradouro, int numero){
        this.logradoro = logradouro;
        this.numero = numero;
    }

    /**
     * @return the logradoro
     */
    public String getLogradoro() {
        return logradoro;
    }

    /**
     * @param logradoro the logradoro to set
     */
    public void setLogradoro(String logradoro) {
        this.logradoro = logradoro;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
