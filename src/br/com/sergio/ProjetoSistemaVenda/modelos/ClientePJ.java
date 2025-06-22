package br.com.sergio.ProjetoSistemaVenda.modelos;

public class ClientePJ extends Cliente{
    public ClientePJ(String nome, String cnpj, String estado){
        super(nome, cnpj, estado);
    }

    @Override
    public String getTipo() {
        return "Pessoa Jurídica";
    }

    @Override
    public String getDocumentoFormatado() {
        return documento.replaceAll("(//d{2})(//d{3})(//d{3})(//d{4})(//d{2})", "$1.$2.$3/$4-$5");
    }

    public String getCNPJ(){
        return documento;
    }
}
