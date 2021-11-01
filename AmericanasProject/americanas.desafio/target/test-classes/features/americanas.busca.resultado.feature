#Author: tatiane.gues.76@gmail.com


Feature: Realizar busca
  Como QA quero acessar o site para realizar busca
  
@buscaTelefone
  Scenario: Validar produto retornado
   Given que eu esteja no site "https://www.americanas.com.br"
   When realizar pesquisa por produto
   Then verifico produto retornado
    
  

 
