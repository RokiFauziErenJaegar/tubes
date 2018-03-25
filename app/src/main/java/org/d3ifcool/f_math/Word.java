package org.d3ifcool.f_math;

/**
 * Created by Roki on 3/11/2018.
 */

public class Word {
    /** Default translation for the word */
    private String mDefaultText;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;
    public Word(String defaultText, int imageResourceID) {
        mDefaultText = defaultText;
        mImageResourceId = imageResourceID;
    }
    /**
     * Get the default translation of the word.
     */
    public String getDefaultText() {
        return mDefaultText;
    }
    /**
     * Get the Miwok translation of the word.
     */
    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
