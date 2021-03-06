package com.company.swaglabs.constants;

public enum ItemsTexts {
    ITEM1( "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection."),
    ITEM2("A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included."),
    ITEM3("Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt."),
    ITEM4("It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office."),
    ITEM5("Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel."),
    ITEM6("This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.");

    private final String description;


    ItemsTexts( String text) {
        this.description = text;

    }
    public String getDescription(){
        return description;
    }

    public static ItemsTexts[] getItemsTexts() {
        ItemsTexts[] itemsTextsArr = {ITEM1, ITEM2, ITEM3, ITEM4, ITEM5, ITEM6};
        return itemsTextsArr;

    }
}
