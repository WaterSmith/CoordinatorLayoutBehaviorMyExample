package watersmith.mypain;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by WaterSmith on 14.01.2018.
 */

public class DemoFragment extends Fragment {
    @BindView(R.id.main_appbar_layout)
    AppBarLayout mAppBarLayout;
    @BindView(R.id.list_recycler)
    RecyclerView mNewsRecycler;
    @BindView(R.id.anchored_frame)
    ConstraintLayout mAnchoredFrame;

    int mFullWindowHeight;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_demo_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        fillRecycler();

        mNewsRecycler.setNestedScrollingEnabled(true);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager()
                .getDefaultDisplay()
                .getMetrics(displayMetrics);
        mFullWindowHeight = displayMetrics.heightPixels;

        mAppBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int offset) {
                int maxScroll = appBarLayout.getTotalScrollRange();
                //Log.i("Coolapse max", String.valueOf(maxScroll));
                //Log.i("Coolapse offset", String.valueOf(offset));

                CoordinatorLayout.LayoutParams params = (CoordinatorLayout.LayoutParams) mAnchoredFrame.getLayoutParams();
                //params.topMargin = maxScroll + offset;
                //params.height = mFullWindowHeight - params.topMargin;
                //mAnchoredFrame.setLayoutParams(params);
                //mAnchoredFrame.requestLayout();
                //Log.i("Coolapse start height", String.valueOf(mStartRecycleHeight));
                //Log.i("Coolapse new height", String.valueOf(params.height));
            }
        });

    }

    private void fillRecycler() {
        DemoRecyclerViewAdapter demoRecyclerViewAdapter = new DemoRecyclerViewAdapter();
        mNewsRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        mNewsRecycler.setAdapter(demoRecyclerViewAdapter);
    }

}
