# 🚲 BikeCare API

Uma API Backend robusta para gestão de manutenções de bicicletas, focada em performance e integridade de dados.

##  Tecnologias e Conceitos Aplicados
* **Java 17 & Spring Boot 3**: Base da aplicação.
* **Spring Data JPA**: Persistência de dados e mapeamento ORM.
* **H2 Database**: Banco de dados em memória para testes rápidos.
* **SOLID (SRP)**: Separação clara de responsabilidades entre Controller, Service e Repository.
* **Clean Code**: Variáveis expressivas e métodos com responsabilidade única.

##  Regras de Negócio Implementadas
- [x] **Validação de Quilometragem**: O sistema impede o cadastro de bicicletas com quilometragem negativa, garantindo a consistência do banco de dados.

##  Como Executar
1. Clone o repositório.
2. Certifique-se de ter o **Java 17** instalado.
3. Rode o projeto via sua IDE favorita ou pelo terminal com `./mvnw spring-boot:run`.
4. A API estará disponível em `http://localhost:8080/bicicletas`.

---
*Projeto desenvolvido como parte do meu portfólio de Engenharia de Software.*