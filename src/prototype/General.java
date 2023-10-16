package prototype;

import javax.naming.OperationNotSupportedException;

public class General extends GameUnit {

	private String state = "idle";

	public void boostMorale() {
		this.state = "MoralBoost";
	}

	@Override
	public String toString() {
		return "General " + state + " @ " + getPosition();
	}

	@Override
	public GameUnit clone() throws CloneNotSupportedException {

		throw new CloneNotSupportedException("General are unique...");
	}

	@Override
	protected void reset() throws RuntimeException {

		throw new UnsupportedOperationException();

	}

}
