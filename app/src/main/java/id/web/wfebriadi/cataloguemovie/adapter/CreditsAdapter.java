package id.web.wfebriadi.cataloguemovie.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

import id.web.wfebriadi.cataloguemovie.BuildConfig;
import id.web.wfebriadi.cataloguemovie.R;
import id.web.wfebriadi.cataloguemovie.model.CastMovieResults;

public class CreditsAdapter extends RecyclerView.Adapter<CreditsAdapter.CreditsViewHolder> {

    private List<CastMovieResults> castResults = new ArrayList<>();
    private Context context;

    public CreditsAdapter() {
    }

    @Override
    public CreditsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_credits, parent, false);
        return new CreditsViewHolder(view);
    }

    public void clearAll() {
        castResults.clear();
        notifyDataSetChanged();
    }

    public void replaceAll(List<CastMovieResults> results) {
        castResults.clear();
        castResults = results;
        notifyDataSetChanged();
    }

    public void updateData(List<CastMovieResults> results) {
        castResults.addAll(results);
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(CreditsViewHolder holder, int position) {
        holder.BinData(castResults.get(position));
    }

    @Override
    public int getItemCount() {
        return castResults.size();
    }

    public class CreditsViewHolder extends RecyclerView.ViewHolder {

        TextView nameCast, nameCharacter;
        ImageView imgCast;
        CardView cardView;

        public CreditsViewHolder(View itemView) {
            super(itemView);
            nameCast = itemView.findViewById(R.id.name_cast);
            nameCharacter = itemView.findViewById(R.id.character_cast);
            imgCast = itemView.findViewById(R.id.thumb_cast);
            cardView = itemView.findViewById(R.id.card_view_cast);
        }

        public void BinData(final CastMovieResults castResults) {
            nameCast.setText(castResults.getName());
            nameCharacter.setText(castResults.getCharacter());
            Glide.with(itemView.getContext()).load(BuildConfig.IMG_THUMB_URL + castResults.getProfile_path())
                    .apply(new RequestOptions().placeholder(R.drawable.img_default).centerCrop())
                    .into(imgCast);
            cardView.setOnClickListener(new ItemClickListener(new ItemClickListener.OnItemClickCallback() {
                @Override
                public void onItemClicked(View view) {
//                    String id = String.valueOf(castResults.getId());
//                    Toast.makeText(itemView.getContext(),id,Toast.LENGTH_SHORT).show();
//                    Intent intent = new Intent(itemView.getContext(), PeopleDetailActivity.class);
//                    intent.putExtra("person_name",castResults.getName());
//                    intent.putExtra("person_id",castResults.getId());
//                    itemView.getContext().startActivity(intent);
                }
            }));
        }
    }
}
