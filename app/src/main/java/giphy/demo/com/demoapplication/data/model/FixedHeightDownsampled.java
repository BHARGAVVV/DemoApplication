
package giphy.demo.com.demoapplication.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixedHeightDownsampled implements Parcelable
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
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("webp")
    @Expose
    private String webp;
    @SerializedName("webp_size")
    @Expose
    private String webpSize;
    public final static Creator<FixedHeightDownsampled> CREATOR = new Creator<FixedHeightDownsampled>() {


        @SuppressWarnings({
            "unchecked"
        })
        public FixedHeightDownsampled createFromParcel(Parcel in) {
            return new FixedHeightDownsampled(in);
        }

        public FixedHeightDownsampled[] newArray(int size) {
            return (new FixedHeightDownsampled[size]);
        }

    }
    ;

    protected FixedHeightDownsampled(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.width = ((String) in.readValue((String.class.getClassLoader())));
        this.height = ((String) in.readValue((String.class.getClassLoader())));
        this.size = ((String) in.readValue((String.class.getClassLoader())));
        this.webp = ((String) in.readValue((String.class.getClassLoader())));
        this.webpSize = ((String) in.readValue((String.class.getClassLoader())));
    }

    public FixedHeightDownsampled() {
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWebp() {
        return webp;
    }

    public void setWebp(String webp) {
        this.webp = webp;
    }

    public String getWebpSize() {
        return webpSize;
    }

    public void setWebpSize(String webpSize) {
        this.webpSize = webpSize;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
        dest.writeValue(width);
        dest.writeValue(height);
        dest.writeValue(size);
        dest.writeValue(webp);
        dest.writeValue(webpSize);
    }

    public int describeContents() {
        return  0;
    }

}
