package com.swtjface.Ch3; //Ch3_Composite 클래스 덧붙이는 작업 widgets, window,
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.window.*;

//TabFolder 생성. composite에 composite 추가
import com.swtjface.Ch3.*;

public class WidgetWindow extends ApplicationWindow
{
	public WidgetWindow()
	{
		super(null);
	}
		protected Control createContents(Composite parent)
		{
			//3.5 tabfolder 추가
			TabFolder tf = new TabFolder(parent, SWT.NONE);
			
			TabItem chap3 = new TabItem(tf, SWT.NONE);
			chap3.setText("Chapter3");
			chap3.setControl(new Ch3_Composite(tf));  //Ch3_Composite 받아옴
			
			getShell().setText("Widget Window"); //전체 쉘 반환
			return parent;
		}
		public static void main(String[] args) 
		{
			WidgetWindow wwin = new WidgetWindow();
			wwin.setBlockOnOpen(true);
			wwin.open();
			Display.getCurrent().dispose(); //user interface thread 반환
		}

}
