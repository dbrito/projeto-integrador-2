package br.com.ads.model.produtos;

//Classe de negócio de quarto
public class Produto {

    //Atributos
    private Integer id;
    private Long numero;
    private Long andar;
    private String tipo;

    
    //Métodos de acesso
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {    
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Long getAndar() {
        return andar;
    }

    public void setAndar(Long andar) {
        this.andar = andar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
