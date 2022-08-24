package com.generics;

public class GenericsInMethodLevel {

	public static class GenericsinVoidMethod {
		public static <E> void display(E data) {
			System.out.println(data);
		}
	}

	public static class GenericsinMethodWithReturnType {
		public static <T> String diplay(T data) {
			return "Your Data : " + data;
		}
	}

	public static class GenericsinMethodWithArrayArguments {
		public static <T> void display(T[] data) {
			for (T t : data) {
				System.out.print(t+" ");
			}
			System.out.println();
		}
	}

	public static class Test {
		public static void main(String[] args) {
			GenericsinVoidMethod.display("GenericsinVoidMethod\n--------------------");
			GenericsinVoidMethod.display(12343);
			GenericsinVoidMethod.display("hello");
			GenericsinVoidMethod.display(123.43f);
			GenericsinVoidMethod.display(123.43d);
//			-------------------------------------------------------------------------------------------
			String a = GenericsinMethodWithReturnType
					.diplay("\nGenericsinMethodWithReturnType\n------------------------------");
			String a1 = GenericsinMethodWithReturnType.diplay(123345),
					a2 = GenericsinMethodWithReturnType.diplay("hello"),
					a3 = GenericsinMethodWithReturnType.diplay(123.43f),
					a4 = GenericsinMethodWithReturnType.diplay(123.43d);
			System.out.println(a + "\n" + a1 + "\n" + a2 + "\n" + a3 + "\n" + a4);
//			-------------------------------------------------------------------------------------------
			System.out.println("\nGenericsinMethodWithArrayArguments\n----------------------------------");
			Integer[] integersArray = {1,2,3,4,5};
			Double [] doublesArray = {1.1,2.2,3.3};
			Character[] charactersArray = {'H','E','L','L','O'};
			String [] stringsArray = {"hyd","blg","chennai"};
			GenericsinMethodWithArrayArguments.display(integersArray);
			GenericsinMethodWithArrayArguments.display(doublesArray);
			GenericsinMethodWithArrayArguments.display(charactersArray);
			GenericsinMethodWithArrayArguments.display(stringsArray);
		}
	}
}
