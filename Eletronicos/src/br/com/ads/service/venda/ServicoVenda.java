/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ads.service.venda;

import br.com.ads.DAO.VendaDAO;
import br.com.ads.exceptions.DataSourceException;
import br.com.ads.exceptions.VendaException;
import br.com.ads.mock.MockVenda;
import br.com.ads.model.validador.venda.ValidadorVenda;
import br.com.ads.model.vendas.Venda;
import java.util.Date;
import java.util.List;

/**
 *
 * @author douglas.sbrito1
 */
public class ServicoVenda {
    //Insere um produto na fonte de dados
    public static void realizarVenda(Venda venda) throws VendaException, DataSourceException {        
        ValidadorVenda.validar(venda);
        try {
            //MockVenda.inserir(venda);
            VendaDAO.criar(venda);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    //Busca todas as vendas realizadas
    public static List<Venda> listarVendas() throws Exception {        
        return VendaDAO.pegaRelatório();        
    }
    
    //Busca todas as vendas realizadas
    public static List<Venda> filtrarVendas(Date de, Date ate) throws Exception {        
        return VendaDAO.pegaRelatório(de, ate);        
    }
}
