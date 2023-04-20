package com.example.wishlist
import Wish
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wishlist.R
//: RecyclerView.Adapter<WishAdapter.ViewHolder>() Use for classes
class WishAdapter(private val wishes: List<Wish>) : RecyclerView.Adapter<WishAdapter.ViewHolder>() {
//    val nameview: TextView
//    val urlView: TextView
//    val priceView: TextView

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val nameView: TextView
        val urlView: TextView
        val priceView: TextView

        init{
            nameView = itemView.findViewById(R.id.itemtx)
            urlView = itemView.findViewById(R.id.urlTx)
            priceView = itemView.findViewById(R.id.pricetx)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val context = parent.context
        val inflater = LayoutInflater.from(context)

        val contactView = inflater.inflate(R.layout.wish_item, parent, false)
        return ViewHolder(contactView)
    }

    override fun getItemCount(): Int {

        return wishes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val wish = wishes.get(position)
        holder.nameView.text = wish.item
        holder.urlView.text = wish.url
        holder.priceView.text = wish.price
    }
}


