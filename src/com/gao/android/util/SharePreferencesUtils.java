package com.gao.android.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SharePreferencesUtils {

    private static String PREFERENCE_NAME = "LEJIA";

    private SharePreferencesUtils() {
        throw new AssertionError();
    }

    /**
     * put string preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to modify
     * @param value
     *            The new value for the preference
     * @return True if the new values were successfully written to persistent
     *         storage.
     */
    public static boolean putString(Context context, String key, String value) {
        LogUtils.d("key: " + key + " value: " + value);
        SharedPreferences settings = context.getSharedPreferences(
                PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        return editor.commit();
    }

    /**
     * get string preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to retrieve
     * @return The preference value if it exists, or null. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a string
     * @see #getString(Context, String, String)
     */
    public static String getString(Context context, String key) {
        LogUtils.d("key: " + key);
        return getString(context, key, null);
    }

    /**
     * get string preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to retrieve
     * @param defaultValue
     *            Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a string
     */
    public static String getString(Context context, String key,
            String defaultValue) {
        LogUtils.d("key: " + key + " defaultValue: " + defaultValue);
        SharedPreferences settings = context.getSharedPreferences(
                PREFERENCE_NAME, Context.MODE_PRIVATE);
        return settings.getString(key, defaultValue);
    }

    /**
     * put int preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to modify
     * @param value
     *            The new value for the preference
     * @return True if the new values were successfully written to persistent
     *         storage.
     */
    public static boolean putInt(Context context, String key, int value) {
        LogUtils.d("key: " + key + " value: " + value);
        SharedPreferences settings = context.getSharedPreferences(
                PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(key, value);
        return editor.commit();
    }

    /**
     * get int preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to retrieve
     * @return The preference value if it exists, or -1. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a int
     * @see #getInt(Context, String, int)
     */
    public static int getInt(Context context, String key) {
        LogUtils.d("key: " + key);
        return getInt(context, key, -1);
    }

    /**
     * get int preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to retrieve
     * @param defaultValue
     *            Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a int
     */
    public static int getInt(Context context, String key, int defaultValue) {
        LogUtils.d("key: " + key + " defaultValue: " + defaultValue);
        SharedPreferences settings = context.getSharedPreferences(
                PREFERENCE_NAME, Context.MODE_PRIVATE);
        return settings.getInt(key, defaultValue);
    }

    /**
     * put long preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to modify
     * @param value
     *            The new value for the preference
     * @return True if the new values were successfully written to persistent
     *         storage.
     */
    public static boolean putLong(Context context, String key, long value) {
        LogUtils.d("key: " + key + " value: " + value);
        SharedPreferences settings = context.getSharedPreferences(
                PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putLong(key, value);
        return editor.commit();
    }

    /**
     * get long preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to retrieve
     * @return The preference value if it exists, or -1. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a long
     * @see #getLong(Context, String, long)
     */
    public static long getLong(Context context, String key) {
        LogUtils.d("key: " + key);
        return getLong(context, key, -1);
    }

    /**
     * get long preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to retrieve
     * @param defaultValue
     *            Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a long
     */
    public static long getLong(Context context, String key, long defaultValue) {
        LogUtils.d("key: " + key + " defaultValue: " + defaultValue);
        SharedPreferences settings = context.getSharedPreferences(
                PREFERENCE_NAME, Context.MODE_PRIVATE);
        return settings.getLong(key, defaultValue);
    }

    /**
     * put float preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to modify
     * @param value
     *            The new value for the preference
     * @return True if the new values were successfully written to persistent
     *         storage.
     */
    public static boolean putFloat(Context context, String key, float value) {
        LogUtils.d("key: " + key + " value: " + value);
        SharedPreferences settings = context.getSharedPreferences(
                PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putFloat(key, value);
        return editor.commit();
    }

    /**
     * get float preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to retrieve
     * @return The preference value if it exists, or -1. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a float
     * @see #getFloat(Context, String, float)
     */
    public static float getFloat(Context context, String key) {
        LogUtils.d("key: " + key);
        return getFloat(context, key, -1);
    }

    /**
     * get float preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to retrieve
     * @param defaultValue
     *            Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a float
     */
    public static float getFloat(Context context, String key, float defaultValue) {
        LogUtils.d("key: " + key + " defaultValue: " + defaultValue);
        SharedPreferences settings = context.getSharedPreferences(
                PREFERENCE_NAME, Context.MODE_PRIVATE);
        return settings.getFloat(key, defaultValue);
    }

    /**
     * put boolean preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to modify
     * @param value
     *            The new value for the preference
     * @return True if the new values were successfully written to persistent
     *         storage.
     */
    public static boolean putBoolean(Context context, String key, boolean value) {
        LogUtils.d("key: " + key + " value: " + value);
        SharedPreferences settings = context.getSharedPreferences(
                PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(key, value);
        return editor.commit();
    }

    /**
     * get boolean preferences, default is false
     * 
     * @param context
     * @param key
     *            The name of the preference to retrieve
     * @return The preference value if it exists, or false. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a boolean
     * @see #getBoolean(Context, String, boolean)
     */
    public static boolean getBoolean(Context context, String key) {
        LogUtils.d("key: " + key);
        return getBoolean(context, key, false);
    }

    /**
     * get boolean preferences
     * 
     * @param context
     * @param key
     *            The name of the preference to retrieve
     * @param defaultValue
     *            Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a boolean
     */
    public static boolean getBoolean(Context context, String key,
            boolean defaultValue) {
        LogUtils.d("key: " + key + " defaultValue: " + defaultValue);
        SharedPreferences settings = context.getSharedPreferences(
                PREFERENCE_NAME, Context.MODE_PRIVATE);
        return settings.getBoolean(key, defaultValue);
    }
}
