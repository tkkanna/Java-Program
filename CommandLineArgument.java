public class CommandLineArgument{
public static void main(String args[])
{
int num1,num2;
if(args.length>0)
{
try
{
num1=Integer.parseInt(args[0]);
num2=Integer.parseInt(args[1]);
System.out.println("Sum of inputted numbers=");
System.out.println(num1 +num2);
}
catch(NumberFormatException e)
{
System.err.println('Argument must be an integer.");
}
}
}
}
