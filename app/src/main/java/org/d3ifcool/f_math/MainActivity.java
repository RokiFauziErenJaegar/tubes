package org.d3ifcool.f_math;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Mendefinisikan variabel yang memiliki id di activity_main
        TextView tv1 = (TextView)findViewById(R.id.view_saklar);
        // mengeset terjemahan kata yang tersimpan pada string.xml
        tv1.setText(R.string.switch_aplication);
    }
}
