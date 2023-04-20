import android.util.Log

class WishFetcher{

    companion object {

        val items = ArrayList<String>()
       val urls = ArrayList<String>()
       val prices = ArrayList<String>()
        fun addWishes(i: String,u:String,p: String){
            items+=i
            urls+=u
            prices+=p
            Log.v("My activity",items.toString())
            Log.v("My activity",urls.toString())
            Log.v("My activity",prices.toString())
        }
        fun getWishes(): MutableList<Wish> {
            val wishboxes : MutableList<Wish> = ArrayList()
            for (x in items.indices) {
                val wishbox = Wish(items[x], urls[x], prices[x])
                wishboxes.add(wishbox)
                Log.v("My activity BOX",wishbox.toString())
            }
            return wishboxes
        }


    }
}