
package giphy.demo.com.demoapplication.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images implements Parcelable
{

    @SerializedName("fixed_height_still")
    @Expose
    private FixedHeightStill fixedHeightStill;
    @SerializedName("original_still")
    @Expose
    private OriginalStill originalStill;
    @SerializedName("fixed_width")
    @Expose
    private FixedWidth fixedWidth;
    @SerializedName("fixed_height_small_still")
    @Expose
    private FixedHeightSmallStill fixedHeightSmallStill;
    @SerializedName("fixed_height_downsampled")
    @Expose
    private FixedHeightDownsampled fixedHeightDownsampled;
    @SerializedName("preview")
    @Expose
    private Preview preview;
    @SerializedName("fixed_height_small")
    @Expose
    private FixedHeightSmall fixedHeightSmall;
    @SerializedName("downsized_still")
    @Expose
    private DownsizedStill downsizedStill;
    @SerializedName("downsized")
    @Expose
    private Downsized downsized;
    @SerializedName("downsized_large")
    @Expose
    private DownsizedLarge downsizedLarge;
    @SerializedName("fixed_width_small_still")
    @Expose
    private FixedWidthSmallStill fixedWidthSmallStill;
    @SerializedName("preview_webp")
    @Expose
    private PreviewWebp previewWebp;
    @SerializedName("fixed_width_still")
    @Expose
    private FixedWidthStill fixedWidthStill;
    @SerializedName("fixed_width_small")
    @Expose
    private FixedWidthSmall fixedWidthSmall;
    @SerializedName("downsized_small")
    @Expose
    private DownsizedSmall downsizedSmall;
    @SerializedName("fixed_width_downsampled")
    @Expose
    private FixedWidthDownsampled fixedWidthDownsampled;
    @SerializedName("downsized_medium")
    @Expose
    private DownsizedMedium downsizedMedium;
    @SerializedName("original")
    @Expose
    private Original original;
    @SerializedName("fixed_height")
    @Expose
    private FixedHeight fixedHeight;
    @SerializedName("looping")
    @Expose
    private Looping looping;
    @SerializedName("original_mp4")
    @Expose
    private OriginalMp4 originalMp4;
    @SerializedName("preview_gif")
    @Expose
    private PreviewGif previewGif;
    @SerializedName("480w_still")
    @Expose
    private giphy.demo.com.demoapplication.data.model._480wStill _480wStill;
    public final static Creator<Images> CREATOR = new Creator<Images>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Images createFromParcel(Parcel in) {
            return new Images(in);
        }

        public Images[] newArray(int size) {
            return (new Images[size]);
        }

    }
    ;

    protected Images(Parcel in) {
        this.fixedHeightStill = ((FixedHeightStill) in.readValue((FixedHeightStill.class.getClassLoader())));
        this.originalStill = ((OriginalStill) in.readValue((OriginalStill.class.getClassLoader())));
        this.fixedWidth = ((FixedWidth) in.readValue((FixedWidth.class.getClassLoader())));
        this.fixedHeightSmallStill = ((FixedHeightSmallStill) in.readValue((FixedHeightSmallStill.class.getClassLoader())));
        this.fixedHeightDownsampled = ((FixedHeightDownsampled) in.readValue((FixedHeightDownsampled.class.getClassLoader())));
        this.preview = ((Preview) in.readValue((Preview.class.getClassLoader())));
        this.fixedHeightSmall = ((FixedHeightSmall) in.readValue((FixedHeightSmall.class.getClassLoader())));
        this.downsizedStill = ((DownsizedStill) in.readValue((DownsizedStill.class.getClassLoader())));
        this.downsized = ((Downsized) in.readValue((Downsized.class.getClassLoader())));
        this.downsizedLarge = ((DownsizedLarge) in.readValue((DownsizedLarge.class.getClassLoader())));
        this.fixedWidthSmallStill = ((FixedWidthSmallStill) in.readValue((FixedWidthSmallStill.class.getClassLoader())));
        this.previewWebp = ((PreviewWebp) in.readValue((PreviewWebp.class.getClassLoader())));
        this.fixedWidthStill = ((FixedWidthStill) in.readValue((FixedWidthStill.class.getClassLoader())));
        this.fixedWidthSmall = ((FixedWidthSmall) in.readValue((FixedWidthSmall.class.getClassLoader())));
        this.downsizedSmall = ((DownsizedSmall) in.readValue((DownsizedSmall.class.getClassLoader())));
        this.fixedWidthDownsampled = ((FixedWidthDownsampled) in.readValue((FixedWidthDownsampled.class.getClassLoader())));
        this.downsizedMedium = ((DownsizedMedium) in.readValue((DownsizedMedium.class.getClassLoader())));
        this.original = ((Original) in.readValue((Original.class.getClassLoader())));
        this.fixedHeight = ((FixedHeight) in.readValue((FixedHeight.class.getClassLoader())));
        this.looping = ((Looping) in.readValue((Looping.class.getClassLoader())));
        this.originalMp4 = ((OriginalMp4) in.readValue((OriginalMp4.class.getClassLoader())));
        this.previewGif = ((PreviewGif) in.readValue((PreviewGif.class.getClassLoader())));
        this._480wStill = ((giphy.demo.com.demoapplication.data.model._480wStill) in.readValue((_480wStill.class.getClassLoader())));
    }

    public Images() {
    }

    public FixedHeightStill getFixedHeightStill() {
        return fixedHeightStill;
    }

    public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
    }

    public OriginalStill getOriginalStill() {
        return originalStill;
    }

    public void setOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
    }

    public FixedWidth getFixedWidth() {
        return fixedWidth;
    }

    public void setFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    public FixedHeightSmallStill getFixedHeightSmallStill() {
        return fixedHeightSmallStill;
    }

    public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
    }

    public FixedHeightDownsampled getFixedHeightDownsampled() {
        return fixedHeightDownsampled;
    }

    public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public FixedHeightSmall getFixedHeightSmall() {
        return fixedHeightSmall;
    }

    public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
    }

    public DownsizedStill getDownsizedStill() {
        return downsizedStill;
    }

    public void setDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
    }

    public Downsized getDownsized() {
        return downsized;
    }

    public void setDownsized(Downsized downsized) {
        this.downsized = downsized;
    }

    public DownsizedLarge getDownsizedLarge() {
        return downsizedLarge;
    }

    public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
    }

    public FixedWidthSmallStill getFixedWidthSmallStill() {
        return fixedWidthSmallStill;
    }

    public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
    }

    public PreviewWebp getPreviewWebp() {
        return previewWebp;
    }

    public void setPreviewWebp(PreviewWebp previewWebp) {
        this.previewWebp = previewWebp;
    }

    public FixedWidthStill getFixedWidthStill() {
        return fixedWidthStill;
    }

    public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
    }

    public FixedWidthSmall getFixedWidthSmall() {
        return fixedWidthSmall;
    }

    public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
    }

    public DownsizedSmall getDownsizedSmall() {
        return downsizedSmall;
    }

    public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
    }

    public FixedWidthDownsampled getFixedWidthDownsampled() {
        return fixedWidthDownsampled;
    }

    public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    public DownsizedMedium getDownsizedMedium() {
        return downsizedMedium;
    }

    public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
        this.downsizedMedium = downsizedMedium;
    }

    public Original getOriginal() {
        return original;
    }

    public void setOriginal(Original original) {
        this.original = original;
    }

    public FixedHeight getFixedHeight() {
        return fixedHeight;
    }

    public void setFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    public Looping getLooping() {
        return looping;
    }

    public void setLooping(Looping looping) {
        this.looping = looping;
    }

    public OriginalMp4 getOriginalMp4() {
        return originalMp4;
    }

    public void setOriginalMp4(OriginalMp4 originalMp4) {
        this.originalMp4 = originalMp4;
    }

    public PreviewGif getPreviewGif() {
        return previewGif;
    }

    public void setPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
    }

    public giphy.demo.com.demoapplication.data.model._480wStill get480wStill() {
        return _480wStill;
    }

    public void set480wStill(giphy.demo.com.demoapplication.data.model._480wStill _480wStill) {
        this._480wStill = _480wStill;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(fixedHeightStill);
        dest.writeValue(originalStill);
        dest.writeValue(fixedWidth);
        dest.writeValue(fixedHeightSmallStill);
        dest.writeValue(fixedHeightDownsampled);
        dest.writeValue(preview);
        dest.writeValue(fixedHeightSmall);
        dest.writeValue(downsizedStill);
        dest.writeValue(downsized);
        dest.writeValue(downsizedLarge);
        dest.writeValue(fixedWidthSmallStill);
        dest.writeValue(previewWebp);
        dest.writeValue(fixedWidthStill);
        dest.writeValue(fixedWidthSmall);
        dest.writeValue(downsizedSmall);
        dest.writeValue(fixedWidthDownsampled);
        dest.writeValue(downsizedMedium);
        dest.writeValue(original);
        dest.writeValue(fixedHeight);
        dest.writeValue(looping);
        dest.writeValue(originalMp4);
        dest.writeValue(previewGif);
        dest.writeValue(_480wStill);
    }

    public int describeContents() {
        return  0;
    }

}
