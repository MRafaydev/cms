import java.util.Scanner;

class staff
{
    String sid, sname, desg, sex;
    int salary;

    void new_staff()
    {
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("id:-");
            sid = input.nextLine();

            System.out.print("name:-");
            sname = input.nextLine();

            System.out.print("desigination:-");
            desg = input.nextLine();

            System.out.print("sex:-");
            sex = input.nextLine();

            System.out.print("salary:-");
            salary = input.nextInt();
        }
        catch (Exception e){
            System.out.println("Error Occured in the Staff class");
        }
    }

    void staff_info()

    {
        try {
            System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
        }
        catch (Exception e){
            System.out.println("There is an error occured");
        }
    }

}
