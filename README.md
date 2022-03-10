# Jogo do 8

Jogo de quebra cabeças que consiste em ordenar 8 peças em um tabuleiro de 3x3 quadrados, movendo sempre os números para o buraco.

Esse jogo é uma variação do N-Puzzle, onde possui diversas versões como o 8-Puzzle, 15-Puzzle, 24-Puzzle 
etc.


![alt text](http://marmsx.msxall.com/cursos/jogos/8_puzzle/puzzle.gif)

  ## Tabuleiro do jogo

  O tabuleiro do jogo poderá ser feito em uma matriz de 3x3 ou um vetor de 9 posições. Serão apresentadas ambas as soluções.

  No caso da matriz de 3x3, devemos armazenar as coordenadas X e Y do buraco em HX e HY, respectivamente. Já no caso do vetor, armazenamos apenas a posição do buraco em pos. A variável moves armazena a quantidade de movimentos gastos pelo jogador para solucionar o jogo.

  Uma vez que os vetores e matrizes no C variam de 0 a N-1, as coordenadas ou posição do buraco irão também variar de 0 a N-1. Entretanto, os rótulos dos números variam de 1 a 8. Dessa forma, deve-se tomar cuidado quanto a essa questão.

  Os valores iniciais do jogo não poderão apresentar qualquer seqüência aleatória, pois poderia resultar em um jogo sem solução possível. Dessa forma, a solução para obter uma seqüência inicial válida será a mesma adotada no jogo real: a partir da seqüência ordenada, faremos N movimentos no sentido de embaralhar o jogo.

## Embaralhando

Primeiramente, uma função irá colocar os números de 1 a 8 de forma ordenada, reservando para o buraco o valor 0.

Em seguida, é necessário realizar N movimentos sucessivos para embaralhar os números. Entretanto, é necessário antes ver como analisamos as trocas possíveis para um determinado buraco.

 ## Movimentos possíveis

A análise dos movimentos possíveis é feita sempre a partir da posição buraco.
Para a matriz 3x3, a análise é feita em tempo de execução. A partir de um deslocamento proposto dx e dy da posição do buraco HX e HX, verificamos se:
As coordenadas resultantes HX+dx e HY+dy caem dentro dos limites do tabuleiro;
A soma de dx e dy NÃO é igual a 0 (buraco não move); e
A soma de dx e dy NÃO é maior que 1 (anda em diagonal).
Obs: -1 < dx < 1 e -1 < dy < 1

Para o vetor de 9, armazenaremos em um vetor de strings todos os movimentos possíveis para cada posição do buraco. A troca é feita diretamente entre a posição do buraco e a possível.
A ilustração abaixo apresenta os movimentos possíveis (em verde) para cada posição do buraco (vermelho).

![alt text](http://marmsx.msxall.com/cursos/jogos/8_puzzle/combine.gif)