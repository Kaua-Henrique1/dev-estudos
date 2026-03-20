# Interface: 

- Um contrato(regras) que a classe deve obedecer.

        public interface DataLoader {
            public static final int MAX_DATA_SIZE = 10;
            public abstract void loid();
            default void checkPermission() {
                System.out.println("Verificando Permissoes");
            }

            public static void retrieveMaxDataSize() {
                System.out.println("Dentro do retrieveMaxDataSize na interface");
            }
        }