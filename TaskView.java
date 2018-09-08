package in.bitcode.customview2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Sukanya on 8/9/18.
 */
@SuppressLint("AppCompatCustomView")
public class TaskView extends TextView  {

    private Task mTask;

    public TaskView(Context context) {
        super(context);
        init();
    }

    public TaskView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Log.e("tag", "onDraw");

        Paint paint = new Paint();
        paint.setColor( Color.RED );
        paint.setStrokeWidth( 10 );

        canvas.drawLine(40, 0, 40, getBottom(), paint);
        canvas.drawLine(60, 0, 60, getBottom(), paint);
    }

    private void init() {
        setPadding(80, 20, 20, 30 );
        setTextSize( 40 );

        setOnTouchListener(new OnTouchListener() {
            int sx, sy, ex, ey;
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if( event.getAction() == MotionEvent.ACTION_DOWN ) {
                    sx = (int) event.getX();
                    sy = (int) event.getY();
                }
                if( event.getAction() == MotionEvent.ACTION_UP ) {
                    ex = (int) event.getX();
                    ey = (int) event.getY();

                    if( sx < ex ) {
                        mTask.setStatus( !mTask.getStatus() );
                        setTextColor( mTask.getStatus() ? Color.GREEN : Color.RED );
                    }
                }

                return false;
            }
        });
    }

    public void setTask( Task task ) {
        mTask = task;
        setText( mTask.getTitle() );
        setTextColor( mTask.getStatus() ? Color.GREEN : Color.RED );
    }

    public Task getTask() {
        return mTask;
    }

}
