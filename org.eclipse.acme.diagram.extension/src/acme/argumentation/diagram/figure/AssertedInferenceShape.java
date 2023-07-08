/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.argumentation.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import argumentation.AssertedInference;

public class AssertedInferenceShape extends Shape{

	private AssertedInference assertedInference;
	protected Rectangle rectangle = new Rectangle();
//	protected Rectangle rectangle2 = new Rectangle();
	
	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		rectangle.translate(dx, dy);
//		rectangle2.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.setBackgroundColor(ColorConstants.black);
		graphics.fillOval(rectangle);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawOval(rectangle);
//		graphics.drawOval(rectangle2);
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);

		rectangle.setBounds(r.x+3, r.y+3, r.width-6, r.height-6);
//		rectangle2.setBounds(r.x, r.y, r.width, r.height);
	}

	public void setAssertedInference(AssertedInference assertedInference) {
		this.assertedInference = assertedInference;
	}
	
	public AssertedInference getAssertedInference() {
		return assertedInference;
	}
}
