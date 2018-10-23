
package giphy.demo.com.demoapplication.data.model;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiResponce implements Parcelable
{

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    public final static Creator<ApiResponce> CREATOR = new Creator<ApiResponce>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ApiResponce createFromParcel(Parcel in) {
            return new ApiResponce(in);
        }

        public ApiResponce[] newArray(int size) {
            return (new ApiResponce[size]);
        }

    }
    ;

    protected ApiResponce(Parcel in) {
        in.readList(this.data, (giphy.demo.com.demoapplication.data.model.Datum.class.getClassLoader()));
        this.pagination = ((Pagination) in.readValue((Pagination.class.getClassLoader())));
        this.meta = ((Meta) in.readValue((Meta.class.getClassLoader())));
    }

    public ApiResponce() {
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(data);
        dest.writeValue(pagination);
        dest.writeValue(meta);
    }

    public int describeContents() {
        return  0;
    }

}
