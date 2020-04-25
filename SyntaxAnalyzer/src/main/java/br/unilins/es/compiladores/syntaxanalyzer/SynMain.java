package br.unilins.es.compiladores.syntaxanalyzer;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

// ANALISADOR SINTATICO DESENVOLVIDO UTILIZANDO A FERRAMENTA ANTLR 4.8 - Matheus Candiotti - ID: 314139

public class SynMain {
    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        SynGrammarLexer lexer = new SynGrammarLexer(cs);

//Descomentar para depurar o analisador e verificar se está reconhecendo o tipo de token certo
//       Token t = null;
//       while( (t = lexer.nextToken()).getType() != Token.EOF) {
//           System.out.println("<" + SynGrammarLexer.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">");
//       }
////////////////////////////// APRESENTA UM ERRO NA ÚLTIMA LINHA DEVIDO AO EOF NO FIM DO PROGRAMA
// 
// TESTADO COM AMBOS OS ALGORITMOS FORNECIDOS, O DO ANALISADOR LEXICO E AGORA O NOVO DO SINTATICO
// AMBOS FUNCIONANDO, APENAS TIVE QUE ALTERAR A DEFINICAÇÃO DO TIPO DE VARIAVEL, POIS EM UM ESTAVA
// INT E NO OUTRO INTEIRO, ALTEREI ISSO E TUDO FUNCIONOU

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SynGrammarParser parser = new SynGrammarParser(tokens);
        parser.programa();
    }
}
