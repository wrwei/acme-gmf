/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.assurancecase.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

public class ModuleShape extends Shape {

	//main shape
	protected PointList shape = new PointList();
	//top left rectangle
	protected PointList topLeftRectangle = new PointList();
	
	public static final int TOP_RECT_WIDTH = 38;
	public static final int TOP_RECT_HEIGHT = 18;
	
	
	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		topLeftRectangle.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(shape);
		graphics.fillPolygon(topLeftRectangle);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawPolygon(shape);
		graphics.drawPolygon(topLeftRectangle);
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		
		Point rectTL, rectTR, rectBR, rectBL;
		rectTL = new Point(r.x, r.y);
		rectTR = new Point(r.x + TOP_RECT_WIDTH, r.y);
		rectBR = new Point(r.x + TOP_RECT_WIDTH, r.y + TOP_RECT_HEIGHT);
		rectBL = new Point(r.x, r.y + TOP_RECT_HEIGHT);
		
		topLeftRectangle.removeAllPoints();
		topLeftRectangle.addPoint(rectTL);
		topLeftRectangle.addPoint(rectTR);
		topLeftRectangle.addPoint(rectBR);
		topLeftRectangle.addPoint(rectBL);
		
		
		Point tl, tr, br, bl;
		tl = new Point(r.x, r.y + TOP_RECT_HEIGHT);
		tr = new Point(r.x + r.width, r.y + TOP_RECT_HEIGHT);
		br = new Point(r.x + r.width, r.y + r.height);
		bl = new Point(r.x, r.y + r.height);
		
		shape.removeAllPoints();
		shape.addPoint(tl);
		shape.addPoint(tr);
		shape.addPoint(br);
		shape.addPoint(bl);
		
	}

}
