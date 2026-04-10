# JUnit 
> É um framework padrão para testes unitários em Java. Ele permite validar se cada pequena parte (unidade) do código está funcionando conforme o esperado.

- Por que usar
  - Segurança na Refatoração: Se alterar algo, o JUnit te avisa em segundos se o comportamento esperado mudou.
  - Feedback Rápido: Não precisa rodar toda a aplicação e clicar em botões para ver se algo funciona. 

---

## Principais Anotações

| Anotação | Momento da Execução | Utilidade Comum |
| :--- | :--- | :--- |
| `@Test` | No método de teste. | Define o que deve ser validado. |
| `@BeforeEach` | Antes de **cada** teste. | Resetar variáveis ou instanciar objetos. |
| `@AfterEach` | Depois de **cada** teste. | Limpar rastros ou fechar conexões. |
| `@BeforeAll` | Uma vez antes de **todos**. | Configurações pesadas (ex: subir banco). |
| `@AfterAll` | Uma vez após **todos**. | Fechamento global de recursos. |
| `@DisplayName` | No método ou classe. | Dá um nome legível ao teste. |

---

```java
    public class PersonServiceTest {
        private Person adult;
        private Person isNotAdult;
        private PersonService personService;
    
        @BeforeEach
        public void setUp() {
            adult = new Person(19);
            isNotAdult = new Person(15);
            personService = new PersonService();
        }
    
        @Test
        public void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
            // E como eu falasse que a eu garato que essa condicao e falsa.
            Assertions.assertFalse(personService.isAdult(isNotAdult));
        }
    
        @Test
        public void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualsThan18() {
            Assertions.assertTrue(personService.isAdult(adult));
        }
    }
```