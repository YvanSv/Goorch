package Goorch.Worker;
import java.util.Scanner;
import java.io.File;

public class Utils {
    public static String[] getRoundActions()
    {
        String[] actions = new String[18];

        try
        {
            Scanner sc = new Scanner(new File("./Rounds.actions"));
            int line = 0;

            while(sc.hasNextLine())
            {
                String tmp = sc.nextLine();
                try {actions[line] = tmp.split(":")[1];} catch(Exception ex) {}
                try {actions[line] = actions[line].replace("|", "\n");} catch(Exception ex) {}
                line++;
            }
        } catch (Exception e) {}

        return actions;
    }
}
