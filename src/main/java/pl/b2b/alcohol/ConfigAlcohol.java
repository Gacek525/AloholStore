package pl.b2b.alcohol;

import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.ArrayList;
import java.util.List;

public class ConfigAlcohol {

    public String expensiveAlcohol(List<Alcohol> alcohols) {

        Alcohol result = alcohols.get(0);

        for (Alcohol alcohol : alcohols) {

            if (alcohol.getPrice() > result.getPrice()) {
                result = alcohol;
            }
        }

        return result.getName();
    }

    {


    }

    public String cheapAlcohol(List<Alcohol> alcohols) {

        Alcohol result = alcohols.get(0);

        for (Alcohol alcohol : alcohols) {

            if (alcohol.getPrice() < result.getPrice()) {
                result = alcohol;
            }
        }

        return result.getName();
    }

    public double averagePrice(List<Alcohol> alcohols) {

        double avarage;
        double sum = 0;

        for (Alcohol alcohol: alcohols) {
            sum += alcohol.getPrice();
        }
avarage= sum/alcohols.size();

        return avarage;
    }

    public List<String> namesOfAlcoholsWitchPriceIsHigherThanAverage(List<Alcohol> alcohols) {

        List <String> names = new ArrayList<>();
        double avarage = averagePrice(alcohols);
        for (Alcohol alcohol : alcohols) {
            if (avarage < alcohol.getPrice()) {
                names.add(alcohol.getName());
            }
        }

        return names;
    }

    public String nameAndPrice(Alcohol alcohol) {


        return alcohol.getName() + " " + alcohol.getPrice();
    }

    public List<String> nameAndPriceBelowAveragePrice(List<Alcohol> alcohols) {

        double avgPrice = averagePrice(alcohols);
        List<String> result = new ArrayList<>();

        for (Alcohol alcohol : alcohols) {
            if (alcohol.getPrice() < avgPrice) {
                result.add(nameAndPrice(alcohol));
            }
        }

        return result;
    }

}
