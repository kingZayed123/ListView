package in.bitcode.customview2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Sukanya on 8/9/18.
 */
public class AdapterTasks extends BaseAdapter {

    private Context mContext;
    private ArrayList<Task> mListTasks;

    public AdapterTasks(Context context, ArrayList<Task> tasks) {
        this.mContext = context;
        mListTasks = tasks;
    }

    @Override
    public int getCount() {
        if( mListTasks != null ) {
            return mListTasks.size();
        }

        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TaskView taskView;

        if( convertView == null ) {
            taskView = new TaskView( mContext );
        }
        else {
            taskView = (TaskView) convertView;
        }

        taskView.setTask( mListTasks.get( position ) );

        return taskView;
    }
}
