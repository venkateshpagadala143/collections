package _01_04_2021_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class DemoCollection {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		List<Integer> list1=new LinkedList<>();
		List<Integer> list2=new Vector<>();
		
		
		
		
		Set<Integer> lset = new LinkedHashSet<>();
		Set<Integer> set = new HashSet<>();
		Set<Float>tset=new TreeSet<>();
		
		tset.add(0.12f);
		tset.add(1.12f);
		tset.add(3.13f);
		tset.add(0.92f);
		tset.add(0.72f);
		System.out.println(tset);
		lset.add(15);
		lset.add(20);
		lset.add(12);
		lset.add(35);

		set.add(15);
		set.add(20);
		set.add(12);
		set.add(35);
		set.add(32);
		System.out.println(lset);
		System.out.println(set);
	}

}
