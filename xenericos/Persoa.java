package xenericos;


public class Persoa {
    private String nome;
    private int edade;

    public Persoa() {
    }

    public Persoa(String nome, int edade) {
        this.nome = nome;
        this.edade = edade;
    }

    public String getNome() {
        return nome;
    }

    public int getEdade() {
        return edade;
    }

    @Override
    public String toString() {
        return  "nome=" + nome + ", edade=" + edade;
    }
    public void Saudar(){
        System.out.println("sauda a Persoa");
    }
    
}
