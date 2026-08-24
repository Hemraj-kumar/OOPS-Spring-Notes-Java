package LLD.Library_mgmt_system;

import java.util.List;

public class Borrower {
    public static final int MAX_SIZE = 5;
    private int id;
    private String firstName;
    private String lastName;
    private List<BorrowRecords> activeRecords;

    public boolean canBorrow(){
        return activeRecords.size()<MAX_SIZE;
    }
}
