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

public class Progs_compare3 extends Activity {
    Button b_down;
    Button b_up;

    int it = 0;
    List<language> liste1;
    List<language> liste2;
    List<language> liste3;
    List<language> liste4;
    RelativeLayout rel1;
    RelativeLayout rel2;
    RelativeLayout rel3;
    RelativeLayout rel4;
    String s;
    String ss;
    String sss;
    String ssss;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView tv_top;
    veri_context vk;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progs_compare3);
        this.b_up = (Button) findViewById(R.id.button12);
        this.b_down = (Button) findViewById(R.id.button11);
        this.rel1 = (RelativeLayout) findViewById(R.id.rel001);
        this.rel2 = (RelativeLayout) findViewById(R.id.rel002);
        this.rel3 = (RelativeLayout) findViewById(R.id.rel003);
        this.rel4 = (RelativeLayout) findViewById(R.id.rel004);
        this.tv_top = (TextView) findViewById(R.id.textView21);
        this.t1 = (TextView) findViewById(R.id.textView27);
        this.t2 = (TextView) findViewById(R.id.textView29);
        this.t3 = (TextView) findViewById(R.id.textView30);
        this.t4 = (TextView) findViewById(R.id.textView31);
        Intent i = getIntent();
        this.s = i.getStringExtra("4to1");
        this.ss = i.getStringExtra("4to2");
        this.sss = i.getStringExtra("4to3");
        this.ssss = i.getStringExtra("4to4");
        this.vk = new veri_context(this);
        this.liste1 = this.vk.vericek(this.s);
        this.liste2 = this.vk.vericek(this.ss);
        this.liste3 = this.vk.vericek(this.sss);
        this.liste4 = this.vk.vericek(this.ssss);
        this.b_down.setVisibility(View.INVISIBLE);
        ((TextView) findViewById(R.id.textView12)).setText(this.liste1.get(0).getName());
        ((TextView) findViewById(R.id.textView16)).setText(this.liste2.get(0).getName());
        ((TextView) findViewById(R.id.textView17)).setText(this.liste3.get(0).getName());
        ((TextView) findViewById(R.id.textView18)).setText(this.liste4.get(0).getName());
        this.t1.setText(this.liste1.get(0).getDescription());
        this.t2.setText(this.liste2.get(0).getDescription());
        this.t3.setText(this.liste3.get(0).getDescription());
        this.t4.setText(this.liste4.get(0).getDescription());
        this.tv_top.setText("Açıklamalar");
        this.b_up.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Progs_compare3.this.b_down.setVisibility(0);
                Progs_compare3.this.it++;
                Progs_compare3.this.herre();
            }
        });
        this.b_down.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Progs_compare3 progs_compare3 = Progs_compare3.this;
                progs_compare3.it--;
                if (Progs_compare3.this.it < 1) {
                    Progs_compare3.this.t1.setText(Progs_compare3.this.liste1.get(0).getDescription());
                    Progs_compare3.this.t2.setText(Progs_compare3.this.liste2.get(0).getDescription());
                    Progs_compare3.this.t3.setText(Progs_compare3.this.liste3.get(0).getDescription());
                    Progs_compare3.this.t4.setText(Progs_compare3.this.liste4.get(0).getDescription());
                    Progs_compare3.this.b_down.setVisibility(4);
                    Progs_compare3.this.tv_top.setText("Açıklamalar");
                }
                Progs_compare3.this.herre();
            }
        });
    }

    public void herre() {
        if (this.it == 1) {
            this.t1.setText(this.liste1.get(0).getCompany());
            this.t2.setText(this.liste2.get(0).getCompany());
            this.t3.setText(this.liste3.get(0).getCompany());
            this.t4.setText(this.liste4.get(0).getCompany());
            this.tv_top.setText("Geliştirici");
            this.b_down.setBackgroundResource(R.drawable.solok);
            this.b_up.setBackgroundResource(R.drawable.sagok);
            this.rel1.setBackgroundResource(R.color.greyy);
            this.rel2.setBackgroundResource(R.color.greyy);
            this.rel3.setBackgroundResource(R.color.greyy);
            this.rel4.setBackgroundResource(R.color.greyy);
            this.t1.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            this.t2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            this.t3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            this.t4.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        }
        if (this.it == 2) {
            this.t1.setText(this.liste1.get(0).getApp1());
            this.t2.setText(this.liste2.get(0).getApp1());
            this.t3.setText(this.liste3.get(0).getApp1());
            this.t4.setText(this.liste4.get(0).getApp1());
            this.tv_top.setText("ekrana 'Hello World' yazan kod");
            this.b_down.setBackgroundResource(R.drawable.solbeyaz);
            this.b_up.setBackgroundResource(R.drawable.sagbeyaz);
            this.rel1.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.rel2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.rel3.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.rel4.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.t1.setTextColor(-1);
            this.t2.setTextColor(-1);
            this.t3.setTextColor(-1);
            this.t4.setTextColor(-1);
        }
        if (this.it == 3) {
            this.t1.setText(this.liste1.get(0).getApp2());
            this.t2.setText(this.liste2.get(0).getApp2());
            this.t3.setText(this.liste3.get(0).getApp2());
            this.t4.setText(this.liste4.get(0).getApp2());
            this.tv_top.setText("iki sayı toplayan kod");
        }
        if (this.it == 4) {
            this.t1.setText(this.liste1.get(0).getApp3());
            this.t2.setText(this.liste2.get(0).getApp3());
            this.t3.setText(this.liste3.get(0).getApp3());
            this.t4.setText(this.liste4.get(0).getApp3());
            this.tv_top.setText("sayı tek mi? çift mi? kodu");
        }
        if (this.it == 5) {
            this.t1.setText(this.liste1.get(0).getApp4());
            this.t2.setText(this.liste2.get(0).getApp4());
            this.t3.setText(this.liste3.get(0).getApp4());
            this.t4.setText(this.liste4.get(0).getApp4());
            this.tv_top.setText("1-10 arası sayıları yazdıran kod");
        }
        if (this.it == 6) {
            Intent i = new Intent(this, Choose_lang3.class);
            i.putExtra("k1", this.s);
            i.putExtra("k2", this.ss);
            i.putExtra("k3", this.sss);
            i.putExtra("k4", this.ssss);
            startActivity(i);
        }
    }
}
