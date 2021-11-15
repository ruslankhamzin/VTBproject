package ru.startandroid.develop.vtbproject.placeholder;

import android.widget.ImageView;

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
        addItem(new PlaceholderItem("R.drawable.games","Pyaterochka","133"));
        addItem(new PlaceholderItem("R.drawable.games","Pyaterochka","133"));
        addItem(new PlaceholderItem("R.drawable.games","Pyaterochka","133"));
        addItem(new PlaceholderItem("R.drawable.games","Pyaterochka","133"));
        addItem(new PlaceholderItem("R.drawable.games","Pyaterochka","133"));
        addItem(new PlaceholderItem("R.drawable.games","Pyaterochka","133"));
        addItem(new PlaceholderItem("R.drawable.games","Pyaterochka","133"));
        addItem(new PlaceholderItem("R.drawable.games","Pyaterochka","133"));
        // Add some sample items.



    }

    private static void addItem(PlaceholderItem item) {
        ITEMS.add(item);
    }




    /**
     * A placeholder item representing a piece of content.
     */
    public static class PlaceholderItem {
        public final String image;
        public final String shop;
        public final String summa;


        public PlaceholderItem(String image, String shop, String summa) {
            this.image = image;
            this.shop = shop;
            this.summa = summa;

        }

    }
}