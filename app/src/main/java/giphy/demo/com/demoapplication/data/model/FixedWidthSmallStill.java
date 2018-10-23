
package giphy.demo.com.demoapplication.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixedWidthSmallStill implements Parcelable
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
    public final static Creator<FixedWidthSmallStill> CREATOR = new Creator<FixedWidthSmallStill>() {


        @SuppressWarnings({
            "unchecked"
        })
        public FixedWidthSmallStill createFromParcel(Parcel in) {
            return new FixedWidthSmallStill(in);
        }

        public FixedWidthSmallStill[] newArray(int size) {
            return (new FixedWidthSmallStill[size]);
        }

    }
    ;

    protected FixedWidthSmallStill(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.width = ((String) in.readValue((String.class.getClassLoader())));
        this.height = ((String) in.readValue((String.class.getClassLoader())));
    }

    public FixedWidthSmallStill() {
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
