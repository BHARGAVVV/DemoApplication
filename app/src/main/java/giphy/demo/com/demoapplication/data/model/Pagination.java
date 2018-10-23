
package giphy.demo.com.demoapplication.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination implements Parcelable
{

    @SerializedName("total_count")
    @Expose
    private int totalCount;
    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("offset")
    @Expose
    private int offset;
    public final static Creator<Pagination> CREATOR = new Creator<Pagination>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Pagination createFromParcel(Parcel in) {
            return new Pagination(in);
        }

        public Pagination[] newArray(int size) {
            return (new Pagination[size]);
        }

    }
    ;

    protected Pagination(Parcel in) {
        this.totalCount = ((int) in.readValue((int.class.getClassLoader())));
        this.count = ((int) in.readValue((int.class.getClassLoader())));
        this.offset = ((int) in.readValue((int.class.getClassLoader())));
    }

    public Pagination() {
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(totalCount);
        dest.writeValue(count);
        dest.writeValue(offset);
    }

    public int describeContents() {
        return  0;
    }

}
