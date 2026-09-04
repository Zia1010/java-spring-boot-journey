import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FilterPredicateExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        Predicate<String> startsWithC = name -> name.startsWith("C");

        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (startsWithC.test(name)) {
                filteredNames.add(name);
            }
        }

        Optional<String> firstResult = filteredNames.isEmpty()
                ? Optional.empty()
                : Optional.of(filteredNames.get(0));

        if (firstResult.isPresent()) {
            System.out.println("Found: " + firstResult.get());
        } else {
            System.out.println("No value found");
        }
    }
}
