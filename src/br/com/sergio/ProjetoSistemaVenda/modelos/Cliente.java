package br.com.sergio.ProjetoSistemaVenda.modelos;

public abstract class Cliente {
    String nome;
    String documento;
    String estado;

    public Cliente(String nome, String documento, String estado){
        this.documento = documento;
        this.nome = nome;
        this.estado = estado;
    }

    public abstract String getTipo();

    public String getDocumentoFormatado(){
        return documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
