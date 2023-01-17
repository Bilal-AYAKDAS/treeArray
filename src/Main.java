import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        MyHash myHash=new MyHash(30);
        String fileName = "dictionary.txt";

            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            //this while read file
            while ((line = br.readLine()) != null) {
                String[] parts =line.split(":");
                myHash.Add(new Node(parts[0],parts[1]));

            }
            } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Dosya okuma başarısız.");

            }

            myHash.printHash();
        }

    }

