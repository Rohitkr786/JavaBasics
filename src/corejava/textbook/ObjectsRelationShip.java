package corejava.textbook;

class One{
	 Two obj2;
	One(Two obj2){
		this.obj2=obj2;
	}
	
	 int cube(int x) {
		int result=x*obj2.square(x);
		return result;
	}
}
class Two{
	Three obj3;
	Two(Three obj3 ){
		this.obj3=obj3;
	}
	int square(int x) {
		int res= x*obj3.getx(x);
		return res;
	}
}
class Three{
	int getx(int x) {
		
		return x;
	} 
	
}

public class ObjectsRelationShip {
	public static void main(String[] args) {
		
		
		
		Three obj3= new Three();
		Two obj2=new Two(obj3);
		One obj1=new One(obj2);
		
		System.out.println("Cube is "+obj1.cube(5));
		System.out.println("Square is "+obj2.square(6));
		
		int arr[] = {1,2,3,4,5,75,7485,541};
		
		for(int a:arr) {
			System.out.println(a);
		}
		
		
	}

}
