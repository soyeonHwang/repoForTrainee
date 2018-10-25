package com.swtjface.Ch3; //컨테이너 두개 클래스 생성
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;


public class Ch3_Composite extends Composite
	{
		public Ch3_Composite(Composite parent)
		{
			super(parent, SWT.NONE);
			parent.getShell().setText("Chapter3 Composite");
			
			Ch3_Group cc1 = new Ch3_Group(this);
			cc1.setLocation(0,0); //control method
			cc1.pack(); //필요한 만큼만 공간할당
			
			Ch3_SashForm cc2 = new Ch3_SashForm(this);
			cc2.setLocation(125,125); //control method
			cc2.pack(); 
			
			pack();
		}
}
