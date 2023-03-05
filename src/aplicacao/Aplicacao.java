package aplicacao;

import java.util.Scanner;

public class Aplicacao{


    public static void inserindoEstados(ListaEstado lestado,String str, Scanner scanner){
        System.out.println("Digite os estados [0 para parar]");
        str = scanner.nextLine();
        while(!str.equals("0"))
        {
            lestado.inserirEstadoF(str);
            System.out.println("Digite os estados [0 para parar]");
            str = scanner.nextLine();
        }
    }

    public static void inserindoCidades(ListaEstado lestado, String str, String cidade, Scanner scanner){
        Estado aux;
        System.out.println("Digite o estado que deseja colocar a cidade [0 para parar]");
        str = scanner.nextLine();
        while(!str.equals("0"))
        {
            aux = lestado.buscaEstado(str);
            if(aux!=null){
                System.out.println("Digite a cidade que deseja colocar no estado [0 para parar]");
                cidade = scanner.nextLine();
                while(!cidade.equals("0"))
                {
                    aux.getPrim().inserirCidadeF(cidade);
                    System.out.println("Digite a cidade que deseja colocar no estado [0 para parar]");
                    cidade = scanner.nextLine();
                }
            }
            System.out.println("Digite o estado que deseja colocar a cidade [0 para parar]");
            str = scanner.nextLine();
        }
    }

    public static void listandoCidades(ListaEstado lestado, String str,Scanner scanner){
        Estado aux;
        System.out.println("Digite o estado que deseja listar as cidades[0 para parar]");
        str = scanner.nextLine();
        while(!str.equals("0"))
        {
            aux = lestado.buscaEstado(str);
            aux.getPrim().listarCidades();
            System.out.println("Digite o estado que deseja listar as cidades[0 para parar]");
            str = scanner.nextLine();
        }
    }

    public static void ordenandoCidades(ListaEstado lestado, String str, Scanner scanner)
    {
        Estado aux;
        System.out.println("Digite o estado que deseja ordenar[0 para parar]");
        str = scanner.nextLine();
        while(!str.equals("0"))
        {
            aux = lestado.buscaEstado(str);
            aux.getPrim().ordenarCidade();
            System.out.println("Digite o estado que deseja ordenar[0 para parar]");
            str = scanner.nextLine();
        }
    }

    public static void verificandoEstadoCidade(ListaEstado lestado, Scanner scanner){
        String estado,cidade;
        Estado aux;
        System.out.println("Digite o estado que deseja checar");
        estado = scanner.nextLine();
        System.out.println("Digite a cidade que deseja checar");
        cidade = scanner.nextLine();
        if(lestado.verificaEstadoCidade(estado, cidade))
        {
            System.out.println("Este estado e esta cidade estão dentro da lista");
        }
        else{
            System.out.println("Uma cidade ou um estado não está inserido");
        }
    }
    public static void main(String[] args) {
        ListaEstado lestado = new ListaEstado();
        String str = new String(),cidade = new String();
        lestado.inicializa();
        Scanner scanner = new Scanner(System.in);
        inserindoEstados(lestado, str, scanner);
        inserindoCidades(lestado, str, cidade, scanner);
        listandoCidades(lestado, str, scanner);
        ordenandoCidades(lestado,str,scanner);
        listandoCidades(lestado, str, scanner);
        verificandoEstadoCidade(lestado,scanner);
    }

    
}
