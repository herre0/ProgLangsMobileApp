package mert.prog.dilleri;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;

import java.util.Random;

public class Choose_lang extends Activity {
    int a;
    int b;
    String kek;
    String s;
    String ss;
    veri_context vk;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_lang);
        Button b2 = (Button) findViewById(R.id.button13);
        Button b1 = (Button) findViewById(R.id.button14);
        Intent i = getIntent();
        this.s = i.getStringExtra("name1");
        this.ss = i.getStringExtra("name2");
        b1.setText(this.s);
        b2.setText(this.ss);
        this.vk = new veri_context(this);
        this.a = new Random().nextInt(70);
        this.b = 100 - this.a;
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Choose_lang.this.kek = Choose_lang.this.s;
                Choose_lang.this.showdialok();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Choose_lang.this.kek = Choose_lang.this.ss;
                Choose_lang.this.showdialok();
            }
        });
    }

    public void showdialok() {
        this.vk.updatet(this.s, 0);
        this.vk.updatet(this.ss, 0);
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage((CharSequence) "Tercihiniz: " + this.kek + "\n\n--Genel Tercihler--\n" + this.s + " -> %" + this.a + "\n" + this.ss + " -> %" + this.b);
        dlgAlert.setCancelable(false);
        dlgAlert.setPositiveButton((CharSequence) "Tamam", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Choose_lang.this.startActivity(new Intent(Choose_lang.this, Progs.class));
            }
        });
        dlgAlert.create().show();
    }
}
