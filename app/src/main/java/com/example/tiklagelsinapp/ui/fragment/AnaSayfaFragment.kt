package com.example.tiklagelsinapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.tiklagelsinapp.R
import com.example.tiklagelsinapp.data.entity.Kampanyalar
import com.example.tiklagelsinapp.databinding.FragmentAnaSayfaBinding
import com.example.tiklagelsinapp.ui.adapter.KampanyalarAdapter

class AnaSayfaFragment : Fragment()
{
    private lateinit var binding:FragmentAnaSayfaBinding




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnaSayfaBinding.inflate(inflater,container,false)

        binding.kampanyalarRv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val kampanyalarListesi =ArrayList<Kampanyalar>()
        val k1 = Kampanyalar(1,"bigking","2'li Big King® Fırsatı","2'li Big King fırsatı ile 2 adet Big King® Sandviç + Patates Kızartması (Orta) + 1L. İçecek sadece 260 TL!")
        val k2 = Kampanyalar(2,"benimuclum","Benim Üçlüm","3 adet seçeceğiniz Sandviç + Patates Kızartması (Büyük) + 1L. İçecek 185 TL’den Başlayan Fiyatlarla!")
        val k3 = Kampanyalar(3,"yedikcekazan","Yedikçe Kazan, Kazandıkça Ye!","Yedikçe Kazan, Kazandıkça Ye!")
        kampanyalarListesi.add(k1)
        kampanyalarListesi.add(k2)
        kampanyalarListesi.add(k3)

        val adapter = KampanyalarAdapter(requireContext(),kampanyalarListesi)
        binding.kampanyalarRv.adapter = adapter


        return binding.root
    }


}