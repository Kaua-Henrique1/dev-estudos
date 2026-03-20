# POLIMORFISMO 

### PARÂMETRO:
>  - A vantagem do Polimorfismo, é que ele pode se reduzir 1 só método para diferentes tipos de objetos.
> 
> Por exemplo: a Class Abstrata Produto, é classe Pai para outras classe Filhas (Tomate e Computador).
> E temos o método 'calcularImposto()', e fazemos ele de forma genérica para ter um código mais limpo
> e facíl de realizar manutenção.  


        public static void calcularaImposto(Produto produto) {
            System.out.println("Relatorio de imposto");
            double imposto = produto.calcularImposto();
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Valor: " + produto.getValor());
            System.out.println("Imposto a ser pago: " + imposto);
        }
- De
### iNSTANCEOF:     

- É uma verificação para aquele parametro genérico é valida.
- Usamos no método/classe que por exemplo precisa realizar algo especifico de algum objeto,
        
        ...
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Data de validade: " + dataValidade);
        }
-
             if (produto instanceof Tomate)
    -  Aqui ele verifica **produto** (genérico) e um objeto do tipo **Tomate**.

              ((Tomate) produto).getDataValidade();
        - Essa sintaxe e basicamente falando "Compilador Java, confia que esse produto e do tipo Tomate."
