/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencias;
import classesdedados.Contato;
import interfaces.ICRUD;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
/**
 *
 * @author calebaum
 */
public class ContatoPersistencia implements ICRUD{
    //Atributos
    private String nomeDoArquivoNoDisco="";
    //Métodos
    public ContatoPersistencia(String nomeArquivoNoDisco){
        this.nomeDoArquivoNoDisco = nomeArquivoNoDisco;
    }

    @Override
    public void incluir(Contato objeto) throws Exception {
        try{
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            //criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //escreve no arquivo
            bw.write(objeto+"\n");
            //fecha o arquivo
            bw.close();
        }catch(Exception erro){
                throw erro;
    
        }
    }
    @Override
    public ArrayList<Contato> recuperar() throws Exception{
        try {
            ArrayList<Contato> listaDeContatos = new ArrayList<Contato>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Contato objetoContato = new Contato();                
                listaDeContatos.add(objetoContato);
        }
            br.close();
            return listaDeContatos;
        } catch (Exception erro) {
            throw erro;
        }
    }
}
