# Registro dos prompts da IA — Decorator

A atividade pede que o desenvolvimento com auxílio de IA seja documentado em etapas. Abaixo está o roteiro de prompts correspondente à evolução registrada nos commits.

## Etapa 1 — Identificar a estrutura necessária

**Prompt:**

> Analise o código inicial da prática de Padaria e explique, passo a passo, como aplicar o padrão Decorator sem resolver toda a questão de uma vez. Na primeira etapa, crie somente a abstração necessária para que decoradores possam envolver objetos `Cake` e delegar custo e descrição. Preserve as classes existentes sempre que possível.

**Resultado:** criação de `CakeDecorator`, que armazena o bolo decorado e delega as operações básicas.

## Etapa 2 — Multicamadas

**Prompt:**

> Continue a implementação do padrão Decorator. Agora crie apenas o decorador de bolo multicamadas. Ele deve acrescentar 5 ao custo e colocar `Multi-layered` antes da descrição do bolo recebido. Não altere as classes concretas já existentes.

**Resultado:** criação de `MultiLayeredCake`.

## Etapa 3 — Granulado

**Prompt:**

> Continue a solução. Crie apenas o decorador de granulado. Ele deve acrescentar 2 ao custo e adicionar `with sprinkles` ao final da descrição, mantendo a possibilidade de combinar vários decoradores.

**Resultado:** criação de `SprinklesCake`.

## Etapa 4 — Mensagem

**Prompt:**

> Continue a solução. Crie apenas o decorador de mensagem, que recebe um texto no construtor, não altera o custo e acrescenta `with saying "X"` ao final da descrição do bolo decorado.

**Resultado:** criação de `SayingCake`.

## Etapa 5 — Novo tipo de bolo

**Prompt:**

> Agora acrescente o novo tipo de bolo de morango. Ele deve ser um novo componente concreto, sem exigir alterações nas classes de bolo existentes ou nos decoradores. O custo deve ser o dobro do bolo padrão e a descrição deve ser `Strawberry cake`.

**Resultado:** criação de `StrawberryCake`.

## Etapa 6 — Simulação final

**Prompt:**

> Por fim, altere somente `Main.java` para montar o pedido solicitado no exercício: chocolate; baunilha com `PLAIN!`; baunilha com granulado e `FANCY!`; e morango multicamadas com granulado duplo e as mensagens `One of` e `EVERYTHING`. Use composição de decoradores e imprima a `Order`.

**Resultado:** montagem da simulação final em `Main.java`.

## Ajustes e decisões

- A abstração `CakeDecorator` evita duplicar a referência ao bolo decorado em cada classe de decoração.
- Cada decorador altera apenas o comportamento que lhe pertence e delega o restante ao objeto encapsulado.
- `StrawberryCake` foi criado como novo `Cake`, demonstrando que um novo sabor pode ser adicionado sem modificar os demais sabores ou decoradores.
- Os decoradores podem ser empilhados. Por isso, aplicar `SprinklesCake` duas vezes acrescenta dois granulados e 4 ao custo.
- O item textual menciona `FANCY`, enquanto o exemplo de saída usa `FANCY!`. Foi adotado `FANCY!` para reproduzir o exemplo apresentado no enunciado.
