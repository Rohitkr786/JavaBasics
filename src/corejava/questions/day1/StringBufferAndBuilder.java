package corejava.questions.day1;

public class StringBufferAndBuilder {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello Java");
		System.out.println(sb);
		sb.append("-Eight");
		System.out.println(sb.reverse().toString());
		StringBuilder sbb = new StringBuilder("Hello Builder");
		System.out.println(sbb);
		sbb.append("-Build");
		System.out.println(sbb);
		StringBufferAndBuilder sv =new StringBufferAndBuilder();
		System.out.println(sv);

	}
	

}
