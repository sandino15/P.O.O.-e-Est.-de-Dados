public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public double media(){
        media = (nota1 + nota2 + nota3)/3;
    if(this.media >= 7){
        System.out.println("você esta aprovado");
    }
    else if(this.media <7){
        System.out.println("você esta reprovado");
    }
    return media;
}
    
    public void imprimir(){
        System.out.println("Eu sou o aluno:" + this.nome + " e a minha matricula é:" + matricula + " minha primeira nota foi:" + nota1 + " minha segunda nota foi:" + nota2 + " minha terceira nota foi:" + nota3 + " minha media então é:" + media);

    }

}
