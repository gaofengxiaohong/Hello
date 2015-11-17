package iostream;

public class out {
	public static void print(Object[] s)
	{
		for(Object obj : s)
		{
			System.out.print(obj +  " ");
		}
	}
	public static void print(String s)
	{
		System.out.print(s);
	}
	public static void print(String... s)
	{
		for(String c : s)
		{
			System.out.print(c);
		}
	}
	public static void print(int s)
	{
		System.out.print(s);
	}
	public static void print(int... s)
	{
		for(int c : s)
		{
			System.out.print(c);
		}
	}
	public static void print(char s)
	{
		System.out.print(s);
	}
	public static void print(char... s)
	{
		for(char c : s)
		{
			System.out.print(c);
		}
	}
	public static void print(float s)
	{
		System.out.print(s);
	}
	public static void print(float... s)
	{
		for(float c : s)
		{
			System.out.print(c);
		}
	}
	public static void print(double s)
	{
		System.out.print(s);
	}
	public static void print(double... s)
	{
		for(double c : s)
		{
			System.out.print(c);
		}
	}
	public static void println(Object[] s)
	{
		for(Object obj : s)
		{
			System.out.println(obj);
		}
	}
	public static void println()
	{
		System.out.println();
	}
	public static void println(String s)
	{
		System.out.println(s);
	}
	public static void println(String... s)
	{
		for(String c : s)
		{
			System.out.println(c);
		}
	}
	public static void println(int s)
	{
		System.out.println(s);
	}
	public static void println(int... s)
	{
		for(int c : s)
		{
			System.out.println(c);
		}
	}
	public static void println(char s)
	{
		System.out.println(s);
	}
	public static void println(char... s)
	{
		for(char c : s)
		{
			System.out.println(c);
		}
	}
	public static void println(float s)
	{
		System.out.println(s);
	}
	public static void println(float... s)
	{
		for(float c : s)
		{
			System.out.println(c);
		}
	}
	public static void println(double s)
	{
		System.out.println(s);
	}
	public static void println(double... s)
	{
		for(double c : s)
		{
			System.out.println(c);
		}
	}
}