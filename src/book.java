public class book {

    public class Book() {
    }
    public class dummyBook();
    
// Construct an author instance

// Test Getters and Setters
    

    // Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()
    public getName(){
            System.out.println("name is: " + dummyBook.getName());
        }
    public getAuthor(){
        System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()

        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
            System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
        }
    public getPrice(){
            System.out.println("price is: " + dummyBook.getPrice());
        }
    public setPrice(){
            dummyBook.setPrice(29.95);
        }
    public getQty(){
            System.out.println("qty is: " + dummyBook.getQty());


        }
    public setQty() {
            dummyBook.setQty(28);
        }
    }
