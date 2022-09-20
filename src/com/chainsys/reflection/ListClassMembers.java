package com.chainsys.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class ListClassMembers {
	public static void main(String args[]) {
//		earlyBinding();
//		testA();
		testB();
//		lateBinding();
//		queryTypeInfo();
//	testsetAccessible();
//		printClassInfo(args);
	}

	public static void printClassInfo(Object ob) {
		
		Class<?> classreflected = ob.getClass();
		System.out.println(classreflected.getName());
		System.out.println("Constructors:");
		Constructor<?> constructorlist[] = classreflected.getConstructors();
		for (int i = 0; i < constructorlist.length; i++) {
			System.out.println("\t" + constructorlist[i]);
		}
		//
		System.out.println("Methods:");
		Method methodlist[] = classreflected.getMethods();
		for (int i = 0; i < methodlist.length; i++) {
			methodlist[i].setAccessible(true);
			System.out.println("\t Method Name: " + methodlist[i].getName() + " ParameterCount "
					+ methodlist[i].getParameterCount() + " returnType " + methodlist[i].getReturnType());
		}
	}

	public static void testA() {
		String s1 = "hello";
		printClassInfo(s1);
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		Integer x = 2000;
		printClassInfo(x);
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		Empo firstEmp = new Empo();
		printClassInfo(firstEmp);
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		Actor hero = new Actor();
		printClassInfo(hero);

	}

	public static void testB() {
		String classname = "com.chainsys.reflection.Actor";
		Class<?> actorclass = null;
		try {
			actorclass = Class.forName(classname); // Actor actorclass=null;
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		Object obj = null;
		try {
//			obj=actorclass.newInstance(); // new Actor();
			obj = actorclass.getDeclaredConstructors()[0].newInstance();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		printClassInfo(obj);
	}

	public static void earlyBinding() {
		Actor actorReference = new Actor();
		actorReference.Name = "SJK";
		actorReference.city = "Chennai";
		actorReference.printCity();
		actorReference.printName();

	}

	@SuppressWarnings("deprecation")
	public static void lateBinding() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Class Name");
			/**
			 * java.lang.String java.lang.Integer java.lang.Array java.lang.List
			 * com.chainsys.reflection.Actor com.chainsys.reflection.Empo
			 */
			String className = sc.nextLine();
			// load the class -- A a1;
			// Class<?> classReference = Class.forName(className);
			// load the class -- Actor a1;
			Class<?> Actor = Class.forName(className);

			// create Object a1=new A();
			// Object obj = classReference.getDeclaredConstructor().newInstance();
			// create Object a1=new Actor();
			Object obj = Actor.getDeclaredConstructor().newInstance();

			System.out.println("Class Name " + obj.getClass().getName());
			System.out.println("Hash Code " + obj.hashCode());
			// ------
			System.out.println("Parent Class " + Actor.getSuperclass().getName());
			int mod = Actor.getModifiers();
			System.out.println("IsPublic " + Modifier.isPublic(mod));
			System.out.println("IsPrivate " + Modifier.isPrivate(mod));
			System.out.println("IsAbstract " + Modifier.isAbstract(mod));
			System.out.println("IsProtected " + Modifier.isProtected(mod));

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			sc.close();
		}
	}

	//
	public static void queryTypeInfo() {
		java.util.Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Class Name");
			String cname = sc.nextLine();
			Class<?> classReferenace = Class.forName(cname);
			System.out.println("Constructors:");
			Constructor<?> clist[] = classReferenace.getConstructors();
			for (int i = 0; i < clist.length; i++) {
				System.out.println("\t" + clist[i]);
			}
			System.out.println("Fields:");
			Field flist[] = classReferenace.getFields();
			for (int i = 0; i < flist.length; i++) {
				flist[i].setAccessible(true);
//				String modifier = ConstantsUtil.getModifierName(flist[i].getModifiers(), 
//						Class.forName("java.lang.reflect.Modifier"));
//				System.out.println("\t" + flist[i].getType() + " " + flist[i].getName() + " Modifier " +modifier );
				System.out.println(
						"\t" + flist[i].getType() + " " + flist[i].getName() + " Modifier " + flist[i].getModifiers());
				/*
				 * Fields: int Eno Modifier --- 1 --- class java.lang.String Name Modifier --- 1
				 * ---
				 */
			}
			System.out.println("Methods:");
			Method mlist[] = classReferenace.getMethods();
			for (int i = 0; i < mlist.length; i++) {
				mlist[i].setAccessible(true);
				System.out.println("\t Method Name: " + mlist[i].getName() + " ParameterCount "
						+ mlist[i].getParameterCount() + " returnType " + mlist[i].getReturnType());
				if (mlist[i].getParameterCount() > 0) {
					Parameter[] param = mlist[i].getParameters();
					for (Parameter p1 : param) {
						System.out.println("\t\t" + p1.getName() + " " + p1.getParameterizedType().getTypeName());
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			sc.close();
		}
	}

	public static void testsetAccessible() {
		try {
			String cname = "com.chainsys.reflection.Actor";
			Class<?> classReference = Class.forName(cname);
			Object objReference = classReference.getDeclaredConstructor().newInstance();
// city is default access modifier
			Field fieldCity = objReference.getClass().getDeclaredField("city");
			fieldCity.setAccessible(false);//by using this encapsulation is break and give access
			fieldCity.set(objReference, "Chennai");
			Object cityFieldInstance = fieldCity.get(objReference);
			System.out.println(cityFieldInstance);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
