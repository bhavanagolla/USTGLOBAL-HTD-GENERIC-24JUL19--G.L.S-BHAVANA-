public class Pattern4{
	public static void main(String[] args)
	{
	char ch='A';
	for(int i=1;i<=3;i++)
	{
	for(int j=3;j>i;j--)
	{
	System.out.print(" ");
	}
	for(int k=1;k<=(i * 2)-1;k++)
	{
	System.out.print(ch);
	ch++;
	}
	System.out.println();
	}
	int a=1;
	for(int i=1;i<=2;i++)
	{
	for(int j=1;j<=5;j++)
	{
	if(j>=(i+1) && j<=(5-i))
	{
	System.out.print(a);
	a++;
	}
	else{
	System.out.print(" ");
	}
}
}
}
} 