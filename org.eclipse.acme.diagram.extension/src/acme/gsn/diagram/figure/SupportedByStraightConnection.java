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
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

import gsn.SupportedBy;

public class SupportedByStraightConnection extends PolylineConnectionEx {

	private SupportedBy supportedBy;

	public void setSupportedBy(SupportedBy supportedBy) {
		this.supportedBy = supportedBy;
	}
	
	
	@Override
	protected void outlineShape(Graphics g) {
		g.setBackgroundColor(ColorConstants.black);
		g.setForegroundColor(ColorConstants.black);
		g.drawLine(getStart(), getEnd());
		if (supportedBy != null) {
			Point midPoint = getPoints().getMidpoint();
			if (supportedBy.isIsMany()) {
				CircleDecoration circleDecoration = new CircleDecoration();
				circleDecoration.setLocation(midPoint);
				circleDecoration.setFill(true);
				g.setBackgroundColor(ColorConstants.black);
				g.fillOval(circleDecoration.getBounds());
				g.drawOval(circleDecoration.getBounds());		
				
//				String constraint = "";
//				if (!supportedBy.getImplementationConstraint().isEmpty()) {
//					constraint = supportedBy.getImplementationConstraint().get(0).getContent().getValue().get(0).getContent();
//				}
			}
			else if (supportedBy.isIsOptional()) {
				CircleDecoration circleDecoration = new CircleDecoration();
				circleDecoration.setLocation(midPoint);
				circleDecoration.setFill(true);
				g.setBackgroundColor(ColorConstants.white);
				//g.setForegroundColor(ColorConstants.white);
				g.fillOval(circleDecoration.getBounds());
				g.drawOval(circleDecoration.getBounds());
			}
			
			if (supportedBy.getCitedElement() != null) {
				SupportedByACPDecoration decoration = new SupportedByACPDecoration();
				decoration.setLocation(new Point(midPoint.x + 10, midPoint.y));
				decoration.setFill(true);
				decoration.setScale(20, 10);
				g.setBackgroundColor(ColorConstants.black);
				g.fillRectangle(decoration.getBounds());
				g.drawRectangle(decoration.getBounds());

			}
		}
	}
}
