package corejava.collectionframework.memberoperations;

import java.util.List;

import lombok.Getter;

@Getter
public class MemberIdGenerator {
	private static int count = 5005;
	public String suffix = "IND";
	public String prifix = "ASHO";

	public static String getMemeberId() {
		MemberIdGenerator mid = new MemberIdGenerator();
		MemberContainerImpl mc = MemberContainerImpl.getInstance(); // singleton class
		List<Member> list = mc.getAllMembers(); // get all members who present already
		int c = MemberIdGenerator.count;
		c++;
		String id = mid.prifix + c + mid.suffix; // Generating Memeber ID
		String nid = null;
		if (list.isEmpty()) {
			return id;
		} else {
			for (Member m : list) {
				nid = m.getMid();
				c++;
			}
		}
		id = mid.prifix + c + mid.suffix;
		String newId = nid.replace(nid, id);
		return newId;

	}
}
