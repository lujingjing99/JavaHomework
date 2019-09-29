package bag1;

import java.util.Map;

public class TableInfo {
	private String tableName;
	private Class<?>clazz;
	private boolean needPersist=false;
	private Map<String,ColumnInfo>columns=new HashMap<String,ColumnInfo>;
}
