package com.wrapperclasses;

public class WrapperClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 9223372036854775807l;
		float f = 9.1234567f;
		double d = 9.1234567899876d;

//		AutoBoxing    ##normal cunstructor for a class is depricated for better performance
		Byte byte1 = b;
		Short short1 = s;
		Integer integer = i;
		Long long1 = l;
		Float float1 = f;
		Double double1 = d;
		System.out.println("output for AutoBoxing\n-----------------------\n" + byte1 + "->" + byte1.getClass() + "\n"
				+ short1 + "->" + short1.getClass() + "\n" + integer + "->" + integer.getClass() + "\n" + long1 + "->"
				+ long1.getClass() + "\n" + float1 + "->" + float1.getClass() + "\n" + double1 + "->"
				+ double1.getClass());

//		Unboxing 
		byte b1 = byte1.byteValue();
		short s1 = short1.shortValue();
		int i1 = integer.intValue();
		long l1 = long1.longValue();
		float f1 = float1.floatValue();
		double d1 = double1.doubleValue();
		System.out.println("\noutput for UnBoxing\n-----------------------\n" + b1 + "\n" + s1 + "\n" + i1 + "\n" + l1
				+ "\n" + f1 + "\n" + d1);
		
//		autoUnBoxing
		byte b2 = byte1;
		short s2 = short1;
		int i2 = integer;
		long l2 = long1;
		float f2 = float1;
		double d2 = double1;
		System.out.println("\noutput for AutoUnBoxing\n-----------------------\n" + b2 + "\n" + s2 + "\n" + i2 + "\n"
				+ l2 + "\n" + f2 + "\n" + d2);
		
//		primitive datatype to String
		System.out.println("\nobject data to String data\n---------------------------");
		String[] strings = new String[] { String.valueOf(b2), String.valueOf(s2), String.valueOf(i2),
				String.valueOf(l2), String.valueOf(f2), String.valueOf(d2) };
		for (String string : strings) {
			System.out.println(string + "->" + string.getClass());
		}
		
//		String to primitive datatype
		byte b3 = Byte.parseByte(strings[0]);
		short s3 = Short.parseShort(strings[1]);
		int i3 = Integer.parseInt(strings[2]);
		long l3 = Long.parseLong(strings[3]);
		float f3 = Float.parseFloat(strings[4]);
		double d3 = Double.parseDouble(strings[5]);
		System.out.println("\noutput for AutoUnBoxing\n-----------------------\n" + b3 + "\n" + s3 + "\n" + i3 + "\n"
				+ l3 + "\n" + f3 + "\n" + d3);
	}

}
