package br.com.ads.model.produtos;

//Classe de negócio de quarto
public class Produto {

    //Atributos
    private Integer codigo;
    private String nome;
    private String marca;
    private double preço;
    private int quantidade;
    private String categoria;
    private String descrição;

    
    //Métodos de acesso

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPoreço() {
        return preço;
    }

    public void setPoreço(double poreço) {
        this.preço = poreço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
   
}
