package com.swtjface.Ch3; //arrow direction
import org.eclipse.swt.*;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.*;

public class Ch3_SashForm extends Composite
	{
	public Ch3_SashForm(Composite parent)
	{
		super (parent, SWT.NONE);
		
		SashForm sf = new SashForm(this, SWT.VERTICAL);
		sf.setSize(120,80);
		
		Button button1 = new Button(sf, SWT.ARROW | SWT.UP);
		button1.setSize(120,40);
		
		Button button2 = new Button(sf, SWT.ARROW | SWT.DOWN);
		button2.setBounds(0,40,120,40);
	}
	
	
	}
