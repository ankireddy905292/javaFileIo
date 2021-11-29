package com.javafileIo;
import java.util.*;
public class IoAddressBook {
    public static void main(String[] args) {
        AddressBookManager makeBook = new AddressBookManager();
        makeBook.takeOption();
        boolean condition = true;
        while (condition) {
            boolean monitorUser = makeBook.takeOption();
            if (monitorUser)
                break;
        }
    }
}

