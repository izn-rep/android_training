package com.example.lenovo.trainingday1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.trainingday1.R;
import com.example.lenovo.trainingday1.entity.Question;
import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * Created by LENOVO on 9/3/2016.
 */
public class DaftarPertanyaanAdapter extends BaseAdapter {

    private final Context mContext;
    LayoutInflater inflater;
    private List<Question> mQuestions;

    public DaftarPertanyaanAdapter(Context context, List<Question> questions) {
        this.mContext = context;
        this.inflater = LayoutInflater.from(this.mContext);
        this.mQuestions = questions;
    }

    @Override
    public int getCount() {
        return mQuestions.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder mViewHolder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item_pertanyaan, parent, false);
            mViewHolder = new MyViewHolder(convertView);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (MyViewHolder) convertView.getTag();
        }

        Question question = mQuestions.get(position);

        mViewHolder.tvTitle.setText(question.getTitle());
        Picasso picasso = new Picasso.Builder(mContext)
                .build();
        picasso.setIndicatorsEnabled(true);
        picasso.load(question.getImage())
                .placeholder(R.drawable.placeholder)
                .into(mViewHolder.ivImage);

        return convertView;
    }

    private class MyViewHolder {
        TextView tvTitle;
        ImageView ivImage;
        public MyViewHolder(View item) {
            tvTitle = (TextView) item.findViewById(R.id.tvTitle);
            ivImage = (ImageView) item.findViewById(R.id.ivImage);
        }
    }
}
