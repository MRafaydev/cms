import java.util.Scanner;


class facility extends Thread {

    String fec_name;

    void add_feci() {
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("fecility:-");
            fec_name = input.nextLine();
        }
        catch (Exception e){
            System.out.println("Error Occured in the Facility class");
        }
    }

    void show_feci() {
        System.out.println(fec_name);
    }
}
