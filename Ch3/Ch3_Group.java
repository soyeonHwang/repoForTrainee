package com.swtjface.Ch3;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class Ch3_Group extends Composite
{
	public Ch3_Group(Composite parent)
	{
		super(parent, SWT.NONE);
		
		Group group = new Group(this, SWT.SHADOW_ETCHED_IN);
		group.setText("Group Label"); //Group Label
		
		Label label = new Label(group, SWT.NONE);
		label.setText("Two buttons:");
		label.setLocation(20,20);
		label.pack(); //container에 widget추가시 pack
		
		Button b1 = new Button(group, SWT.PUSH);
		b1.setText("Push Button");
		b1.setLocation(20,45);
		b1.pack(); //container에 widget 추가시 pack
		
		Button b2 = new Button(group, SWT.CHECK);
		b2.setText("Check Button");
		b2.setBounds(20,75,90,30);
		
		group.pack(); //container에 group widget 공간 할당 
	} 
}
