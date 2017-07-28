
public class Paint {

	String paintName;
	int litre;
	double cost;
	int coverage;
	
	
	public Paint(String paintName, int litre, double cost, int coverage)
	{
		this.paintName = paintName;
		this.litre = litre;
		this.cost = cost;
		this.coverage = coverage;
	}
	
	public String OutputPaint(Paint p)
	{
		String paint = "Name = " + p.paintName +" Litre = " + p.litre + " Price = £" + p.cost + " Coverage = " + p.coverage;
		return paint;
	}
}
