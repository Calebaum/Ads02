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
public class Contato {
    //Atributos
    private String nomeCompleto = "";
    private String telefone = "";
    private String email = "";
    private Endereco enderecoResidencial = null;
    
    //Metodos
    public Contato(){
    }
    public Contato(String nome, String telefone, 
            String email, String logradouro, int numero){
        nomeCompleto = nome;
        this.telefone = telefone;
        this.email = email;
        this.enderecoResidencial = new Endereco(logradouro, numero);
    }
    public Contato (String nome, String telefone, 
            String email, Endereco enderecoResidencial){
        nomeCompleto = nome;
        this.telefone = telefone;
        this.email = email;
        this.enderecoResidencial = enderecoResidencial;
    }
    public Contato(Contato objeto){
        this.nomeCompleto = objeto.nomeCompleto;
        this.telefone = objeto.telefone;
        this.email = objeto.email;
        this.enderecoResidencial = new Endereco(objeto.enderecoResidencial.getLogradoro(),
                                                objeto.enderecoResidencial.getNumero());
    }

    //Construtor pega a String separada e cria o objeto
    public Contato(String strDados)throws Exception{
        String vetorString[] = strDados.split(";");
        if(vetorString.length < 5) throw new Exception("Faltam dados na String");
        nomeCompleto = vetorString[0];
        telefone = vetorString[1];
        email = vetorString[2];
        enderecoResidencial = new Endereco(vetorString[3], 
                Integer.parseInt(vetorString[4]));
        
    }
    /**
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the enderecoResidencial
     */
    public Endereco getEnderecoResidencial() {
        return enderecoResidencial;
    }

    /**
     * @param enderecoResidencial the enderecoResidencial to set
     */
    public void setEnderecoResidencial(Endereco enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }
    @Override
    public String toString(){
        String saida = nomeCompleto + ";";
        saida += telefone + ";";
        saida += email + ";";
        saida += enderecoResidencial.getLogradoro() + ";";
        saida += enderecoResidencial.getNumero() + ";";
        return saida;
    }
    
}
