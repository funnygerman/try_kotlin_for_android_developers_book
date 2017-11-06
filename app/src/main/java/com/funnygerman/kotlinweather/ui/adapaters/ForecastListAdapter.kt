package com.funnygerman.kotlinweather.ui.adapaters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.funnygerman.kotlinweather.domain.model.ForecastList

/**
 * Created by timur on 04.11.17.
 */
class ForecastListAdapter(private val weekForecast: ForecastList) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(TextView(parent.context))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(weekForecast[position]) {
            holder.textView.text = "$date - $description - $high/$low"
        }
    }

    override fun getItemCount(): Int = weekForecast.size


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}