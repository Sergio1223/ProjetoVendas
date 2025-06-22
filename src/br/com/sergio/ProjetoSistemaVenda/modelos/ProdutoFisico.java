package br.com.sergio.ProjetoSistemaVenda.modelos;

public class ProdutoFisico extends Produto{

    public ProdutoFisico(String nome, double valorCusto, int porcentagemVenda){
        super(nome, valorCusto, porcentagemVenda);
    }

    @Override
    public double getValorFinal(){
        return getValorVenda()+(getValorVenda()*0.10);
    }
}
