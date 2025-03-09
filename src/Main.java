
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        String id = new Random().toString();
        String uuid = UUID.randomUUID().toString();
        System.out.print("[+] Insert Student's name: ");
        String Name = new Scanner(System.in).nextLine();
        System.out.print("[+] Insert Student's class: ");
        float Class = new Scanner(System.in).nextFloat();
        System.out.print("[+] Insert Student's score: ");
        int Score = new Scanner(System.in).nextInt();
        // adding table
        Table table = new Table(4, BorderStyle.CLASSIC, ShownBorders.ALL);
        table.addCell("uuid", new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell("Name",new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell("Class",new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell("Score",new CellStyle(CellStyle.HorizontalAlign.center));
        // set width
        table.setColumnWidth(0,10,20);
        table.setColumnWidth(1,10,20);
        table.setColumnWidth(2,10,20);
        table.setColumnWidth(3,10,20);
        //
        table.addCell(String.valueOf(uuid), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(Name, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(String.valueOf(Class), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(String.valueOf(Score), new CellStyle(CellStyle.HorizontalAlign.center));
        System.out.println(table.render());
    }
}