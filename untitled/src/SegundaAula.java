public class SegundaAula {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setNomeDoAnimal("Rex");
        animal.setIdade(3);
        animal.setPeso(12.5F);
        animal.setNomeDoDono("Andrea");
        animal.setEndereco("Rua X, 123");

        System.out.println("Nome: "+animal.getNomeDoAnimal());
        System.out.println("Idade: "+animal.getIdade());
        System.out.println("Peso :"+animal.getPeso());
    }
}
