package br.com.sergio.ProjetoSistemaVenda.modelos;

public class ClientePF extends Cliente{
    public ClientePF(String nome, String cpf, String estado){
        super(nome, cpf, estado);
    }

    @Override
    public String getTipo() {
        return "Pessoa Física";
    }

    @Override
    public String getDocumentoFormatado() {
        return documento.replaceAll("(//d{3})(//d{3})(//d{3})(//d{2})", "$1.$2.$3-$4");
    }

    public String getCPF(){
        return documento;
    }
}
