package miniduck.simulator;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< silence >>");
	}
}
