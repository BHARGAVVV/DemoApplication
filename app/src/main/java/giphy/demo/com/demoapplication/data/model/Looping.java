
package giphy.demo.com.demoapplication.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Looping implements Parcelable
{

    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;
    public final static Creator<Looping> CREATOR = new Creator<Looping>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Looping createFromParcel(Parcel in) {
            return new Looping(in);
        }

        public Looping[] newArray(int size) {
            return (new Looping[size]);
        }

    }
    ;

    protected Looping(Parcel in) {
        this.mp4 = ((String) in.readValue((String.class.getClassLoader())));
        this.mp4Size = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Looping() {
    }

    public String getMp4() {
        return mp4;
    }

    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    public String getMp4Size() {
        return mp4Size;
    }

    public void setMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(mp4);
        dest.writeValue(mp4Size);
    }

    public int describeContents() {
        return  0;
    }

}
