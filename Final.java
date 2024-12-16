import CIE.*;
import SEE.Externals;
import java.util.Scanner;

public class Final {
    public static void main(String args[]) {
        int n;
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter number of students:");
        n = s1.nextInt();

        Externals[] eobj = new Externals[n];

        for (int i = 0; i < n; i++) {
            eobj[i] = new Externals();

            System.out.println("Enter name, USN, semester of student:");
            String name = s1.next();
            int usn = s1.nextInt();
            int sem = s1.nextInt();

            eobj[i].getdetails(name, usn, sem);
            eobj[i].displaystudent();
            eobj[i].getimarks();
            eobj[i].getsmarks();
            eobj[i].calfinal();
            eobj[i].displayfmarks();
        }
    }
}

