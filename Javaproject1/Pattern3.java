public class Pattern3{
	public static void main(String []args){
	int rows=4;
	for(int i=1;i<=rows;i++){
	int num=i;
	for(int j=1;j<=i;j++)
	{
	System.out.print(num+"");
	num=num+rows-j;
	}
	System.out.println();
	}
	}
}