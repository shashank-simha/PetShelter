package com.example.android.pets.data;

/**
 * Created by simha on 22/8/18.
 */

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/**
 * {@link ContentProvider} for Pets app.
 */
public class PetProvider extends ContentProvider {
    /** Database helper object */
    private PetDbHelper mDbHelper;
    @Override
    public boolean onCreate() {
        mDbHelper = new PetDbHelper(getContext());
        return true;
    }
    @Override
    public Cursor query(Uri uri, String[] strings, String s, String[] strings1, String s1) {
        return null;
    }
    @Override
    public String getType(Uri uri) {
        return null;
    }
    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }
    @Override
    public int delete(Uri uri, String s, String[] strings) {
        return 0;
    }
    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}
