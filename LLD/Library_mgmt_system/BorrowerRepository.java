package LLD.Library_mgmt_system;

public interface BorrowerRepository {
    Book findbyId(String id);
    void saveBook(Book book);
}
