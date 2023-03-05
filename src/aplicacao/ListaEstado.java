package aplicacao;

public class ListaEstado {
    private Estado inicio;
    public ListaEstado(){

    }
    public void inicializa()
    {
        inicio = null;
    }

    public Estado buscaEstado(String nome)
    {
        Estado aux;
        aux = inicio;
        while(aux!=null && !aux.getNome().equals(nome))
            aux=aux.getProx();
        if(aux==null)
            return null;
        return aux;
    }

    public void inserirEstadoF(String estado)
    {
        ListaCidade inicid = new ListaCidade();
        Estado aux,novo = new Estado(null,inicid,estado);
        if(inicio==null)
            inicio = novo;
        else
        {
            aux = inicio;
            while(aux.getProx()!=null)
                aux = aux.getProx();
            aux.setProx(novo);
        }
    }

    public void ordenarEstado()
    {
        Estado ant,aux;
        String troca;
        if(inicio==null)
            System.out.println("Lista vazia");
        else
        {
            ant = inicio;
            aux = ant.getProx();
            while(ant.getProx()!=null)
            {
                while(aux!=null)
                {
                    if(aux.getNome().compareTo(ant.getNome())<0)
                    {
                        troca = aux.getNome();
                        aux.setNome(ant.getNome());
                        ant.setNome(troca);
                    }
                    aux = aux.getProx();
                }
                ant = ant.getProx();
                aux = ant.getProx();
            }
        }
    }

    public boolean verificaEstadoCidade(String estado, String cidade)
    {
        Estado aux = inicio;
        while(aux!=null && !aux.getNome().equals(estado))
            aux = aux.getProx();
        if(aux!=null && aux.getPrim().verificaCidade(cidade))
            return true;
        return false;
    }

    public Estado getInicio() {
        return inicio;
    }

    public void setInicio(Estado inicio) {
        this.inicio = inicio;
    }
}
