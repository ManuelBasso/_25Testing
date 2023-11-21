import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Initial date: " + date);

        //aggiungi un anno
        OffsetDateTime newDate = addYear(date);
        System.out.println("Add 1 year: " + newDate);

        //sottrai un mese
        newDate = subtractMonth(newDate);
        System.out.println("Minus 1 month: " + newDate);

        //aggiungi 7 giorni
        newDate = add7days(newDate);
        System.out.println("Plus 7 days:" + newDate);

        //Stampa il risultato localizzata per l'Italia
        String dateString = newDate.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.ITALY));
        System.out.println("Date in Italian: "+ dateString);
    }

     static OffsetDateTime add7days(OffsetDateTime newDate) {
        if (newDate == null) {
            return null;
        } else {
            return newDate.plusDays(7);
        }
    }

     static OffsetDateTime subtractMonth(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.minusMonths(1);
        }
    }

    public static OffsetDateTime addYear(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.plusYears(1);
    }


}
}