package ch17_collection.part3_map;

import java.util.HashMap;
import java.util.Map;

import ch17_collection.part2_Set.sec12_member.Member;

public class Ex02_MemberHashMap {
// Hash는 key의 순서보장이 안됨, 값을 새로 생성해서 따로 보여줌
	public static void main(String[] args) {
		Map<Integer, Member> map = new HashMap<Integer, Member>();
		map.put(101, new Member(21, "james")); // 101 <- 고유값 
		map.put(103, new Member(24, "maria"));
		map.put(102, new Member(29, "brian"));
		map.forEach((k, v) -> System.out.println(k + ": " + v));
	
		Map<Member, Integer> map2 = new HashMap<Member, Integer>();
		map2.put(new Member(21, "james"), 100000); 
		map2.put(new Member(24, "maria"), 300000);
		map2.put(new Member(29, "brian"), 150000);
		map2.put(new Member(21, "james"), 200000); 
		map2.forEach((k, v) -> System.out.println(k + ": " + v));
	}

}
