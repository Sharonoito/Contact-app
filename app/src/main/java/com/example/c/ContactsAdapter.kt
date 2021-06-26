package com.example.c

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactsAdapter (var contactList: List<Contacts>,var context:Context):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
       holder.tvName.text=currentContact.contactName
        holder.tvPhonenumber.text=currentContact.contactPhoneNumber
        holder.tvEmail.text=currentContact.contactEmail
        Picasso.get()
            .load(currentContact.imageUrl)
            .into(holder.imgContact)

        holder.clContact.setOnClickListener{
            var intent=Intent(context,ViewContactsActivity::class.java)
            intent.putExtra("name",currentContact.contactName)
            intent.putExtra("phonenumber",currentContact.contactPhoneNumber)
            intent.putExtra("email",currentContact.contactEmail)
            intent.putExtra("image",currentContact.imageUrl
            )
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return contactList.size

    }
}
class ContactViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
//    var tvContactname=itemView.findViewById<TextView>(R.id.tvContactname)
//    var tvdescription=itemView.findViewById<TextView>(R.id.tvdescription)
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhonenumber=itemView.findViewById<TextView>(R.id.tvPhonenumber)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var imgContact=itemView.findViewById<ImageView>(R.id.imgContact)
    var clContact=itemView.findViewById<CardView>(R.id.clContact)

}