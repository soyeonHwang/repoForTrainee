

package com.swtjface.Ch2;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.window.*;
import com.swtjface.Ch3.*;
import com.swtjface.Ch4.*;

public class WidgetWindow_2 extends ApplicationWindow 
{
	public WidgetWindow_2() //widget
	{
		super(null);
	}
	protected Control createContents(Composite parent) 
	{
		//tf �� �θ�� SWT�� �Ҵ�. ch3&ch4
		TabFolder tf = new TabFolder(parent, SWT.NONE); //�θ�Ŭ���� ����
		
		TabItem chap3 = new TabItem(tf,SWT.NONE); //TapFolder�ȿ� TabItem 
		chap3.setText("Chapter3");
		chap3.setControl(new Ch3_Composite(tf));
		
		TabItem chap4 = new TabItem(tf,SWT.NONE);
		chap4.setText("Chapter4");
		chap4.setControl(new Ch4_Composite(tf));
		//
		getShell().setText("Widget Window_2");
		return parent;
	}
	public static void main(String[] args) 
	{
	WidgetWindow_2 wwin = new WidgetWindow_2();
	wwin.setBlockOnOpen(true);
	wwin.open();
	Display.getCurrent().dispose(); //�����������̽� thread ��ȯ,�ڿ��Ҵ� ���� 
	}
}