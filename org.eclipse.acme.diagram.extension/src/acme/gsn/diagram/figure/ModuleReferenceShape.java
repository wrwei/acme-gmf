/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.gsn.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

import gsn.ModuleReference;

public class ModuleReferenceShape extends Shape {

	private ModuleReference moduleReference;
	protected PointList shape = new PointList();
	protected PointList topLeftRectangle = new PointList();
	public static final int TOP_RECT_WIDTH = 38;
	public static final int TOP_RECT_HEIGHT = 13;
	
	protected PointList triangle = new PointList(3);
	public static final int TRIANGLE_DECORATION_HEIGHT = 10;

	
	public PointList getParallelgram() {
		return shape; 
	}

	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		topLeftRectangle.translate(dx, dy);
		triangle.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(shape);
		graphics.fillPolygon(topLeftRectangle);
		if (moduleReference.isUninstantiated()) {
			graphics.fillPolygon(triangle);
		}
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawPolygon(shape);
		graphics.drawPolygon(topLeftRectangle);
		if (moduleReference.isUninstantiated()) {
			graphics.drawPolygon(triangle);
		}
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		graphics.drawText("Reference", new Point(r.x + 5 + TOP_RECT_WIDTH, r.y));
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		
		int offset = 0;
		if (moduleReference != null) {
			//uninstantiated
			if (moduleReference.isUninstantiated()) {
				Point triangleTop = new Point(r.x + r.width/2, r.y + r.height-TRIANGLE_DECORATION_HEIGHT);
				Point triangleLeft = new Point(triangleTop.x - TRIANGLE_DECORATION_HEIGHT, triangleTop.y + TRIANGLE_DECORATION_HEIGHT);
				Point triangleRight = new Point(triangleTop.x + TRIANGLE_DECORATION_HEIGHT, triangleTop.y + TRIANGLE_DECORATION_HEIGHT);
				
				triangle.removeAllPoints();
				triangle.addPoint(triangleTop);
				triangle.addPoint(triangleLeft);
				triangle.addPoint(triangleRight);
				offset = TRIANGLE_DECORATION_HEIGHT;
			}
		}
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
		br = new Point(r.x + r.width, r.y + r.height-offset);
		bl = new Point(r.x, r.y + r.height-offset);
		
		shape.removeAllPoints();
		shape.addPoint(tl);
		shape.addPoint(tr);
		shape.addPoint(br);
		shape.addPoint(bl);
		
	}
	
	public ModuleReference getModuleReference() {
		return moduleReference;
	}
	
	public void setModuleReference(ModuleReference moduleReference) {
		this.moduleReference = moduleReference;
	}

}
