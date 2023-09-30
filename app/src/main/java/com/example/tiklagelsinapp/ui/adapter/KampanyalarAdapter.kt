package com.example.tiklagelsinapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tiklagelsinapp.data.entity.Kampanyalar
import com.example.tiklagelsinapp.databinding.CardTasarimBinding

class KampanyalarAdapter(var mContext: Context, var kampanyalarListesi:List<Kampanyalar>)
: RecyclerView.Adapter<KampanyalarAdapter.CardTasarimTutucu>()
{
    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun getItemCount(): Int {
        return kampanyalarListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kampanya = kampanyalarListesi.get(position) //kaç film varsa getiricek
        val t = holder.tasarim

        t.imageView.setImageResource(mContext.resources.getIdentifier(kampanya.resim,"drawable",mContext.packageName))
        t.textViewKampanyaBaslik.text = "${kampanya.baslik}"
        t.textViewKampanyaDetay.text = "${kampanya.detay}"



    }

}