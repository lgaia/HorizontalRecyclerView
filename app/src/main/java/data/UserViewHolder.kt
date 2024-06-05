package data

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.apprecyclerview.databinding.UserItemBinding

class UserViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding: UserItemBinding = UserItemBinding.bind(view)
    fun render(user: User){
        binding.tvName.text = user.name
        binding.tvLastname.text = user.lastname
        binding.tvAge.text = user.age.toString()
        binding.tvBirthday.text = user.birthday
    }
}

