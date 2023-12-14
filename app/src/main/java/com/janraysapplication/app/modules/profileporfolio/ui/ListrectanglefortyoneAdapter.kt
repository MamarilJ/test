package com.janraysapplication.app.modules.profileporfolio.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.janraysapplication.app.R
import com.janraysapplication.app.databinding.RowListrectanglefortyoneBinding
import com.janraysapplication.app.modules.profileporfolio.`data`.model.ListrectanglefortyoneRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefortyoneAdapter(
  var list: List<ListrectanglefortyoneRowModel>
) : RecyclerView.Adapter<ListrectanglefortyoneAdapter.RowListrectanglefortyoneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefortyoneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefortyone,parent,false)
    return RowListrectanglefortyoneVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefortyoneVH, position: Int) {
    val listrectanglefortyoneRowModel = ListrectanglefortyoneRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefortyoneRowModel = list[position]
    holder.binding.listrectanglefortyoneRowModel = listrectanglefortyoneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglefortyoneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListrectanglefortyoneRowModel
    ) {
    }
  }

  inner class RowListrectanglefortyoneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefortyoneBinding = RowListrectanglefortyoneBinding.bind(itemView)
  }
}
