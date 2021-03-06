package backend;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Line extends Line2D.Double {

	private static final long serialVersionUID = 1;
	private Color color;
	private int width;

	public Line(Point start, Point end, Color color, int width) {
		super(start, end);
		this.color = color;
		this.width = width;
	}

	protected boolean intersects(Line otherLine) {
		return super.intersectsLine(otherLine);
	}

	protected boolean isVisible() {
		return color == null;
	}

	public Color getColor() {
		return color;
	}
	
	public int getWidth() {
		return width;
	}

	public Point getStartPoint() {
		return convertDoublePoint(super.getP1());
	}

	public Point getEndPoint() {
		return convertDoublePoint(super.getP2());
	}
	
	private Point convertDoublePoint(Point2D ptd) {
		return new Point((int) ptd.getX(), (int) ptd.getY());
	}

	protected double getLength() {
		double dx = super.getX1() - super.getX2();
		double dy = super.getY1() - super.getY2();
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	public String toString() {
		return String.format ("Line: (%d, %d) -> (%d, %d)", getStartPoint().x, getStartPoint().y, getEndPoint().x, getEndPoint().y);
	}

}
