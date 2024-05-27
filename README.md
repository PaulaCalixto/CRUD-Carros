# API de Cadastro de Carros
## Visão Geral
Esta aplicação é uma API para cadastro de carros, construída utilizando Java para o backend e Angular para o frontend. A API permite realizar operações CRUD (Create, Read, Update, Delete) para carros, cores e marcas. Este documento fornece uma visão geral da estrutura do projeto, configuração e instruções de uso.

## Estrutura do Projeto
### Backend (Java)
Framework: Spring Boot
Banco de Dados: H2 (ou outro banco de sua escolha)
Dependências: Spring Web, Spring Data JPA, H2 Database
### Frontend (Angular)
Framework: Angular
Estilo: Bootstrap
Comunicação com a API: HttpClient
## Funcionalidades
### Carros
Cadastrar Carro: Adiciona um novo carro ao sistema.
Listar Carros: Exibe todos os carros cadastrados.
Atualizar Carro: Atualiza as informações de um carro existente.
Excluir Carro: Remove um carro do sistema.
### Cores
Adicionar Cor: Adiciona uma nova cor à lista de cores disponíveis.
Listar Cores: Exibe todas as cores cadastradas.
### Marcas
Adicionar Marca: Adiciona uma nova marca à lista de marcas disponíveis.
Listar Marcas: Exibe todas as marcas cadastradas.
## Pré-requisitos
Java 11+
Maven
Node.js e npm
Angular CLI

## Configuração do Ambiente
### Backend
#### Clone o repositório:

git clone <URL-do-repositorio>
cd <nome-do-repositorio>/backend

#### Compile e execute a aplicação:

mvn clean install
mvn spring-boot:run

#### A aplicação estará disponível em http://localhost:8080.

### Frontend

#### Clone o repositório:

git clone <URL-do-repositorio>
cd <nome-do-repositorio>/frontend

#### Instale as dependências:

npm install

#### Execute a aplicação Angular:

ng serve

#### A aplicação estará disponível em http://localhost:4200.

## Estrutura do Código
### Backend
Controller: Contém os endpoints da API.
Service: Contém a lógica de negócios.
Repository: Interface para comunicação com o banco de dados.
Model: Contém as classes de entidade JPA.

### Frontend
Componentes:
CadastroCarroComponent: Formulário para cadastro de carros.
ListaCarrosComponent: Lista de carros cadastrados.
Services:
CarroService: Serviço para comunicação com a API de carros.
CorService: Serviço para comunicação com a API de cores.
MarcaService: Serviço para comunicação com a API de marcas.
Models:
Carro: Modelo de dados para carros.
Cor: Modelo de dados para cores.
Marca: Modelo de dados para marcas.

## Exemplo de Uso
### Cadastro de Carro
Acesse http://localhost:4200.
Clique em "Cadastrar".
Preencha os campos do formulário:
Nome do Carro
Ano de Fabricação
Ano do Modelo
Modelo
Marca
Adicione cores
Clique em "Cadastrar".

### Listagem de Carros
Acesse http://localhost:4200.
Clique em "Exibir lista".
A lista de carros cadastrados será exibida.
### Atualização de Carro
Na lista de carros, clique no ícone de lápis ao lado do carro que deseja atualizar.
Atualize as informações desejadas.
Confirme a atualização.
