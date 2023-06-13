
public class Point {
float x,y;
Point()
{
	x=0;
	y=0;
}
Point(float x1, float y1)
{
	x=x1;
	y=y1;
}

public boolean arePointEqual(Point SecondPoint)
{
	return this.x==SecondPoint.x && this.y==SecondPoint.y;
		
}




}
