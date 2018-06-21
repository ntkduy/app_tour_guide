package com.ntkduy1604.tourguidewa.recycling;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ntkduy1604.tourguidewa.R;
import com.ntkduy1604.tourguidewa.model.Attractions;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Provide a reference to the type of views that you are using (custom ViewHolder)
 */
public class ViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.tv_attraction_name)
    TextView tvAttractionName;
    @BindView(R.id.tv_attraction_info)
    TextView tvAttractionInfo;
    @BindView(R.id.iv_attraction_image)
    ImageView ivAttractionImage;


    public ViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

        // Define click listener for the ViewHolder's View.
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),tvAttractionName.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void bindDataModel(Attractions attraction) {
        tvAttractionName.setText(attraction.getName());
        tvAttractionInfo.setText(attraction.getInfo());
        ivAttractionImage.setImageDrawable(attraction.getImageDrawable());
    }
}
