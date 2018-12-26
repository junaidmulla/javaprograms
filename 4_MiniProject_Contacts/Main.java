class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        Contact aiman = new Contact("Aiman", "aiman@visuallabs", "9619591519");
        Contact taher = new Contact("Taher", "taher@visuallabs", "9619591520");
        Contact bhakti = new Contact("Bhakti", "bhakti@visuallabs", "9619591521");

        contactManager.addContact(aiman);
        contactManager.addContact(taher);
        contactManager.addContact(bhakti);

        Contact searchResult = contactManager.searchContact("Aiman");
        System.out.println(searchResult.phoneNumber);

    }
}