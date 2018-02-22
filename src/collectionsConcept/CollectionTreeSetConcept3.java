package collectionsConcept;

import java.util.TreeSet;

public class CollectionTreeSetConcept3 
{
	public static void main(String[] args) 
	{
		TreeSet TS = new TreeSet();
		
		TS.add(new Pen("Red",20));
		TS.add(new ITBook("Java",150));
		TS.add(new NTBook("LongSize",85));
		TS.add(new Pen("Green",56));
		TS.add(new ITBook("Unix",140));
		TS.add(new NTBook("RuledNote",80));
		TS.add(new Pen("Blue",45));
		
		for (Object object : TS) {
			System.out.println(object);
		}
		
	}
}

class ITBook implements Comparable
{
	String name;
	int price;
	public ITBook(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ITBook [name=" + name + ", price=" + price + "]";
	}
	
	public int compareTo(Object obj) 
	{
		if(obj instanceof ITBook)
		{
			ITBook bk = (ITBook)obj;
			if(this.price > bk.price)
				return 1;
			else
				return -1;
		}
		else if(obj instanceof Pen)
		{
			Pen p = (Pen)obj;
			if(this.price > p.price)
				return 1;
			else
				return -1;
		}
		else if(obj instanceof NTBook)
		{
			NTBook nb = (NTBook)obj;
			if (this.price > nb.price) 
				return 1;
			else 
				return -1;
		}
		
	return 0;		
	}
}

class Pen implements Comparable
{
	String color;
	int price;
	public Pen(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pen [color=" + color + ", price=" + price + "]";
	}

	public int compareTo(Object obj) 
	{
		if(obj instanceof ITBook)
		{
			ITBook bk = (ITBook)obj;
			if(this.price > bk.price)
				return 1;
			else
				return -1;
		}
		else if(obj instanceof Pen)
		{
			Pen p = (Pen)obj;
			if(this.price > p.price)
				return 1;
			else
				return -1;
		}
		else if(obj instanceof NTBook)
		{
			NTBook nb = (NTBook)obj;
			if (this.price > nb.price) 
				return 1;
			else 
				return -1;
		}
		
	return 0;		
	}
}

class NTBook implements Comparable
{
	String name;
	int price;
	public NTBook(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "NTBook [name=" + name + ", price=" + price + "]";
	}
	
	public int compareTo(Object obj) 
	{
		if(obj instanceof ITBook)
		{
			ITBook bk = (ITBook)obj;
			if(this.price > bk.price)
				return 1;
			else
				return -1;
		}
		else if(obj instanceof Pen)
		{
			Pen p = (Pen)obj;
			if(this.price > p.price)
				return 1;
			else
				return -1;
		}
		else if(obj instanceof NTBook)
		{
			NTBook nb = (NTBook)obj;
			if (this.price > nb.price) 
				return 1;
			else 
				return -1;
		}
		
	return 0;		
	}
}
