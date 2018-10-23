
package giphy.demo.com.demoapplication.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixedWidthStill implements Parcelable
{

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    public final static Creator<FixedWidthStill> CREATOR = new Creator<FixedWidthStill>() {


        @SuppressWarnings({
            "unchecked"
        })
        public FixedWidthStill createFromParcel(Parcel in) {
            return new FixedWidthStill(in);
        }

        public FixedWidthStill[] newArray(int size) {
            return (new FixedWidthStill[size]);
        }

    }
    ;

    protected FixedWidthStill(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.width = ((String) in.readValue((String.class.getClassLoader())));
        this.height = ((String) in.readValue((String.class.getClassLoader())));
    }

    public FixedWidthStill() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
        dest.writeValue(width);
        dest.writeValue(height);
    }

    public int describeContents() {
        return  0;
    }

}
