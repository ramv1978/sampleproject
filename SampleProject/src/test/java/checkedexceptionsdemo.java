import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class checkedexceptionsdemo
        {
            public void readfromfile(String filename) throws IOException
            {
                //FileReader filereader = new FileReader(new File(filename));
                System.out.println("Checked exception using throws IOException ");
            }


public static void main(String[]args) throws IOException {
            checkedexceptionsdemo ckkdemo = new checkedexceptionsdemo();
            ckkdemo.readfromfile("new12");
            try{

            }
            finally
    {
        System.out.println("delete cookies");//THis block is executed irrespective of exception thrown or not
    }
        }
        }
