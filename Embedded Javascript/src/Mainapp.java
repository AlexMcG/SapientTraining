import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Mainapp {


		public static void main(String[] args) {
				// TODO Auto-generated method stub
				ScriptEngineManager mgr = new ScriptEngineManager();
				ScriptEngine engine  = mgr.getEngineByName("JavaScript");
				
				try {
					engine.eval("print('Hello World')");
				} catch (ScriptException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}


}
