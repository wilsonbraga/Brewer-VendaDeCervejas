# Brewer-VendaDeCervejas
Sistema de Venda de cervejas responsivo, se adaptar as varios tipos de telas de Celulares e tablets,  tem como papel agilizar as consultas na base de dados bem como fazer as impressões de Arquivos PDF, Upload de imagens no Amazon S3,  busca com gráficos as vendas efetuadas nos ultimos 6 mêses faz orçamento e manda por e-mail para uma compra futura.

## Índice
* [Introdução](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#brewer---venda-de-cervejas)
* [1. Diagrama de Classe](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#1-diagrama-de-classe)
* [2. Diagrama E-R - Modelo de banco de dados](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#2-diagrama-e-r---modelo-de-banco-de-dados)
* [3. Tecnologias Utilizadas](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#3-tecnologias-utilizadas)
* [4. Interface do sistema](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#4-interface-do-sistema)
  * [4.1 Login](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#41-login)
    * [4.1.1 Erro ao logar](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#411-erro-ao-logar)
  * [4.2 Tela Inicial](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#42-tela-inicial)
  * [4.3 Menu Lateral](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43-menu-lateral)
    * [4.3.1 Dashboard](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#431-dashboard)
    * [4.3.2 Vendas](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#432-vendas)
      * [4.3.2.1 Cadastro de venda](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#4321-cadastro-de-venda)
      * [4.3.2.2 Pesquisa de vendas](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#4322-pesquisa-de-vendas)
    * [4.3.3 Estoque](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#433-estoque)
      * [4.3.3.1 Estilo](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#4331-estilo)
        * [4.3.3.1.1 Edição de estilo](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43311-edi%C3%A7%C3%A3o-de-estilo)
        * [4.3.3.1.2 Exclusão de estilo](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43312-exclus%C3%A3o-de-estilo)
        * [4.3.3.1.3 Cadastro de estilo](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43313-cadastro-de-estilo)
      * [4.3.3.2 Cervejas](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#4332-cervejas)
        * [4.3.3.2.1 Edição de cerveja](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43321-edi%C3%A7%C3%A3o-de-cerveja)
        * [4.3.3.2.2 Exclusão de cerveja](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43322-exclus%C3%A3o-de-cerveja)
        * [4.3.3.2.3 Cadastro de cerveja](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43323-cadastro-de-cerveja)
    * [4.3.4 Cadastro](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#434-cadastro)
      * [4.3.4.1 Cidades](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#4341-cidades)
        * [4.3.4.1.1 Edição de cidade](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43411-edi%C3%A7%C3%A3o-de-cidade)
        * [4.3.4.1.2 Exclusão de cidade](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43412-exclus%C3%A3o-de-cidade)
        * [4.3.4.1.3 Cadastro de cidade](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43413-cadastro-de-cidade)
      * [4.3.4.2 Clientes](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#4342-clientes)
        * [4.3.4.2.1 Edição de cliente](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43421-edi%C3%A7%C3%A3o-de-cliente)
        * [4.3.4.2.2 Exclusão de cliente](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43422-exclus%C3%A3o-de-cliente)
        * [4.3.4.2.3 Cadastro de cidade](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43423-cadastro-de-cidade)
      * [4.3.4.3 Usuários](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#4343-usu%C3%A1rios)
        * [4.3.4.3.1 Edição de usuário](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43431-edi%C3%A7%C3%A3o-de-usu%C3%A1rio)
        * [4.3.4.3.2 Exclusão de usuário](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43432-exclus%C3%A3o-de-usu%C3%A1rio)
        * [4.3.4.3.3 Cadastro de usuário](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#43433-cadastro-de-usu%C3%A1rio)
    * [4.3.5 Relatórios](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#435-relat%C3%B3rios)
      * [4.3.5.1 Vendas emitidas](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#4351-vendas-emitidas)
  * [4.4 Telas de informações](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#44-telas-de-informa%C3%A7%C3%B5es)
    * [4.4.1 Acesso negado](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#441--acesso-negado)
    * [4.4.2 Página não encontrada](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#442--p%C3%A1gina-n%C3%A3o-encontrada)
    * [4.4.3 Página de erro no servidor](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#443--p%C3%A1gina-de-erro-no-servidor)
    * [4.4.4 Página de sessão expirada](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#444--p%C3%A1gina-de-sess%C3%A3o-expirada)
  * [4.5 Responsividade](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#45-responsividade)
  * [4.6 Internacionalização](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#46-internacionaliza%C3%A7%C3%A3o)
* [5 Segurança](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#5-seguran%C3%A7a)
  * [5.1 Autenticação](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#51-autentica%C3%A7%C3%A3o)
    * [5.1.1 BCrypt](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#511--bcrypt)
  * [5.2 Autorização](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#52-autoriza%C3%A7%C3%A3o)
  * [5.3 Cross-Site Request Forgery (CSRF)](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#53-cross-site-request-forgery-csrf)
  * [5.4 Expiração de múltiplos login](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#54-expira%C3%A7%C3%A3o-de-m%C3%BAltiplos-login)
  * [5.5 Duração de sessão](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#55-dura%C3%A7%C3%A3o-de-sess%C3%A3o)
  * [5.6 SQL Injection](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#56-sql-injection)
  * [5.7 Validação de formulário](https://github.com/wilsonbraga/Brewer-VendaDeCervejas#57-valida%C3%A7%C3%A3o-de-formul%C3%A1rio)

-------------------------------

# Brewer - Venda De Cervejas

&nbsp;&nbsp;&nbsp;&nbsp;Brewer é um sistema online de vendas de cervejas responsivo para se adaptar a todos tipos de telas que tem como papel agilizar o processo de vendas de cerveja ou propondo ao cliente registrar um orçamento ou recebê-lo por e-mail para uma compra futura.


&nbsp;&nbsp;&nbsp;&nbsp;Este artigo descreve como o sistema foi projetado utilizando diagrama de classes para exibição da arquitetura do projeto e a modelagem de banco de dados para exibir os relacionamentos entre as tabelas do banco de dados, tecnologias utilizadas também como as funcionalidades do sistema e práticas de seguranças utilizadas.


### 1. Diagrama de Classe

&nbsp;&nbsp;&nbsp;&nbsp;A **figura 1** descreve a estrutura do sistema Brewer modelando suas classes descrevendo seus atributos e as relações entre objetos.

<img src="https://uploaddeimagens.com.br/images/001/193/625/original/diagrama-classe-brewer.png?1512062211" alt="Diagrama de classe" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 1 - Diagrama de classe</b> 
  </p> 
</img>

### 2. Diagrama E-R - Modelo de banco de dados
&nbsp;&nbsp;&nbsp;&nbsp;A **figura 2** representa graficamente as entidades e seus relacionamentos com as de mais entidades do banco de dados

<img src="https://uploaddeimagens.com.br/images/001/193/621/original/er.png?1512062123" alt="ER - Diagrama entidade relacionamento" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 2 - ER - Diagrama entidade relacionamento</b> 
  </p> 
</img>

### 3. Tecnologias Utilizadas
&nbsp;&nbsp;&nbsp;&nbsp;A seguir serão listadas todas as tecnologias utilizadas no desenvolvimento do sistema Brewer

 - **Java** - Linguagem de programação utilizada para o desenvolvimento do sistema.
 
 - **Spring Framework** - Frameworks responsável pela arquitetura MVC e seguranças com **BCrypt** no projeto. 

 - **Thymeleaf** - Template engine do projeto responsável por transmitir dados para tela, construção de layout das telas.
 
 - **JPA/Hibernate** - Utilizada a especificação do **JPA**  para persistência dos dados utilizando a implementação do **Hibernate**.
 
 - **HTML 5 e CSS3** - Usada para codificação e estilização do projeto utilizando também a biblioteca CSS do **Bootstrap**.
 
 - **Javascript e jQuery** - Usada para interatividade com o usuário e controles dos dados do sistema.

 - **Maven** - Para arquitetura inicial de projeto e controle de dependências.

 - **Flyway** Para a utilização de banco de dados incremental.
 
 - **MySql** - Linguagem de banco de dados utilizada.

 - **SLF4 e Log4j** - Para controle dos log da aplicação.

 - **Bean Validation e Hibernate Validator** - Usado validação de entidades e validações de campos.

 - **Thumbnailator** - Para criação de thumbmail das imagens da cervejas.

 - **JUnit** - Para teste unitários.

 - **Java Mail** - Responsável pelos envio de e-mail utilizando serviço do **sendgrid**.

 - **ChartJS** - Para geração de gráficos.
 
 - **JasperReport** - Para geração de relatórios do sistema.

### 4. Interface do sistema
&nbsp;&nbsp;&nbsp;&nbsp;Nesse tópico serão mostradas as principais telas do sistemas seguindo de suas funcionalidades.
 
#### 4.1 Login
&nbsp;&nbsp;&nbsp;&nbsp;Inicialmente o sistema inicia na tela de “login” onde o vendedor irá entrar com seus dados de autenticação, como mostrado na **figura 3**.

<img src="https://uploaddeimagens.com.br/images/001/193/663/original/login.png?1512063577" alt="Tela de login" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 3 - Tela de login</b> 
  </p> 
</img>

#### 4.1.1 Erro ao logar
&nbsp;&nbsp;&nbsp;&nbsp;Na figura 4 é mostrado a mensagem de falha ao tentar logar caso o vendedor informe seus dados incorretamente.

<img src="https://uploaddeimagens.com.br/images/001/193/666/original/erroLogin.png?1512063670" alt="Mensagem de falha ao tentar logar" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 4 - Mensagem de falha ao tentar logar</b> 
  </p> 
</img>

#### 4.2 Tela Inicial
&nbsp;&nbsp;&nbsp;&nbsp;A tela inicial do sistema é composta por um cabeçalho contendo a logo do sistema Brewer, nome do vendedor e o botão de sair (logout) mais abaixo temos o menu lateral com os menus do sistema (ver próximo tópico) e a área de conteúdo que exibe a página de “Dashboard” do sistema e por fim o rodapé no final da página contendo o nome do desenvolvedor do sistema. **Figura 5**.

<img src="https://uploaddeimagens.com.br/images/001/193/680/original/dashboard.png?1512064130" alt="Dashboard - Tela inicial do sistema" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 5 - Dashboard - Tela inicial do sistema</b> 
  </p> 
</img>

#### 4.3 Menu Lateral
&nbsp;&nbsp;&nbsp;&nbsp;No menu lateral temos 5 menus e seus submenus.
- Dashboard
- Vendas
    - Cadastro de venda
    - Pesquisa de vendas
- Estoque
    - Estilo
    - Cervejas
- Cadastro
    - Cidades
    - Clientes
    - Usuários
- Relatórios
    - Vendas emitidas
    
#### 4.3.1 Dashboard
&nbsp;&nbsp;&nbsp;&nbsp;A tela de “Dashboard” serão feitas o levantamento de algumas informações como “Valor do estoque”, “Itens no estoque”, “Total de clientes”, “Vendas no ano”, “Vendas no mês”, “Ticket médio” assim como dois gráficos, um mostrando a quantidades de vendas nos últimos 6 meses e o outro a quantidade de cervejas “Nacional” e “Internacional” vendidas. Como mostrado na **figura 5**.

#### 4.3.2 Vendas
&nbsp;&nbsp;&nbsp;&nbsp;O menu de vendas possui dois submenus “Cadastro de venda” e “Pesquisa de vendas”.

#### 4.3.2.1 Cadastro de venda
&nbsp;&nbsp;&nbsp;&nbsp;No cadastro de venda encontra-se 3 caixas de informações “Total”, “Status” e “Criação” representando o valor total da compra, o status da compra se está em “Orçamento”, “Emitida” ou “Cancelada”. e a data de criação da compra. Abaixo temos o formulário da venda com os campos de pesquisa rápida de “Cliente”, entrada de “Valor do frete”, entrada de “Valor do desconto” e duas abas terminando o formulário. Mostrado na **figura 6**. 

<img src="https://uploaddeimagens.com.br/images/001/193/700/original/CadastroVenda.png?1512065012" alt="Tela de cadastro de venda" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 6 - Tela de cadastro de venda</b> 
  </p> 
</img>

&nbsp;&nbsp;&nbsp;&nbsp;Na aba “Cervejas” temos um campo de pesquisa rápida de cerveja onde ao digitar o “Nome” ou “SKU” aparecerá uma caixa de seleção contendo o nome, SKU, origem e o valor unitário da cerveja. Após selecionar a cerveja ela aparecerá na tabela de itens da venda logo abaixo do campo de pesquisa rápida de “Cliente”. **Figura 7**.

<img src="https://uploaddeimagens.com.br/images/001/193/701/original/VendaPreenchida.png?1512065067" alt="Tela de cadastro de venda preenchida" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 7 - Tela de cadastro de venda preenchida</b> 
  </p> 
</img>

&nbsp;&nbsp;&nbsp;&nbsp;Na Aba de entrega encontra-se outro formulário com os campos “Data de entrega”, “Horário de entrega” e “Observação” exibida na **figura 8**.

<img src="https://uploaddeimagens.com.br/images/001/193/713/original/VendaEntrada.png?1512065478" alt="Tela de cadastro de venda - Guia entrada" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 8 - Tela de cadastro de venda (Guia entrada)</b> 
  </p> 
</img>

&nbsp;&nbsp;&nbsp;&nbsp;Após preencher os campos obrigatórios da venda é possível “Salvar” esta venda com o “Status” de “Orçamento” ou “Salvar e emitir” para salvar e emitir uma venda e mudar seu “Status” para “Emitida” ou “Salvar e enviar por e-mail” para salvar a venda com “Status” de “Orçamentos” e enviando um e-mail para o cliente com seus dados desta venda, confira a **figura 9** o recebimento do e-mail com os dados da venda

<img src="https://uploaddeimagens.com.br/images/001/193/955/original/email.png?1512078168" alt="Tela do e-mail recebido" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 9 - Tela do e-mail recebido</b> 
  </p> 
</img>

#### 4.3.2.2 Pesquisa de vendas
&nbsp;&nbsp;&nbsp;&nbsp;Na tela de pesquisa de vendas na **figura 10** podem ser filtradas as vendas pelos seguintes filtros “Código”, “Status”, “Data de criação”, “Valor Total”, “Nome Cliente”, “CPF/JNPG” e a baixo a listagem de vendas filtradas.
Pesquisando por quaisquer dos campos retornará a busca clicando no botão “Pesquisar”. Ao deixar os campos de filtros vazios será retornado todas as vendas.

<img src="https://uploaddeimagens.com.br/images/001/193/737/original/PesquisaVenda.png?1512066325" alt="Tela de pesquisa de vendas" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 10 - Tela de pesquisa de vendas</b> 
  </p> 
</img>

&nbsp;&nbsp;&nbsp;&nbsp;**Observação:** todas as paginações do sistema são feitas no servidor, ou seja, são trafegadas somente uma determinada quantidade de registros do servidor fazendo-a assim trafegar menos dados do servidor deixando aplicação mais rápida e dinâmica.

&nbsp;&nbsp;&nbsp;&nbsp;Na listagem de venda na **figura 10** cada “venda” possui um ícone de edição onde pode-se fazer alteração da venda ou o cancelamento da venda. 

&nbsp;&nbsp;&nbsp;&nbsp;Na tela de “Edição de venda exibida" na **figura 11,** sómente os **administradores** e o **dono da venda** tem permissão para cancelar uma venda.

<img src="https://uploaddeimagens.com.br/images/001/193/962/original/edicaoVenda.png?1512078577" alt="Tela de edição de venda" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 11 - Tela de edição de venda</b> 
  </p> 
</img>

&nbsp;&nbsp;&nbsp;&nbsp;Caso o vendedor sem administrador tente cancelar uma venda em que ele não registrou, o mesmo será redirecionado para uma página de acesso negado. Figura 12. 

<img src="https://uploaddeimagens.com.br/images/001/193/996/original/AcessoNegado.png?1512080054" alt="Tela acesso negado" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 12 - Tela acesso negado</b> 
  </p> 
</img>

#### 4.3.3 Estoque
&nbsp;&nbsp;&nbsp;&nbsp;O menu de estoque possui dois submenus “Estilos” e “Cervejas”.

#### 4.3.3.1 Estilo
&nbsp;&nbsp;&nbsp;&nbsp;No submenu “Estilos” figura 13, encontra-se a página de pesquisa de estilos com o campo de pesquisa de estilo e a tabela de registro de estilos tendo acima o botão “Novo estilo”. 

&nbsp;&nbsp;&nbsp;&nbsp;Na listagem de estilo na **figura 13** cada registro possui os íconea de edição e exclusão.

<img src="https://uploaddeimagens.com.br/images/001/195/006/original/PesquisaEstilo.png?1512144452" alt="Tela de pesquisa de estilos" title="Clique para ampliar">
  <p align="center">
    <b>Figura 13 - Tela de pesquisa de estilos</b>
  </p>
</img>

#### 4.3.3.1.1 Edição de estilo
&nbsp;&nbsp;&nbsp;&nbsp;Na edição de estilo **figura 14**, encontra-se o campo de estilo preenchido com o dados do registro selecionado e o botão “Salvar” para alterar o “estilo”.

<img src="https://uploaddeimagens.com.br/images/001/195/059/original/EdicaoEstilo.png?1512146347" alt="Tela de edição de estilo" title="Clique para ampliar">
  <p align="center">
    <b>Figura 14 - Tela de edição de estilo</b>
  </p>
</img>

#### 4.3.3.1.2 Exclusão de estilo
&nbsp;&nbsp;&nbsp;&nbsp;No ícone de exclusão de estilo abrirá uma caixa de diálogo com a confirmação se deseja excluir este estilo **figura 15**.

<img src="https://uploaddeimagens.com.br/images/001/195/063/original/excluirEstiloConfirmacao.png?1512146422" alt="Tela de exclusão de estilo" title="Clique para ampliar">
  <p align="center">
    <b>Figura 15 - Tela de exclusão de estilo</b>
  </p>
</img>

#### 4.3.3.1.3 Cadastro de estilo
&nbsp;&nbsp;&nbsp;&nbsp;No cadastro de estilos **figura 16**, encontra-se a página de cadastro de estilo com o campo de estilo e o botão “Salvar” para salvar um novo “estilo”.

<img src="https://uploaddeimagens.com.br/images/001/195/070/original/CadastroEstilo.png?1512146563" alt="Tela de cadastro de estilo" title="Clique para ampliar">
  <p align="center">
    <b>Figura 16 - Tela de cadastro de estilo</b>
  </p>
</img>

#### 4.3.3.2 Cervejas
&nbsp;&nbsp;&nbsp;&nbsp;No submenu “Cervejas” figura 17 , encontra-se a página de pesquisa de cervejas com os campos de pesquisa por  “SKU”, “Nome”, “Estilo”, “Sabor”, “Origem”,“Valor unitário” e a tabela de registro de cervejas tendo acima o botão “Nova Cerveja”. 

<img src="https://uploaddeimagens.com.br/images/001/196/324/original/pesquisaCerveja.png?1512234781" alt="Tela de pesquisa de cervejas" title="Clique para ampliar">
  <p align="center">
    <b>Figura 17 - Tela de pesquisa de cervejas</b>
  </p>
</img>

#### 4.3.3.2.1 Edição de cerveja
&nbsp;&nbsp;&nbsp;&nbsp;Na edição de cerveja **figura 18**, encontra-se os campos preenchido com o dados do registro selecionado e o botão “Salvar” para alterar a “cerveja”.

<img src="https://uploaddeimagens.com.br/images/001/196/323/original/EdicaoCerveja.png?1512234723" alt="Tela de edição de cerveja" title="Clique para ampliar">
  <p align="center">
    <b>Figura 18 - Tela de edição de estilo</b>
  </p>
</img>

#### 4.3.3.2.2 Exclusão de cerveja
&nbsp;&nbsp;&nbsp;&nbsp;No ícone de exclusão de cerveja abrirá uma caixa de diálogo com a confirmação se deseja excluir esta cerveja **figura 19**.

<img src="https://uploaddeimagens.com.br/images/001/196/327/original/ExclusaoCerveja.png?1512234987" alt="Tela de exclusão de cerveja" title="Clique para ampliar">
  <p align="center">
    <b>Figura 19 - Tela de exclusão de cerveja</b>
  </p>
</img>

#### 4.3.3.2.3 Cadastro de cerveja
&nbsp;&nbsp;&nbsp;&nbsp;No cadastro de cervejas **figura 20**, encontra-se a página de cadastro de cervejas com o formulário de preenchimento de cerveja e o botão “Salvar” para salvar uma nova “cerveja”.

<img src="https://uploaddeimagens.com.br/images/001/196/329/original/CadastroCerveja.png?1512235204" alt="Tela de cadastro de cerveja" title="Clique para ampliar">
  <p align="center">
    <b>Figura 20 - Tela de cadastro de cerveja</b>
  </p>
</img>

&nbsp;&nbsp;&nbsp;&nbsp;Caso tenha cadastrado uma cerveja sem foto ao salvar a cerveja será usada uma foto padrão para as cervejas sem foto. **Figura 21**.

<img src="https://uploaddeimagens.com.br/images/001/196/364/original/mock.png?1512237208" alt="Imagem para cervejas sem foto" title="Clique para ampliar">
  <p align="center">
    <b>Figura 21 - Imagem para cervejas sem foto</b>
  </p>
</img>

&nbsp;&nbsp;&nbsp;&nbsp;É possível cadastrar um novo “estilo” clicando no ícone de (+) ao lado do campo “Estilo”. assim fazendo-o abrir uma caixa de diálogo **figura 22** para cadastrar um novo “estilo”. Após o cadastramento de um novo estilo o mesmo já vem selecionado na caixa de seleção de “Estilo”.

<img src="https://uploaddeimagens.com.br/images/001/196/379/original/CadastroEstiloRapido.png?1512237860" alt="Caixa de diálogo de cadastro estilo rapido" title="Clique para ampliar">
  <p align="center">
    <b>Figura 22 - Caixa de diálogo de cadastro estilo rapido</b>
  </p>
</img>

#### 4.3.4 Cadastro
&nbsp;&nbsp;&nbsp;&nbsp;O menu de cadastro possui três submenus “Cidades”, “Cliente” e “Usuário”.

#### 4.3.4.1 Cidades
&nbsp;&nbsp;&nbsp;&nbsp;No submenu “Cidades” figura 23, encontra-se a página de pesquisa de cidades com os campos de pesquisa de cidades e a tabela de registro de cidades tendo acima o botão “Nova cidade”. 

&nbsp;&nbsp;&nbsp;&nbsp;Na listagem de cidade na **figura 23** cada registro possui um ícone de edição e outros de exclusão.

<img src="https://uploaddeimagens.com.br/images/001/196/609/original/PesquisaCidade.png?1512252848" alt="Tela de pesquisa de cidades" title="Clique para ampliar">
  <p align="center">
    <b>Figura 23 - Tela de pesquisa de cidades</b>
  </p>
</img>

#### 4.3.4.1.1 Edição de cidade
&nbsp;&nbsp;&nbsp;&nbsp;Na edição de cidade **figura 24**, encontra-se os campos preenchido com o dados do registro selecionado e o botão “Salvar” para alterar a “cidade”.

<img src="https://uploaddeimagens.com.br/images/001/196/634/original/EdicaoCidade.png?1512254255" alt="Tela de edição de cidade" title="Clique para ampliar">
  <p align="center">
    <b>Figura 24 - Tela de edição de cidade</b>
  </p>
</img>

#### 4.3.4.1.2 Exclusão de cidade
&nbsp;&nbsp;&nbsp;&nbsp;No ícone de exclusão de cidade abrirá uma caixa de diálogo com a confirmação se deseja excluir esta cidade **figura 25**.

<img src="https://uploaddeimagens.com.br/images/001/196/636/original/ExclusaoCidade.png?1512254291" alt="Tela de exclusão de cidade" title="Clique para ampliar">
  <p align="center">
    <b>Figura 25 - Tela de exclusão de cidade</b>
  </p>
</img>

#### 4.3.4.1.3 Cadastro de cidade
&nbsp;&nbsp;&nbsp;&nbsp;No cadastro de cidades **figura 26**, encontra-se a página de cadastro de cidade com os campos do formulário de cidade e o botão “Salvar” para salvar uma nova “cidade”.

<img src="https://uploaddeimagens.com.br/images/001/196/637/original/CadastroCidade.png?1512254328" alt="Tela de cadastro de cidade" title="Clique para ampliar">
  <p align="center">
    <b>Figura 26 - Tela de cadastro de cidade</b>
  </p>
</img>

#### 4.3.4.2 Clientes
&nbsp;&nbsp;&nbsp;&nbsp;No submenu “Clientes” figura 27, encontra-se a página de pesquisa de clientes com os campos de pesquisa de clientes e a tabela de registro de clientes tendo acima o botão “Novo cliente”. 

&nbsp;&nbsp;&nbsp;&nbsp;Na listagem de cliente na **figura 27** cada registro possui um ícone de edição e outros de exclusão.

<img src="https://uploaddeimagens.com.br/images/001/196/658/original/PesquisaCliente.png?1512255999" alt="Tela de pesquisa de clientes" title="Clique para ampliar">
  <p align="center">
    <b>Figura 27 - Tela de pesquisa de clientes</b>
  </p>
</img>

#### 4.3.4.2.1 Edição de cliente
&nbsp;&nbsp;&nbsp;&nbsp;Na edição de cidade **figura 28**, encontra-se os campos preenchido com o dados do registro selecionado e o botão “Salvar” para alterar o “cliente”.

<img src="https://uploaddeimagens.com.br/images/001/196/661/original/edicaoCliente.png?1512256047" alt="Tela de edição de cliente" title="Clique para ampliar">
  <p align="center">
    <b>Figura 28 - Tela de edição de cliente</b>
  </p>
</img>

#### 4.3.4.2.2 Exclusão de cliente
&nbsp;&nbsp;&nbsp;&nbsp;No ícone de exclusão de cliente abrirá uma caixa de diálogo com a confirmação se deseja excluir esta cidade **figura 29**.

<img src="https://uploaddeimagens.com.br/images/001/196/662/original/exclusaoCliente.png?1512256091" alt="Tela de exclusão de cliente" title="Clique para ampliar">
  <p align="center">
    <b>Figura 29 - Tela de exclusão de cliente</b>
  </p>
</img>

#### 4.3.4.2.3 Cadastro de cidade
&nbsp;&nbsp;&nbsp;&nbsp;No cadastro de cidades **figura 30**, encontra-se a página de cadastro de cidade com os campos do formulário de cidade e o botão “Salvar” para salvar uma nova “cidade”.

<img src="https://uploaddeimagens.com.br/images/001/196/663/original/CadastroCliente.png?1512256127" alt="Tela de cadastro de cliente" title="Clique para ampliar">
  <p align="center">
    <b>Figura 30 - Tela de cadastro de cliente</b>
  </p>
</img>

#### 4.3.4.3 Usuários
&nbsp;&nbsp;&nbsp;&nbsp;No submenu “Usuários” figura 31, encontra-se a página de pesquisa de usuários com os campos de pesquisa de usuários e a tabela de registro de usuários tendo acima o botão “Novo Usuário”.

&nbsp;&nbsp;&nbsp;&nbsp;Na listagem de usuário na **figura 31** cada registro possui um ícone de edição e outros de exclusão.

&nbsp;&nbsp;&nbsp;&nbsp;**Observação:** nas caixas de seleções não é possível selecionar o caixa de seleção do usuário logado para evitar erros comuns de desativamento do usuário logado.

<img src="https://uploaddeimagens.com.br/images/001/203/638/original/PesquisaUsuario.png?1512692371" alt="Tela de pesquisa de usuários" title="Clique para ampliar">
  <p align="center">
    <b>Figura 31 - Tela de pesquisa de usuários</b>
  </p>
</img>

#### 4.3.4.3.1 Edição de usuário
&nbsp;&nbsp;&nbsp;&nbsp;Na edição de usuário **figura 32**, encontra-se os campos preenchido com o dados do registro selecionado e o botão “Salvar” para alterar o “usuário”.

<img src="https://uploaddeimagens.com.br/images/001/203/663/original/edicaoUsuario.png?1512694111" alt="Tela de edição de usuário" title="Clique para ampliar">
  <p align="center">
    <b>Figura 32 - Tela de edição de usuário</b>
  </p>
</img>

#### 4.3.4.3.2 Exclusão de usuário
&nbsp;&nbsp;&nbsp;&nbsp;No ícone de exclusão de usuário abrirá uma caixa de diálogo com a confirmação se deseja excluir este usuário **figura 33**.

<img src="https://uploaddeimagens.com.br/images/001/196/662/original/exclusaoCliente.png?1512256091" alt="Tela de exclusão de usuário" title="Clique para ampliar">
  <p align="center">
    <b>Figura 33 - Tela de exclusão de usuário</b>
  </p>
</img>

#### 4.3.4.3.3 Cadastro de usuário
&nbsp;&nbsp;&nbsp;&nbsp;No cadastro de usuário **figura 34**, encontra-se a página de cadastro de usuário com os campos do formulário de usuários e o botão “Salvar” para salvar um novo “usuário”.

<img src="https://uploaddeimagens.com.br/images/001/203/679/original/CadastroUsuario.png?1512694850" alt="Tela de cadastro de usuário" title="Clique para ampliar">
  <p align="center">
    <b>Figura 34 - Tela de cadastro de usuário</b>
  </p>
</img>

#### 4.3.5 Relatórios
&nbsp;&nbsp;&nbsp;&nbsp;O menu de relatório possui apenas um submenus “Vendas emitidas”.

#### 4.3.5.1 Vendas emitidas 
&nbsp;&nbsp;&nbsp;&nbsp;No submenu “Vendas emitidas” figura 35, encontra-se a página de relatório de vendas emitidas com dois campos de datas para preencher os intervalos entre essas duas datas e o botão de “Emitir”.

<img src="https://uploaddeimagens.com.br/images/001/203/708/original/PesquisaRelatorio.png?1512696589" alt="Tela de relatório de vendas emitidas" title="Clique para ampliar">
  <p align="center">
    <b>Figura 35 - Tela de relatório de vendas emitidas</b>
  </p>
</img>

&nbsp;&nbsp;&nbsp;&nbsp;Ao emitir o relatório de vendas emitidas o relatório irá abrir automaticamente, **figura 36**, exibindo os registros do filtro informado.


<img src="https://uploaddeimagens.com.br/images/001/203/758/original/relatorioImpresso.png?1512698346" alt="Relatório emitido" title="Clique para ampliar">
  <p align="center">
    <b>Figura 36 - Relatório emitido</b>
  </p>
</img>

#### 4.4 Telas de informações
&nbsp;&nbsp;&nbsp;&nbsp;É comum do usuário eventualmente acabar fazendo alguma ação inesperada, para esse tipos de situações o usuário será redirecionado para a tela contendo a informação da sua ação inesperada.

#### 4.4.1  Acesso negado
&nbsp;&nbsp;&nbsp;&nbsp;Ao tentar acessar uma URL de alguma função restrita do sistema, o sistema irá redirecionar para a página de acesso negado. **Figura 37.**

<img src="https://uploaddeimagens.com.br/images/001/204/570/original/403.png?1512758903" alt="Tela de acesso negado" title="Clique para ampliar">
  <p align="center">
    <b>Figura 37 - Tela de acesso negado</b>
  </p>
</img>

#### 4.4.2  Página não encontrada
&nbsp;&nbsp;&nbsp;&nbsp;Ao tentar acessar uma URL não existente, o sistema irá redirecionar para a página de página não encontrada. **Figura 38.**

<img src="https://uploaddeimagens.com.br/images/001/204/574/original/404.png?1512759032" alt="Tela de Tela de página não encontrada" title="Clique para ampliar">
  <p align="center">
    <b>Figura 38 - Tela de página não encontrada</b>
  </p>
</img>

#### 4.4.3  Página de erro no servidor 
&nbsp;&nbsp;&nbsp;&nbsp;Caso ocorra algo inesperado com o sistema, o sistema irá redirecionar para a página de erro no servidor. **Figura 39.**

<img src="https://uploaddeimagens.com.br/images/001/238/794/original/500.png?1515162745" alt="Tela de página de erro no servidor" title="Clique para ampliar">
  <p align="center">
    <b>Figura 39 - Tela de erro no servidor</b>
  </p>
</img>

#### 4.4.4  Página de sessão expirada
&nbsp;&nbsp;&nbsp;&nbsp;Caso o mesmo usuário tente logar novamente ao sistema já tendo uma sessão ativa, o sistema irá redirecionar para a página de sessão expirada. **Figura 40.**

<img src="https://uploaddeimagens.com.br/images/001/204/581/original/expire.png?1512759413" alt="Tela de página de sessão expirada" title="Clique para ampliar">
  <p align="center">
    <b>Figura 40 - Tela de sessão expirada</b>
  </p>
</img>

#### 4.5 Responsividade
&nbsp;&nbsp;&nbsp;&nbsp;O sistema brewer possui responsividade para se adaptar a telas de diversos aparelhos. Na **figura 41** temos a tela de um dispositivo móvel de tela pequena. 

<img src="https://uploaddeimagens.com.br/images/001/204/589/original/Responsividade.png?1512759885" alt="Tela de Tela de Dashboard responsiva" title="Clique para ampliar">
  <p align="center">
    <b>Figura 41 - Tela de Dashboard responsiva</b>
  </p>
</img>

#### 4.6 Internacionalização
&nbsp;&nbsp;&nbsp;&nbsp;O sistema brewer possui internacionalização adaptada para duas línguas, sendo ela portugues e ingles. Na **figura 42** temos a tela do Dashboard do sistema toda na linguagem inglesa só trocando o idioma do navegador utilizado.

<img src="https://uploaddeimagens.com.br/images/001/204/592/original/Internacionalizacao.png?1512760079" alt="Tela de Tela de Dashboard em inglês" title="Clique para ampliar">
  <p align="center">
    <b>Figura 41 - Tela de Dashboard em inglês</b>
  </p>
</img>

#### 5 Segurança
&nbsp;&nbsp;&nbsp;&nbsp;O sistema brewer possui alguma camadas de seguranças a qual permite uma veracidade e integridade dentro do sistema.

#### 5.1 Autenticação
&nbsp;&nbsp;&nbsp;&nbsp;Com a autenticação cada “usuário” do sistema possui seu “e-mail” e “senha” para efetuar seu login. 

&nbsp;&nbsp;&nbsp;&nbsp;**Observação:** É preciso estar autenticado para operar qualquer funcionalidade dentro do sistema.

#### 5.1.1  BCrypt
&nbsp;&nbsp;&nbsp;&nbsp;Ao cadastrar um usuário no sistema a senha desse usuário utiliza a criptografia “BCrypt” para transformar a senha desse usuário num “hash” de 60 caracteres.

#### 5.2 Autorização
&nbsp;&nbsp;&nbsp;&nbsp;O sistema brewer trabalha com níveis de permissão onde o usuário comum só pode ter acesso a funções do sistema relacionado ao vendedor, enquanto os usuários com permissões de administradores podem ter acesso a todo o sistema.

#### 5.3 Cross-Site Request Forgery (CSRF)
&nbsp;&nbsp;&nbsp;&nbsp;“CSRF” é uma ferramenta de segurança que valida uma requisição. O que impede o sequestro de uma requisição entre sites, ou seja, quando algum usuário logado no sistema executa algum codigo malicioso recebido por alguém mal intencionado para executar alguma ação dentro do sistema se aproveitando da requisição do usuário logado.

#### 5.4 Expiração de múltiplos login  
&nbsp;&nbsp;&nbsp;&nbsp;Expiração de múltiplos login ocorre quando o usuário já está logado no sistema e acaba se logando novamente de outro lugar, fazendo-o assim a sessão antiga se perder (deslogar) e se mantendo ativo somente com a última sessão logada.

#### 5.5 Duração de sessão
&nbsp;&nbsp;&nbsp;&nbsp;O sistema brewer trabalha com o tempo de sessão de inoperatividade de 20 minutos, ou seja, se o usuário ficar 20 minutos sem fazer qualquer atividade dentro do sistema ele perderá sua sessão e terá que fazer o login novamente.

#### 5.6 SQL Injection 
&nbsp;&nbsp;&nbsp;&nbsp;SQL Injection é uma técnica onde um atacante cria ou altera comandos SQL existentes para expor dados escondidos, ou sobrescrever dados valiosos, ou ainda executar comandos de sistema perigosos no servidor.

&nbsp;&nbsp;&nbsp;&nbsp;O sistema brewer é implementado com o implementação do hibernate e com especificação JPA, essas ferramentas evitam falhas de seguranças como SQL Injection.

#### 5.7 Validação de formulário
&nbsp;&nbsp;&nbsp;&nbsp;O sistema brewer utiliza da API **Bean Validation** e **Hibernate Validator** para auxiliar nas validações de formulários utilizando suas anotações e criando anotações de validações de campos próprias.

