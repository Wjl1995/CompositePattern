package Component;

public abstract class Component {

	public abstract void printStruct(String preStr);
	
	public void addChild(Component ahild)
	{
		throw new UnsupportedOperationException("����֧�ִ˹���");
	}
	
	public void removeChild(Component ahild)
	{
		throw new UnsupportedOperationException("����֧�ִ˹���");
	}
	
	public void getChildren(int index)
	{
		throw new UnsupportedOperationException("����֧�ִ˹���");
	}
}
