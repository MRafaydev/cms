import java.util.Scanner;

class patient extends Thread

{
    String pid, pname, disease, sex, admit_status;
    int age;
    void new_patient()

    {
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("id:-");
            pid = input.nextLine();

            System.out.print("name:-");
            pname = input.nextLine();

            System.out.print("disease:-");
            disease = input.nextLine();

            System.out.print("sex:-");
            sex = input.nextLine();

            System.out.print("admit_status:-");
            admit_status = input.nextLine();

            System.out.print("age:-");
            age = input.nextInt();
        }
        catch (Exception e){
            System.out.println("Error occured in the Patient class");
        }
    }

    void patient_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
    }
}
