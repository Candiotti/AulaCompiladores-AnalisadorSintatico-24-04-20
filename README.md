Matheus dos Santos Candiotti - ID: 314139

O analisador sintático desenvolvido em ANTLR tem sua estrutura básica girando em torno do arquivo de gramática .G4. O analisador sintatico, resumidamente, é responsável por dividir o conceito de "programa" em blocos menores e formando pequenas estruturas que formam um todo no final, desse modo , se define a ordem e a forma que os tokens gerados no analisador lexico devem aparecer no algoritmo para ser aceito na linguagem, por exemplo, na linguagem a ser desenvolvida, a estrutura do programa como um todo é definido por:
	programa: ':' 'DECLARACOES' listaDeclaracoes ':' 'ALGORITMO' listaComandos EOF;

DEFININDO:

':' -> Token DELIMITADOR;
'DECLARACOES' -> Palavra-chave, no entanto já não existe mais a necessidade de um token especifico para isso, utiliza-se apenas a palavra diretamente;
listaDeclaracoes -> Uma estrutura de codigo que deve ter seu formato definido no arquivo .G4, assim como a estrutura do programa é definido, como dito, pequenos blocos formam um todo no final, o programa final;
listaComandos -> Exatamente como listaDeclaracoes, terá que definir o formato desse bloco no arquivo .G4;
EOF -> Representação de fim de arquivo, ou seja, fim do algoritmo.

Nessa etapa já é possível visualizar erros mais diretamente, pois caso a estrutura definida não for respeitada em alguma parte do programa, o algoritmo não será aceito e apresentará o erro naquele pedaço e o que na verdade se esperaria para aquela parte, por exemplo:
	- Como dito anteriormente, na linguagem a ser desenvolvida é possível declarar variaveis de tipo INTEIRO e FLOAT(REAL), respeitando a seguinte estrutura definida no arquivo .G4:
	- NOME : TIPO VARIAVEL;
Caso, por algum motivo, o tipo da variavel venha a aparecer antes do nome da variavel, assim como funciona em linguagem C, não será aceito, pois a estrutura não foi respeitada, e será gerado um erro informando que a estrutura apresentada não é compativel com a esperada.

O analisador sintatico funciona em conjunto com o analisador lexico, e posteriormente com o semantico, enquanto o lexico se preocupa com a estrutura básica dos componentes menores do programa como a maneira de representar o tipo INTEIRO na linguagem, seja em caixa calta, abreviado, de qualquer maneira, gerando tokens para cada uma dessas partes do codigo, o analisador sintatico se preocupa com a estruturação que esses tokens aparecem no algoritmo.
