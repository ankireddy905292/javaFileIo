package com.javafileIo;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AdressBookFileIO {

    public void writeData(ArrayList<AddressBookMethods> addressBook){
        StringBuffer addressBookBuffer = new StringBuffer();
        addressBook.forEach(employee ->{
            String empDataString = employee.toString().concat("\n");
            addressBookBuffer.append(empDataString);
        });
        try {
            Files.write(Paths.get("AddressBook.txt"),addressBookBuffer.toString().getBytes());
        }catch (IOException e){
        }
    }

    public List<AddressBookMethods> readData() {
        List<AddressBookMethods> addressBookList = new ArrayList<>();

        try {
            Files.lines(new File("AddressBook.txt").toPath())
                    .map(line -> line.trim())
                    .forEach(line -> System.out.println(line));
        }catch (IOException e){
        }
        return addressBookList;
    }
}

