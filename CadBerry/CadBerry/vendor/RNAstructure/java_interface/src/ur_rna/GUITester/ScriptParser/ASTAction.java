/* Generated By:JJTree: Do not edit this line. ASTAction.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
 package ur_rna.GUITester.ScriptParser;

public
class ASTAction extends ScriptNode {
  public String verb;

  @Override
  public void writeProps(StringBuilder sb) {
    super.writeProps(sb);
    sb.append(" Verb: \"" + verb + '\"');
  }

  public ASTAction(int id) {
    super(id);
  }

  public ASTAction(GuiTestScriptParser p, int id) {
    super(p, id);
  }

}
/* JavaCC - OriginalChecksum=06936497a610b9103e01611133e5bef0 (do not edit this line) */
