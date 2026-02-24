## 1. `equals()` e `hashCode()`
São métodos da classe `Object` usados pelas coleções para comparar e organizar elementos.
* **`equals()`:** Compara se o *conteúdo/estado* de dois objetos é igual.
* **`hashCode()`:** Gera um código numérico de identificação rápida para o objeto. 
- **Exemplo**: Imagine uma lista de 1.000.000 de objetos, se categoriza eles em grupos, por exemplo, por quantidade de letras no nome.
  - {Kauã, Kauê, Luan} = 4 letras.
> O hashCode() faz uma lista deles, e deixa dentro da lista inteira de nomes.

> Quando procurar por 'Kauã', vai entrar direto no grupo de 4 letras.

> Aí usa o equals() para verificar se o objeto é igual ao parâmetro.

* **Sempre se usa os dois juntos.** Se sobrescrever o `equals()`, **deve** sobrescrever o `hashCode()`.

### SINTAXE:
```java
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;

        // Aqui ele verifica se o obj é um telefone, onde ele pega o "DNA" da class this.getClass() (Smartphone) e compara se é diferente do "DNA" do obj.
        if (this.getClass() != obj.getClass() ) return false;
        // Aqui como temos certeza, falo para o java confia que o objeto e Smartphone e pego o valor do objeto.
        Smartphone smartphone = (Smartphone) obj;

        // Faço a comparação para ver se o objeto é o mesmo objeto (Aqui tem a regra de negócio onde verificamos apenas o
        // serialNumber para saber se duas instância representa mesmo objeto
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // Ler ternário: (condition) '?' (Se for verdadeiro faça) ':' (se nao faça);
    @Override
    public int hashCode() {
        return serialNumber == null ? 0: this.serialNumber.hashCode();
    }
```
---
## PRINCIPAIS INTERFACES: 

### `List` / `ArrayList`
* **Como funciona:** Mantém a ordem de inserção e **aceita** elementos repetidos.
* **Uso no dia dia:** É o padrão para quase tudo. Usado para armazenar retornos de banco de dados, listas de objetos a serem processados, etc.

### `Map` / `HashMap` 
* **Como funciona:** Trabalha com dicionários de **Chave e Valor**. A chave é única, o valor pode se repetir. Buscas são instantâneas.
* **Uso no dia dia:** Cruzamento de dados e buscas rápidas em memória.
* *Exemplo:* Em vez de varrer uma lista gigante para achar um cliente, você cria um mapa indexado pelo ID e busca direto com `mapa.get(10L)`. Evita laços (`for`) aninhados.

### 🥉 3º Lugar: `Set` / `HashSet`
* **Como funciona:** **Não aceita** elementos duplicados. Na maioria das vezes, não mantém a ordem.
* **Uso no dia dia:** Remoção rápida de duplicatas.
* *Exemplo:* Extrair apenas os IDs únicos de clientes de dentro de uma lista com milhares de transações financeiras.

---
# Principais Métodos:

## 1. Interface List (Ex: ArrayList)
* `add(E e)`: Adiciona um elemento ao final da lista.
* `get(int index)`: Retorna o elemento na posição específica.
* `remove(int index)`: Remove o elemento de uma posição.
* `size()`: Retorna o número de elementos.
* `contains(Object o)`: Verifica se o item existe na lista.

## 2. Interface Set (Ex: HashSet)
* `add(E e)`: Adiciona se o elemento ainda não existir (retorna false se for duplicado).
* `remove(Object o)`: Remove o elemento específico.
* `contains(Object o)`: Muito rápido para verificar existência.
* `clear()`: Remove todos os elementos.

## 3. Interface Map (Ex: HashMap)
* `put(K key, V value)`: Insere ou atualiza um par chave-valor.
* `get(Object key)`: Retorna o valor associado à chave.
* `containsKey(Object key)`: Verifica se a chave existe.
* `keySet()`: Retorna um Set com todas as chaves.
* `values()`: Retorna uma Collection com todos os valores.

## 4. Métodos de Object (Base)
* `equals(Object obj)`: Compara o conteúdo dos objetos.
* `hashCode()`: Gera o índice numérico para busca rápida (o "grupo/gaveta").