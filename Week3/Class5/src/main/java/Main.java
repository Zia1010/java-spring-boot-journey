import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
   static class ProductFiltering {
        String name;
        double price;

        public ProductFiltering(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        List<ProductFiltering> products = new ArrayList<>();
        products.add(new ProductFiltering("Apple", 1.5));
        products.add(new ProductFiltering("Banana", 0.8));
        products.add(new ProductFiltering("Cherry", 2.0));
        products.add(new ProductFiltering("Date", 3.5));

        List<String> names = products.stream()
                .filter(p -> p.getPrice() < 3.0)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .map(ProductFiltering::getName)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
