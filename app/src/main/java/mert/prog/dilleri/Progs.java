package mert.prog.dilleri;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

public class Progs extends AppCompatActivity {

    static Button bc;
    static String[] bibidizisi = new String[4];
    static int brain;
    int gelenart;
    String[] liste;
    veri_context vk;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_progs);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#424242")));
        this.vk = new veri_context(this);
        bc = (Button) findViewById(R.id.button6);
        this.liste = this.vk.call_list();
        ListView lv = (ListView) findViewById(R.id.listView);
        bc.setClickable(false);
        lv.setAdapter(new CustomAdapter(this, this.liste));
        bc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Progs.bibidizisi = Progs.this.vk.call_name();
                if (Progs.brain == 2) {
                    Intent i = new Intent(Progs.this, Progs_compare.class);
                    String s = Progs.bibidizisi[0];
                    String ss = Progs.bibidizisi[1];
                    i.putExtra("2to1", s);
                    i.putExtra("2to2", ss);
                    Progs.this.startActivity(i);
                }
                if (Progs.brain == 3) {
                    Intent i2 = new Intent(Progs.this, Progs_compare2.class);
                    String s2 = Progs.bibidizisi[0];
                    String ss2 = Progs.bibidizisi[1];
                    String sss = Progs.bibidizisi[2];
                    i2.putExtra("3to1", s2);
                    i2.putExtra("3to2", ss2);
                    i2.putExtra("3to3", sss);
                    Progs.this.startActivity(i2);
                }
                if (Progs.brain == 4) {
                    Intent i3 = new Intent(Progs.this, Progs_compare3.class);
                    String s3 = Progs.bibidizisi[0];
                    String ss3 = Progs.bibidizisi[1];
                    String sss2 = Progs.bibidizisi[2];
                    String ssss = Progs.bibidizisi[3];
                    i3.putExtra("4to1", s3);
                    i3.putExtra("4to2", ss3);
                    i3.putExtra("4to3", sss2);
                    i3.putExtra("4to4", ssss);
                    Progs.this.startActivity(i3);
                }
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String s = Progs.this.liste[position];
                Intent i = new Intent(Progs.this, Progs_desc.class);
                i.putExtra("name", s);
                Progs.this.startActivity(i);
            }
        });
    }

    public static void setButton(int art) {
        brain = art;
        if (art < 2 || art > 4) {
            bc.setText("");
            bc.setClickable(false);
            return;
        }
        bc.setText(art + " dili karşılaştır");
        bc.setClickable(true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == 16908332) {
            NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
        }
        if (id == R.id.action_info) {
            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
            dlgAlert.setMessage((CharSequence) "Programlama Dillerini Karşılaştırmaya Başlayın.\nUnutmayın aynı anda en fazla 4 dil karşılaştırabilirsiniz..");
            dlgAlert.setTitle((CharSequence) "Bilgi");
            dlgAlert.setCancelable(false);
            dlgAlert.setPositiveButton((CharSequence) "Tamam", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialog = dlgAlert.create();
            alertDialog.show();
            alertDialog.getButton(-1).setTextColor(getResources().getColor(R.color.colorPrimary));
        }
        return super.onOptionsItemSelected(item);
    }
}
