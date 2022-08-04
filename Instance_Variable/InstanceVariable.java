package Instance_Variable;

public class InstanceVariable {

	public int a = 10;

	public InstanceVariable(int y) {
		this.a = a + y;
		System.out.println("I incremneted value: " + a);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		InstanceVariable i1 = new InstanceVariable(10);
		InstanceVariable i2 = new InstanceVariable(20);
		InstanceVariable i3 = new InstanceVariable(30);
		InstanceVariable i4 = new InstanceVariable(40);

	}

}
