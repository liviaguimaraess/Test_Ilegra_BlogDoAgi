
@test
Feature: Como usuario
Quero realizar pesquisas
Para encontrar artigos

  @test
  Scenario: Pesquisa com palavra aleatória
    Given que esteja na pagina inicial
    And click na lupa de pesquisa
    And informe palavra aleatória no campo solicitado
    When clicar no botao de pesquisa
    Then sistema informa todos os artigos relacionados a palavra informada
    
    Scenario: Pesquisa com caracteres aleatorios
    Given que esteja na home
    And clicar na lupa de pesquisa
    And informe caracteres aleatorios no campo pesquisar
    When clicar no botao "PESQUISAR"
    Then sistema informa mensagem "Nenhum Resultado" "Nao encontramos nada para estes termos de busca. Tente novamente com  com palavras-chave diferentes."




 