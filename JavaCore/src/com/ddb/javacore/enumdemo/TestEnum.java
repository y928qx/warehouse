package com.ddb.javacore.enumdemo;

import java.io.PrintStream;

public class TestEnum {
	public static void print(WeekEnum we) {
		PrintStream out = System.out;
		switch (we) {
		case MONDAY:
			out.println("鏄熸湡涓�   ");
			break;
		case TUESDAY:
			out.println("鏄熸湡浜�  ");
			break;
		case WEDNESDAY:
			out.println("鏄熸湡涓�  ");
			break;
		case THURSDAY:
			out.println("鏄熸湡鍥�   ");
			break;
		case FRIDAY:
			out.println("鏄熸湡浜�   ");
			break;
		case SATURDAY:
			out.println("鏄熸湡鍏�   ");
			break;
		default:
			out.println("鏄熸湡鏃�   ");
			break;
		}
	}

	public static void print2(WeekEnum2 we) {
		PrintStream out = System.out;
		switch (we) {
		case MONDAY:
			out.println(we);
			PrintWeek(we, out);
			break;
		case TUESDAY:
			out.println(we);
			PrintWeek(we, out);
			break;
		case WEDNESDAY:
			out.println(we);
			PrintWeek(we, out);
			break;
		case THURSDAY:
			out.println(we);
			PrintWeek(we, out);
			break;
		case FRIDAY:
			out.println(we);
			PrintWeek(we, out);
			break;
		case SATURDAY:
			out.println(we);
			PrintWeek(we, out);
			break;
		default:
			out.println(we);
			PrintWeek(we, out);
			break;
		}
	}

	private static void PrintWeek(WeekEnum2 we, PrintStream out) {
		out.println(we.getIndex() +" ----"+ we.getDesc());
	}

	public static void main(String[] args) {
		//print(WeekEnum.MONDAY);
		/*
		 * print(WeekEnum.TUESDAY); print(WeekEnum.WEDNESDAY);
		 * print(WeekEnum.THURSDAY); print(WeekEnum.FRIDAY);
		 * print(WeekEnum.SATURDAY); print(WeekEnum.SUNDAY);
		 * */
		PrintStream out = System.out;
		print2(WeekEnum2.MONDAY);
		print2(WeekEnum2.TUESDAY);
		print2(WeekEnum2.WEDNESDAY);
		print2(WeekEnum2.THURSDAY);
		print2(WeekEnum2.FRIDAY);
		
		out.println("閬嶅巻鎵撳嵃鏋氫妇鎵�鏈夊�� 锛�");
		for (WeekEnum2 string : WeekEnum2.values()) {
			PrintWeek(string, out);
		}
		
	}

}
