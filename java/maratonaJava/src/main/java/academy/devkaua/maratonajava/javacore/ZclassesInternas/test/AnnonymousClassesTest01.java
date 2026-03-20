package academy.devkaua.maratonajava.javacore.ZclassesInternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal Andando");
    }
}
class Cachorro extends Animal {
    @Override
    public void walk() {
        System.out.println("CAchorro andando");
    }
}
// Sao classes que vao exister por um determinado tempo de codigo e nao deve ser utilizado em lugar
public class AnnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Andando pelo vale anonimo.");
            }
        };
    }
}
