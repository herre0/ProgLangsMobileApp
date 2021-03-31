package mert.prog.dilleri;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class veri_context {
    sqlitekatmani dbHelper;


    public veri_context(Context c) {
        this.dbHelper = new sqlitekatmani(c);
    }

    public String[] call_list() {
        try {
            this.dbHelper.createDataBase();
            this.dbHelper.openDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i = 0;
        String[] liste = new String[Count()];
        Cursor c = this.dbHelper.getReadableDatabase().query("dbtablo", new String[]{"name"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        c.moveToFirst();
        while (!c.isAfterLast()) {
            liste[i] = c.getString(0);
            i++;
            c.moveToNext();
        }
        c.close();
        return liste;
    }

    public String[] call_list3() {
        try {
            this.dbHelper.createDataBase();
            this.dbHelper.openDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i = 0;
        SQLiteDatabase db = this.dbHelper.getReadableDatabase();
        String[] liste = new String[Count()];
        Cursor c = db.rawQuery("select name from dbtablo where image2=true", (String[]) null);
        c.moveToFirst();
        while (!c.isAfterLast()) {
            liste[i] = c.getString(0);
            i++;
            c.moveToNext();
        }
        c.close();
        return liste;
    }

    public int Count() {
        Cursor c = this.dbHelper.getReadableDatabase().rawQuery("select count(*) from dbtablo", (String[]) null);
        c.moveToFirst();
        return c.getInt(0);
    }

    public int CountcCc() {
        Cursor c = this.dbHelper.getReadableDatabase().rawQuery("select count(*) from dbtablo where compare = 1", (String[]) null);
        c.moveToFirst();
        return c.getInt(0);
    }

    public List<language> vericek(String named) {
        try {
            this.dbHelper.createDataBase();
            this.dbHelper.openDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        Cursor c = this.dbHelper.getReadableDatabase().query("dbtablo", new String[]{"name", "image", "company", "description", "app1", "app2", "app3", "app4", "app5", "compare", "types"}, " name = ?", new String[]{named}, (String) null, (String) null, (String) null);
        c.moveToFirst();
        while (!c.isAfterLast()) {
            arrayList.add(new language(c.getString(0), c.getString(1), c.getString(2), c.getString(3), c.getString(4), c.getString(5), c.getString(6), c.getString(7), c.getString(8), c.getInt(9), c.getString(10)));
            c.moveToNext();
        }
        c.close();
        return arrayList;
    }

    public void updatet(int id, int compare) {
        ContentValues cv = new ContentValues();
        cv.put("compare", Integer.valueOf(compare));
        SQLiteDatabase db = this.dbHelper.getWritableDatabase();
        db.update("dbtablo", cv, "id=?", new String[]{String.valueOf(id + 1)});
        db.close();
    }

    public int comprele(int id) {
        Cursor c = this.dbHelper.getReadableDatabase().query("dbtablo", new String[]{"compare"}, " id = ?", new String[]{String.valueOf(id + 1)}, (String) null, (String) null, (String) null);
        c.moveToFirst();
        return c.getInt(0);
    }

    public void updatet(String id, int compare) {
        ContentValues cv = new ContentValues();
        cv.put("compare", Integer.valueOf(compare));
        SQLiteDatabase db = this.dbHelper.getWritableDatabase();
        db.update("dbtablo", cv, "name=?", new String[]{id});

        db.close();
    }

    public void updatet2(String name, String image2) {
        ContentValues cv = new ContentValues();
        cv.put("image2", image2);
        SQLiteDatabase db = this.dbHelper.getWritableDatabase();
        db.update("dbtablo", cv, "name=?", new String[]{name});
        db.close();
    }

    public String[] call_name() {
        try {
            this.dbHelper.createDataBase();
            this.dbHelper.openDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i = 0;
        String[] liste = new String[Count()];
        Cursor c = this.dbHelper.getReadableDatabase().query("dbtablo", new String[]{"name"}, "compare = ?", new String[]{String.valueOf(1)}, (String) null, (String) null, (String) null);
        c.moveToFirst();
        while (!c.isAfterLast()) {
            liste[i] = c.getString(0);
            i++;
            c.moveToNext();
        }
        c.close();
        return liste;
    }
}

