![Descrição do desafio apresentado no repositório](/img/desafio-funcionario.jpg)

# Aplicação dos Princípios SOLID em Java: Desafio salário do funcionário.

Este repositório contém minha solução para o desafio, utilizando os princípios SOLID. Abaixo estão os princípios SOLID aplicados ao projeto:

## Princípio da Responsabilidade Única (SRP)

Criei duas classes principais: `Funcionário` e `Cargo`, onde cada uma tem uma única responsabilidade clara. A classe `Funcionário` lida com informações individuais de cada funcionário, como nome e salário, enquanto a classe `Cargo` define diferentes tipos de cargos e as porcentagens de bônus associadas.

## Princípio Aberto-Fechado (OCP)

Também foi implementado o Princípio Aberto-Fechado ao projetar nossas classes para serem extensíveis sem a necessidade de modificação. Por exemplo, ao adicionar novos tipos de cargo ou ajustar as porcentagens de bônus, criamos novos elementos no enum `Cargo` e implementamos os cálculos correspondentes sem impactar as implementações existentes.

Desse modo, ao separar a lógica de cálculo de bônus para cada tipo de cargo, o código se torna mais flexível e fácil de manter. Agora é possível adicionar novos tipos de cargos ou ajustar as políticas de bônus sem perturbar outras partes do sistema.

## Exemplos Concretos

Aqui estão alguns exemplos concretos de como o Princípio Aberto-Fechado foi aplicado:

- Adição de um novo tipo de cargo: Implementei uma nova enumeração em `Cargo` e defini a lógica de cálculo de bônus correspondente. Isso não exigiu alterações nas classes existentes.
- Ajuste das porcentagens de bônus: Atualizei as porcentagens de bônus em uma enumeração existente, mantendo o código de `Funcionário` inalterado.

## Benefícios dos Princípios SOLID

Ao seguir os princípios SOLID, obtive os seguintes benefícios:

- **Flexibilidade:** O código se tornou mais flexível para acomodar mudanças futuras nos tipos de cargo e nas políticas de bônus.
- **Fácil Manutenção:** A separação das responsabilidades facilitou a manutenção do código, tornando as alterações mais seguras e eficientes.
- **Testabilidade:** A lógica de cálculo de bônus pode ser testada de forma isolada, contribuindo para uma cobertura de testes mais completa.

Sintam-se à vontade para explorar o código e desenvolver sua solução. 

Agradeço por conferir o meu trabalho e espero que essa solução possa ser útil como exemplo de aplicação dos princípios SOLID.








