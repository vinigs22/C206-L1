public class Main {

    public static void main(String[] args) {

        Empresa viniEmpresa = new Empresa("Vini", "1213");


        Contato contato1 = new Contato("Vinicius", "viniciusgsimoni@gmail.com", "35984083409", "04/12/2003");
        Contato contato2 = new Contato("Aplexy", "aplexy22@gmail.com", "35984080808", "19/06/2002");

        viniEmpresa.addContato(contato1);
        viniEmpresa.addContato(contato2);

        viniEmpresa.exibirInfos();

    }

}
