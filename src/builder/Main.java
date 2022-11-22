package builder;

import builder.builder.BusinessCard;
import builder.builder.BusinessCardBuilder;
import builder.builder.LargeBusinessCardBuilder;
import builder.builder.SmallBusinessCardBuilder;

public class Main {
    public static void main(String[] args) {
        BusinessCardBuilder builder = new SmallBusinessCardBuilder();
        BusinessCard card = builder.build();

        System.out.println(card);
    }
}
