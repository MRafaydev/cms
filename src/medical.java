import java.util.Scanner;

class medical extends Thread

{
    String med_name, med_comp, exp_date;
    int med_cost, count;
    void new_medi()
    {
        try {

            Scanner input = new Scanner(System.in);

            System.out.print("name:-");
            med_name = input.nextLine();

            System.out.print("comp:-");
            med_comp = input.nextLine();

            System.out.print("exp_date:-");
            exp_date = input.nextLine();

            System.out.print("cost:-");
            med_cost = input.nextInt();

            System.out.print("no of unit:-");
            count = input.nextInt();
        }
        catch (Exception e){
            System.out.println("Error Occured in the medical class");
        }

    }

    void find_medi()
    {
        System.out.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);
    }
}
