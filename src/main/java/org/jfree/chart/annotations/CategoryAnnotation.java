
/* ===========================================================
BLAH BLAH BLAH
 */

package org.jfree.chart.annotations;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;

/**
 * The interface that must be supported by annotations that are to be added to
 * a {@link CategoryPlot}. Note that, in JFreeChart 1.0.14, a non-compatible 
 * change has been made to this interface (it now extends the Annotation
 * interface to support change notifications).
 */
public interface CategoryAnnotation extends Annotation {

    /**
     * Draws the annotation.
     *
     * @param g2  the graphics device.
     * @param plot  the plot.
     * @param dataArea  the data area.
     * @param domainAxis  the domain axis.
     * @param rangeAxis  the range axis.
     */
    //TODO Fix Short Variable
    void draw(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea,
                     CategoryAxis domainAxis, ValueAxis rangeAxis);

}
