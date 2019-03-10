package corejava.collectionframework.memberoperations;

import lombok.Getter;

@Getter
public class MemberIdGenerator {
	private static int count = 5005;
	public String suffix = "IND";
	public String prifix = "ASHO";

	
	
	
	
	public static String getMemeberId() {
		MemberIdGenerator mid = new MemberIdGenerator();
		int c=MemberIdGenerator.count;
		c++;
		String id = mid.prifix+""+c+mid.suffix;
		return id;

	}
}
