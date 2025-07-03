# Projeto: Car Management com JPA + Hibernate
Este projeto Java demonstra operações básicas de CRUD para cadastro e gerenciamento de veículos utilizando JPA com Hibernate e banco de dados em memória (H2).

# ⚙️ Tecnologias utilizadas
- Java 16
- Maven
- Hibernate ORM
- JPA (Java Persistence API)
- H2 Database (em memória)

### 📁 Estrutura: 
`Car`: entidade JPA representando o veículo. <br>
`CarDao`: classe DAO com métodos de CRUD. <br>
`DataLoading`: popula o banco com dados iniciais. <br>
`CarService`: classe principal que executa operações CRUD. <br>
`JPAUtil`: utilitário para criar `EntityManager`. <br>

🚀 Executando
Basta executar `CarService.java`. O projeto cria e manipula registros de veículos em um banco H2 em memória, exibindo os resultados no console.
