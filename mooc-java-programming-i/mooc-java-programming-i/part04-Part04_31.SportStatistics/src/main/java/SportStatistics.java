
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            System.out.println("Team:");
            String team = scan.nextLine();
            int games = 0;
            int wins = 0;
            int losses = 0;
            
            while(fileReader.hasNextLine()){
                String row = fileReader.nextLine();
                String[] parts = row.split(",");
                
                int length = parts.length;
                
                for (int i = 0; i < length; i++) {
                    if(team.equals(parts[i])) {
                        games++;
                        if (i == 0) {
                            if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                                wins++;
                            } else if (Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])) {
                                losses++;
                            }
                        } else {
                            if (Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])) {
                                wins++;
                            } else if (Integer.valueOf(parts[3]) < Integer.valueOf(parts[2])) {
                                losses++;
                            }
                        }
                    }
                }
            }
            
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
