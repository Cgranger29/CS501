import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;


public class PetMain {

    public static void main(String[] args) throws IOException{
        String filename;
        FileInputStream fileNameStream;
        Scanner fileNameScanner;

        String petName, dogName, dogBreed;
        int petAge, dogAge;

        fileNameStream = new FileInputStream("pet.txt");
        fileNameScanner = new Scanner(fileNameStream);

        Pet myPet = new Pet();

        petName = fileNameScanner.next();

        petAge = fileNameScanner.nextInt();


        myPet.setName(petName);
        myPet.setAge(petAge);

        myPet.printInfo();

        fileNameStream.close();
        fileNameScanner.close();
    }
}
