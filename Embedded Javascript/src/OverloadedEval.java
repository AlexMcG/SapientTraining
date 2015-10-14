import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class OverloadedEval {

	public static void main(String[] args) {
		String script = args[0];
		String extension = script.substring(script.lastIndexOf(script.lastIndexOf('.') + 1, script.length()));
		
		InputStream is = ScriptEngineScripts.class.getResourceAsStream("/" + script);
		Reader reader = new InputStreamReader(is);
		
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByExtension(extension);
		
		engine.eval(reader);
	}

	
}
