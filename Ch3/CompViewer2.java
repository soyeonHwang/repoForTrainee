package com.swtjface.Ch3; //덧붙이는 작업은 jface
import org.eclipse.jface.window.*;
import org.eclipse.swt.widgets.*;

public class CompViewer2 extends ApplicationWindow
	{
	public CompViewer2()
	{
		super(null);
	}
	protected Control createContents(Composite parent) 
	{
		Ch3_SashForm cc1=new Ch3_SashForm(parent);
		return parent;
	}
	public static void main(String[] args) 
	{
		CompViewer2 cv = new CompViewer2();
		cv.setBlockOnOpen(true);
		cv.open();
		Display.getCurrent().dispose();
	}
}
