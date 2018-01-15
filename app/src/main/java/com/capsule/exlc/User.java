package com.capsule.exlc;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by yuluyao on 2018/1/15.
 */

public class User implements Parcelable {

    private String name;
    private Book book;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeParcelable(this.book, flags);
    }

    public User() {
    }

    protected User(Parcel in) {
        this.name = in.readString();
        this.book = in.readParcelable(Book.class.getClassLoader());
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
