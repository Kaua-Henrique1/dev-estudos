# Anotações da Maratona Java

---

## **Acomplamento**
- O que é acoplamento?
    - É o grau de dependência entre duas classes, módulos ou partes do sistema.
      - Se uma classe depende muito da outra → Alto acoplamento
      - Se uma classe depende pouco ou nada da outra → Baixo acoplamento
      - **Alto acomplamento é ruim.**


### Modificador de acesso private

-     public class FuncionarioExercise {
        private double media;
-     public double getMedia() {
        return media; }

  
  - Retirando o setMedia... Nao e possivel modificar a media, so se mudar na propria classe, assim deixando mais seguro.