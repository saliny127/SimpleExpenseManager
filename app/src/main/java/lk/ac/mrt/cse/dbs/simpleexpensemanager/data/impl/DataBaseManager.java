package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DataBaseManager extends SQLiteOpenHelper {
    public static final String ACCOUNTS = "accounts";
    public static final String TRANSACTIONS = "transactions";

    public DataBaseManager(@Nullable Context context) {
        super(context, "180664L.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + ACCOUNTS + " (" +
                "accountNo STRING PRIMARY KEY," +
                "bankName STRING," +
                "accountHolderName STRING," +
                "balance REAL)";
        db.execSQL(createTableStatement);
        String createTableStatement2 = "CREATE TABLE " + TRANSACTIONS + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "date TEXT," +
                "accountNo STRING," +
                "expenseType STRING," +
                "amount REAL)";
        db.execSQL(createTableStatement2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
