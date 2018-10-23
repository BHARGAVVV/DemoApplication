
package giphy.demo.com.demoapplication.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Onsent implements Parcelable
{

    @SerializedName("url")
    @Expose
    private String url;
    public final static Creator<Onsent> CREATOR = new Creator<Onsent>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Onsent createFromParcel(Parcel in) {
            return new Onsent(in);
        }

        public Onsent[] newArray(int size) {
            return (new Onsent[size]);
        }

    }
    ;

    protected Onsent(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Onsent() {
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
