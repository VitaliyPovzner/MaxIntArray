package tel_ran.array_max_length.controller;

public class ArrayMaxLengthAppl {
	public static void main(String[] args) {
		System.out.println(maxLenght());
	}
	public static int maxLenght(){
		int length = 0;
		int r = Integer.MAX_VALUE;
		int[] array = null;
		while (length != r - 1) {
			try {
				array = new int[(length + r) / 2];
				length = (length + r) / 2;
			} catch (OutOfMemoryError e) {
				r = (length + r) / 2;
			} finally {
				array = null;
			}
		}
		return length;
	}

}
