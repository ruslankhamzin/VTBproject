package ru.startandroid.develop.vtbproject.placeholder;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

import ru.startandroid.develop.vtbproject.R;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<PlaceholderItem> ITEMS = new ArrayList<PlaceholderItem>();


    private static final int COUNT = 25;

    static {
        addItem(new PlaceholderItem(R.drawable.games, "Steam", "-133"));
        addItem(new PlaceholderItem(R.drawable.bk, "Burger King", "-259"));
        addItem(new PlaceholderItem(R.drawable.plus, "Пополнение", "+500"));
        addItem(new PlaceholderItem(R.drawable.kino, "Киномакс", "-250"));
        addItem(new PlaceholderItem(R.drawable.pyaterka, "Пятерочка", "-233"));
        addItem(new PlaceholderItem(R.drawable.plus, "Пополнение", "+650"));
        addItem(new PlaceholderItem(R.drawable.games, "Steam", "-133"));
        addItem(new PlaceholderItem(R.drawable.bk, "Burger King", "-259"));
        addItem(new PlaceholderItem(R.drawable.plus, "Пополнение", "+500"));
        addItem(new PlaceholderItem(R.drawable.kino, "Киномакс", "-250"));
        addItem(new PlaceholderItem(R.drawable.pyaterka, "Пятерочка", "-233"));
        addItem(new PlaceholderItem(R.drawable.plus, "Пополнение", "+650"));
        addItem(new PlaceholderItem(R.drawable.games, "Steam", "-133"));
        addItem(new PlaceholderItem(R.drawable.bk, "Burger King", "-259"));
        addItem(new PlaceholderItem(R.drawable.plus, "Пополнение", "+500"));
        addItem(new PlaceholderItem(R.drawable.kino, "Киномакс", "-250"));
        addItem(new PlaceholderItem(R.drawable.pyaterka, "Пятерочка", "-233"));
        addItem(new PlaceholderItem(R.drawable.plus, "Пополнение", "+650"));
        // Add some sample items.


    }

    private static void addItem(PlaceholderItem item) {
        ITEMS.add(item);
    }


    /**
     * A placeholder item representing a piece of content.
     */
    public static class PlaceholderItem {
        public final int image;
        public final String shop;
        public final String summa;


        public PlaceholderItem(int image, String shop, String summa) {
            this.image = image;
            this.shop = shop;
            this.summa = summa;

        }

    }
}