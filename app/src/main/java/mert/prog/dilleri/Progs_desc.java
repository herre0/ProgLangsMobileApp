package mert.prog.dilleri;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import java.util.List;

public class Progs_desc extends AppCompatActivity {

    String ss;
    TabHost tabHost;
    TabHost.TabSpec tb1;
    TabHost.TabSpec tb2;
    TabHost.TabSpec tb3;
    TabHost.TabSpec tb4;
    veri_context vk;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progs_desc);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#424242")));
        ((TextView) findViewById(R.id.herre1)).setText("Ekrana 'Hello World' yazan kod");
        ((TextView) findViewById(R.id.herre2)).setText("İki Sayı Toplayan kod");
        ((TextView) findViewById(R.id.herre3)).setText("sayı tek mi? çift mi? kodu");
        ((TextView) findViewById(R.id.herre4)).setText("1-10 arası sayıları yazdıran kod");
        Intent i = getIntent();
        this.tabHost = (TabHost) findViewById(R.id.tabhost);
        this.tabHost.setup();
        this.tb1 = this.tabHost.newTabSpec("n1");
        this.tb1.setIndicator("Code 1");
        this.tb1.setContent(R.id.tab1);
        this.tabHost.addTab(this.tb1);
        this.tb2 = this.tabHost.newTabSpec("n2");
        this.tb2.setIndicator("Code 2");
        this.tb2.setContent(R.id.tab2);
        this.tabHost.addTab(this.tb2);
        this.tb3 = this.tabHost.newTabSpec("n3");
        this.tb3.setIndicator("Code 3");
        this.tb3.setContent(R.id.tab3);
        this.tabHost.addTab(this.tb3);
        this.tb4 = this.tabHost.newTabSpec("n4");
        this.tb4.setIndicator("Code 4");
        this.tb4.setContent(R.id.tab4);
        this.tabHost.addTab(this.tb4);
        TextView tv_name = (TextView) findViewById(R.id.textView);
        ImageView imgv = (ImageView) findViewById(R.id.imageView2);
        TextView tv_desc = (TextView) findViewById(R.id.textView2);
        TextView tv_comp = (TextView) findViewById(R.id.textView4);
        TextView tv_app1 = (TextView) findViewById(R.id.textView7);
        TextView tv_app2 = (TextView) findViewById(R.id.textView9);
        TextView tv_app3 = (TextView) findViewById(R.id.textView5);
        TextView tv_app4 = (TextView) findViewById(R.id.textView6);
        ImageView i1 = (ImageView) findViewById(R.id.im1);
        ImageView i2 = (ImageView) findViewById(R.id.im2);
        ImageView i3 = (ImageView) findViewById(R.id.im3);
        ImageView i4 = (ImageView) findViewById(R.id.im4);
        ImageView i5 = (ImageView) findViewById(R.id.im5);
        i1.setVisibility(View.INVISIBLE);
        i2.setVisibility(View.INVISIBLE);
        i3.setVisibility(View.INVISIBLE);
        i4.setVisibility(View.INVISIBLE);
        i5.setVisibility(View.INVISIBLE);
        this.ss = i.getStringExtra("name");
        String str = this.ss;
        char c = 0;
        switch (str) {
            case "Kotlin":
                    c = 15;
                break;
            case "Matlab":
                    c = 17;
                break;
            case "Haskell":
                    c = 12;
                break;
            case "Pascal":
                    c = 19;
                break;
            case "Prolog":
                    c = 22;
                break;
            case "Python":
                    c = 23;
                break;
            case "Assembly":
                    c = 2;
                break;
            case "C":
                    c = 4;
                break;
            case "R":
                    c = 24;
                break;
            case "C#":
                    c = 7;
                break;
            case "F#":
                    c = 9;
                break;
            case "Go":
                    c = 10;
                break;
            case "Ada":
                    c = 1;
                break;
            case "C++":
                    c = 6;
                break;
            case "Php":
                    c = 21;
                break;
            case "Bash":
                    c = 3;
                break;
            case "Java":
                    c = 13;
                break;
            case "Lisp":
                    c = 16;
                break;
            case "Perl":
                    c = 20;
                break;
            case "Ruby":
                    c = 25;
                break;
            case "Cobol":
                    c = 5;
                break;
            case "Scala":
                    c = 26;
                break;
            case "Swift":
                    c = 27;
                break;
            case "Visual Basic":
                    c = 28;
                break;
            case "Objective-C":
                    c = 18;
                break;
            case "Fortran":
                    c = 8;
                break;
            case "JavaScript":
                    c = 14;
                break;
            case "ActionScript":
                    c = 0;
                break;
            case "Groovy":
                    c = 11;
                break;
        }
        switch (c) {
            case 0:
                imgv.setImageResource(R.drawable.actionscript);
                break;
            case 1:
                imgv.setImageResource(R.drawable.ada);
                break;
            case 2:
                imgv.setImageResource(R.drawable.assembly);
                break;
            case 3:
                imgv.setImageResource(R.drawable.bash);
                break;
            case 4:
                imgv.setImageResource(R.drawable.c);
                break;
            case 5:
                imgv.setImageResource(R.drawable.cobol);
                break;
            case 6:
                imgv.setImageResource(R.drawable.cplusplus);
                break;
            case 7:
                imgv.setImageResource(R.drawable.csharp);
                break;
            case 8:
                imgv.setImageResource(R.drawable.fortran);
                break;
            case 9:
                imgv.setImageResource(R.drawable.fsharp);
                break;
            case 10:
                imgv.setImageResource(R.drawable.go);
                break;
            case 11:
                imgv.setImageResource(R.drawable.groovy);
                break;
            case 12:
                imgv.setImageResource(R.drawable.haskell);
                break;
            case 13:
                imgv.setImageResource(R.drawable.java);
                break;
            case 14:
                imgv.setImageResource(R.drawable.javascript);
                break;
            case 15:
                imgv.setImageResource(R.drawable.kotlin);
                break;
            case 16:
                imgv.setImageResource(R.drawable.lisp);
                break;
            case 17:
                imgv.setImageResource(R.drawable.matlab);
                break;
            case 18:
                imgv.setImageResource(R.drawable.objectivec);
                break;
            case 19:
                imgv.setImageResource(R.drawable.pascal);
                break;
            case 20:
                imgv.setImageResource(R.drawable.perl);
                break;
            case 21:
                imgv.setImageResource(R.drawable.php);
                break;
            case 22:
                imgv.setImageResource(R.drawable.prolog);
                break;
            case 23:
                imgv.setImageResource(R.drawable.python);
                break;
            case 24:
                imgv.setImageResource(R.drawable.r);
                break;
            case 25:
                imgv.setImageResource(R.drawable.ruby);
                break;
            case 26:
                imgv.setImageResource(R.drawable.scala);
                break;
            case 27:
                imgv.setImageResource(R.drawable.swift);
                break;
            case 28:
                imgv.setImageResource(R.drawable.visualbasic);
                break;
            default:
                imgv.setImageResource(R.drawable.web);
                break;
        }
        tv_name.setText(this.ss);
        this.vk = new veri_context(this);
        List<language> liste = this.vk.vericek(this.ss);
        tv_desc.setText(liste.get(0).getDescription());
        tv_comp.setText(liste.get(0).getCompany());
        tv_app1.setText(liste.get(0).getApp1());
        tv_app2.setText(liste.get(0).getApp2());
        tv_app3.setText(liste.get(0).getApp3());
        tv_app4.setText(liste.get(0).getApp4());
        String types = liste.get(0).getTypes();
        char c2 = 'd';
        switch (types) {
            case "d":
                    c2 = 4;
                break;
            case "p":
                    c2 = 2;
                break;
            case "w":
                    c2 = 3;
                break;
            case "dc":
                    c2 = 5;
                break;
            case "dp":
                    c2 = 6;
                break;
            case "dw":
                    c2 = 1;
                break;
            case "wp":
                    c2 = 8;
                break;
            case "dcp":
                    c2 = 7;
                break;
            case "dwp":
                    c2 = 0;
                break;
        }

        switch (c2) {
            case 0:
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                break;
            case 1:
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                break;
            case 2:
                i3.setVisibility(View.VISIBLE);
                break;
            case 3:
                i2.setVisibility(View.VISIBLE);
                break;
            case 4:
                i1.setVisibility(View.VISIBLE);
                break;
            case 5:
                i1.setVisibility(View.VISIBLE);
                i4.setVisibility(View.VISIBLE);
                break;
            case 6:
                i1.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                break;
            case 7:
                i1.setVisibility(View.VISIBLE);
                i4.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                break;
            case 8:
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                break;
            default:
                i5.setVisibility(View.VISIBLE);
                break;
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 16908332) {
            NavUtils.navigateUpTo(this, new Intent(this, Progs.class));
        }
        return super.onOptionsItemSelected(item);
    }
}