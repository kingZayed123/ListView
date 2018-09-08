package in.bitcode.customview2;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    private ListView mListViewTasks;
    private ArrayList<Task> mListTasks;
    private AdapterTasks mAdapterTasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mListViewTasks = getListView();

        mListTasks = new ArrayList<>();
        mListTasks.add( new Task("1Pay Bills", false ));
        mListTasks.add( new Task("2Buy Stuff", false ));
        mListTasks.add( new Task("3Finish Project", false ));
        mListTasks.add( new Task("4Pay Bills", false ));
        mListTasks.add( new Task("5Buy Stuff", false ));
        mListTasks.add( new Task("6Finish Project", false ));
        mListTasks.add( new Task("7Pay Bills", false ));
        mListTasks.add( new Task("8Buy Stuff", false ));
        mListTasks.add( new Task("9Finish Project", false ));
        mListTasks.add( new Task("10Pay Bills", false ));
        mListTasks.add( new Task("11Buy Stuff", false ));
        mListTasks.add( new Task("12Finish Project", false ));
        mListTasks.add( new Task("13Pay Bills", false ));
        mListTasks.add( new Task("14Buy Stuff", false ));
        mListTasks.add( new Task("15Finish Project", false ));
        mListTasks.add( new Task("16Pay Bills", false ));
        mListTasks.add( new Task("17Buy Stuff", false ));
        mListTasks.add( new Task("18Finish Project", false ));

        mAdapterTasks = new AdapterTasks( this, mListTasks );

        mListViewTasks.setAdapter( mAdapterTasks );

        mListViewTasks.setOnItemClickListener( new ListViewTasksItemClickListener() );


    }

    class ListViewTasksItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            mListTasks.get( position ).setStatus(
                    !mListTasks.get( position ).getStatus()
            );
            mAdapterTasks.notifyDataSetInvalidated();
        }
    }
}
