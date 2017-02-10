import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String fString = sc.nextLine();
        Calendar now = Calendar.getInstance();
        Long t = 27878676556453328l;
        Date nowDate = new Date(t);
        System.out.println("Миллисекуды: " + now.get(Calendar.MILLISECOND));
        System.out.println("День в году: " + now.get(Calendar.DAY_OF_YEAR));
        now.add(Calendar.DAY_OF_YEAR, 10);
        System.out.println("Увеличеный день в году: " + now.get(Calendar.DAY_OF_YEAR));
        System.out.println("День месяца: " + now.get(Calendar.DAY_OF_MONTH));
        Formatter formatter = new Formatter();
        formatter.format("%td %<td", now);
        System.out.println(formatter);
        SimpleDateFormat dateFormat = new SimpleDateFormat("G MMMM W a mm z", Locale.ENGLISH);
        System.out.println(dateFormat.format(nowDate));
        t += t;
        nowDate = new Date(t);
        System.out.println(dateFormat.format(nowDate));
        dateFormat = new SimpleDateFormat("F MM yyyy");
        Date buffDate =dateFormat.parse(fString);
        dateFormat = new SimpleDateFormat("yyyy MM F");
        System.out.println(dateFormat.format(buffDate));
    }
}
