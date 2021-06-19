package com.example.c

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter (var contactList: List<Contacts>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.tvContactname.text=currentContact.contactDetails
        holder.tvdescription.text=currentContact.contactDescription
        holder.tvName.text=currentContact.contactName
        holder.tvPhonenumber.text=currentContact.contactPhoneNumber
        holder.tvEmail.text=currentContact.contactEmail
    }

    override fun getItemCount(): Int {
        return contactList.size

    }
}
class ContactViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvContactname=itemView.findViewById<TextView>(R.id.tvContactname)
    var tvdescription=itemView.findViewById<TextView>(R.id.tvdescription)
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhonenumber=itemView.findViewById<TextView>(R.id.tvPhonenumber)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)

}