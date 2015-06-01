import java.util.Random;

public class BinaryString {
	private char[] bits;
	
	public BinaryString(int numberOfbits) {
		bits = new char[numberOfbits];
		Random random = new Random();
		for(int i=0; i<numberOfbits; i++)
		{
			if(random.nextDouble() < 0.5)
			{
				bits[i] = '1';
			}
			else
			{
				bits[i] = '0';
			}
		}
	}
	
	public BinaryString(String bits) {
		this.bits = bits.toCharArray();
	}
	
	public int length() {
		return bits.length;
	}
	
	public void set(int index, char value) {
		try {
			if(value == '0' || value == '1')
			{
				bits[index] = value;
			}
			else
			{
				throw new BinaryStringException();
			}
		} catch (RuntimeException e) {
			throw new BinaryStringException();
		}
	}
	
	public char get(int index) {
		try {
			return bits[index];
		} catch (RuntimeException e) {
			throw new BinaryStringException();
		}
	}
	
	public String toString() {
		String resul = " ";
		
		for(int i=0; i<bits.length; i++)
		{
			if(bits[i] == '1')
			{
				resul += "1";
			}
			else
			{
				resul += "0";
			}
		}
		return resul;
	}
}
