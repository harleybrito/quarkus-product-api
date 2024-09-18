
# Quarkus Product API

## Descrição
**Quarkus Product API** é uma aplicação desenvolvida com o framework Quarkus, projetada para gerenciar informações de produtos de forma eficiente e escalável. A API oferece endpoints para criar, ler, atualizar e deletar dados de produtos, garantindo alta performance e baixa latência.

## Tecnologias Utilizadas
- **Quarkus**: Framework Java nativo na nuvem.
- **RESTEasy Jackson**: Extensão para suporte a JSON com Jackson.
- **Hibernate ORM com Panache**: Framework de mapeamento objeto-relacional simplificado.
- **JDBC PostgreSQL**: Conector JDBC para PostgreSQL.
- **CDI (Contexts and Dependency Injection)**: Implementação de injeção de dependência.
- **SmallRye OpenAPI**: Implementação de OpenAPI para documentar a API.
- **JUnit 5**: Framework de testes para Java.
- **REST Assured**: Biblioteca para testes de serviços REST.
- **Lombok**: Biblioteca para reduzir a verbosidade do código Java.

## Requisitos
- **Java 22+**
- **Maven 3.6.3+**
- **Docker** (opcional, para execução em contêiner)

## Instalação
1. Clone o repositório:
    ```sh
    git clone https://github.com/seu-usuario/quarkus-product-api.git
    cd quarkus-product-api
    ```

2. Compile e execute a aplicação:
    ```sh
    ./mvnw compile quarkus:dev
    ```

## Endpoints
A API oferece os seguintes endpoints:

- **GET /products**: Retorna a lista de todos os produtos.
- **POST /products**: Cria um novo produto.
- **PUT /products/{id}**: Atualiza as informações de um produto existente.
- **DELETE /products/{id}**: Deleta um produto.

## Configuração
As configurações da aplicação podem ser ajustadas no arquivo `application.properties`.
