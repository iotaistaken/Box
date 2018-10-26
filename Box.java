
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Box 
{
	private Long length;
	private Long breadth;
	private Long height;
	
	private  Box()
	{
		this.length = (long) 0;
		this.breadth = (long) 0;
		this.height = (long) 0;
		
	}
	private void setL(Long l)
	{
		this.length = l;
	}
	
	private void setB(Long l)
	{
		this.breadth = l;
	}
	
	private  Box(Long l, Long b, Long h)
	{
		this.length = l;
		this.breadth = b;
		this.height = h;
	}
	
	private  Box(Long l)
	{
		this.length = l;
		this.breadth = l;
		this.height = l;
	}
	
	private  void Vol()
	{
		System.out.println(this.length*this.breadth*this.height);;
	}
	public static void main(String[] args) 
	{
		Long x = (long) 1;
		Long y = (long) 2;
		Long z = (long) 3;
		Box obj = new Box();
		Box obj2 = new Box(x,y,z);
		Box obj3 = new Box(x);
		obj.Vol();
		obj2.Vol();
		obj3.Vol();
		System.out.println("Number of edges are " + 6);
	}

}
