
package giphy.demo.com.demoapplication.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Preview implements Parcelable
{

    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;
    public final static Creator<Preview> CREATOR = new Creator<Preview>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Preview createFromParcel(Parcel in) {
            return new Preview(in);
        }

        public Preview[] newArray(int size) {
            return (new Preview[size]);
        }

    }
    ;

    protected Preview(Parcel in) {
        this.width = ((String) in.readValue((String.class.getClassLoader())));
        this.height = ((String) in.readValue((String.class.getClassLoader())));
        this.mp4 = ((String) in.readValue((String.class.getClassLoader())));
        this.mp4Size = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Preview() {
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
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
        dest.writeValue(width);
        dest.writeValue(height);
        dest.writeValue(mp4);
        dest.writeValue(mp4Size);
    }

    public int describeContents() {
        return  0;
    }

}
