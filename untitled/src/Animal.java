public class Animal {

    private String nomeDoAnimal;
    private Float peso;
    private int idade;
    private String nomeDoDono;
    private String endereco;

    public Animal(){
        // construtor default
    }

    public Animal(String nomeDoAnimal, Float peso, int idade, String nomeDoDono, String endereco) {
        this.nomeDoAnimal = nomeDoAnimal;
        this.peso = peso;
        this.idade = idade;
        this.nomeDoDono = nomeDoDono;
        this.endereco = endereco;
    }

    public Animal(String nomeDoAnimal, Float peso){
        this.nomeDoAnimal = nomeDoAnimal;
        this.peso = peso;

    }

    public String getNomeDoAnimal(){
        return nomeDoAnimal;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }

    public String getEndereco() {
        return endereco;
    }
}

