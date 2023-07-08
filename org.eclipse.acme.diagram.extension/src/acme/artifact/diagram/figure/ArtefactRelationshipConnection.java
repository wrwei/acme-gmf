/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.artifact.diagram.figure;

import java.awt.geom.CubicCurve2D;
import java.awt.geom.PathIterator;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.widgets.Display;

public class ArtefactRelationshipConnection extends PolylineConnection {

	//offset X and offset Y
	private static int OFFSET_X = 0;
	private static int OFFSET_Y = 70;

	//list of connection points
	private List<PrecisionPoint> connectionPoints = new ArrayList<PrecisionPoint>();

	//bend X and bend Y
	private int bend_X;
	private int bend_Y;

	private int queueEntries = 0;
	
	@Override
	protected void outlineShape(Graphics g) {

		connectionPoints.clear();
		Point bendPointStart = null;
		Point bendPointEnd = null;
		
		//calculating bend points
		int lineup = calculateLineup(getStart(), getEnd());
		switch (lineup) {
		case 1:
			bendPointStart = new Point(getStart().x + bend_X, getStart().y - bend_Y);
			bendPointEnd = new Point(getEnd().x - bend_X, getEnd().y + bend_Y);
			break;
		case 2:
			bendPointStart = new Point(getStart().x + bend_X, getStart().y + bend_Y);
			bendPointEnd = new Point(getEnd().x - bend_X, getEnd().y - bend_Y);
			break;
		case 3:
			bendPointStart = new Point(getStart().x + bend_X, getStart().y - bend_Y);
			bendPointEnd = new Point(getEnd().x - bend_X, getEnd().y + bend_Y);
			break;
		case 4:
			bendPointStart = new Point(getStart().x + bend_X, getStart().y + bend_Y);
			bendPointEnd = new Point(getEnd().x - bend_X, getEnd().y - bend_Y);
			break;
		case 5:
			bendPointStart = new Point(getStart().x, getStart().y);
			bendPointEnd = new Point(getEnd().x, getEnd().y);
			break;
		default:
			break;
		}

		//cubic curve
		CubicCurve2D curve = new CubicCurve2D.Float(getStart().x, getStart().y, bendPointStart.x, bendPointStart.y,
				bendPointEnd.x, bendPointEnd.y, getEnd().x, getEnd().y);

		//path iterator for curve
		PathIterator pi = curve.getPathIterator(null, Float.MIN_VALUE);

		//add to connection points
		while (pi.isDone() == false) {
			PrecisionPoint p = getCurrentPoint(pi);
			connectionPoints.add(p);
			pi.next();
		}

		//draw path from start point and to each of the connection points
		Path p = new Path(Display.getCurrent());
		p.moveTo(getStart().x, getStart().y);

		for (PrecisionPoint po : connectionPoints) {
			p.lineTo((float) po.preciseX(), (float) po.preciseY());
		}
		
		//draw to end point
		p.lineTo(getEnd().x, getEnd().y);

		g.setInterpolation(SWT.HIGH);

		Display display = Display.getCurrent();
		g.setAntialias(SWT.ON);

		g.setForegroundColor(display.getSystemColor(SWT.COLOR_BLACK));
		g.drawPath(p);

		int counter = queueEntries;
		Path path = new Path(Display.getCurrent());

		PrecisionPoint last = connectionPoints.get(connectionPoints.size() - 1);
		path.moveTo((float) last.preciseX(), (float) last.preciseY());
		int size = connectionPoints.size() - 1;
		for (int i = 0; i < counter * 35; i++) {
			PrecisionPoint nextPoint = connectionPoints.get(size - i);
			path.lineTo((float) nextPoint.preciseX(), (float) nextPoint.preciseY());
		}
		if (counter > 1) {
			g.drawPath(path);
		}
		
		p.dispose();
		path.dispose();
		
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
	}

	private PrecisionPoint getCurrentPoint(PathIterator pi) {
		double[] coordinates = new double[6];
		PrecisionPoint p = new PrecisionPoint();

		int type = pi.currentSegment(coordinates);
		if (type == PathIterator.SEG_LINETO || type == PathIterator.SEG_MOVETO) {

			double x = coordinates[0];

			double y = coordinates[1];

			p.setPreciseX(x);

			p.setPreciseY(y);
		}
		return p;
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		Rectangle bounds = super.getBounds();
		
		Rectangle newBounds = new Rectangle();
		newBounds.width = bounds.width + 40;
		newBounds.height = bounds.height + 40;
		newBounds.x = bounds.x - 20;
		newBounds.y = bounds.y - 20;
		bounds.union(newBounds);
		return bounds;
	}

	/*
	 * results return indicates where the end point is
	 *   3  |  2
	 * -----------
	 * 	 4  |  1
	 * finally 5 means end point is directly below start point
	 */
	private int calculateLineup(Point startPoint, Point endPoint) {
		//if start point and end point have the same X
		if (startPoint.x == endPoint.x) {
			int reference = (startPoint.x - endPoint.x) / 2;
			if (reference > 130)
				reference = 130;
			this.bend_X = OFFSET_X + reference;
			this.bend_Y = OFFSET_Y + 30;
			return 5;
		}
		//if end point is in south east
		if (startPoint.x <= endPoint.x && startPoint.y <= endPoint.y) {
			this.bend_X = OFFSET_X;
			this.bend_Y = -OFFSET_Y;
			return 1;
		}
		//if end point is in north east
		if (startPoint.x <= endPoint.x && startPoint.y >= endPoint.y) {
			this.bend_X = OFFSET_X;
			this.bend_Y = OFFSET_Y;
			return 2;
		}
		//if end point is in north west
		if (startPoint.x >= endPoint.x && startPoint.y >= endPoint.y) {
			int reference = (startPoint.x - endPoint.x);
			if (reference > 100)
				reference = 100;
			this.bend_X = OFFSET_X + reference;
			this.bend_Y = OFFSET_Y + 30;
			return 3;
		}
		// if end point is in south west
		if (startPoint.x >= endPoint.x && startPoint.y <= endPoint.y) {
			int reference = (startPoint.x - endPoint.x) / 2;
			if (reference > 130)
				reference = 130;
			this.bend_X = OFFSET_X;// + reference;
			this.bend_Y = OFFSET_Y;
			return 4;
		}
		return 0;
	}

	public List<PrecisionPoint> getConnectionPoints() {
		return connectionPoints;
	}

	public void setConnectionPoints(List<PrecisionPoint> connectionPoints) {
		this.connectionPoints = connectionPoints;
	}

	public void setEntry(int count) {
		this.queueEntries = count;
	}
}