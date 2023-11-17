import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Initial date: " + date);

        //aggiungi un anno, sottrai un mese, aggiungi 7 giorni
        OffsetDateTime newDate = changeDate(date);
        System.out.println("New date: " + newDate);

        //Stampa il risultato localizzata per l'Italia
        String dateString = newDate.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.ITALY));
        System.out.println("Date in Italian: "+ dateString);
    }

    public static OffsetDateTime changeDate(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.plusYears(1).minusMonths(1).plusDays(7);
    }


}
}