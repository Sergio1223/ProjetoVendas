package br.com.sergio.ProjetoSistemaVenda.modelos;

public class Servico extends Produto{
    public Servico(String nome, double valorCusto, int porcentagemVenda){
        super(nome, valorCusto, porcentagemVenda);
    }

    @Override
    public double getValorFinal(){
        return getValorVenda()+(getValorVenda()*0.20);
    }
}
