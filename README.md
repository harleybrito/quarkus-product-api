# Quarkus Order API

## Descrição
**Quarkus Order API** é uma aplicação desenvolvida com o framework Quarkus, projetada para gerenciar pedidos de forma eficiente e escalável. A API oferece endpoints para criar, ler, atualizar e deletar dados de pedidos, garantindo alta performance e baixa latência.

## Tecnologias Utilizadas
- **Quarkus**: Framework Java nativo na nuvem.
- **RESTEasy Jackson**: Extensão para suporte a JSON com Jackson.
- **Hibernate ORM com Panache**: Framework de mapeamento objeto-relacional simplificado.
- **JDBC PostgreSQL**: Conector JDBC para PostgreSQL.
- **CDI (Contexts and Dependency Injection)**: Implementação de injeção de dependência.
- **SmallRye OpenAPI**: Implementação de OpenAPI para documentar a API.
- **Docker**: Suporte a criação de imagens de contêiner com Quarkus.
- **OIDC**: Suporte para OpenID Connect, usado para autenticação.
- **Keycloak Authorization**: Integração com Keycloak para autorização baseada em RBAC.
- **JUnit 5**: Framework de testes para Java.
- **Lombok**: Biblioteca para reduzir a verbosidade do código Java.

## Requisitos
- **Java 22+**
- **Maven 3.6.3+**
- **Docker** (opcional, para execução em contêiner)

## Instalação
1. Clone o repositório:
    ```sh
    git clone https://github.com/seu-usuario/quarkus-order-api.git
    cd quarkus-order-api
    ```

2. Compile e execute a aplicação:
    ```sh
    ./mvnw compile quarkus:dev
    ```

## Endpoints
A API oferece os seguintes endpoints:

- **GET /orders**: Retorna a lista de todos os pedidos.
- **POST /orders**: Cria um novo pedido.
- **DELETE /orders/{id}**: Deleta um pedido.

## Configuração
As configurações da aplicação podem ser ajustadas no arquivo `application.properties`.
