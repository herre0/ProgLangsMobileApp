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

public class Progs_compare2 extends Activity {
    Button b_down;
    Button b_up;

    int it = 0;
    List<language> liste1;
    List<language> liste2;
    List<language> liste3;
    RelativeLayout rel1;
    RelativeLayout rel2;
    RelativeLayout rel3;
    String s;
    String ss;
    String sss;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView tv_top;
    String type;
    String type0;
    String type2;

    veri_context vk;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progs_compare2);
        this.rel1 = (RelativeLayout) findViewById(R.id.rel01);
        this.rel2 = (RelativeLayout) findViewById(R.id.rel02);
        this.rel3 = (RelativeLayout) findViewById(R.id.rel03);
        this.tv_top = (TextView) findViewById(R.id.textView20);
        this.t1 = (TextView) findViewById(R.id.textView24);
        this.t2 = (TextView) findViewById(R.id.textView25);
        this.t3 = (TextView) findViewById(R.id.textView26);
        this.b_down = (Button) findViewById(R.id.button8);
        this.b_up = (Button) findViewById(R.id.button10);
        this.b_down.setVisibility(View.INVISIBLE);
        Intent i = getIntent();
        this.s = i.getStringExtra("3to1");
        this.ss = i.getStringExtra("3to2");
        this.sss = i.getStringExtra("3to3");
        this.vk = new veri_context(this);
        this.liste1 = this.vk.vericek(this.s);
        this.liste2 = this.vk.vericek(this.ss);
        this.liste3 = this.vk.vericek(this.sss);
        ((TextView) findViewById(R.id.textView11)).setText(this.liste1.get(0).getName());
        ((TextView) findViewById(R.id.textView14)).setText(this.liste2.get(0).getName());
        ((TextView) findViewById(R.id.textView15)).setText(this.liste3.get(0).getName());
        this.t1.setText(this.liste1.get(0).getDescription());
        this.t2.setText(this.liste2.get(0).getDescription());
        this.t3.setText(this.liste3.get(0).getDescription());
        this.tv_top.setText("Açıklamalar");
        this.b_up.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Progs_compare2.this.b_down.setVisibility(0);
                Progs_compare2.this.it++;
                Progs_compare2.this.herre();
            }
        });
        this.b_down.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Progs_compare2 progs_compare2 = Progs_compare2.this;
                progs_compare2.it--;
                if (Progs_compare2.this.it < 1) {
                    Progs_compare2.this.t1.setText(Progs_compare2.this.liste1.get(0).getDescription());
                    Progs_compare2.this.t2.setText(Progs_compare2.this.liste2.get(0).getDescription());
                    Progs_compare2.this.t3.setText(Progs_compare2.this.liste3.get(0).getDescription());
                    Progs_compare2.this.b_down.setVisibility(4);
                    Progs_compare2.this.tv_top.setText("Açıklamalar");
                }
                Progs_compare2.this.herre();
            }
        });
    }

    public void herre() {
        if (this.it == 1) {
            this.t1.setText(this.liste1.get(0).getCompany());
            this.t2.setText(this.liste2.get(0).getCompany());
            this.t3.setText(this.liste3.get(0).getCompany());
            this.tv_top.setText("Geliştirici");
            this.b_down.setBackgroundResource(R.drawable.solok);
            this.b_up.setBackgroundResource(R.drawable.sagok);
            this.rel1.setBackgroundResource(R.color.greyy);
            this.rel2.setBackgroundResource(R.color.greyy);
            this.rel3.setBackgroundResource(R.color.greyy);
            this.t1.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            this.t2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            this.t3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        }
        if (this.it == 2) {
            this.t1.setText(this.liste1.get(0).getApp1());
            this.t2.setText(this.liste2.get(0).getApp1());
            this.t3.setText(this.liste3.get(0).getApp1());
            this.tv_top.setText("ekrana 'Hello World' yazan kod");
            this.b_down.setBackgroundResource(R.drawable.solbeyaz);
            this.b_up.setBackgroundResource(R.drawable.sagbeyaz);
            this.rel1.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.rel2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.rel3.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.t1.setTextColor(-1);
            this.t2.setTextColor(-1);
            this.t3.setTextColor(-1);
        }
        if (this.it == 3) {
            this.t1.setText(this.liste1.get(0).getApp2());
            this.t2.setText(this.liste2.get(0).getApp2());
            this.t3.setText(this.liste3.get(0).getApp2());
            this.tv_top.setText("iki sayı toplayan kod");
        }
        if (this.it == 4) {
            this.t1.setText(this.liste1.get(0).getApp3());
            this.t2.setText(this.liste2.get(0).getApp3());
            this.t3.setText(this.liste3.get(0).getApp3());
            this.tv_top.setText("sayı tek mi? çift mi? kodu");
        }
        if (this.it == 5) {
            this.t1.setText(this.liste1.get(0).getApp4());
            this.t2.setText(this.liste2.get(0).getApp4());
            this.t3.setText(this.liste3.get(0).getApp4());
            this.tv_top.setText("1-10 arası sayıları yazdıran kod");
        }
        if (this.it == 6) {
            Intent i = new Intent(this, Choose_lang2.class);
            i.putExtra("n1", this.s);
            i.putExtra("n2", this.ss);
            i.putExtra("n3", this.sss);
            startActivity(i);
        }
    }

    private String yubbi(String type1) {
        if (type1 == "dwp") {
            return "Masaüstü,Web,Mobil";
        }
        if (type1 == "dw") {
            return "Masaüstü,Web";
        }
        if (type1 == "p") {
            return "Mobil";
        }
        if (type1 == "w") {
            return "Web";
        }
        if (type1 == "d") {
            return "Masaüstü";
        }
        if (type1 == "dc") {
            return "Masaüstü,Sistem";
        }
        if (type1 == "dp") {
            return "Masaüstü,Mobil";
        }
        if (type1 == "dcp") {
            return "Masaüstü,Sistem,Mobil";
        }
        if (type1 == "wp") {
            return "Web,Mobil";
        }
        if (type1 == "s") {
            return "Sistem";
        }
        return "none";
    }
}
