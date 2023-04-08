# ExerciciosEstruturadeDadosIfsp -  Java 

<h5>Estudante de Analise e Desenvolvimento de Sistemas - Federal de São Paulo 2º Semestre 04/2023,
Exercícios para a fixação do conteudo passado em sala de aula em cima da linguagem Java Orientação Objeto (Profº Puga)<h5>

><h5>Como estudante de Análise e Desenvolvimento de Sistemas na Universidade Federal de São Paulo, estou no segundo semestre do ano de 2023. 
>Atualmente, estamos imersos no estudo da 
>linguagem de programação Java e da orientação a objetos,que são conceitos cruciais para a construção de sistemas de 
>software robustos e eficientes.<h5>

* MeuPrimeiroPrograma,
* Fahrenheit -> Celsius (Inteiro),
* Fahrenheit -> Celsius (Ponto Flutuante),
* Promoção de Variavel,
* 30 primeiros números da sequência de Fibonacci,
* Calculadora versão sobrecarga,
* Matriz de duas dimensões de tamanho variável,
* Matriz de duas dimensões de tamanho variável sequencial,
* Bubble sort com array,
* Insertion sort com array.




<h5>
1)Crie um programa simples em Java que imprima uma linha simples.  A mensagem a ser exibida deve ser: Estou vivo!!!<h5>
<div align="left">
<img src=https://user-images.githubusercontent.com/102634725/230691956-80ae4f7d-47c0-4464-bb5a-2c8fd6b87299.png width="650px" margin-top:"150px"  />
</div>

_______________________________________________________________________________________________________________________________________________________________________

<div><h5>
<h4>2)Fahrenheit -> Celsius (Inteiro)<h4>
Fazer um programa em "Java" que receba o valor em graus Fahrenheit e imprime no vídeo o correspondente em graus Celsius usando a fórmula:  C = (f-32) * (5/9)

OBS: Usar uma variável int para ler o valor em Fahrenheit<h5><h4>
<div align="left">
<img src=https://user-images.githubusercontent.com/102634725/230694268-db635580-cc43-4efc-a994-3f2f50547a3c.png width="650px" margin-top:"150px" />
</div>
</div>

_______________________________________________________________________________________________________________________________________________________________________

<h5>
<h4>3)*Fahrenheit -> Celsius (Ponto Flutuante)<h4>
Fazer um programa em "Java" que receba o valor em graus Fahrenheit e imprime no vídeo o correspondente em graus Celsius usando a fórmula:  C = (f-32.0) * (5.0/9.0)

OBS: Usar uma variável double para ler o valor em Fahrenheit<h5>
<div align="left">
<img src=https://user-images.githubusercontent.com/102634725/230694782-ba872422-8e2d-4c19-a088-e6f126a9162c.png width="650px" margin-top:"150px" />
</div>

_______________________________________________________________________________________________________________________________________________________________________

<h5>
<h4>4)Promoção de Variavel<h4>
Execute o trecho abaixo (resultado da discussão em sala de aula)

public class Promocao {

     public static void main(String[] args) {

          byte a = 10;

          short b = 21;

          int c = 32;

          long d = 43L;

          float e = 54.5F;

          double f = 65.4D;

          double result = (a * b / c * d / e * f);

          System.out.println(result);

     }

}<h5>
<div align="left">
<img src=https://user-images.githubusercontent.com/102634725/230694970-70cb72fa-a2af-4f81-a712-bc94373acd7d.png width="650px" margin-top:"150px" />
</div>

_______________________________________________________________________________________________________________________________________________________________________


<h5>
<h4>5)30 primeiros números da sequência de Fibonacci<h4>
A Sequência de Fibonacci tem como primeiros termos os números 0 e 1 e, a seguir, cada termo subsequente é obtido pela soma dos dois termos predecessores. Nenhuma outra sequência de números foi tão estudada e possui aplicações em áreas tão distintas, como por exemplo Biologia, Arquitetura, Arte e outras. A razão entre dois números consecutivos da sequência converge para um valor constante de 1,618... conhecido como número de ouro.

A série de Fibonacci inicia com os números F0 = 0 e F1 = 1, e cada número posterior equivale à soma dos dois números anteriores (Fn = Fn-1 + Fn-2).

Imprima os 30 primeiros números da sequência de Fibonacci
Formato da saída esperada: um número por linha

0 

1

1

2

3 

<h5>
<div align="left">
<img src=https://user-images.githubusercontent.com/102634725/230695125-7a51df1a-5ea8-42f1-b41f-37a90cb7a14e.png width="650px" margin-top:"150px" />
</div>

_______________________________________________________________________________________________________________________________________________________________________


<h5>
<h4>6) Calculadora versão sobrecarga<h4>
Crie uma classe calculadora:

Deve possuir métodos para as operações matemáticas básicas, ou seja, somar, subtrair, dividir e multiplicar
Haverá uma versão do método que recebe dois números e efetua a operação
Será feita uma sobrecarga de método com outra versão que recebe varags como parâmetro<h5>
<div align="left">
<img src=https://user-images.githubusercontent.com/102634725/230695235-bc1f2c62-0a39-47f8-954a-0e8e02a94282.png width="650px" margin-top:"150px" />
</div>

_______________________________________________________________________________________________________________________________________________________________________

<h5>
<h4>7) Matriz de duas dimensões de tamanho variável<h4>
Crie uma matriz de duas dimensões preenchida conforme a figura abaixo. 

Utiliza um array auxiliar para instanciar as linhas.  
Utilize a sintaxe abaixo para instanciar as linhas de tamanhos diferentes:
int[][] meses = new int[12][]; 

meses[0] = new int[31]; 

meses[1] = new int[28]; 

meses[2] = new int[31];

Matriz de duas dimensões de tamanho variável
![image](https://user-images.githubusercontent.com/102634725/230695299-022fdac3-a786-48f3-b3f5-b1120d12611e.png)

Saída esperada:
[1, 2, 3, 4, 5, 6, 7, 8, 9]

[10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

[20, 21, 22, 23, 24, 25, 26, 27]

[28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39]

[40, 41, 42, 43, 44, 45]

[46, 47]

[48]

[49, 50, 51, 52, 53, 54, 55, 56]

<h5>
<div align="left">
<img src=https://user-images.githubusercontent.com/102634725/230695367-ac7ff7ff-a749-40c1-967b-edb047ab76fe.png width="650px" margin-top:"150px" />
</div>
_______________________________________________________________________________________________________________________________________________________________________


<h5>
<h4>8) Matriz de duas dimensões de tamanho variável sequencial<h4>
Crie uma matriz de duas dimensões preenchida conforme a figura abaixo. 

Observe que o tamanho das linhas corresponde ao índice da coluna. 
No caso da coluna zero não deve ser criado uma linha. 
Utilize a sintaxe abaixo para instanciar as linhas de tamanhos diferentes:
int[][] meses = new int[12][]; 

meses[0] = new int[31]; 

meses[1] = new int[28]; 

meses[2] = new int[31];

Matriz bidimensional de tamanho variável sequencial
![image](https://user-images.githubusercontent.com/102634725/230695426-dd0eeb09-5018-44f9-a8ff-c2ed8a1a9543.png)

Saída esperada:
null

[1]

[2, 3]

[4, 5, 6]

[7, 8, 9, 10]

[11, 12, 13, 14, 15]

[16, 17, 18, 19, 20, 21]

[22, 23, 24, 25, 26, 27, 28]

<h5>
<div align="left">
<img src=https://user-images.githubusercontent.com/102634725/230695456-504950b5-8d27-4939-a6ed-8a712a607938.png width="650px" margin-top:"150px" />
</div>


_______________________________________________________________________________________________________________________________________________________________________


<h5>
<h4>9) Bubble sort com array<h4>
Um algoritmo de classificação é usado para reorganizar uma determinada matriz ou lista de elementos de acordo com um operador de comparação nos elementos. O operador de comparação é usado para decidir a nova ordem dos elementos na respectiva estrutura de dados.

O Bubble Sort é o algoritmo de classificação mais simples que funciona trocando repetidamente os elementos adjacentes se eles estiverem na ordem errada. Este algoritmo não é adequado para grandes conjuntos de dados, pois sua complexidade de tempo média e de pior caso é bastante alta.

.......................................................................................................................................................................
Entrada: array[] = {5, 1, 4, 2, 8}

Primeira passagem: 

A classificação por bolhas começa com os dois primeiros elementos, comparando-os para verificar qual é o maior.
( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Aqui, o algoritmo compara os dois primeiros elementos e troca desde 5 > 1. 
( 1 5 4 2 8 ) –> ( 1 4 5 2 8 ), Troca desde 5 > 4 
( 1 4 5 2 8 ) –> ( 1 4 2 5 8 ), Troca desde 5 > 2 
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Agora, como esses elementos já estão em ordem (8 > 5), o algoritmo não os troca.
Segunda passagem: 

Agora, durante a segunda iteração, deve ficar assim:
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ) 
( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Troca desde 4 > 2 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
Terceira passagem: 

Agora, o array já está ordenado, mas nosso algoritmo não sabe se está completo.
O algoritmo precisa de uma passagem inteira sem nenhuma troca para saber que está classificado.
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
Ilustração:
![image](https://user-images.githubusercontent.com/102634725/230695549-69f672d5-28db-4e48-a044-8d0ccef5f59a.png)

Tipo de bolha

.......................................................................................................................................................................
Siga os passos abaixo para resolver o problema:

Execute um loop for aninhado para percorrer o array de entrada usando duas variáveis ​​i e j , de modo que 0 ≤ i < n-1 e 0 ≤ j < ni-1
Se array[j] for maior que array[j+1], troque esses elementos adjacentes, caso contrário, siga em frente
Imprimir o array classificado
<h5>
<div align="left">
<img src=https://user-images.githubusercontent.com/102634725/230695590-9517a0e3-ac06-4943-81af-900b573ec36b.png width="650px" margin-top:"150px" />
</div>


_______________________________________________________________________________________________________________________________________________________________________

<h5>
<h4>10) Insertion sort com array<h4>
Um algoritmo de classificação é usado para reorganizar uma determinada matriz ou lista de elementos de acordo com um operador de comparação nos elementos. O operador de comparação é usado para decidir a nova ordem dos elementos na respectiva estrutura de dados.

A classificação por inserção é um algoritmo de classificação simples que funciona de maneira semelhante à maneira como você classifica as cartas de baralho em suas mãos. A matriz é virtualmente dividida em uma parte classificada e outra não classificada. Os valores da parte não classificada são selecionados e colocados na posição correta na parte classificada.

Características da classificação por inserção:
Este algoritmo é um dos algoritmos mais simples com implementação simples
Basicamente, a classificação por inserção é eficiente para pequenos valores de dados
A classificação por inserção é de natureza adaptativa, ou seja, é apropriada para conjuntos de dados que já estão parcialmente classificados.
Funcionamento do algoritmo de ordenação por inserção:
Considere um exemplo: arr[]: {12, 11, 13, 5, 6}

   12   	   11   	   13   	   5   	   6   
Primeira passagem:

Inicialmente, os dois primeiros elementos do array são comparados na ordenação por inserção.
   12   	   11   	   13   	   5   	   6   
Aqui, 12 é maior que 11, portanto, eles não estão na ordem crescente e 12 não está na posição correta. Assim, troque 11 e 12.
Portanto, por enquanto, 11 é armazenado em uma submatriz classificada.
   11   	   12   	   13   	   5   	   6   
Segunda passagem:

 Agora, passe para os próximos dois elementos e compare-os
   11   	   12   	   13   	   5   	   6   
Aqui, 13 é maior que 12, portanto, ambos os elementos parecem estar em ordem crescente, portanto, nenhuma troca ocorrerá. 12 também armazenado em um sub-array classificado junto com 11
Terceira passagem:

Agora, dois elementos estão presentes no sub-array ordenado que são 11 e 12
Avançando para os próximos dois elementos que são 13 e 5
   11   	   12   	   13   	   5   	   6   
Ambos 5 e 13 não estão presentes em seus lugares corretos, então troque-os
   11   	   12   	   5   	   13   	   6   
Após a troca, os elementos 12 e 5 não são classificados, portanto, troque novamente
   11   	   5   	   12   	   13   	   6   
Aqui, novamente 11 e 5 não estão classificados, portanto, troque novamente
   5   	   11   	   12   	   13   	   6   
Aqui, 5 está em sua posição correta
Quarta Passagem:

Agora, os elementos que estão presentes no sub-array ordenado são 5, 11 e 12
Passando para os próximos dois elementos 13 e 6
   5   	   11   	   12   	   13   	   6   
Claramente, eles não são classificados, portanto, realize a troca entre os dois
   5   	   11   	   12   	   6   	   13   
Agora, 6 é menor que 12, portanto, troque novamente
   5   	   11   	   6   	   12   	   13   
Aqui, também trocar faz 11 e 6 não classificados, portanto, troque novamente
   5   	   6   	   11   	   12   	   13   
Finalmente, o array está completamente ordenado.
Ilustrações:

 ![image](https://user-images.githubusercontent.com/102634725/230695697-49653d94-a38c-4a13-84d0-eeedbf2bbeec.png)


<h5>
<div align="left">
<img src=https://user-images.githubusercontent.com/102634725/230695760-7441f7ed-25f8-4393-8d3b-08b693984302.png width="650px" margin-top:"150px" />
</div>
**
*


