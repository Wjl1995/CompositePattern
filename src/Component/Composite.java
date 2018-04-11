package Component;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> childComponents = null;
	private String name = "";
	
	public Composite(String name)
	{
		this.name = name;
	}
	
	public void addChild(Component child)
	{
		if (childComponents == null)
			childComponents = new ArrayList<Component>();
		childComponents.add(child);
	}
	
	@Override
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr+"+"+this.name);
		if (this.childComponents != null)
		{
			preStr += " ";
			for (Component c:childComponents)
			{
				c.printStruct(preStr);
			}
		}
	}

}
