package com.example.lukastq.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Items> {

    private static final String LOG_TAG = ItemAdapter.class.getSimpleName();

    public ItemAdapter(Activity context, ArrayList<Items> album) {
        super(context, 0, album);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_item, parent, false);

        Items currentAlbum = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.item_name);
        nameTextView.setText(currentAlbum.getItemName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.item_shortDesc);
        numberTextView.setText(currentAlbum.getItemShortDesc());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_img);
        iconView.setImageResource(currentAlbum.getImageId());

        return listItemView;
    }

}
