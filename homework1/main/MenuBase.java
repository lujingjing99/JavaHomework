//�õ����ݽṹ�����C++����
package main;
import Menu.*;
public class MenuBase {
	public static final int ID_LIST=1;
	public static final int ID_STACKANDQUEUE=2;
	public static final int ID_STRING=3;
	public static final int ID_BITREE=4;
	public static final int ID_GRAPH=5;
	public static final int ID_EXIT=0;
	public MenuBase() {};
	MenuBase Parent;
	protected void Show() {
		System.out.println("**************���ݽṹ*******************\n");
		System.out.println( "*\t1�����Ա�\t2��ջ�Ͷ���\t3����\n*\t4����\t5��ͼ\t0���˳�\n");
		System.out.println( "*****************************************\n");
	}

	
	protected void OnList() {
		System.out.println( "�������Ա��������\n");
		MenuList pBase = new MenuList();
	}
	public void OnStackAndQueue(){
		System.out.println( "����ջ�Ͷ��е�����\n");
		MenuStackAndQueue pBase = new MenuStackAndQueue();
	}
	protected void OnString() {
		System.out.println( "�������������\n");
		MenuString pBase=new MenuString();
	}
	protected void OnBiTree() {
		System.out.println( "���������������\n");
		MenuBiTree pBase=new MenuBiTree();
	}
	protected void OnGraph() {
		System.out.println( "����ͼ���������\n");
		MenuGraph pBase=new MenuGraph();
	}
	protected void OnExit() {}
	protected void OnInvilidate() {
		System.out.println( "����ѡ�����\n");
	}
	
	public  MenuBase getParent(){
		return Parent;
	}
	public void DoEvent(int ID) {
		switch (ID)
		{
		case ID_LIST:
			OnList();
			break;
		case ID_STACKANDQUEUE:
			OnStackAndQueue();
			break;
		case ID_STRING:
			OnString();
			break;
		case ID_BITREE:
			OnBiTree();
			break;
		case ID_GRAPH:
			OnGraph();
			break;
		case ID_EXIT:
			OnExit();
			break;
		default:
			OnInvilidate();
			break;
	}
	}
}

