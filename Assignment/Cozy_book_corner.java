
public class Cozy_book_corner {
    public static void main(String[] args) {

        String[] categories = {"Fiction", "Nepali"};

        String[][] titles = {
            {"Shirishko ful"},
            {"Muna Madan"}
        };

        double[][] prices = {
            {400.0},
            {200.0}
        };

        for (int i = 0; i < 2; i++) {
            System.out.println(categories[i]);
            System.out.println(titles[i][0]);
            System.out.println(prices[i][0]);
        }
    }
}