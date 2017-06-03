// Generated from QueuingT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QueuingTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QueuingTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#propertycustinq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertycustinq(@NotNull QueuingTParser.PropertycustinqContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#prob}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProb(@NotNull QueuingTParser.ProbContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(@NotNull QueuingTParser.CodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#analitics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalitics(@NotNull QueuingTParser.AnaliticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#node_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_property(@NotNull QueuingTParser.Node_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#id_con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_con(@NotNull QueuingTParser.Id_conContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#propertyqd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyqd(@NotNull QueuingTParser.PropertyqdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#footer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooter(@NotNull QueuingTParser.FooterContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#expd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpd(@NotNull QueuingTParser.ExpdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#propertyidend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyidend(@NotNull QueuingTParser.PropertyidendContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#dist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDist(@NotNull QueuingTParser.DistContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#und}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnd(@NotNull QueuingTParser.UndContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#stime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStime(@NotNull QueuingTParser.StimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#propertysd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertysd(@NotNull QueuingTParser.PropertysdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(@NotNull QueuingTParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#propertyidstart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyidstart(@NotNull QueuingTParser.PropertyidstartContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#node_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_description(@NotNull QueuingTParser.Node_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnection(@NotNull QueuingTParser.ConnectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#propertynumberofservers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertynumberofservers(@NotNull QueuingTParser.PropertynumberofserversContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#network_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_description(@NotNull QueuingTParser.Network_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#propertyid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyid(@NotNull QueuingTParser.PropertyidContext ctx);
}