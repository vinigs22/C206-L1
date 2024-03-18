public class Empresa {

    String cnpj;
    String enderaco;
    Contato[] contatos = new Contato[5];

    public Empresa(String cnpj, String enderaco) {
        this.cnpj = cnpj;
        this.enderaco = enderaco;
        }

    void addContato(Contato contato){
        for (int i = 0; i < contatos.length; i++) {
            if ( this.contatos[i] == null){
                this.contatos[i] = contato;
                return;
            }
        }
    }



    void exibirInfos(){
        for(Contato contato: this.contatos){
            if (contato != null){
                System.out.println("Nome: " + contato.nome);
                System.out.println("Email: " + contato.email);
                System.out.println("Telefone: " + contato.telefone);
                System.out.println("Data Nascimento: " + contato.dataNascimento);
                System.out.println();
            }
        }
    }

}
