package com.yourpet.modules.home.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yourpet.R;
import com.yourpet.models.Loss;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CardsAdapter extends RecyclerView.Adapter<CardsAdapter.ViewHolder>{

  private List<Loss> pets;
  private Context context;

  public CardsAdapter(Context context, List<Loss> pets) {
    this.pets = pets;
    this.context = context;
  }

  @Override
  public CardsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
    return new ViewHolder(itemView);
  }

  @Override
  public void onBindViewHolder(CardsAdapter.ViewHolder holder, int position) {
    final Loss pet = pets.get(position);


  }

  @Override
  public int getItemCount() {
    return pets.size();
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.textViewTitle)
    TextView textViewTitle;
    @BindView(R.id.textViewDescription)
    TextView textViewDescription;
    @BindView(R.id.textViewShortDescription)
    TextView textViewShortDescription;

    ViewClickListener eventListener;

    public ViewHolder(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
      itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          if(eventListener != null){
            eventListener.onViewClickListener(v);
          }
        }
      });
    }

    public interface ViewClickListener{
      void onViewClickListener(View view);
    }

    public void setOnViewClickListener(ViewClickListener eventListener){
      this.eventListener = eventListener;
    }
  }


}