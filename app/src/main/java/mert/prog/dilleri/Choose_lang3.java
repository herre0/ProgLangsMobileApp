package mert.prog.dilleri;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;

import java.util.Random;

public class Choose_lang3 extends Activity {
    int a;
    int b;
    int c;
    int d;
    String kek;
    String s;
    String ss;
    String sss;
    String ssss;
    veri_context vk;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_lang3);
        Button b1 = (Button) findViewById(R.id.button25);
        Button b2 = (Button) findViewById(R.id.button26);
        Button b3 = (Button) findViewById(R.id.button27);
        Button b4 = (Button) findViewById(R.id.button28);
        this.vk = new veri_context(this);
        Intent i = getIntent();
        this.s = i.getStringExtra("k1");
        this.ss = i.getStringExtra("k2");
        this.sss = i.getStringExtra("k3");
        this.ssss = i.getStringExtra("k4");
        Random r = new Random();
        this.a = r.nextInt(10) + 30;
        this.b = r.nextInt(10) + 10;
        this.c = r.nextInt(10) + 30;
        this.d = 100 - ((this.a + this.b) + this.c);
        b1.setText(this.s);
        b2.setText(this.ss);
        b3.setText(this.sss);
        b4.setText(this.ssss);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Choose_lang3.this.kek = Choose_lang3.this.s;
                Choose_lang3.this.showdialok();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Choose_lang3.this.kek = Choose_lang3.this.ss;
                Choose_lang3.this.showdialok();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Choose_lang3.this.kek = Choose_lang3.this.sss;
                Choose_lang3.this.showdialok();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Choose_lang3.this.kek = Choose_lang3.this.ssss;
                Choose_lang3.this.showdialok();
            }
        });
    }

    public void showdialok() {
        this.vk.updatet(this.s, 0);
        this.vk.updatet(this.ss, 0);
        this.vk.updatet(this.sss, 0);
        this.vk.updatet(this.ssss, 0);
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage((CharSequence) "Tercihiniz: " + this.kek + "\n\n--Genel Tercihler--\n" + this.s + " -> %" + this.a + "\n" + this.ss + " -> %" + this.b + "\n" + this.sss + " -> %" + this.c + "\n" + this.ssss + " -> %" + this.d);
        dlgAlert.setTitle((CharSequence) "Genel Tercihler");
        dlgAlert.setCancelable(false);
        dlgAlert.setPositiveButton((CharSequence) "Tamam", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Choose_lang3.this.startActivity(new Intent(Choose_lang3.this, Progs.class));
            }
        });
        dlgAlert.create().show();
    }
}
