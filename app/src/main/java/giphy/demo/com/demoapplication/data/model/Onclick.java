
package giphy.demo.com.demoapplication.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Onclick implements Parcelable
{

    @SerializedName("url")
    @Expose
    private String url;
    public final static Creator<Onclick> CREATOR = new Creator<Onclick>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Onclick createFromParcel(Parcel in) {
            return new Onclick(in);
        }

        public Onclick[] newArray(int size) {
            return (new Onclick[size]);
        }

    }
    ;

    protected Onclick(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Onclick() {
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
