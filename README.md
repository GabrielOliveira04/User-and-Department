# Projeto de Gerenciamento de Usuários e Departamentos
### Project Using java and Spring framework where I register the user and their specific department
  
  Este projeto Java utiliza o framework Spring e o banco de dados H2 para criar uma aplicação de gerenciamento de usuários e departamentos.
  A aplicação segue a arquitetura RESTful e fornece endpoints para realizar operações CRUD (Create, Read, Update, Delete) em usuários.  

## Tecnologias Utilizadas
    Java
    Spring Framework (Spring Boot, Spring Data JPA)
    Banco de Dados H2
    Postman (para testar as requisições)
    
## Configuração do Projeto

    Clone o repositório para a sua máquina local.
    Importe o projeto no IntelliJ IDEA (ou na sua IDE de preferência) como um projeto Maven existente.
    Verifique as configurações do banco de dados H2 no arquivo application.properties.
    Execute o script SQL fornecido no arquivo data.sql para popular o banco de dados com alguns dados iniciais.

## Funcionalidades

    A aplicação fornece os seguintes endpoints para manipulação dos usuários:

    GET /users/all: Retorna uma lista com todos os usuários cadastrados.
    GET /users/{id}: Retorna um usuário específico com base no ID informado.
    POST /users: Cria um novo usuário com base nos dados fornecidos no corpo da requisição.


## Como Testar

    Inicie a aplicação em sua IDE.
    Utilize o Postman (ou outra ferramenta similar) para enviar as requisições HTTP para os endpoints mencionados acima.
    Verifique as respostas e os resultados obtidos.
    
## Observações

    A aplicação utiliza o banco de dados H2 em memória, o que significa que os dados serão perdidos quando a aplicação for encerrada. 
    Para persistir os dados, você pode configurar um banco de dados diferente no arquivo application.properties.
    O projeto está configurado para exibir o SQL gerado pelo Spring Data JPA no console, o que pode ser útil para depuração e entendimento das consultas executadas.    
    
## Sobre o Autor

Sou um desenvolvedor Java em busca de oportunidades de trabalho como desenvolvedor Júnior ou em estágio.
Tenho experiência no desenvolvimento de aplicações Java utilizando frameworks como Spring e Hibernate, 
além de conhecimentos em bancos de dados relacionais. Estou entusiasmado para aplicar meu conhecimento em novos projetos e contribuir para o sucesso de uma empresa. 
Entre em contato comigo se você estiver interessado em discutir oportunidades de trabalho ou projetos colaborativos.

LinkedIn: https://www.linkedin.com/in/gabriel-de-oliveira-pontes-131288246/
    
