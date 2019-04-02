import java.util.Scanner;
public class towerofhanoi {

    public void solve(int n, String start, String auxiliary, String end) {
        if(n==0)
        {
            return;
        }
        if (n == 1) {
            System.out.println(start + " -> " + end);
        } else {
            solve(n - 1, start, end, auxiliary);
            System.out.println(start + " -> " + end);
            solve(n - 1, auxiliary, start, end);
        }
    }

    public static void main(String[] args) {
        towerofhanoi obj = new towerofhanoi();
        System.out.print("Enter number of discs: ");
        int disk;
        Scanner sc = new Scanner(System.in);
        disk = sc.nextInt();
        obj.solve(disk, "A", "B", "C");
    }
}
