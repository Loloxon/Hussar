public class Output{
public static void main(){
int x=3;
for(int tempUntypicalVariable=3; tempUntypicalVariable <= 100; tempUntypicalVariable++){
int dzielnik=1;
int dzielniki=0;
while(dzielnik<=x){
if(x%dzielnik==0){
dzielniki=dzielniki+1;
}
dzielnik=dzielnik+1;
}
if(dzielniki==2){
System.out.print(x);
System.out.print(" to liczba pierwsza");
System.out.println();
}
if(dzielniki>2){
System.out.print(x);
System.out.print(" ma ");
System.out.print(dzielniki);
System.out.print(" dzielnikow");
System.out.println();
}
x=x+1;
}
}
}
