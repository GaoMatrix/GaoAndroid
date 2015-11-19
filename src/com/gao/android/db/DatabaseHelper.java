package com.gao.android.db;

import com.gao.android.util.LogUtils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    /**
     * 1-->2 add header table
     * 2-->3 update info
     * 3--> update info haha
     * 
     */
    private static final String DB_NAME = "gao.db";
    private static final int DB_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        LogUtils.d();
        onUpgrade(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        for (int version = oldVersion + 1; version <= newVersion; version++) {
            upgradeTo(db, version);
        }
    }

    /**
     * Upgrade database from (version - 1) to version
     * 
     * @param db
     * @param version
     */
    private void upgradeTo(SQLiteDatabase db, int version) {
        switch (version) {
            case 1:
                // createDownloadsTable(db);
                break;
            case 2:
                // createHeadersTable(db);
                break;
            case 3:
                // addColumn(db, DB_TABLE, Downloads.Impl.COLUMN_IS_PUBLIC_API,
                // "INTEGER NOT NULL DEFAULT 0");
                // addColumn(db, DB_TABLE, Downloads.Impl.COLUMN_ALLOW_ROAMING,
                // "INTEGER NOT NULL DEFAULT 0");
                // addColumn(db, DB_TABLE,
                // Downloads.Impl.COLUMN_ALLOWED_NETWORK_TYPES,
                // "INTEGER NOT NULL DEFAULT 0");
                break;
            case 103:
                // addColumn(db, DB_TABLE,
                // Downloads.Impl.COLUMN_IS_VISIBLE_IN_DOWNLOADS_UI,
                // "INTEGER NOT NULL DEFAULT 1");
                // makeCacheDownloadsInvisible(db);
                break;
            case 4:
                // addColumn(db, DB_TABLE,
                // Downloads.Impl.COLUMN_BYPASS_RECOMMENDED_SIZE_LIMIT,
                // "INTEGER NOT NULL DEFAULT 0");
                break;
            default:
                throw new IllegalStateException("Don't know how to upgrade to "
                        + version);
        }
    }

}
