import java.util.Comparator;
import java.util.TreeSet;
class comp implements Comparator
{
	public int compare(Object ob1,Object ob2)
	{
		String s1=(String)ob1;//typecasting object to string type
		String s2=(String)ob2;
		return-(s1.compareTo(s2));
	}
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new comp());
		t.add("Chirag");
		t.add("Ishan");
		t.add("Aman");
		t.add("Chakshu my son");
		t.add("Himanshu");
		t.add("Deepak");
		System.out.println(t);
	}
}