
public class Line {

	float x1,y1,x2,y2;
	Line()
	{
		x1=0;
		y1=0;
		x2=0;
		y2=0;
	}
	Line(float p1, float p2, float p3, float p4)
	{
		x1=p1;
		y1=p2;
		x2=p3;
		y2=p4;
	}

	public boolean isLinesEqual(Line Line2)
	{
		return ((this.x1==Line2.x1 && this.y1==Line2.y1)&&(this.x2==Line2.x2 && this.y2==Line2.y2));
			
	}
	
	public double length()
	{
		return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
	}
	
	
}
