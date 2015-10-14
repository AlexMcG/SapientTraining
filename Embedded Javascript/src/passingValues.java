import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class passingValues {
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		ScriptEngineManager mgr = new ScriptEngineManager();
		mgr.put("op1", 4);
		
		ScriptEngine engine  = mgr.getEngineByName("JavaScript");
		
		Bindings bindings = engine.createBindings();
		bindings.put("op2", 5);
		
		Object result = null;
		try {
			result = engine.eval("op1 + op2", bindings);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Result = " + result);
	}
}
