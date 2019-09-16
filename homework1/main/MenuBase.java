//用的数据结构课设的C++代码
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
		System.out.println("**************数据结构*******************\n");
		System.out.println( "*\t1、线性表\t2、栈和队列\t3、串\n*\t4、树\t5、图\t0、退出\n");
		System.out.println( "*****************************************\n");
	}

	
	protected void OnList() {
		System.out.println( "处理线性表相关问题\n");
		MenuList pBase = new MenuList();
	}
	public void OnStackAndQueue(){
		System.out.println( "处理栈和队列的问题\n");
		MenuStackAndQueue pBase = new MenuStackAndQueue();
	}
	protected void OnString() {
		System.out.println( "处理串的相关问题\n");
		MenuString pBase=new MenuString();
	}
	protected void OnBiTree() {
		System.out.println( "处理树的相关问题\n");
		MenuBiTree pBase=new MenuBiTree();
	}
	protected void OnGraph() {
		System.out.println( "处理图的相关问题\n");
		MenuGraph pBase=new MenuGraph();
	}
	protected void OnExit() {}
	protected void OnInvilidate() {
		System.out.println( "命令选项错误\n");
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

