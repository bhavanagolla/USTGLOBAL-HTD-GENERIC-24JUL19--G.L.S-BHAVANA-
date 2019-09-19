public class Operators{
	public static void main(String [] args){
	int i=65;
	int j=50;
	int k=i+j;
	System.out.println("add ="+k);//arithematic operator
	k=i-j;
	System.out.println("sub ="+k);
	k=i*j;
	System.out.println("mul ="+k);
	k=i/j;
	System.out.println("div ="+k);
	k=i%j;
	System.out.println("mod ="+k);

	System.out.println("i = "+i);// assignement operator
	System.out.println("j = "+j);
	
	 j+= i;
	System.out.println("i = "+j);
	j-= i;
	System.out.println("i = "+j);
	 j*= i;
	System.out.println("i = "+j);
	j/= i;
	System.out.println("i = "+j);
	j%= i;
	System.out.println("i = "+j);

	 j=i++;//increment operator
	System.out.println(j);
	j=i++;
	System.out.println(j);
	j=i--;//decrement operator
	System.out.println(j);
	j=i--;
	System.out.println(j);

	boolean b= i==j;//relational operator
	System.out.println("For ==: "+b);
	 b= i!=j;
	System.out.println("For !=: "+b);
	b= i>j;
	System.out.println("For >:   "+b);
	 b= i<j;
	System.out.println("For <:   "+b);
	 b= i<=j;
	System.out.println("For <=:   "+b);
	 b= i>=j;
	System.out.println("For >=:   "+b);

	boolean b1=true;//logical operator
	boolean c=false;
	 boolean d=b1&&c;
	System.out.println("For &&:"+d);
	d= b1||c;
	System.out.println("For ||:"+d);
	d= !(b1||c);
	System.out.println("For !:"+d);
	
}
}
