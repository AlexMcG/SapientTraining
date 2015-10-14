package mainpack;

class Data<T> {
	private T value;
	
	public Integer getValue() {
		return 3;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
}

public class MainApp {
	public static void main(String[] args) {
		Data d = new Data<Integer>();
		d.setValue(new Integer(34));
		Integer value= (Integer) d.getValue();
		System.out.println(value);
	}
}
