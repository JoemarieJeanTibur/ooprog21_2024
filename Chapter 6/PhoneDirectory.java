class PhoneDirectory {
    private String[] names;
    private String[] phoneNumbers;
    private int size;

    public PhoneDirectory(int capacity) {
        names = new String[capacity];
        phoneNumbers = new String[capacity];
        size = 0;
    }

    public void addEntry(String name, String phoneNumber) {
        if (size < names.length) {
            names[size] = name;
            phoneNumbers[size] = phoneNumber;
            size++;
        } else {
            System.out.println("Phone directory is full. Cannot add more entries.");
        }
    }

    public String findPhoneNumber(String name) {
        for (int i = 0; i < size; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return phoneNumbers[i];
            }
        }
        return null; // Name not found
    }

    public int getSize() {
        return size;
    }
}