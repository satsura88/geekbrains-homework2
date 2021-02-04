package lesson203.dz203;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<String>> phonebook;

    public PhoneBook(){
        this.phonebook = new HashMap<>();
    }

    public void addContact(String name, String phone){
        HashSet<String> pBook = phonebook.getOrDefault(name, new HashSet<>());
        pBook.add(phone);
        phonebook.put(name, pBook);
    }

    public void findContact(String name){
        System.out.println("Контакт " + name + "\nНомер телефона " + phonebook.getOrDefault(name, new HashSet<>()));
    }
}
