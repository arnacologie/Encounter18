package fr.hillsongcoding.encounter18.utilitaires;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import fr.hillsongcoding.encounter18.R;
import fr.hillsongcoding.encounter18.utilitaires.Item;

public class ItemAdapter extends ArrayAdapter<Item> {

    private Bitmap bitmap;
    // View lookup cache
    private static class ViewHolder {
        TextView productName;
        TextView maker;
        ImageView productImg;
        TextView price;
    }

    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, R.layout.list_item_store, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Item item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            // If there's no view to re-use, inflate a brand new view for row
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_item_store, parent, false);
            viewHolder.productName = (TextView) convertView.findViewById(R.id.productNameTxt);
            viewHolder.maker = (TextView) convertView.findViewById(R.id.makerTxt);
            viewHolder.productImg = (ImageView) convertView.findViewById(R.id.productImg);
            viewHolder.price = (TextView) convertView.findViewById(R.id.priceTxt);
            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data from the data object via the viewHolder object
        // into the template view.
        viewHolder.productName.setText(item.getProductName());
        viewHolder.maker.setText(item.getMaker());
        viewHolder.productImg.setImageDrawable(item.getProductImg());
        return convertView;
    }


}

