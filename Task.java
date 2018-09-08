package in.bitcode.customview2;

import java.io.Serializable;

/**
 * Created by Sukanya on 8/9/18.
 */
public class Task implements Serializable {

    private String mTitle;
    private boolean mStatus;

    public Task(String title, boolean status) {
        this.mTitle = title;
        this.mStatus = status;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public boolean getStatus() {
        return mStatus;
    }

    public void setStatus(boolean status) {
        this.mStatus = status;
    }
}
