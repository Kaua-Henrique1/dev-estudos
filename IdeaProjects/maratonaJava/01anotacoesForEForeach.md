## Diferença entre `for` tradicional e `foreach` (enhanced for loop)

| Tipo de `for` | Estrutura | Quando usar | Exemplo |
|---------------|-----------|-------------|---------|
| **For tradicional** | `for (int i = 0; i < array.length; i++) { ... }` | Quando você precisa trabalhar com **índices** (posição do elemento) ou alterar valores diretamente no array. | ```java for (int i = 0; i < salarios.length; i++) { media += salarios[i]; } ``` |
| **Foreach (enhanced for)** | `for (Tipo var : array) { ... }` | Quando você só precisa **percorrer os valores** do array/coleção, sem se importar com a posição. | ```java for (double salario : salarios) { media += salario; } ``` |

### 📌 Resumindo
- **For tradicional** → trabalha com **índices**.
- **Foreach** → trabalha direto com **valores**.  
