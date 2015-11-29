/* Generated by JTB 1.4.7 */
package syntaxtree;

import visitor.*;

public class readStatement implements INode {

  public NodeToken f0;

  public NodeToken f1;

  public NodeToken f2;

  public NodeToken f3;

  private static final long serialVersionUID = 147L;

  public readStatement(final NodeToken n0, final NodeToken n1, final NodeToken n2, final NodeToken n3) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
  }

  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return vis.visit(this, argu);
  }

  public <R> R accept(final IRetVisitor<R> vis) {
    return vis.visit(this);
  }

  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    vis.visit(this, argu);
  }

  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }

}
