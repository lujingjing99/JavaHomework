package Menu;

public class MenuList {
	public static final int ID_CREAT=1;
	public static final int ID_INSERT=2;
	public static final int ID_DELETE=3;
	public static final int ID_SHOW=4;
	public void Show() {
		System.out.println( "**************线性表********************\n");
		System.out.println( "*\t1、创建\t2、插入\n*\t3、删除\t4、遍历\t0、退出\n");
		System.out.println( "****************************************\n");
	}
	protected void OnCreat() {}
	protected void OnInsert() {};
	protected void OnDelete() {};
	protected void OnShow() {};
	protected void OnExit() {}
	protected void OnInvilidate() {
		System.out.println( "命令选项错误\n");
	}
	public void DoEvent(int ID) {
		switch (ID)
		{
		case ID_CREAT:
			OnCreat();
			break;
		case ID_INSERT:
			OnInsert();
			break;
		case ID_DELETE:
			OnDelete();
			break;
		case ID_SHOW:
			OnShow();
			break;
		default:
			OnInvilidate();
			break;
		}
	}
}
