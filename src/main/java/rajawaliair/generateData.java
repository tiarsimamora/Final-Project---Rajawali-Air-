package rajawaliair;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;


public class generateData {

    static List<String> indexList = Arrays.asList("1", "2", "3", "4", "5");
    static Random random = new Random();
    static Faker faker = new Faker(new Locale("ID"));

    public static String getFirstName() {
        return faker.name().firstName();
    }

    public static String getFullName() {
        return faker.name().fullName();
    }
    public static String getEmail() {
        return faker.internet().emailAddress();
    }

    public static String getValue() {
        return indexList.get(random.nextInt(indexList.size()));
    }
    public static String getProductName() {
        return faker.commerce().productName();
    }

    public static String getAirportName() {
        return faker.funnyName().name();
    }

    public static String getCity() {
        return faker.address().cityName();
    }

    public static String getDateNow() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy");
        return sdf.format(faker.date().past(3, TimeUnit.DAYS));}

    public static String generateCityCode() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        SecureRandom random = new SecureRandom();

        StringBuilder codeBuilder = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            codeBuilder.append(randomChar);
        }

        return codeBuilder.toString();
    }


    public static String generateAirplaneCode() {
        String characters = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        SecureRandom random = new SecureRandom();

        StringBuilder codeBuilder = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            codeBuilder.append(randomChar);
        }

        return codeBuilder.toString();
    }
}