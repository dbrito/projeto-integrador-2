package br.com.ads.mock;

import br.com.ads.model.vendas.Venda;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class MockVenda {
    private static int totalVendas = 0;
    private static List<Venda> listaVendas = new ArrayList<Venda>();

    //Insere uma venda
    public static void inserir(Venda venda) throws Exception {
        venda.setId(totalVendas++);
        venda.setData(new Date());
        listaVendas.add(venda);
    }

    //Lista todas as vendas
    public static List<Venda> listar() throws Exception {
        return listaVendas;
    }

    //Procuro as vendas que se encaixam no filtro de data
    public static List<Venda> procurar(String termo) throws Exception {
        List<Venda> listaResultado = new ArrayList<Venda>();

        if (termo != null && !listaVendas.isEmpty()) {
            for (Venda vendaLi : listaVendas) {
                if (vendaLi != null) {
                    //verifico se a venda esta entre o periodo solicitado
                    //if (vendaLi.getData() >= beginDate && vendaLi.getData <= endDate){
                        //listaResultado.add(produtoLi);
                    //}
                }
            }
        }

        return listaResultado;
    }

    //Obtém uma ventda especifica
    public static Venda obter(Integer id) throws Exception {
        if (id != null && !listaVendas.isEmpty()) {
            for (int i = 0; i < listaVendas.size(); i++) {
                if (listaVendas.get(i) != null && listaVendas.get(i).getId()== id) {
                    return listaVendas.get(i);
                }
            }
        }
        return null;
    }
}
