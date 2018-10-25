package com.swtjface.Ch3; //덧붙이는 작업은 jface
import org.eclipse.jface.window.*;
import org.eclipse.swt.widgets.*;

public class CompViewer extends ApplicationWindow
	{
	public CompViewer()
	{
		super(null);
	}
	protected Control createContents(Composite parent) 
	{
		Ch3_Group cc1=new Ch3_Group(parent);
		return parent;
	}
	public static void main(String[] args) 
	{
		CompViewer cv = new CompViewer();
		cv.setBlockOnOpen(true);
		cv.open();
		Display.getCurrent().dispose();
	}
}
