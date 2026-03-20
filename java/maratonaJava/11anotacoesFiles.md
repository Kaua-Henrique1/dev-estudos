# FILE:

> Preica fazer o tratamento de erro ao importar alguma biblioteca de file.
> Para que uma classe possa ser usada dentro dos parênteses do try,
> ela precisa implementar a interface AutoCloseable.
- Faz a verificacao do if (exists) para poder rodar os metodos:

        public static void main(String[] args) {
            File file = new File("file.txt");
            try {
                boolean isCreated = file.createNewFile();
                System.out.println(isCreated);
                boolean exists = file.exists();
- 
                if (exists) {
                    System.out.println("deleted: "+ file.delete());
                    ...
                    System.out.println("Data de modificacao: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

## FileReader

> O Java retorna int para uma questao de espaços. Ele usa o intervalo de 0 a 65535 para os caracteres e reserva o -1 para ser o sinal de parada. 

- Quando o método read() é chamado, ele tenta "pescar" o próximo caractere dentro do arquivo. Se o balde voltar vazio (não há mais nada para ler), o Java retorna -1.
- Por isso que deve colocar '!= -1' na condicao de repeticao do while.

        public static void main(String[] args) {
            File file = new File("text.txt");
            // Dessa forma o Java se encarrega de fechar assim que terminar e afins
            try (FileReader fr = new FileReader(file)) {
                int i;
                while ((i= fr.read()) != -1) {
                    System.out.print((char)i);
                }
        }

## FileWriter
> Mais baixo nivel, ele escreve dentro do metodo de forma arcaica


             File file = new File("text.txt");
            try (FileReader fr = new FileReader(file)) {
- Dessa forma o Java se encarrega de fechar assim que terminar e afins

            int i;
            while ((i= fr.read()) != -1) {
            System.out.print((char)i);
- O método retorna um int, por isso deve fazer o cache para o char.          
        } 

### OBS: Se pretende usar arquivos muitos grandes, usem as CLASSES abaixo:

## BufferedWriter
> A sintaxe e igual a do FileWriter.
- Tem o metodo adicional de criar uma nova linha.
- E encapsula a Classe FileWriter

        FileWriter fw = new FileWriter(file, true);
    
Ela encapsula o metodo FileWriter.

        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write("Dia 3 janeiro, mudando o mundo para sempre.");
        bw.newLine();
        bw.flush();

## BufferedReader
> Igual a class FileReader mas ele imprimi a linha inteira
>  Tambem usa o encapsulamento igual ao BufferedWriter

        File file = new File("text.txt");
        try (FileReader fr = new FileReader(file)) {
            BufferedReader br = new BufferedReader(fr);
            String linha;

            // Ele imprimi a linha inteira
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }