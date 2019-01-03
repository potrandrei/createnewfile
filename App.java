package ProiectDiploma;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
    The program checks bar code number input from Honeywell 1300 model. The scanner doesn't need driver.it is plug and
play and it has USB connection. After scanning  the bar code number the informations is written in a Excel file.
Also it has to be checked additional informations according to this number like(date: (y/m/d, h/m/s),
measured resistance from digital multimeter(this information will be added afterward).
    The program has to be running in a loop.
    After the informations are correct according to the standard values he values is written in Excel file.After this
    the program is starts automatically from the beginning
 */
public class App {
    public static void main(String args[]) {

// Create the file for barcode scan informations.
        String fileName = "Processflow.txt";  // the name of the file.
try {
    PrintWriter outputStream = new PrintWriter(fileName);
    outputStream.println("Test for writting text in file"); // Stores the informations in the Ram.
    outputStream.close(); // Writte the data into the file.

    System.out.println("Done");
}
catch (FileNotFoundException e){
    e.printStackTrace();
}

        String bsrcodescanner; // Initiate the parameter for barcode scanning.

        Scanner barcode = new Scanner(System.in);  // Creates a new objekt bar code.
        System.out.println("Please scan the bar code");
        bsrcodescanner = barcode.next(); // Input bar code from Honeywell 1300.


    }
}