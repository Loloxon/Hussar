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
System.out.print(x+ " " +"to liczba pierwsza"+ " " +"\n");
}
if(dzielniki>2){
System.out.print(x+ " " +"ma"+ " " +dzielniki+ " " +"dzielnikow"+ " " +"\n");
}
x=x+1;
}
}
}
