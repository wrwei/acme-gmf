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

import gsn.ContractModuleReference;

public class ContractModuleReferenceShape extends Shape {

	private ContractModuleReference contractModuleReference;
	protected PointList shape = new PointList();
	protected PointList topLeftRectangle = new PointList();
	protected PointList botRightRectangle = new PointList();
	
	protected PointList triangle = new PointList(3);
	public static final int TRIANGLE_DECORATION_HEIGHT = 10;

	public static final int TOP_RECT_WIDTH = 38;
	public static final int TOP_RECT_HEIGHT = 13;
	
	public static final int BOT_RECT_WIDTH = 38;
	public static final int BOT_RECT_HEIGHT = 13;
	
	public PointList getParallelgram() {
		return shape; 
	}

	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		topLeftRectangle.translate(dx, dy);
		botRightRectangle.translate(dx, dy);
		triangle.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(shape);
		graphics.fillPolygon(topLeftRectangle);
		graphics.fillPolygon(botRightRectangle);
		if (contractModuleReference.isUninstantiated()) {
			graphics.fillPolygon(triangle);
		}
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawPolygon(shape);
		graphics.drawPolygon(topLeftRectangle);
		graphics.drawPolygon(botRightRectangle);
		if (contractModuleReference.isUninstantiated()) {
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
		
		Point tRectTL, tRectTR, tRectBR, tRectBL;
		tRectTL = new Point(r.x, r.y);
		tRectTR = new Point(r.x + TOP_RECT_WIDTH, r.y);
		tRectBR = new Point(r.x + TOP_RECT_WIDTH, r.y + TOP_RECT_HEIGHT);
		tRectBL = new Point(r.x, r.y + TOP_RECT_HEIGHT);
		
		topLeftRectangle.removeAllPoints();
		topLeftRectangle.addPoint(tRectTL);
		topLeftRectangle.addPoint(tRectTR);
		topLeftRectangle.addPoint(tRectBR);
		topLeftRectangle.addPoint(tRectBL);
		
		
		Point tl, tr, br, bl;
		tl = new Point(r.x, r.y + TOP_RECT_HEIGHT);
		tr = new Point(r.x + r.width, r.y + TOP_RECT_HEIGHT);
		br = new Point(r.x + r.width, r.y + r.height - BOT_RECT_HEIGHT);
		bl = new Point(r.x, r.y + r.height - BOT_RECT_HEIGHT);
		
		shape.removeAllPoints();
		shape.addPoint(tl);
		shape.addPoint(tr);
		shape.addPoint(br);
		shape.addPoint(bl);
		
		Point bRectTL, bRectTR, bRectBR, bRectBL;
		bRectTL = new Point(r.x + r.width - BOT_RECT_WIDTH, r.y + r.height - BOT_RECT_HEIGHT);
		bRectTR = new Point(r.x + r.width, r.y + r.height - BOT_RECT_HEIGHT);
		bRectBR = new Point(r.x + r.width, r.y + r.height);
		bRectBL = new Point(r.x + r.width - BOT_RECT_WIDTH, r.y + r.height);
		
		botRightRectangle.removeAllPoints();
		botRightRectangle.addPoint(bRectTL);
		botRightRectangle.addPoint(bRectTR);
		botRightRectangle.addPoint(bRectBR);
		botRightRectangle.addPoint(bRectBL);
		

		if (contractModuleReference.isUninstantiated()) {
			Point triangleTop = new Point(r.x + r.width/2, r.y + r.height-BOT_RECT_HEIGHT);
			Point triangleLeft = new Point(triangleTop.x - TRIANGLE_DECORATION_HEIGHT, triangleTop.y + TRIANGLE_DECORATION_HEIGHT);
			Point triangleRight = new Point(triangleTop.x + TRIANGLE_DECORATION_HEIGHT, triangleTop.y + TRIANGLE_DECORATION_HEIGHT);
			
			triangle.removeAllPoints();
			triangle.addPoint(triangleTop);
			triangle.addPoint(triangleLeft);
			triangle.addPoint(triangleRight);

		}
	}

	public ContractModuleReference getContractModuleReference() {
		return contractModuleReference;
	}
	
	public void setContractModuleReference(ContractModuleReference contractModuleReference) {
		this.contractModuleReference = contractModuleReference;
	}
}
