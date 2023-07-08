/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.gsn.diagram.figure;


import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;

public class InContextOfACPDecoration extends PolygonDecoration {

	public static final PointList RECTANGLE = new PointList();
	
	static {
		RECTANGLE.addPoint(0, 1);
		RECTANGLE.addPoint(-2, 1);
		RECTANGLE.addPoint(-2, -1);
		RECTANGLE.addPoint(0, -1);
	}
}
