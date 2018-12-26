class ContactManager {
    Contact[] myFriends;
    int friendCount;

    ContactManager() {
        friendCount = 0;
        myFriends = new Contact[500];
    }

    public void addContact(Contact contact) {
        myFriends[friendCount] = contact;
        friendCount++;
        System.out.println("Friend Count = " + friendCount);
    }

    public Contact searchContact(String searchName) {

        for (int i = 0; i < friendCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                System.out.println("Match Found");
                return myFriends[i];
            }
        }
        return null;
    }
}