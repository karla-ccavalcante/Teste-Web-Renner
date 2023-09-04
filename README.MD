Exercício Renner WEB

Caso de Teste: Transferência entre Contas

Neste caso de teste, vamos garantir que a funcionalidade de transferência entre contas funcione conforme o esperado. Certifique-se de seguir este procedimento passo a passo.

Pré-requisitos:

- Você deve ter acesso ao site [BugBank](https://bugbank.netlify.app/).
- Deve haver pelo menos duas contas criadas com saldos para realizar a transferência.
  
Passos:

1. Acesse o site [BugBank](https://bugbank.netlify.app/).

2. Faça login em uma das contas criadas anteriormente.

3. Clique na opção de "Transferência"

4. Selecione a conta de destino para onde deseja transferir o dinheiro.

5. Insira o valor que deseja transferir.

6. Confirme a transferência.

Resultado Esperado:

- O sistema deve processar a transferência sem erros ou exceções.

- O saldo na conta de origem deve ser reduzido pelo valor da transferência.

- O saldo na conta de destino deve aumentar pelo valor da transferência.

- Valide se os saldos das contas de origem e destino foram atualizados corretamente após a transferência.

- Certifique-se de que você não encontre erros visuais ou mensagens de erro durante o processo de transferência.

Como executar o projeto:
1. Importar na IDE de preferencia o projeto como maven java
2. Abrir o arquivo TRANSFERENCIATEST e executar via Junit5

Arquitetura do Projeto: 

Pacotes:
----------------------------------------------------------------
Enums: Pacote responsavel para guardar qualquer Enum que seja necessário criar
----------------------------------------------------------------
Maps: Pacote responsavel pela parte dos mapeamentos dos campos, onde os objetos dos campos são instanciadas através da anotação do PageFactory
----------------------------------------------------------------
Pages: Pacote responsavel pela parte das ações das paginas, como preenchimento, cliques, retornos de conteudos.
----------------------------------------------------------------
Testes: Pacote responsavel pela parte dos testes, utilizando JUnit5
----------------------------------------------------------------
Utils: Pacote responsavel para guardar todas as classes que contenham metodos que possam ser usadas por varios métodos ou classes
----------------------------------------------------------------
# Features: Diretório responsável para guardar os arquivos .feature, onde estão gravados os arquivos relacionados ao cucumber e as escrita em gherkin

Libs utilizadas:

PageFactory: Responsavel pelo mapeamento dos elementos e integração dos objetos com o driver
----------------------------------------------------------------
Selenium: Responsável pelas ações em navegadores da web.
----------------------------------------------------------------
Webdrivermanager de bonigarcia: Dependencia responsavel por gerenciar os drivers, evitando a necessidade de verificar a versao atual do browser, qual browser vai utilizar e buscar o driver para download.
----------------------------------------------------------------
Maven: Responsavel por gerenciar as dependencias utilizadas no projeto.
----------------------------------------------------------------
## JUnit5: Dependencia para realizar a execução dos testes atraves da linguagem Java.
----------------------------------------------------------------
## Surefire Report: Responsavel por  gerar relatórios detalhados da execucao do teste

