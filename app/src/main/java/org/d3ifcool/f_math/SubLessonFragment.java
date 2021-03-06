package org.d3ifcool.f_math;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
/**
 * Created by Roki on 3/10/2018.
 */
public class SubLessonFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list,container,false);
        //Membuat list kata kata dengan sumber nya berada di string.xml
        ArrayList <Word> words = new ArrayList<Word>();
        words.add(new Word(""+getString(R.string.sub1),R.drawable.logo_root));
        words.add(new Word(""+getString(R.string.sub2),R.drawable.logo_limit));
        words.add(new Word(""+getString(R.string.sub3),R.drawable.logo_elos));
        words.add(new Word(""+getString(R.string.sub4),R.drawable.logo_spl));
        words.add(new Word(""+getString(R.string.sub5),R.drawable.logo_root_funct));
        words.add(new Word(""+getString(R.string.sub6),R.drawable.logo_inequality));
        words.add(new Word(""+getString(R.string.sub7),R.drawable.logo_trigonom));
        words.add(new Word(""+getString(R.string.sub8),R.drawable.logo_logic));
        words.add(new Word(""+getString(R.string.sub9),R.drawable.logo_dimen3));
        words.add(new Word(""+getString(R.string.sub10),R.drawable.logo_statistics));
        words.add(new Word(""+getString(R.string.sub11),R.drawable.logo_oppor));
        // Membuat {@link WordAdapter}, yang mana sumber datanya adalah list dari {@link Word}
        // adapter mengetahui bagaimana membuat list item untuk setiap item dalam list.
        WordAdapter adapter = new WordAdapter(getContext(), words, R.color.colorSubless);
        // Mencari {@link ListView} objek di dalam view hierarchy dari {@link Activity}.
        // Harus ada {@link ListView} dengan melihat ID, yang mana telah di deklarasikan pada
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Membuat {@link ListView} menggunakan {@link WordAdapter} yang kami buat diatas, jadi
        // {@link ListView} akan menampilkan list item setiap {@link Word} di dalam list.
        listView.setAdapter(adapter);
        return rootView;
    }
}
