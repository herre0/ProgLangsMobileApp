package mert.prog.dilleri;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

public class CustomAdapter extends BaseAdapter {

    int a;
    Activity activity;
    int[] bibi = new int[4];
    String langs;

    List<language> lh;
    private LayoutInflater userInflater;
    private String[] userList = new String[10];

    veri_context vk;

    public CustomAdapter(Activity activity2, String[] list) {
        this.userInflater = (LayoutInflater) activity2.getSystemService("layout_inflater");
        this.userList = list;
        this.activity = activity2;
        this.vk = new veri_context(activity2);
        this.a = this.vk.CountcCc();
    }

    public int getCount() {
        return 29;
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(final int i, View view, ViewGroup viewGroup) {
        View lineView = this.userInflater.inflate(R.layout.activity_custom_adapter, (ViewGroup) null);
        TextView textViewUserName = (TextView) lineView.findViewById(R.id.textViewUserName);
        TextView textView = (TextView) lineView.findViewById(R.id.herr);
        final Button bc = (Button) lineView.findViewById(R.id.btn_compare);
        if (this.vk.comprele(i) == 0) {
            bc.setBackgroundResource(R.drawable.compare);
        } else {
            bc.setBackgroundResource(R.drawable.compare_active);
        }
        Progs.setButton(this.a);
        this.langs = this.userList[i];
        this.lh = this.vk.vericek(this.langs);
        bc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (CustomAdapter.this.vk.CountcCc() >= 4) {
                    if (CustomAdapter.this.vk.comprele(i) == 1) {
                        bc.setBackgroundResource(R.drawable.compare);
                        CustomAdapter customAdapter = CustomAdapter.this;
                        customAdapter.a--;
                        CustomAdapter.this.vk.updatet(i, 0);
                    } else {
                        Toast.makeText(CustomAdapter.this.activity, "4'ten fazla karşılaştırma yapılamaz.", 0).show();
                    }
                } else if (CustomAdapter.this.vk.comprele(i) == 0) {
                    bc.setBackgroundResource(R.drawable.compare_active);
                    CustomAdapter.this.a++;
                    CustomAdapter.this.vk.updatet(i, 1);
                } else {
                    bc.setBackgroundResource(R.drawable.compare);
                    CustomAdapter customAdapter2 = CustomAdapter.this;
                    customAdapter2.a--;
                    CustomAdapter.this.vk.updatet(i, 0);
                }
                Progs.setButton(CustomAdapter.this.a);
            }
        });
        textViewUserName.setText(this.langs);
        return lineView;
    }
}
