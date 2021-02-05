public abstract class Shape1
{
abstract void draw();
}
class Rect extends Shape1
{
	void draw()
	{
		System.out.println("draw rectangle");
	}}
	class Circle extends Shape1
	{
		void draw()
		{
			System.out.println("draw circle");
		}
	}
class Shape{
	public static void main(String args[])
	{
		Shape1 s,s1;
		s=new Rect();
		s1=new Circle();
		s.draw();
		s1.draw();
	}
	
	}


