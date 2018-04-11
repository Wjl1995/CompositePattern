package Component;

public abstract class Component {

	public abstract void printStruct(String preStr);
	
	public void addChild(Component ahild)
	{
		throw new UnsupportedOperationException("对象不支持此功能");
	}
	
	public void removeChild(Component ahild)
	{
		throw new UnsupportedOperationException("对象不支持此功能");
	}
	
	public void getChildren(int index)
	{
		throw new UnsupportedOperationException("对象不支持此功能");
	}
}
