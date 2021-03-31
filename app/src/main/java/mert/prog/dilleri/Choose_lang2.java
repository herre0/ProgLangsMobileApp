package mert.prog.dilleri;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;

import java.util.Random;

public class Choose_lang2 extends Activity {
    int a;
    int b;
    int c;
    String kek;
    String s;
    String ss;
    String sss;
    veri_context vk;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_lang2);
        Button b1 = (Button) findViewById(R.id.button20);
        Button b2 = (Button) findViewById(R.id.button21);
        Button b3 = (Button) findViewById(R.id.button22);
        this.vk = new veri_context(this);
        Intent i = getIntent();
        this.s = i.getStringExtra("n1");
        this.ss = i.getStringExtra("n2");
        this.sss = i.getStringExtra("n3");
        Random r = new Random();
        this.a = r.nextInt(10) + 40;
        this.b = r.nextInt(10) + 30;
        this.c = 100 - (this.a + this.b);
        b1.setText(this.s);
        b2.setText(this.ss);
        b3.setText(this.sss);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Choose_lang2.this.kek = Choose_lang2.this.s;
                Choose_lang2.this.showdialok();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Choose_lang2.this.kek = Choose_lang2.this.ss;
                Choose_lang2.this.showdialok();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Choose_lang2.this.kek = Choose_lang2.this.sss;
                Choose_lang2.this.showdialok();
            }
        });
    }

    public void showdialok() {
        this.vk.updatet(this.s, 0);
        this.vk.updatet(this.ss, 0);
        this.vk.updatet(this.sss, 0);
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage((CharSequence) "Tercihiniz: " + this.kek + "\n\n--Genel Tercihler--\n" + this.s + " -> %" + this.a + "\n" + this.ss + " -> %" + this.b + "\n" + this.sss + " -> %" + this.c);
        dlgAlert.setCancelable(false);
        dlgAlert.setPositiveButton((CharSequence) "Tamam", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Choose_lang2.this.startActivity(new Intent(Choose_lang2.this, Progs.class));
            }
        });
        dlgAlert.create().show();
    }
}
