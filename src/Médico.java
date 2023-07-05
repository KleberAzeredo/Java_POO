public class Médico {

    private String nome;
    private String crm;
    private Especialidade especialidade;


    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getCrm(){
        return this.crm;
    }

    public void setCrm(String cR){
        this.crm = cR;
    }

    public Especialidade getEspecialidade(){
        return this.especialidade;
    }

    public void setEspecialidade(Especialidade esp){
        this.especialidade = esp;
    }


    Médico(String n, String crm, Especialidade esp){
        this.nome = n;
        this.crm = crm;
        this.especialidade = esp;
    }
    
}
