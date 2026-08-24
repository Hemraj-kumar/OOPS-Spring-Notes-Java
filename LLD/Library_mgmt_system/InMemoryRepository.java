package LLD.Library_mgmt_system;

import java.util.HashMap;
import java.util.Map;

public class InMemoryRepository implements BorrowerRepository {

    @Override
    public Book findbyId(String id) {
        Map<String, Book> map = new HashMap();
        throw new UnsupportedOperationException("Unimplemented method 'findbyId'");
    }

    @Override
    public void saveBook(Book book) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveBook'");
    }
    
}
