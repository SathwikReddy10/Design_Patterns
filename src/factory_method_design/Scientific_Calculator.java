package Factory_Method_Design;

public class Scientific_Calculator implements Calculator{

	@Override
	public double add(double x, double y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public double subtract(double x, double y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	public double multiply(double x, double y) {
		// TODO Auto-generated method stub
		return x * y;
	}

	@Override
	public double divide(double x, double y) {
		// TODO Auto-generated method stub
		 return x / y;
	}
	
	public double sin(double x) {
        return Math.sin(x);
    }

    public double cos(double x) {
        return Math.cos(x);
    }

    public double tan(double x) {
        return Math.tan(x);
    }

}
