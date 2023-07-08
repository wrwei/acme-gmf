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

import gsn.InContextOf;

public class InContextOfStraightConnection extends PolylineConnectionEx {

	private InContextOf inContextOf;
	
	public void setInContextOf(InContextOf inContextOf) {
		this.inContextOf = inContextOf;
	}
	
	@Override
	protected void outlineShape(Graphics g) {
		g.setBackgroundColor(ColorConstants.black);
		g.setForegroundColor(ColorConstants.black);
		g.drawLine(getStart(), getEnd());
		if (inContextOf != null) {
			Point midPoint = getPoints().getMidpoint();
			if (inContextOf.isIsMany()) {
				CircleDecoration circleDecoration = new CircleDecoration();
				circleDecoration.setLocation(midPoint);
				circleDecoration.setFill(true);
				g.setBackgroundColor(ColorConstants.black);
				g.fillOval(circleDecoration.getBounds());
				g.drawOval(circleDecoration.getBounds());		
				
//				String constraint = "";
//				if (!inContextOf.getImplementationConstraint().isEmpty()) {
//					constraint = inContextOf.getImplementationConstraint().get(0).getContent().getValue().get(0).getContent();
//				}
			}
			else if (inContextOf.isIsOptional()) {
				CircleDecoration circleDecoration = new CircleDecoration();
				circleDecoration.setLocation(midPoint);
				circleDecoration.setFill(true);
				g.setBackgroundColor(ColorConstants.white);
				g.fillOval(circleDecoration.getBounds());
				g.drawOval(circleDecoration.getBounds());
			}
			
			if (inContextOf.getCitedElement() != null) {
				InContextOfACPDecoration decoration = new InContextOfACPDecoration();
				decoration.setLocation(midPoint);
				decoration.setFill(true);
				decoration.setScale(20, 10);
				g.setBackgroundColor(ColorConstants.black);
				g.fillRectangle(decoration.getBounds());
				g.drawRectangle(decoration.getBounds());

			}
		}
	}
}
