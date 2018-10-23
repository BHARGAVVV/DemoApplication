
package giphy.demo.com.demoapplication.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Analytics implements Parcelable
{

    @SerializedName("onload")
    @Expose
    private Onload onload;
    @SerializedName("onclick")
    @Expose
    private Onclick onclick;
    @SerializedName("onsent")
    @Expose
    private Onsent onsent;
    public final static Creator<Analytics> CREATOR = new Creator<Analytics>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Analytics createFromParcel(Parcel in) {
            return new Analytics(in);
        }

        public Analytics[] newArray(int size) {
            return (new Analytics[size]);
        }

    }
    ;

    protected Analytics(Parcel in) {
        this.onload = ((Onload) in.readValue((Onload.class.getClassLoader())));
        this.onclick = ((Onclick) in.readValue((Onclick.class.getClassLoader())));
        this.onsent = ((Onsent) in.readValue((Onsent.class.getClassLoader())));
    }

    public Analytics() {
    }

    public Onload getOnload() {
        return onload;
    }

    public void setOnload(Onload onload) {
        this.onload = onload;
    }

    public Onclick getOnclick() {
        return onclick;
    }

    public void setOnclick(Onclick onclick) {
        this.onclick = onclick;
    }

    public Onsent getOnsent() {
        return onsent;
    }

    public void setOnsent(Onsent onsent) {
        this.onsent = onsent;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(onload);
        dest.writeValue(onclick);
        dest.writeValue(onsent);
    }

    public int describeContents() {
        return  0;
    }

}
