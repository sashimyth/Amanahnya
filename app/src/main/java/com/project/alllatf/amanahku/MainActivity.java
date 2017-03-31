package com.project.alllatf.amanahku;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent i = new Intent(this,TambahBrg.class);
//        startActivity(i);

        /**
         * Yang tadinya menu tab slide untuk menambahkan pesanan menggunakan aktivity baru
         * pindah ke aktivity pesanbarang
         */
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabPesanBrg);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,PesanBrg.class);
                startActivity(i);
            }
        });
    }
}
