public class Paciente {
    
    private String nome;
    private String cpf;
    private String dataNasc;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String c){
        this.cpf = c;
    }

    public String getDataNasc(){
        return this.dataNasc;
    }

    public void setData(String dN){
        this.dataNasc = dN;
    }

    Paciente(String  n, String cpf, String i){
        this.nome = n;
        this.cpf = cpf;
        this.dataNasc = i;
    }

}
