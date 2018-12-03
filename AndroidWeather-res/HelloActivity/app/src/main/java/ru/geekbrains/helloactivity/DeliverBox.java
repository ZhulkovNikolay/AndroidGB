package ru.geekbrains.helloactivity;

import android.os.Parcelable;

public class DeliverBox implements Parcelable {
    public String text;
    public int number;

    public DeliverBox(String text, int number) {
        this.text = text;
        this.number = number;
    }

    public DeliverBox(String text) {
        this.text = text;
    }

    public DeliverBox(int number) {
        this.number = number;
    }

    public DeliverBox() {
        super();
    }

    protected DeliverBox(android.os.Parcel in) {
        text = in.readString();
        number = in.readInt();
    }

    public static final Creator<DeliverBox> CREATOR = new Creator<DeliverBox>() {
        @Override
        public DeliverBox createFromParcel(android.os.Parcel in) {
            return new DeliverBox(in);
        }

        @Override
        public DeliverBox[] newArray(int size) {
            return new DeliverBox[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(text);
        parcel.writeInt(number);
    }
}
