package com.dicoding.foodapps

object FoodsData {

    private val foodNames = arrayOf("Ayam Bakar",
            "Ayam Goreng",
            "Bakwan",
            "Mendoan",
            "Nasi Goreng",
            "Omelete",
            "Tahu Isi",
            "Tahu Krispi",
            "Telur Dadar",
            "Tempe Goreng")

    private val foodsDetail = arrayOf("Harga : Rp 21.000 \n\n",
            "Harga : Rp 20.000 \n\nAyam goreng khas Bali",
            "Harga : Rp 13.000 \n\n",
            "Harga : Rp 12.000 \n\n",
            "Harga : Rp 17.000 \n\n",
            "Harga : Rp 13.000 \n\n",
            "Harga : Rp 10.000 \n\n",
            "Harga : Rp 14.000 \n\n",
            "Harga : Rp 10.000 \n\n",
            "Harga : Rp 13.000 \n\n")

    private val foodsImages = intArrayOf(R.drawable.ayam_bakar,
            R.drawable.ayam_goreng,
            R.drawable.bakwan,
            R.drawable.mendoan,
            R.drawable.nasi_goreng,
            R.drawable.omelete,
            R.drawable.tahu_isi,
            R.drawable.tahu_krispi,
            R.drawable.telur_dadar,
            R.drawable.tempe_goreng)



    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodsDetail[position]
                food.photo = foodsImages[position]
                list.add(food)
            }
            return list
        }
}