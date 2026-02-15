package academy.devkaua.maratonajava.javacore.ZclassesInternas.test;

public class OuterClassesTest02 {
    private String nome = "Kaua";
    
    static class Nested {
        private String sobrenome = "HEnrique";
        public void print() {
            System.out.println(new OuterClassesTest02().nome + " " + sobrenome);
        }
    }
    
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
