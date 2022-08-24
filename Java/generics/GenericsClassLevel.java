package com.generics;

public class GenericsClassLevel {
	public class Person<T>{
		private T data;

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}
		
	}
	
	public static class TestPerson{
		public static void main(String[] args) {
//			GenericsClassLevel objClassLevel = new GenericsClassLevel();
			Person<String> objPerson = new GenericsClassLevel().new Person<>();
			objPerson.setData("Hello Budy!");
			System.out.println(objPerson.data);
		}
	}
}
