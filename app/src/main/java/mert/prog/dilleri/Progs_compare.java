package mert.prog.dilleri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.core.view.ViewCompat;

import java.util.List;

public class Progs_compare extends Activity {
    Button b_down;
    Button b_up;

    int it = 0;
    List<language> liste1;
    List<language> liste2;
    RelativeLayout rel1;
    RelativeLayout rel2;
    String s;
    String s1;
    String s2;
    String ss;
    TextView tv3;
    TextView tv4;
    TextView tv_top;
    String type;
    String type2;

    veri_context vk;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progs_compare);
        this.rel1 = (RelativeLayout) findViewById(R.id.rel1);
        this.rel2 = (RelativeLayout) findViewById(R.id.rel2);
        this.b_up = (Button) findViewById(R.id.button9);
        this.b_down = (Button) findViewById(R.id.button7);
        this.b_down.setVisibility(View.INVISIBLE);
        this.tv_top = (TextView) findViewById(R.id.textView19);
        this.tv3 = (TextView) findViewById(R.id.textView23);
        this.tv4 = (TextView) findViewById(R.id.textView22);
        Intent i = getIntent();
        this.s = i.getStringExtra("2to1");
        this.ss = i.getStringExtra("2to2");
        this.vk = new veri_context(this);
        this.liste1 = this.vk.vericek(this.s);
        this.liste2 = this.vk.vericek(this.ss);
        ((TextView) findViewById(R.id.textView8)).setText(this.liste1.get(0).getName());
        ((TextView) findViewById(R.id.textView13)).setText(this.liste2.get(0).getName());
        this.tv3.setText(this.liste1.get(0).getDescription());
        this.tv4.setText(this.liste2.get(0).getDescription());
        this.tv_top.setText("Açıklamalar");
        this.b_up.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Progs_compare.this.b_down.setVisibility(0);
                Progs_compare.this.it++;
                Progs_compare.this.herre();
            }
        });
        this.b_down.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Progs_compare progs_compare = Progs_compare.this;
                progs_compare.it--;
                if (Progs_compare.this.it < 1) {
                    Progs_compare.this.tv3.setText(Progs_compare.this.liste1.get(0).getDescription());
                    Progs_compare.this.tv4.setText(Progs_compare.this.liste2.get(0).getDescription());
                    Progs_compare.this.b_down.setVisibility(4);
                    Progs_compare.this.tv_top.setText("Açıklamalar");
                }
                Progs_compare.this.herre();
            }
        });
    }

    public void herre() {
        if (this.it == 1) {
            this.tv3.setText(this.liste1.get(0).getCompany());
            this.tv4.setText(this.liste2.get(0).getCompany());
            this.tv_top.setText("Geliştirici");
            this.b_down.setBackgroundResource(R.drawable.solok);
            this.b_up.setBackgroundResource(R.drawable.sagok);
            this.rel1.setBackgroundResource(R.color.greyy);
            this.rel2.setBackgroundResource(R.color.greyy);
            this.tv3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            this.tv4.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        }
        if (this.it == 2) {
            this.tv3.setText(this.liste1.get(0).getApp1());
            this.tv4.setText(this.liste2.get(0).getApp1());
            this.tv_top.setText("ekrana 'Hello World' yazan kod");
            this.b_down.setBackgroundResource(R.drawable.solbeyaz);
            this.b_up.setBackgroundResource(R.drawable.sagbeyaz);
            this.rel1.setBackgroundResource(R.color.black);
            this.rel2.setBackgroundResource(R.color.black);
            this.tv3.setTextColor(-1);
            this.tv4.setTextColor(-1);
        }
        if (this.it == 3) {
            this.tv3.setText(this.liste1.get(0).getApp2());
            this.tv4.setText(this.liste2.get(0).getApp2());
            this.tv_top.setText("iki sayı toplayan kod");
            this.tv4.setTextColor(-1);
        }
        if (this.it == 4) {
            this.tv3.setText(this.liste1.get(0).getApp3());
            this.tv4.setText(this.liste2.get(0).getApp3());
            this.tv_top.setText("sayı tek mi? çift mi? kodu");
        }
        if (this.it == 5) {
            this.tv3.setText(this.liste1.get(0).getApp4());
            this.tv4.setText(this.liste2.get(0).getApp4());
            this.tv_top.setText("1-10 arası sayıları yazdıran kod");
        }
        if (this.it == 6) {
            Intent i = new Intent(this, Choose_lang.class);
            i.putExtra("name1", this.s);
            i.putExtra("name2", this.ss);
            startActivity(i);
        }
    }
}
