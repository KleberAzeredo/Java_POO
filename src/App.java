public class App {
    public static void main(String[] args) throws Exception {

        Paciente pac1 = new Paciente(" Getulio", "12545515311", "14/02/1993");

        Especialidade esp1 = new Especialidade("Clinico geral");

        Médico med1 = new Médico("Dr. Radamel", "15424565", esp1);

        Consulta Cons = new Consulta();

        Cons.consulta();

        Cons.agendarConsulta(pac1, med1, "13/08/2023", "13:00");

        System.out.println(Cons.mostrarAgendamento());

    }
}
