// Generated from br\u005Cunilins\es\compiladores\syntaxanalyzer\SynGrammar.g4 by ANTLR 4.8
package br.unilins.es.compiladores.syntaxanalyzer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SynGrammarParser}.
 */
public interface SynGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SynGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SynGrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(SynGrammarParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(SynGrammarParser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(SynGrammarParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(SynGrammarParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(SynGrammarParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(SynGrammarParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(SynGrammarParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(SynGrammarParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(SynGrammarParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(SynGrammarParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(SynGrammarParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(SynGrammarParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(SynGrammarParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(SynGrammarParser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(SynGrammarParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(SynGrammarParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(SynGrammarParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(SynGrammarParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(SynGrammarParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(SynGrammarParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(SynGrammarParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(SynGrammarParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(SynGrammarParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(SynGrammarParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(SynGrammarParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(SynGrammarParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(SynGrammarParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(SynGrammarParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynGrammarParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(SynGrammarParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynGrammarParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(SynGrammarParser.SubAlgoritmoContext ctx);
}