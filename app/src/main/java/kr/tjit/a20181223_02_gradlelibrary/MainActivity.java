package kr.tjit.a20181223_02_gradlelibrary;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends BaseActivity {

    private android.widget.ImageView profileImgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        String iuProfileImageURL = "https://fimg3.pann.com/new/download.jsp?FileID=33730787";
        Glide.with(mContext).load(iuProfileImageURL).into(profileImgView);

    }

    @Override
    public void bindViews() {
        this.profileImgView = (ImageView) findViewById(R.id.profileImgView);
    }
}
