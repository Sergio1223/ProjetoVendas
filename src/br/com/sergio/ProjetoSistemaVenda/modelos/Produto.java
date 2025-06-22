package br.com.sergio.ProjetoSistemaVenda.modelos;

public class Produto {
    String nome;
    double valorCusto;
    int porcentagemVenda;

    public Produto(String nome, double valorCusto, int porcentagemVenda){
        this.nome = nome;
        this.valorCusto = valorCusto;
        this.porcentagemVenda = porcentagemVenda;
    }

    public double getValorVenda(){
        return valorCusto+(valorCusto*((double) porcentagemVenda /100));
    }

    public double getValorFinal(){
        return getValorVenda();
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public String getNome() {
        return nome;
    }

    public int getPorcentagemVenda(){
        return porcentagemVenda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorCusto(double valorCusto){
        this.valorCusto = valorCusto;
    }

    public void setPorcentagemVenda(int porcentagemVenda){
        this.porcentagemVenda = porcentagemVenda;
    }
}
