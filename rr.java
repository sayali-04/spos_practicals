package pr4;
import java.util.Scanner;
public class rr {
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
int wtime[],btime[],rtime[],num,quantum,total;
wtime = new int[10];
btime = new int[10];
rtime = new int[10];
System.out.print("Enter number of processes(MAX 10): ");
num = s.nextInt();
System.out.print("Enter burst time");
for(int i=0;i<num;i++) { System.out.print("\nP["+(i+1)+"]: "); btime[i] = s.nextInt(); rtime[i] =
btime[i]; wtime[i]=0; } System.out.print("\n\nEnter quantum: "); quantum = s.nextInt(); int rp =
num; int i=0; int time=0; System.out.print("0"); wtime[0]=0; while(rp!=0) { if(rtime[i]>quantum)
{
rtime[i]=rtime[i]-quantum;
System.out.print(" | P["+(i+1)+"] | ");
time+=quantum;
System.out.print(time);
}
else if(rtime[i]<=quantum && rtime[i]>0)
{time+=rtime[i];
rtime[i]=rtime[i]-rtime[i];
System.out.print(" | P["+(i+1)+"] | ");
rp--;
System.out.print(time);
}
i++;
if(i==num)
{
i=0;
}
}

}
}

OUTPUT:
Enter number of processes(MAX 10): 5
Enter burst time
P[1]: 12

P[2]: 14

P[3]: 15

P[4]: 18

P[5]: 20



Enter quantum: 4
0 | P[1] | 4 | P[2] | 8 | P[3] | 12 | P[4] | 16 | P[5] | 20 | P[1] | 24 | P[2] | 28 | P[3] | 32 | P[4] | 36 | P[5] | 40 | P[1] | 44 | P[2] | 48 | P[3] | 52 | P[4] | 56 | P[5] | 60 | P[2] | 62 | P[3] | 65 | P[4] | 69 | P[5] | 73 | P[4] | 75 | P[5] |
