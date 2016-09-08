/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package jcharts;

import net.sf.jasperreports.engine.JRExpression;
import net.sf.jasperreports.engine.JRExpressionCollector;
import net.sf.jasperreports.engine.design.JRDesignElementDataset;

/**
 * 
 * @author Lucian Chirita (lucianc@users.sourceforge.net)
 * @version $Id: DesignAxisDataset.java 3031 2009-08-27 11:14:57Z teodord $
 */
public class DesignAxisDataset extends JRDesignElementDataset implements AxisDataset
{
	
	private static final long serialVersionUID = 1L;
	
	private JRExpression labelExpression;
	private JRExpression valueExpression;

	public void collectExpressions(JRExpressionCollector collector)
	{
		AxisChartCompiler.collectExpressions(this, collector);
	}
	
	public JRExpression getLabelExpression()
	{
		return labelExpression;
	}

	public void setLabelExpression(JRExpression labelExpression)
	{
		this.labelExpression = labelExpression;
	}

	public JRExpression getValueExpression()
	{
		return valueExpression;
	}

	public void setValueExpression(JRExpression valueExpression)
	{
		this.valueExpression = valueExpression;
	}

}
