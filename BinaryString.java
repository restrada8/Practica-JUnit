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
		bits[index] = value;
	}
	
	public char get(int index) {
		return bits[index];
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
