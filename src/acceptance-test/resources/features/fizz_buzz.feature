Feature: Mettre en place la focntionnalité Fizz Buzz

  Scenario Outline: créer le Fizz Buzz
    Given  un intervalle entre "<minimum>" et "<maximum>"
    When on vérifie le FizzBuzz sur cet intervalle
    Then le FizzBuzz retourne "<resultat>"

    Examples:
      | minimum | maximum | resultat                                      |
      |   1     |   1     |   1                                           |
      |   2     |   2     |   2                                           |
      |   3     |   3     |   Fizz                                        |
      |   5     |   5     |   Buzz                                        |
      |   15    |   15    |   FizzBuzz                                    |
      |   1     |   2     |   12                                          |
      |   1     |   3     |   12Fizz                                      |
      |   1     |   5     |   12Fizz4Buzz                                 |
      |   1     |   10    |   12Fizz4BuzzFizz78FizzBuzz                   |
      |   1     |   15    |   12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz |
