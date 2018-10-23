
package giphy.demo.com.demoapplication.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Onload implements Parcelable
{

    @SerializedName("url")
    @Expose
    private String url;
    public final static Creator<Onload> CREATOR = new Creator<Onload>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Onload createFromParcel(Parcel in) {
            return new Onload(in);
        }

        public Onload[] newArray(int size) {
            return (new Onload[size]);
        }

    }
    ;

    protected Onload(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Onload() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
    }

    public int describeContents() {
        return  0;
    }

}
