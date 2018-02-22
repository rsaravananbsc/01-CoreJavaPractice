package map;

import java.util.*;

public class MapConceptTreeMap1
{
	public static void main(String[] args) 
	{
	
		TreeMap TM = new TreeMap(new AscName());
		
		Studentz ST1 = new Studentz(10, "Saravanan");
		Studentz ST2 = new Studentz(10, "Bemesh");
		Studentz ST3 = new Studentz(10, "Amesh");
		Studentz ST4 = new Studentz(10, "Ramesh");
		
		TM.put(ST1, ST2); TM.put(ST3, ST4);
		
		
		
		Set keys = TM.entrySet();
		for (Object object : keys) 
		{
			System.out.println(object);
		}
		
		
	}
}

class Studentz implements Comparator
{
	int studid;
	String studname;
	
	public Studentz(int studid, String studname) 
	{
		super();
		this.studid = studid;
		this.studname = studname;
	}

	@Override
	public String toString() {
		return "Studentz [studid=" + studid + ", studname=" + studname + "]";
	}

	@Override
	public int compare(Object obj1, Object obj2) 
	{
		Studentz stz1 = (Studentz)obj1;
		Studentz stz2 = (Studentz)obj2;
		
		return stz1.studname.compareTo(stz2.studname);
	}
	
}

class AscName implements Comparator
{
	public int compare(Object obj1, Object obj2) 
	{
		Studentz stz1 = (Studentz)obj1;
		Studentz stz2 = (Studentz)obj2;
		
		return stz1.studname.compareTo(stz2.studname);
	}
	
}