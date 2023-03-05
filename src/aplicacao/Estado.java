package aplicacao;



public class Estado {
    private Estado prox;
    private ListaCidade prim;
    private String nome;
    public Estado(Estado prox, ListaCidade prim, String nome)
    {
        this.prox = prox;
        this.prim = prim;
        this.nome = nome;
    }

    public Estado getProx() {
        return prox;
    }
    public void setProx(Estado prox) {
        this.prox = prox;
    }

    public ListaCidade getPrim() {
        return prim;
    }
    public void setPrim(ListaCidade prim) {
        this.prim = prim;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
