package aplicacao;

public class ListaCidade {
    private Cidade inicio;
    public ListaCidade()
    {

    }

    public void inicializa()
    {
        inicio = null;
    }

    public void inserirCidadeF(String nome)
    {
        Cidade aux, novo = new Cidade(null,nome);
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

    public void ordenarCidade()
    {
        Cidade ant,aux;
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

    public boolean verificaCidade(String cidade)
    {
        Cidade aux = inicio;
        while(aux!=null && aux.getNome().equals(cidade))
            aux = aux.getProx();
        if(aux==null)
            return false;
        return true;
    }

    public void listarCidades()
    {
        Cidade aux = inicio;
        while(aux!=null)
        {
            System.out.println(aux.getNome());
            aux=aux.getProx();
        }
    }
}
