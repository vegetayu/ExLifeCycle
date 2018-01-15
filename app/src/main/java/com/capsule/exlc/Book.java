package com.capsule.exlc;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by yuluyao on 2018/1/15.
 */

public class Book implements Parcelable {

    private String name;
    private int number;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.number);
    }

    public Book() {
    }

    protected Book(Parcel in) {
        this.name = in.readString();
        this.number = in.readInt();
    }

    public static final Parcelable.Creator<Book> CREATOR = new Parcelable.Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel source) {
            return new Book(source);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };
}
