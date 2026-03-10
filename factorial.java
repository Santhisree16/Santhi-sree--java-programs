import java.util.*;
class factorial
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int r=fact(n);
System.out.println(r);
s.close();
}
static int fact(int f)
{
int r=1;
for(int i=f;i>0;i--)
{
r=r*i;
}
return r;
}
}

