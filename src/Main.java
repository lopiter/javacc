import com.lopiter.parser.MyParser;
import com.lopiter.parser.ParseException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import com.lopiter.parser.node.*;
import java.util.*;
import java.lang.reflect.Field;

public class Main{
  public static void main(String args[]) throws Exception {
    MyParser parser = new MyParser(new FileInputStream("test.txt"));
    MyParsercompilationunit val = parser.MyParsercompilationunit();
    create(val , "");
  }

  public static void create(INode root , String prefix) throws InstantiationException, IllegalAccessException{
  		Object obj;
  		for(Field field : root.getClass().getFields()){
  			obj = field.get(root);
  			if(obj instanceof INode){
  				if(obj instanceof NodeChoice){
  					NodeChoice nodeChoice = (NodeChoice)obj;
  					createNode(nodeChoice.choice , prefix);
  				}else if(obj instanceof NodeListOptional){
  					NodeListOptional nodeListOptional = (NodeListOptional)obj;
  					for(INode node : nodeListOptional.nodes){
  						createNode(node , prefix);
  					}
  				}else if(obj instanceof NodeOptional){
  					NodeOptional optional = (NodeOptional)obj;
  					if(optional.present()){
  						create(optional , prefix);
  					}
  				}else if(obj instanceof NodeSequence){
  					NodeSequence sequence = (NodeSequence)obj;
  					for(INode node : sequence.nodes){
  						createNode(node , prefix);
  					}
  				}else if(obj instanceof NodeList){
  					NodeList nodeList = (NodeList)obj;
  					for(INode node : nodeList.nodes){
  						createNode(node , prefix);
  					}
  				}else if(obj instanceof NodeToken){
  					NodeToken nodeToken = (NodeToken)obj;
            //System.out.println(nodeToken);
          }else{
            System.out.println(prefix + obj.getClass().getSimpleName());
  					create((INode)obj  , prefix + ">> ");
  				}
  			}else if(obj instanceof List){
  				for(Object element : (List)obj){
  					if(element instanceof INode){
  						createNode(element , prefix);
  					}
  				}
  			}
  		}
  	}

private static void createNode(Object element , String prefix) throws InstantiationException, IllegalAccessException{
  if(element.getClass().getSimpleName().startsWith("MyParser")){
    System.out.println(prefix + element.getClass().getSimpleName());
    create((INode)element , prefix + ">> ");
  }else if(element instanceof NodeToken){
    //System.out.println(element);
  }else{
    create((INode)element , prefix);
  }
}

}
