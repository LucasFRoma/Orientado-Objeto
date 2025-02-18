public class Aluno {

    int rm;
    String nome;
    double nota1;
    double nota2;

    public double media(){
        return (nota1+nota2)/2;
    }

    public String status(){
        if (media()>=6){
            return "APROVADO";
        }else if (media()<6&&media()>=4){
            return "EXAME";
        }
        return "REPROVADO";
    }





}
