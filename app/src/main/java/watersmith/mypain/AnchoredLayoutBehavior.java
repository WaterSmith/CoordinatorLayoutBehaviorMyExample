package watersmith.mypain;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by WaterSmith on 14.01.2018.
 */

public class AnchoredLayoutBehavior extends CoordinatorLayout.Behavior<ConstraintLayout> {
    public AnchoredLayoutBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.i("Behavior","create");
    }

    @Override
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout child, @NonNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        Log.i("Behavior", child.toString() + " scroll "+target.toString());
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
    }

    @Override
    public boolean onTouchEvent(CoordinatorLayout parent, ConstraintLayout child, MotionEvent ev) {
        Log.i("Behavior", child.toString() + " touch ");
        return super.onTouchEvent(parent, child, ev);
    }
}
