package org.d3ifcool.f_math;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Roki on 3/11/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    /** Resource ID untuk warna background pada list dari words/kata */
    private int mColorResourceId;
    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Periksa apakah tampilan yang ada digunakan kembali, jika tidak, inflate tampilan
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get {@link Word} obyek yang berada pada posisi ini dalam daftar
        Word currentWord = getItem(position);
        // Cari TextView di layout list_item.xml dengan ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.subles_text_view);
        // Get text default dari objek CurrentWord dan setel teks ini pada
        // TextView default.
        defaultTextView.setText(currentWord.getDefaultText());
        // Temukan ImageView di layout list_item.xml dengan ID Image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Periksa apakah ada gambar untuk kata ini atau tidak
        if (currentWord.hasImage()) {
            // Jika gambar tersedia, tampilkan gambar yang disediakan berdasarkan resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
            // memastikan view dalam keadaan dapat dilihat
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Jika tidak menyembunyikan ImageView (atur visibilitas menjadi GONE)
            imageView.setVisibility(View.GONE);
        }
        // Mengeset theme color untuk list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Mencari warna yang dapat digunakan resource ID
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // mengeset warna background dari text container View
        textContainer.setBackgroundColor(color);
        // mengembalikan semua list item layout (megandung 2 TextViews) sehingga dapat
        // ditampilkan pada ListView
        return listItemView;
    }
}
