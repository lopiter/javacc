/* Generated by JTB 1.4.7 */
package com.lopiter.parser.visitor;

import com.lopiter.parser.node.*;

public interface IVoidArguVisitor<A> {

  public void visit(final NodeChoice n, final A argu);

  public void visit(final NodeList n, final A argu);

  public void visit(final NodeListOptional n, final A argu);

  public void visit(final NodeOptional n, final A argu);

  public void visit(final NodeSequence n, final A argu);

  public void visit(final NodeTCF n, final A argu);

  public void visit(final NodeToken n, final A argu);

  public void visit(final MyParsercompilationunit n, final A argu);

  public void visit(final MyParserfunction n, final A argu);

  public void visit(final MyParserstatement n, final A argu);

  public void visit(final MyParserforStatement n, final A argu);

  public void visit(final MyParserprintStatement n, final A argu);

  public void visit(final MyParserifStatemet n, final A argu);

  public void visit(final MyParserreadStatement n, final A argu);

  public void visit(final MyParsercallStatement n, final A argu);

  public void visit(final MyParsersetValueStatement n, final A argu);

}
