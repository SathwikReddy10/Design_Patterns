package Factory_Method_Design;

public class Programmer_Calculator implements Calculator{

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
	
	public int binaryToInt(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public String intToBinary(int number) {
        return Integer.toBinaryString(number);
    }

    public int hexToInt(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public String intToHex(int number) {
        return Integer.toHexString(number);
    }

}
