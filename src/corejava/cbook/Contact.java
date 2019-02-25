package corejava.cbook;

public class Contact {
	
		private String empno;
		private String name;
		private String email;
		private String mobile;
		
		private Contact(ContactBuilder builder){
			this.empno = builder.empno;
			this.name = builder.name;
			this.mobile = builder.mobile;
			this.email = builder.email;
		}
		
		public String getEmpno() {
			return empno;
		}

		public String getName() {
			return name;
		}

		public String getEmail() {
			return email;
		}

		public String getMobile() {
			return mobile;
		}

		public static class ContactBuilder{
			private String empno;
			private String name;
			private String email;
			private String mobile;
			
			public  static ContactBuilder newInstance(){
				return new ContactBuilder();
			}
			public ContactBuilder withEmpno(String empno){
				this.empno = empno;
				return this;
			}
			public ContactBuilder withName(String name){
				this.name=name;
				return this;
			}
			public ContactBuilder withMobile(String mobile){
				this.mobile=mobile;
				return this;
			}
			public ContactBuilder withEmail(String email){
				this.email = email;
				return this;
			}
			public Contact build(){
				return new Contact(this);
			}
			
		}
}
