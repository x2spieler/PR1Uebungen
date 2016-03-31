import java.awt.Graphics;

public class Loc {
	private int x, y;

	public Loc(int initialX, int initialY) {
		setLocation(initialX, initialY);
	}

	public Loc() {
		this(0, 0);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void draw(Graphics g) {
		g.fillOval(x, y, 3, 3);
		g.drawString("(" + x + ", " + y + ")", x, y);
	}

	public void setLocation(int newx, int newy) {
		if (newx < 0 || newy < 0) {
			throw new IllegalArgumentException("x und y müssen >= 0 sein");
		}
		x = newx;
		y = newy;
	}

	public void translate(int dx, int dy) {
		setLocation(x + dx, y + dy);
	}

	public double distance(Loc other) {
		int dx = x - other.x;
		int dy = y - other.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public double distanceFromOrigin() {
		Loc origin = new Loc();
		return distance(origin);
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public int manhattanDistance(Loc loc) {
		int dx = x - loc.x;
		int dy = y - loc.y;
		return Math.abs(dx) + Math.abs(dy);
	}
}
