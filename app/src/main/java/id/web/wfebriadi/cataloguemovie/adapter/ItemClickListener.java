package id.web.wfebriadi.cataloguemovie.adapter;

import android.view.View;

public class ItemClickListener implements View.OnClickListener {

    private OnItemClickCallback onItemClickCallback;

    public ItemClickListener(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view);
    }

    public interface OnItemClickCallback {
        void onItemClicked(View view);
    }
}
