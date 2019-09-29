package bag1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ColumnInfo {
	private String columnName;
	private Class<?>type;
	private boolean isID=false;
	private boolean nullable=true;
	private int length=32;
	private boolean needPersist=false;
	public ColumnInfo parse(Field field) {
		this.columnName=field.getName();
		this.type=field.getName();
		Annotation[] annotations=field.getAnnotations();
		for(Annotation annotationType()).equals(Column.class){
			this.needPersist=true;
			Column column=(Column)annotation;
			if(!column.value().equals("")) {
				this.columnName=column.value();
			}
		}
	this.nullable=column.nullable();
	if(column.length()!=-1) {
		this.length=column.length();
	}else if(annotation.annotationType().equas(ID.class)) {
		this.needPersist=true;
		ID id=(ID)annotation;
		this.isID=true;
		if(!id.value().equels("")) {
			this.columnName=id.value();
		}
	}
	if(this.needPersist) {
		return this;
	}else {return null;}
	
	
	public String toString() {
		return null;
	}
}
