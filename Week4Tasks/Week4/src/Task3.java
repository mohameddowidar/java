import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws Exception {
        File file = new File("Scores.txt");
        file = readFromWebToFile("http://liveexample.pearsoncmg.com/data/Scores.txt");
        long sum = getSum(file);
        double average = getAverage(file);
        System.out.println(sum);
        System.out.println(average);
    }
    public static File readFromWebToFile(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
        // write to a file
        File file = new File("Scores.txt");
        FileWriter writer = new FileWriter("Scores.txt");
        String i;
        while ((i = read.readLine()) != null) {
            writer.write(i);
            writer.write(System.getProperty( "line.separator" ));
        }
        read.close();
        writer.close();
        // return the file
        return file;
    }
    public static long getSum(File file) throws FileNotFoundException {
        long sum = 0;
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            int x = Integer.valueOf(scan.nextInt());
            sum += x;
        }
        return  sum;
    }
    public static float getAverage(File file) throws FileNotFoundException {
        long sum = 0;
        int count = 0;
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            int x = Integer.valueOf(scan.nextInt());
            sum += x;
            count++;
        }
        return  (sum / count);
    }
}