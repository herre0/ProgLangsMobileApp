package mert.prog.dilleri;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sqlitekatmani extends SQLiteOpenHelper {
    String DB_NAME = "dbname.db";
    String DB_PATH = "/data/data/mert.prog.dilleri/databases/";
    Context mContext;
    SQLiteDatabase sqLiteDatabase;

    public sqlitekatmani(Context context) {
        super(context, "dbname.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.mContext = context;
    }

    public void onCreate(SQLiteDatabase db) {
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public void createDataBase() throws IOException {
        if (!checkDataBase()) {
            getReadableDatabase();
            try {
                copyDataBase();
            } catch (IOException e) {
                throw new Error("Veritabanı kopyalanamadı");
            }
        }
    }

    private boolean checkDataBase() {
        SQLiteDatabase checkDB = null;
        try {
            checkDB = SQLiteDatabase.openDatabase(this.DB_PATH + this.DB_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        } catch (SQLiteException e) {
        }
        if (checkDB != null) {
            checkDB.close();
        }
        if (checkDB != null) {
            return true;
        }
        return false;
    }

    private void copyDataBase() throws IOException {
        InputStream myInput = this.mContext.getAssets().open(this.DB_NAME);
        OutputStream myOutput = new FileOutputStream(this.DB_PATH + this.DB_NAME);
        byte[] buffer = new byte[1024];
        while (true) {
            int length = myInput.read(buffer);
            if (length > 0) {
                myOutput.write(buffer, 0, length);
            } else {
                myOutput.flush();
                myOutput.close();
                myInput.close();
                return;
            }
        }
    }

    public void openDataBase() throws SQLException {
        this.sqLiteDatabase = SQLiteDatabase.openDatabase(this.DB_PATH + this.DB_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public SQLiteDatabase getDatabase() {
        return this.sqLiteDatabase;
    }

    public synchronized void close() {
        if (this.sqLiteDatabase != null) {
            this.sqLiteDatabase.close();
        }
        super.close();
    }
}

