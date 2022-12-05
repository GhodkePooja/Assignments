public class TypecastingF_Int{
public static void main(String[] args){
//int a=10.0;//we got o/p lossy conversion.we have to change this program.means we have to explicit the program.
//System.out.println(a);


//we have to change like this
int a=(int)10.0;
System.out.println(a);//here we got output but some data are missing
}


}